import java.util.*;

class Point {
    int x, y;
    Point(int x, int y) { this.x = x; this.y = y; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point p = (Point) o;
        return x == p.x && y == p.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

class Line {
    Point start, end;
    Line(int x1, int y1, int x2, int y2) {
        start = new Point(x1, y1);
        end = new Point(x2, y2);
    }
    List<Point> getEndpoints() { return Arrays.asList(start, end); }
}

public class ShapeChecker {

    static boolean isClosedFigure(List<Line> lines) {
        Map<Point, Integer> endpointCount = new HashMap<>();
        for (Line line : lines) {
            for (Point p : line.getEndpoints()) {
                endpointCount.put(p, endpointCount.getOrDefault(p, 0) + 1);
            }
        }
        for (int count : endpointCount.values()) {
            if (count % 2 != 0) return false;
        }
        return endpointCount.size() >= 3;
    }

    static double calculateArea(List<Line> lines) {
        List<Integer> xs = new ArrayList<>();
        List<Integer> ys = new ArrayList<>();
        for (Line l : lines) {
            if (l.start.x == l.end.x) xs.add(l.start.x);
            if (l.start.y == l.end.y) ys.add(l.start.y);
        }
        if (xs.size() < 2 || ys.size() < 2) return 0.0;

        Collections.sort(xs);
        Collections.sort(ys);

        int innerWidth = xs.get(xs.size()/2) - xs.get(xs.size()/2 - 1);
        int innerHeight = ys.get(ys.size()/2) - ys.get(ys.size()/2 - 1);

        return (double)(innerWidth * innerHeight);
    }

    static boolean canRecreateShape(List<Line> lines, double area) {
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Line> lines = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            lines.add(new Line(x1, y1, x2, y2));
        }

        if (isClosedFigure(lines)) {
            System.out.print("Yes");
            double area = calculateArea(lines);
            if (canRecreateShape(lines, area)) {
                System.out.print("Shape can be recreated");
            } else {
                System.out.print("No");
            }
            System.out.printf("%.2f", area);
        } else {
            System.out.print("No");
        }
    }
}
