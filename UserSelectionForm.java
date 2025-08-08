import javax.swing.*;
import java.awt.*;

public class UserSelectionForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("User Option Selection Form");
        frame.setLayout(null);

        // Icon
        ImageIcon icon = new ImageIcon("/home/rajat/Downloads/java.png");
        frame.setIconImage(icon.getImage());

        // Heading
        JLabel heading = new JLabel("Selection Form by Rajat Kumar", JLabel.CENTER);
        heading.setBounds(0, 10, 780, 40);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 24));
        frame.add(heading);

        // Hobbies
        JLabel hobbiesLabel = new JLabel("Hobbies:");
        hobbiesLabel.setBounds(5, 60, 100, 20);
        hobbiesLabel.setFont(new Font("Georgia", Font.BOLD, 18));
        frame.add(hobbiesLabel);

        JCheckBox reading = new JCheckBox("Reading");
        reading.setBounds(350, 60, 100, 20);
        frame.add(reading);

        JCheckBox traveling = new JCheckBox("Traveling");
        traveling.setBounds(480, 60, 100, 20);
        frame.add(traveling);

        JCheckBox gaming = new JCheckBox("Gaming");
        gaming.setBounds(610, 60, 100, 20);
        frame.add(gaming);

        // Gender
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(5, 110, 100, 20);
        genderLabel.setFont(new Font("Georgia", Font.BOLD, 18));
        frame.add(genderLabel);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(350, 110, 100, 20);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(480, 110, 100, 20);

        JRadioButton other = new JRadioButton("Other");
        other.setBounds(610, 110, 100, 20);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);

        frame.add(male);
        frame.add(female);
        frame.add(other);

        // Country
        JLabel countryLabel = new JLabel("Country:");
        countryLabel.setBounds(5, 160, 100, 20);
        countryLabel.setFont(new Font("Georgia", Font.BOLD, 18));
        frame.add(countryLabel);

        String[] countries = { "India", "Nepal", "USA", "UK", "Australia" };
        JComboBox<String> countryComboBox = new JComboBox<>(countries);
        countryComboBox.setBounds(350, 160, 400, 30);
        countryComboBox.setEditable(true);
        frame.add(countryComboBox);

        // Submit button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(350, 210, 400, 30);
        frame.add(submitButton);

        submitButton.addActionListener(e -> {
            StringBuilder result = new StringBuilder("You have selected: \nHobbies: \n");

            if (reading.isSelected()) {
                result.append("  - Reading \n");
            }
            if (traveling.isSelected()) {
                result.append("  - Traveling \n");
            }
            if (gaming.isSelected()) {
                result.append("  - Gaming \n");
            }

            if (male.isSelected()) {
                result.append("Gender: Male \n");
            } else if (female.isSelected()) {
                result.append("Gender: Female \n");
            } else if (other.isSelected()) {
                result.append("Gender: Other \n");
            }

            result.append("Country: ").append(countryComboBox.getSelectedItem());
            JOptionPane.showMessageDialog(frame, result.toString());

        });
        // Frame settings
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setSize(780, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
