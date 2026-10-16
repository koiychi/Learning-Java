/*
IT 203 - Activity 9: GUI with Swing I
Name: Rodriguez, Miles
Section: BSIT 2H-G1
Option Chosen: 1
Date: October 16, 2026
*/

import javax.swing.*;
import java.awt.*;

public class TaskTrackerApp {
    public static void main(String[] koiychi) {

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
        listPanel.add(buttonPanel, BorderLayout.NORTH);

        addButton.addActionListener(e -> {
            String task = taskName.getText();
            String due = dueDate.getText();
            String code = new String(accessCode.getPassword());
            String taskNotes = notes.getText();
            System.out.println("[Add Task clicked] name=\"" + task + "\", due=\"" + due + "\", accessCode=\"" + code + "\", notes=\"" + taskNotes + "\"");
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

        // Sample Tasks List
        String[] sampleTasks = {
            "Work on OOP Activity 9",
            "Submit OOP Activity 9",
            "IM Activity",
            "Prepare for OOP Group Meeting",
            "Prepare Weekly Group Assignments"
        };


        JList<String> taskList = new JList<>(sampleTasks);
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

Part E Output ----------------------------------------------------------
formPanel.getSize() = java.awt.Dimension[width=524,height=228]
controlPanel.getSize() = java.awt.Dimension[width=524,height=45]
listPanel.getSize() = java.awt.Dimension[width=524,height=198]
addButton.getBounds() = java.awt.Rectangle[x=219,y=5,width=86,height=26]
trackerAppFrame.getSize() = java.awt.Dimension[width=538,height=524]

If another row would be added to formPanel, definitely its .getSize()
specifically its height would change and increase vertically. This happens as
adding more rows on the formPanel of course would take more space,
and then eventually, the frame's size would adjust in response to formPanel's adjustments.


Part F: Classify: Which Layout?

1. The GridLayout is the best for a calculator's 4x4 buttons to give
it equal-sized cells forming a grid.
2. FlowLayout is the best for a toolbar of icons to allow it to adapt
by taking the space on the row below it original row when space is running
out due to shrinking window size.
3. BorderLayout is the best as it allow the message to be pinned or take the
bottom or the south of the window.
4. GridLayout allows each label and their partner textFields to be on the same alignment
giving consistent columns and rows.

*/