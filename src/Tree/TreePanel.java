package Tree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.util.Random;

public class TreePanel extends JPanel implements ActionListener {

    private static final int WIDTH = 25;
    private static final int HEIGHT = 25;
    private static double rotationAngle = 0;
    private static int level = -5;


    private int firstColor = 0xBB2528;
    private int secondColor = 0xF8B229;

    public void enableLight(){
        Timer timer = new Timer(400,this);
        timer.start();
    }

    public TreePanel() {
        this.setBackground(new Color(0xEA4630));
        this.setPreferredSize(new Dimension(500,500));
    }

    @Override
    public void paint(Graphics g) {

        Graphics2D g2d = (Graphics2D)g;

        super.paint(g);

        level++;
        g.setColor(new Color(0x165B33));

        int Y = 50;
        //第一层
        if(level < 1) return;
        g.fillRect(190,Y,WIDTH,HEIGHT);

        Y += 30;
        if(level < 2) return;
        g.fillRect(160,Y,WIDTH,HEIGHT);
        g.fillRect(190,Y,WIDTH,HEIGHT);
        g.fillRect(220,Y,WIDTH,HEIGHT);

        Y += 30;
        if(level < 3) return;
        g.fillRect(130,Y,WIDTH,HEIGHT);
        g.fillRect(160,Y,WIDTH,HEIGHT);
        g.fillRect(190,Y,WIDTH,HEIGHT);
        g.fillRect(220,Y,WIDTH,HEIGHT);
        g.fillRect(250,Y,WIDTH,HEIGHT);


        //第二层
        if(level < 4) return;
        Y += 30;
        g.fillRect(160,Y,WIDTH,HEIGHT);
        g.fillRect(190,Y,WIDTH,HEIGHT);
        g.fillRect(220,Y,WIDTH,HEIGHT);

        Y += 30;
        if(level < 5) return;
        g.fillRect(130,Y,WIDTH,HEIGHT);
        g.fillRect(160,Y,WIDTH,HEIGHT);
        g.fillRect(190,Y,WIDTH,HEIGHT);
        g.fillRect(220,Y,WIDTH,HEIGHT);
        g.fillRect(250,Y,WIDTH,HEIGHT);

        Y += 30;
        if(level < 6) return;
        g.fillRect(100,Y,WIDTH,HEIGHT);
        g.fillRect(130,Y,WIDTH,HEIGHT);
        g.fillRect(160,Y,WIDTH,HEIGHT);
        g.fillRect(190,Y,WIDTH,HEIGHT);
        g.fillRect(220,Y,WIDTH,HEIGHT);
        g.fillRect(250,Y,WIDTH,HEIGHT);
        g.fillRect(280,Y,WIDTH,HEIGHT);

        //第三层
        if(level < 7) return;
        Y += 30;
        g.fillRect(130,Y,WIDTH,HEIGHT);
        g.fillRect(160,Y,WIDTH,HEIGHT);
        g.fillRect(190,Y,WIDTH,HEIGHT);
        g.fillRect(220,Y,WIDTH,HEIGHT);
        g.fillRect(250,Y,WIDTH,HEIGHT);

        Y += 30;
        if(level < 8) return;
        g.fillRect(100,Y,WIDTH,HEIGHT);
        g.fillRect(130,Y,WIDTH,HEIGHT);
        g.fillRect(160,Y,WIDTH,HEIGHT);
        g.fillRect(190,Y,WIDTH,HEIGHT);
        g.fillRect(220,Y,WIDTH,HEIGHT);
        g.fillRect(250,Y,WIDTH,HEIGHT);
        g.fillRect(280,Y,WIDTH,HEIGHT);

        Y += 30;
        if(level < 9) return;
        g.fillRect(70,Y,WIDTH,HEIGHT);
        g.fillRect(100,Y,WIDTH,HEIGHT);
        g.fillRect(130,Y,WIDTH,HEIGHT);
        g.fillRect(160,Y,WIDTH,HEIGHT);
        g.fillRect(190,Y,WIDTH,HEIGHT);
        g.fillRect(220,Y,WIDTH,HEIGHT);
        g.fillRect(250,Y,WIDTH,HEIGHT);
        g.fillRect(280,Y,WIDTH,HEIGHT);
        g.fillRect(310,Y,WIDTH,HEIGHT);

        Y += 30;
        if(level < 10) return;
        g.fillRect(40,Y,WIDTH,HEIGHT);
        g.fillRect(70,Y,WIDTH,HEIGHT);
        g.fillRect(100,Y,WIDTH,HEIGHT);
        g.fillRect(130,Y,WIDTH,HEIGHT);
        g.fillRect(160,Y,WIDTH,HEIGHT);
        g.fillRect(190,Y,WIDTH,HEIGHT);
        g.fillRect(220,Y,WIDTH,HEIGHT);
        g.fillRect(250,Y,WIDTH,HEIGHT);
        g.fillRect(280,Y,WIDTH,HEIGHT);
        g.fillRect(310,Y,WIDTH,HEIGHT);
        g.fillRect(340,Y,WIDTH,HEIGHT);


        //花盆
        if(level < 11) return;
        g2d.setColor(new Color(0xA52A2A));
        g2d.fillPolygon(new int[]{170,240,230,180},new int[]{353,353,400,400},4);

        //雪
        if(level < 15) return;
        g2d.setColor(Color.WHITE);
        g2d.setStroke(new BasicStroke(10));
        g2d.drawArc(130,100,70,35,180,180);
        g2d.drawArc(200,100,70,35,180,180);

        g2d.drawArc(100,210,80,20,180,180);
        g2d.drawArc(180,215,60,20,0,180);
        g2d.drawArc(240,210,80,20,180,180);

        g2d.drawArc(40,320,80,30,180,180);
        g2d.drawArc(120,325,80,30,0,180);
        g2d.drawArc(200,320,80,30,180,180);
        g2d.drawArc(280,325,80,30,0,180);

        //球球
        g2d.setColor(new Color(firstColor));
        g2d.fillOval(120,110,30,30);
        g2d.fillOval(250,110,30,30);

        g2d.fillOval(230,210,30,30);
        g2d.fillOval(300,210,30,30);

        g2d.fillOval(30,320,30,30);
        g2d.fillOval(180,320,30,30);
        g2d.fillOval(350,320,30,30);

        g2d.setColor(new Color(secondColor));
        g2d.fillOval(185,110,30,30);

        g2d.fillOval(90,210,30,30);
        g2d.fillOval(170,210,30,30);

        g2d.fillOval(100,320,30,30);
        g2d.fillOval(270,320,30,30);


//        g2d.drawImage(star,173,10,60,60,null);


        /*Timer timer = new Timer(400,this);
        timer.start();
*/
        if(level < 16) return;
        ImageIcon icon = new ImageIcon("assets/star.png");
        Image star = icon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        star = new ImageIcon(star).getImage();
       /* g2d.drawImage(star,170,0,null);*/



        if(rotationAngle > 50) rotationAngle = 0;
        else rotationAngle += 10;
        AffineTransform tr = new AffineTransform();
        // X and Y are the coordinates of the image
        tr.translate(170, 0);
        tr.rotate(
                Math.toRadians(rotationAngle),
                star.getWidth(null) >> 1,
                star.getHeight(null) >> 1
        );
        g2d.drawImage(star,tr,null);

        // img is a BufferedImage instance
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        int i = new Random().nextInt(2);
        if(i == 1){
            int t = firstColor;
            firstColor = secondColor;
            secondColor = t;
        }
        repaint();

    }
}
