import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountForm {
    // 1. The Reference to your backend manager
    private ShopManager manager;

    // 2. UI Components
    private JPanel rootPanel;
    private JTextField txtCustomerName;
    private JButton btnAddCustomer;
    private JList<String> listCustomers;
    private DefaultListModel<String> listModel;

    // The constructor receives the backend manager
    public AccountForm(ShopManager manager) {
        this.manager = manager;

        // UI Setup (done visually in IntelliJ Designer or via code)
        buildUI();

        // 3. THE CONNECTION POINT: Wiring user action to backend code
        btnAddCustomer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Step A: Grab input from the UI field
                String inputName = txtCustomerName.getText();

                try {
                    // Step B: Send data into your backend logic!
                    manager.registerCustomer(inputName);

                    // Step C: Update the UI on success
                    updateCustomerListView();
                    txtCustomerName.setText(""); // clear the field

                    JOptionPane.showMessageDialog(rootPanel,
                            "Customer successfully added!",
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE);

                } catch (IllegalArgumentException ex) {
                    // Step D: Backend validation caught by the UI dialog
                    JOptionPane.showMessageDialog(rootPanel,
                            ex.getMessage(),
                            "Input Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    // Helper method to sync UI JList with the backend List<Customer>
    private void updateCustomerListView() {
        listModel.clear();
        for (Customer c : manager.getCustomerList()) {
            listModel.addElement(c.getName());
        }
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    // Visual layout setup (IntelliJ GUI Designer handles this structure)
    private void buildUI() {
        rootPanel = new JPanel(new BorderLayout(10, 10));
        rootPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        // Top input panel
        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        inputPanel.add(new JLabel("Customer Name:"));
        txtCustomerName = new JTextField(15);
        inputPanel.add(txtCustomerName);
        btnAddCustomer = new JButton("Register Account");
        inputPanel.add(btnAddCustomer);

        // Center list view
        listModel = new DefaultListModel<>();
        listCustomers = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(listCustomers);

        rootPanel.add(inputPanel, BorderLayout.NORTH);
        rootPanel.add(scrollPane, BorderLayout.CENTER);
    }
}