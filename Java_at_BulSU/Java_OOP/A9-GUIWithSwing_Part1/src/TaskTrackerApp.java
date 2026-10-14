import javax.swing.*;
import java.awt.*;

/*
* IT203 - Activity 9: GUI with Swing I
* Name: Rodriguez, Miles
* Section: BSIT 2H-G1
* Option Chosen: 1
* Date: October 10, 2026
* */
public class TaskTrackerApp {
    public static void main (String[] koiychi) {
        JFrame frame = new JFrame("Task Tracker: Rodriguez, Miles (BSIT 2H-G1)");

        //mainPanel
        JPanel mainPanel = new JPanel(new BorderLayout(8, 8));

        //Other Panels
        JPanel formPanel = new JPanel(new GridLayout(4, 2, 8, 8));
        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JPanel listPanel = new JPanel(new BorderLayout(5, 5));

        //MAIN PANEL
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(controlPanel, BorderLayout.CENTER);
        mainPanel.add(listPanel, BorderLayout.SOUTH);

        //FORM PANEL
        JLabel taskNameLabel = new JLabel("Task Name");
        formPanel.add(taskNameLabel);
        JTextField taskNameField = new JTextField();
        formPanel.add(taskNameField);

        JLabel dueDateLabel = new JLabel("Due Date");
        formPanel.add(dueDateLabel);
        JTextField dueDateField = new JTextField();
        formPanel.add(dueDateField);

        JLabel passwordLabel = new JLabel("Access Code");
        formPanel.add(passwordLabel);
        JPasswordField passwordField = new JPasswordField();
        formPanel.add(passwordField);

        JLabel notesLabel = new JLabel("Notes");
        formPanel.add(notesLabel);
        JPanel notesPanel = new JPanel(new FlowLayout()); //create a panel to contain the JTextField
        //textAreaPanel.setBorder(BorderFactory.createTitledBorder("JTextArea")); //set borders
        JTextArea notes = new JTextArea(); //create the actual JTextField and its contents
        notes.setText("Remember bla bla bla");
        formPanel.add(notes);



        //LIST PANEL
        listPanel.add(new JButton("Add Task"));


        //FRAME
        frame.add(mainPanel);

        //FRAME SETTINGS
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
