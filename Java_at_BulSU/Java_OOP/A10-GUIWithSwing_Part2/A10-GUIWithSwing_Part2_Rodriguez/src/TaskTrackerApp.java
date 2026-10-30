/*
IT 203 - Activity 10: GUI with Swing II
Name: Rodriguez, Miles
Section: BSIT 2H-G1
Option Chosen: 1
Date: October 23, 2026
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TaskTrackerApp {
    public static void main(String[] koiychi) {

        DefaultListModel<String> listModel = new DefaultListModel<>();

    //PART A
        //Creating the frame
        JFrame trackerAppFrame = new JFrame("Task Tracker: Rodriguez, Miles (BSIT 2H-G1)");

        //mainPanel
        JPanel mainPanel = new JPanel(new BorderLayout(8, 8));
        trackerAppFrame.add(mainPanel);

    //PART B
        //3-region nested panels
        JPanel formPanel = new JPanel(new GridLayout(4, 2, 8, 8));
        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JPanel listPanel = new JPanel(new BorderLayout(5, 5));

        //added to the frame
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(controlPanel, BorderLayout.CENTER);
        mainPanel.add(listPanel, BorderLayout.SOUTH);

    //PART C
        JLabel taskNameLabel = new JLabel("Task Name");
        formPanel.add(taskNameLabel);
        JTextField taskName = new JTextField(20);
        formPanel.add(taskName);

        JLabel dueDateLabel = new JLabel("Due Date");
        formPanel.add(dueDateLabel);
        JTextField dueDate = new JTextField(20);
        formPanel.add(dueDate);

        JLabel accessCodeLabel = new JLabel("Access Code");
        formPanel.add(accessCodeLabel);
        JPasswordField accessCode = new JPasswordField(20);
        formPanel.add(accessCode);

        JLabel notesLabel = new JLabel("Notes");
        formPanel.add(notesLabel);
        JTextArea notes = new JTextArea(3, 20);
        notes.setText("Add something to remember dito...");
        JScrollPane notesScrollPane = new JScrollPane(notes);
        formPanel.add(notesScrollPane);

        //Button and ActionListener
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton addButton = new JButton("Add Task");
        buttonPanel.add(addButton);
        JButton clearButton = new JButton("Clear Form Selections");
        buttonPanel.add(clearButton);
        JButton cancelButton = new JButton("Cancel Selections");
        buttonPanel.add(cancelButton);
        JButton quickAddButton = new JButton("Quickly Add");
        buttonPanel.add(quickAddButton);
        JButton markLowButton = new JButton("Mark Low");
        buttonPanel.add(markLowButton);
        JButton markHighButton = new JButton("Mark High");
        buttonPanel.add(markHighButton);
        listPanel.add(buttonPanel, BorderLayout.NORTH);

        addButton.addActionListener(e -> {
            if (taskName.getText().trim().isEmpty() || dueDate.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(
                        trackerAppFrame,
                        "Task Name or Due Date cannot be empty",
                        "No Input",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }


            String task = taskName.getText();
            String due = dueDate.getText();
            String code = new String(accessCode.getPassword());
            String taskNotes = notes.getText();
            System.out.println("[Add Task clicked] name=\"" + task + "\", due=\"" + due + "\", accessCode=\"" + code + "\", notes=\"" + taskNotes + "\"");

            listModel.addElement(task + " (Due: " + due + ")");
            JOptionPane.showMessageDialog(
                    trackerAppFrame,
                    "Task successfully added!",
                    "Task Added",
                    JOptionPane.INFORMATION_MESSAGE
            );
        });

    //PART D
        //Priority selection with JComboBox
        String[] priorities = {"Low", "Medium", "High", "Urgent"};
        JComboBox<String> priorityBox = new JComboBox<>(priorities);
        controlPanel.add(priorityBox);

        // Radio buttons
        JRadioButton personalRadio = new JRadioButton("Personal", true);
        JRadioButton schoolRadio = new JRadioButton("School");
        JRadioButton workRadio = new JRadioButton("Work");

        //Radio buttons grouped into one category
        ButtonGroup categoryGroup = new ButtonGroup();
        categoryGroup.add(personalRadio);
        categoryGroup.add(schoolRadio);
        categoryGroup.add(workRadio);

        controlPanel.add(personalRadio);
        controlPanel.add(schoolRadio);
        controlPanel.add(workRadio);

        // Independent JCheckboxes
        JCheckBox notifyBox = new JCheckBox("Notify Me");
        controlPanel.add(notifyBox);
        JCheckBox repeatBox = new JCheckBox("Repeat Weekly");
        controlPanel.add(repeatBox);

//        // Sample Tasks List
//        String[] sampleTasks = {
//            "Work on OOP Activity 9",
//            "Submit OOP Activity 9",
//            "IM Activity",
//            "Prepare for OOP Group Meeting",
//            "Prepare Weekly Group Assignments"
//        };


        JList<String> taskList = new JList<>(listModel);
        taskList.setVisibleRowCount(5);
        JScrollPane listScrollPane = new JScrollPane(taskList);
        listPanel.add(listScrollPane, BorderLayout.CENTER);

        // Urgency Slider
        JPanel sliderPanel = new JPanel(new BorderLayout());
        JLabel sliderLabel = new JLabel("Urgency", JLabel.CENTER);
        sliderPanel.add(sliderLabel, BorderLayout.NORTH);

        JSlider urgencySlider = new JSlider(1, 10, 5);
        urgencySlider.setMajorTickSpacing(1);
        urgencySlider.setPaintTicks(true);
        urgencySlider.setPaintLabels(true);
        sliderPanel.add(urgencySlider, BorderLayout.CENTER);

        listPanel.add(sliderPanel, BorderLayout.SOUTH);


        clearButton.addActionListener(new ClearFormListener(
                taskName, dueDate, accessCode, notes, personalRadio, notifyBox, repeatBox
        ));

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int choice = JOptionPane.showConfirmDialog(
                        trackerAppFrame,
                        "Are you sure you would like to cancel input? This action will clear this form",
                        "Confirm Cancellation",
                        JOptionPane.YES_NO_OPTION
                );
                if (choice == JOptionPane.YES_OPTION) {
                    taskName.setText("");
                    dueDate.setText("");
                    accessCode.setText("");
                    notes.setText("");
                }
            }
        });

        ActionListener sharedMarkListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cmd = e.getActionCommand();
                if ("Mark Low".equals(cmd)) {
                    priorityBox.setSelectedItem("Low");
                } else if ("Mark High".equals(cmd)) {
                    priorityBox.setSelectedItem("High");
                }
            }
        };
        markLowButton.addActionListener(sharedMarkListener);
        markHighButton.addActionListener(sharedMarkListener);

        quickAddButton.addActionListener(e -> {
            String input = JOptionPane.showInputDialog(
                    trackerAppFrame,
                    "Enter quick task name:",
                    "Quick Add",
                    JOptionPane.QUESTION_MESSAGE
            );
            if (input != null && !input.trim().isEmpty()) {
                listModel.addElement(input.trim());
            }
        });

        addButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                addButton.setBackground(Color.ORANGE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                addButton.setBackground(null);
            }
        });

        //Settigns for the frame
        trackerAppFrame.pack();

        System.out.println("formPanel.getSize() = " + formPanel.getSize());
        System.out.println("controlPanel.getSize() = " + controlPanel.getSize());
        System.out.println("listPanel.getSize() = " + listPanel.getSize());
        System.out.println("addButton.getBounds() = " + addButton.getBounds());
        System.out.println("trackerAppFrame.getSize() = " + trackerAppFrame.getSize());

        trackerAppFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        trackerAppFrame.setVisible(true);
    }
}

/*

> addMouseListner cannot be written as a one-line lambda as it is composed of many methods.
We need to implement every each of those methods so a one-line lambda simply cannot work.

> They just listens independently for whatever could happen in a component like hover or click.
They are not actually tied to a component that it is prohibited to put another listener, therefore
allowing us to implement multiple events on the same component.

*/