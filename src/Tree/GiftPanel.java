package Tree;

import javax.swing.*;
import java.awt.*;

public class GiftPanel extends JLabel {

    public GiftPanel() {
        this.setPreferredSize(new Dimension(500,500));
        ImageIcon icon = new ImageIcon("assets/gift.png");
        this.setIcon(icon);
    }
}
