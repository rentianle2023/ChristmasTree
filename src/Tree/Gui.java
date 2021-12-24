package Tree;

import javax.swing.*;
import java.awt.*;

public class Gui {



    public static void main(String[] args) {

        JFrame frame  = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //default: HIDE_ON_CLOSE
        frame.setResizable(false); //Not Resizable
        frame.setSize(400,700); //x-dimension & y-dimension
        frame.setVisible(true); //visible
        frame.getContentPane().setBackground(Color.RED);

        Image star = new ImageIcon("star.png").getImage();


    }


}
