import javax.swing.*;
import java.awt.*;

public class Layouts {
    public static void main(String [] koiychi) {

        //Creating the Window
        JFrame f = new JFrame("Layout Managers");

        //----------------------------------------------------------//

        //BORDER LAYOUT
        JPanel borderPanel = new JPanel(new BorderLayout());

        borderPanel.add(new JButton("NORTH"), BorderLayout.NORTH);
        borderPanel.add(new JButton("CENTER"), BorderLayout.CENTER);
        borderPanel.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        borderPanel.add(new JButton("WEST"), BorderLayout.WEST);
        borderPanel.add(new JButton("EAST"), BorderLayout.EAST);

        //----------------------------------------------------------//

        //FLOW LAYOUT
        JPanel flowLayout = new JPanel(new FlowLayout());
        flowLayout.add(new JButton("Button One"));
        flowLayout.add(new JButton("Button Two"));
        flowLayout.add(new JButton("Button Three"));
        flowLayout.add(new JButton("Button Four"));
        flowLayout.add(new JButton("Button Five"));
        flowLayout.add(new JButton("Button Six"));
        flowLayout.add(new JButton("Button Seven"));
        flowLayout.add(new JButton("Button Eight"));

        //----------------------------------------------------------//

        //GRID LAYOUT
        JPanel gridLayout = new JPanel(new GridLayout(3, 4));
        gridLayout.add(new JButton("Button One"));
        gridLayout.add(new JButton("Button Two"));
        gridLayout.add(new JButton("Button Three"));
        gridLayout.add(new JButton("Button Four"));
        gridLayout.add(new JButton("Button Five"));
        gridLayout.add(new JButton("Button Six"));
        gridLayout.add(new JButton("Button Seven"));
        gridLayout.add(new JButton("Button Eight"));

        //----------------------------------------------------------//

        //SETTINGS FOR THE WINDOW (FRAME)
        f.setSize(800, 400); //Set the size
        f.setVisible(true); //Set the window to be visible
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Auto-stop at close
        f.setLocationRelativeTo(null); //Set the frame at the center

        //ADDING PANELS TO THE FRAME (WINDOW)
//        f.add(borderPanel);
//        f.add(flowLayout);
//        f.add(gridLayout);

        //----------------------------------------------------------//

        //MAIN PANEL
        JPanel mainPanel = new JPanel(new GridLayout(1, 3));
        mainPanel.add(borderPanel);
        mainPanel.add(flowLayout);
        mainPanel.add(gridLayout);

        //Adding the main panel to the window (frame)
        f.add(mainPanel);

        //----------------------------------------------------------//

    }
}
