import javax.swing.*;

public class MyFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sample frame");
        JLabel label = new JLabel("Welcome to the frame!", SwingConstants.CENTER);

        frame.add(label);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
