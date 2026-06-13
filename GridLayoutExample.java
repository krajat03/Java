import java.awt.*;

public class GridLayoutExample extends Frame {
    public static void main(String[] args) {
        Frame f = new Frame("GridLayout Example");
        f.setLayout(new GridLayout(2, 3, 10, 10)); // 2 rows, 3 cols, gaps=10px

        f.add(new Button("1"));
        f.add(new Button("2"));
        f.add(new Button("3"));
        f.add(new Button("4"));
        f.add(new Button("5"));
        f.add(new Button("6"));

        f.setSize(300, 200);
        f.setVisible(true);
    }
}
