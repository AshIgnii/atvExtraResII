import javax.swing.*;
import java.awt.*;

public class Utils {
    public static void refreshNames(JPanel panelContainer, NamesArray namesArr) {
        panelContainer.removeAll();
        for (String name : namesArr.getNames()) {
            Color color = Color.black;
            if (name.isBlank()) {
                name = "VAZIO";
                color = Color.red;
            }
            NamePanel namePanel = new NamePanel(name, color);
            addPanelToFrame(namePanel, panelContainer);
        }
    }

    public static void addPanelToFrame(JPanel addedPanel, JPanel frame) {
        frame.add(addedPanel);
        frame.revalidate();
        frame.repaint();
    }
}
