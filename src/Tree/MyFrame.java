package Tree;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

public class MyFrame extends JFrame implements MouseListener {

    TreePanel tree;
    SantaPanel santa;
    GiftPanel gift;
    PerformButton button;

    public static void main(String[] args) {
        new MyFrame();
    }
    public MyFrame() throws HeadlessException {

        this.setTitle("Christmas Tree");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //default: HIDE_ON_CLOSE
        this.setResizable(false); //Not Resizable
        this.setSize(400,1000); //x-dimension & y-dimension
        this.setLayout(null);
        this.setVisible(true); //visible
        ImageIcon image = new ImageIcon("assets/tree.png");
        this.setIconImage(image.getImage()); //set icon

        button = new PerformButton();
        button.setBounds(120,400,150,30);
        button.addMouseListener(this);
        this.add(button);

        gift = new GiftPanel();
        gift.setBounds(90,30,400,430);
        this.add(gift);

        santa = new SantaPanel();
        santa.setBounds(30,380,400,450);
        this.add(santa);

        tree = new TreePanel();
        tree.setBounds(-5,30,400,430);
        this.add(tree);



        this.getContentPane().setBackground(new Color(0xEA4630));


    }

    @Override
    public void mouseClicked(MouseEvent e) {
        gift.setVisible(false);
        santa.setIcon(new ImageIcon("assets/santaJump.png"));
        santa.setText("Marry Christmas 岑岑小仙女!");
        button.setVisible(false);

        File file = new File("assets/song.wav");
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        tree.enableLight();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
