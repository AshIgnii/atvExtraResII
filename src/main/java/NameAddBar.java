import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class NameAddBar extends JTextField {
    public NameAddBar(int columns, JPanel panelContainer, NamesArray namesArr) {
        super(columns);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    namesArr.addName(getText());
                    Utils.refreshNames(panelContainer, namesArr);
                }
            }
        });
    }
}