import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Events {
    //TODO: NAMED CLASS
    static class MyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Clicked!");
        }
    }


    public static void main(String[] koiychi) {
        JFrame f = new JFrame("Events");
        JPanel p = new JPanel(new GridLayout(1, 3));

        JButton btn1 = new JButton("Layouts");
        JButton btn2 = new JButton("Components");
        JButton btn3 = new JButton("Dialogs");

        p.add(btn1);
        p.add(btn2);
        p.add(btn3);

        btn1.addActionListener(e -> new Layouts());
        btn2.addActionListener(e -> new Components());
        btn3.addActionListener(e -> new Dialogs());
//        btn2.addActionListener(e -> {
//            Components c = new Components();
//        });

//        JButton btn1 = new JButton("Click Me! :>");
//        p.add(btn1);
//        btn1.addActionListener(new MyListener()); //Using Named class
//
//        Event source - Button
//        Event Component - Logic - What will happen after clicking the button?
//        Event Listener - Wait if something is happening
//
//        TODO: LAMBDA - for short expressions
//        btn1.addActionListener(e -> System.out.println("Clicked!"));
//
//        TODO: ANONYMOUS CLASS
//        btn1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Clicked!");
//                JOptionPane.showMessageDialog(f, "You clicked a button!");
//            }
//        });
//
//        btn1.addMouseListener(new MouseListener() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                JOptionPane.showMessageDialog(f, "Clicked!");
//            }
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//
//            }
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                btn1.setBackground(Color.LIGHT_GRAY);
//                System.out.println("Wii");
//                btn1.setText("Mouse Entered...");
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//                btn1.setBackground(null);
//                System.out.println("Woo");
//                btn1.setText("Click Me...");
//            }
//        });

        //FRAME SETTINGS

        f.add(p);
        f.setVisible(true);
        f.setSize(800, 600);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
