import javax.swing.*;

public class Dialogs extends JFrame {
    public Dialogs() {
        //MESSAGE DIALOG
        JOptionPane msg = new JOptionPane();
        msg.showMessageDialog(
                null,
                "Basta message ito, mag-OK ka nalang pls"
        );

        //SHOW CONFIRM DIALOG BOX
        int choice = JOptionPane.showConfirmDialog(
                null,
                "Sure ka na ba dyan? Delete?"
        );

        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(
                    null,
                    "Deleted successfully");
        } else if (choice == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(
                    null,
                    "You said no");
        }


        //INPUT DIALOG
        boolean nameEntered = false;

        while (!nameEntered) {
            String name = JOptionPane.showInputDialog(
                    null,
                    "Enter your name"
            );

            if (name != null && !name.isBlank()) {
                JOptionPane.showMessageDialog(
                        null,
                        "Welcome, " + name
                );
                nameEntered = true;
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Please enter your name"
                );
            }
        }


        //OPTION DIALOG
        String[] options = {"Save", "Don't Save", "Cancel"};
        int ch =  JOptionPane.showOptionDialog(
                null,
                "Do you want to save your changes?",
                "Unsaved Changes",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );

        System.out.println(ch);

    }
}
