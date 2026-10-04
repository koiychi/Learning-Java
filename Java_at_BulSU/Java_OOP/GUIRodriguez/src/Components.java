import javax.swing.*;
import java.awt.*;

public class Components {
    public static void main (String[] koiychi) {

        //CONTAINERS ----------------------------------------------------------------

        //JFrame
        JFrame f = new JFrame("Components"); //Creating the window (frame)

        //JPanel
        JPanel mainPanel = new JPanel(new GridLayout(0, 2)); //(row, col)

        //COMPONENTS ----------------------------------------------------------------

        //JLabel
        JPanel labelPanel = new JPanel(new FlowLayout()); //create a panel to contain the JLabel
        labelPanel.setBorder(BorderFactory.createTitledBorder("JLabel")); //set borders
        JLabel label = new JLabel("Hello, Java!"); //create the actual JLabel and its contents
        labelPanel.add(label); //adding the label (actual JLabel) to the labelPanel
        mainPanel.add(labelPanel); //adding the labelPanel to mainPanel

        //JTextField
        JPanel textFieldPanel = new JPanel(new FlowLayout()); //create a panel to contain the JTextField
        textFieldPanel.setBorder(BorderFactory.createTitledBorder("JTextField")); //set borders
        JTextField textField = new JTextField(25); //create the actual JTextField and its contents
        textFieldPanel.add(textField); //adding the textField (actual JTextField) to the textFieldPanel
        mainPanel.add(textFieldPanel);

        //JButton
        JPanel buttonPanel = new JPanel(new FlowLayout()); //create a panel to contain the JButton
        buttonPanel.setBorder(BorderFactory.createTitledBorder("JButton")); //set borders
        JButton btn = new JButton("Click me!"); //create the actual JButton
        buttonPanel.add(btn); //adding the button (actual JButton) to the buttonPanel
        mainPanel.add(buttonPanel); //adding the buttonPanel to mainPanel

        //JCheckbox
        JPanel checkBoxPanel = new JPanel(new FlowLayout()); //create a panel to contain the JCheckBox
        checkBoxPanel.setBorder(BorderFactory.createTitledBorder("JCheckBox")); //set borders
        JCheckBox cbx1 = new JCheckBox("Java"); //create the actual JCheckBox
        JCheckBox cbx2 = new JCheckBox("Python"); //create the actual JCheckBox
        JCheckBox cbx3 = new JCheckBox("C++"); //create the actual JCheckBox
        checkBoxPanel.add(cbx1); //adding the checkBox (actual JCheckBox) to the checkBoxPanel
        checkBoxPanel.add(cbx2); //adding the checkBox (actual JCheckBox) to the checkBoxPanel
        checkBoxPanel.add(cbx3); //adding the checkBox (actual JCheckBox) to the checkBoxPanel
        mainPanel.add(checkBoxPanel); //adding the checkBoxPanel to mainPanel

        //JRadioButton
        ButtonGroup sex = new ButtonGroup();
        JPanel radioButtonPanel = new JPanel(new FlowLayout()); //create a panel to contain the JRadioButton
        radioButtonPanel.setBorder(BorderFactory.createTitledBorder("JRadioButton")); //set borders
        JRadioButton male = new JRadioButton("Male"); //create the actual JRadioButton
        JRadioButton female = new JRadioButton("Female"); //create the actual JRadioButton

        sex.add(male); //adding the radio buttons (actual JRadioButton) to the radioButtonPanel
        sex.add(female); //adding the radio buttons (actual JRadioButton) to the radioButtonPanel

        radioButtonPanel.add(male);
        radioButtonPanel.add(female);
        mainPanel.add(radioButtonPanel); //adding the radioButtonPanel to mainPanel

        //JComboBox
        JPanel comboBoxPanel = new JPanel(new FlowLayout()); //create a panel to contain the JComboBox
        comboBoxPanel.setBorder(BorderFactory.createTitledBorder("JComboBox")); //set borders
        String[] provinces = {"Aurora", "Bataan", "Bulacan", "Nueva Ecija", "Pampanga", "Tarlac", "Zambales", "Biringan"};
        JComboBox<String> cbx = new JComboBox<>(provinces); //create the actual JButton
        comboBoxPanel.add(cbx); //adding the button (actual JButton) to the buttonPanel
        mainPanel.add(comboBoxPanel); //adding the buttonPanel to mainPanel

        //JPasswordField
        JPanel passwordFieldPanel = new JPanel(new FlowLayout()); //create a panel to contain the JTextField
        passwordFieldPanel.setBorder(BorderFactory.createTitledBorder("JPasswordField")); //set borders
        JPasswordField pw = new JPasswordField(25); //create the actual JTextField and its contents
        passwordFieldPanel.add(pw); //adding the textField (actual JTextField) to the textFieldPanel
        mainPanel.add(passwordFieldPanel);

        //JTextArea
        JPanel textAreaPanel = new JPanel(new FlowLayout()); //create a panel to contain the JTextField
        textAreaPanel.setBorder(BorderFactory.createTitledBorder("JTextArea")); //set borders
        JTextArea txt = new JTextArea(); //create the actual JTextField and its contents
        txt.setText("Would the quick brown fox jump over the lazy dog?");
        textAreaPanel.add(txt); //adding the textField (actual JTextField) to the textFieldPanel
        mainPanel.add(textAreaPanel);

        //JSpinner
        JPanel spinnerPanel = new JPanel(new FlowLayout()); //create a panel to contain the JTextField
        spinnerPanel.setBorder(BorderFactory.createTitledBorder("JSpinner")); //set borders
        JSpinner age = new JSpinner(new SpinnerNumberModel(18, 0, 100, 1)); //create the actual JTextField and its contents
        spinnerPanel.add(age); //adding the textField (actual JTextField) to the textFieldPanel
        mainPanel.add(spinnerPanel);

        //JProgressBar
        JPanel progressBarPanel = new JPanel(new FlowLayout()); //create a panel to contain the JTextField
        progressBarPanel.setBorder(BorderFactory.createTitledBorder("JProgressBar")); //set borders
        JProgressBar progress = new JProgressBar(0, 100); //create the actual JTextField and its contents
        progress.setValue(23);
        progress.setStringPainted(true);
        progressBarPanel.add(progress); //adding the textField (actual JTextField) to the textFieldPanel
        mainPanel.add(progressBarPanel);

        //JSlider
        JPanel sliderPanel = new JPanel(new FlowLayout()); //create a panel to contain the JTextField
        sliderPanel.setBorder(BorderFactory.createTitledBorder("JSlider")); //set borders
        JSlider vol = new JSlider(0, 100, 50); //create the actual JTextField and its contents
        vol.setMajorTickSpacing(25);
        vol.setPaintTicks(true);
        vol.setPaintLabels(true);
        sliderPanel.add(vol); //adding the textField (actual JTextField) to the textFieldPanel
        mainPanel.add(sliderPanel);

        //JList
        JPanel listPanel = new JPanel(new FlowLayout()); //create a panel to contain the JTextField
        listPanel.setBorder(BorderFactory.createTitledBorder("JList")); //set borders
        String[] courses = {"OOP", "IM", "DSA", "Net1", "PATHFit", "Rizal", "STS", "QM", "MMW", "CP"};
        JList<String> list = new JList<>(courses); //create the actual JTextField and its contents
        listPanel.add(new JScrollPane(list), BorderLayout.CENTER);
        mainPanel.add(listPanel);

        //JTabPane
        JPanel tabPanel = new JPanel(new FlowLayout()); //create a panel to contain the JTextField
        tabPanel.setBorder(BorderFactory.createTitledBorder("JTabPanel")); //set borders
        JTabbedPane tabs = new JTabbedPane();
        tabs.addTab("Inbox", new JLabel("Inbox"));
        tabs.addTab("Activities", new JLabel("Activities"));
        tabs.addTab("Teams", new JLabel("Teams"));
        tabs.addTab("Calendar", new JLabel("Calendar"));
        tabs.addTab("Assignment", new JLabel("Assignment"));
        tabPanel.add(tabs);
        mainPanel.add(tabPanel);

        //JTable
        JPanel tablePanel = new JPanel(new FlowLayout()); //create a panel to contain the JTextField
        tablePanel.setBorder(BorderFactory.createTitledBorder("JTable")); //set borders

        String[] columns = {"ID", "Name", "Program", "GWA"};
        Object[][] data = {
                {2023123456, "Gerald", "BSCS", 1.24},
                {2025003987, "Miles", "BSIT", 1.00},
                {2025973844, "MJ", "BSIS", 1.00},
                {2024123456, "LJ", "BLIS", 1.23},
                {2026123456, "Sandra", "BSN", 1.36},
                {2023123456, "Gerald", "BSCS", 1.24},
                {2025003987, "Miles", "BSIT", 1.00},
                {2025973844, "MJ", "BSIS", 1.00},
                {2024123456, "LJ", "BLIS", 1.23},
                {2026123456, "Sandra", "BSN", 1.36},
                {2023123456, "Gerald", "BSCS", 1.24},
                {2025003987, "Miles", "BSIT", 1.00},
                {2025973844, "MJ", "BSIS", 1.00},
                {2024123456, "LJ", "BLIS", 1.23},
                {2026123456, "Sandra", "BSN", 1.36}
        };

        JTable tb = new JTable(data, columns);

        tablePanel.add(new JScrollPane(tb), BorderLayout.CENTER);
        mainPanel.add(tablePanel);


        //FRAME SETTINGS ------------------------------------------------------------
        f.setSize(800, 400); //Set window size
        f.setVisible(true); //Set the frame visibility
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Auto-stop at close
        f.setLocationRelativeTo(null); //Set the frame at the center

        //ADDING PANELS TO FRAME
        f.add(new JScrollPane(mainPanel));
    }
}
