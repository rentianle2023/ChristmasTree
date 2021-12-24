package Tree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SantaPanel extends JLabel{

    public SantaPanel() {
        this.setPreferredSize(new Dimension(500,500));
        ImageIcon icon = new ImageIcon("assets/santa.png");
        this.setIcon(icon);
        this.setText("您有一份来自乐仔的礼物吼吼~");

        this.setFont(new Font("黑体", Font.BOLD,23));
        this.setIconTextGap(20);
        this.setHorizontalTextPosition(CENTER);
        this.setVerticalTextPosition(TOP);
    }
}
