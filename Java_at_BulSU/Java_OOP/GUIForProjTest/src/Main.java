import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // 1. Initialize the backend engine
            ShopManager sharedManager = new ShopManager();

            // 2. Initialize the UI and pass the backend engine to it
            AccountForm form = new AccountForm(sharedManager);

            // 3. Put it in a JFrame and display
            JFrame frame = new JFrame("Customer Management");
            frame.setContentPane(form.getRootPanel());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 350);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}