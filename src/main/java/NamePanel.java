import javax.swing.*;
import java.awt.*;

public class NamePanel extends JPanel {
    public NamePanel(String name, Color color) {
        super();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.white);
        setMinimumSize(new Dimension(20, 20));

        JLabel nameLabel = new JLabel(name);
        nameLabel.setForeground(color);
        add(nameLabel);
    }
}
