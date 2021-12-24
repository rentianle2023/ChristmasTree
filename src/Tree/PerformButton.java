package Tree;

import javax.swing.*;
import java.awt.*;

public class PerformButton extends JButton {

    public PerformButton() {

        this.setText("谢谢Santa!收下礼物!");
        this.setFont(new Font("Serif",Font.BOLD,13));
        this.setFocusable(false);
        this.setForeground(new Color(0xEA4630));
        this.setBackground(Color.lightGray);
        this.setBorder(BorderFactory.createEtchedBorder());
    }
}
