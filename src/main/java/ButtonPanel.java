import javax.swing.*;
import java.awt.*;

public class ButtonPanel extends JPanel {
    public ButtonPanel(NamesArray namesArr, JPanel panelContainer) {
        super();
        setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();

        JButton azButton = new JButton("A-Z");
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(5, 10, 5, 10);
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0;
        c.weighty = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.NORTH;
        this.add(azButton, c);
        azButton.addActionListener(_ -> {
            namesArr.sortNamesAZ();
            Utils.refreshNames(panelContainer, namesArr);
        });

        JButton zaButton = new JButton("Z-A");
        c.gridx = 0;
        c.gridy = 1;
        c.insets = new Insets(5, 10, 5, 10);
        this.add(zaButton, c);
        zaButton.addActionListener(_ -> {
            namesArr.sortNamesZA();
            Utils.refreshNames(panelContainer, namesArr);
        });

        JButton invertButton = new JButton("Inverter");
        c.gridx = 0;
        c.gridy = 2;
        c.insets = new Insets(5, 10, 30, 10);
        this.add(invertButton, c);
        invertButton.addActionListener(_ -> {
            namesArr.invert();
            Utils.refreshNames(panelContainer, namesArr);
        });

        JButton removeDupButton = new JButton("Remover Duplicados");
        c.gridx = 0;
        c.gridy = 3;
        c.insets = new Insets(0, 10, 5, 10);
        this.add(removeDupButton, c);
        removeDupButton.addActionListener(_ -> {
            namesArr.removeDuplicates();
            Utils.refreshNames(panelContainer, namesArr);
        });

        JButton removeEmpButton = new JButton("Remover Vazios");
        c.gridx = 0;
        c.gridy = 4;
        c.insets = new Insets(5, 10, 5, 10);
        this.add(removeEmpButton, c);
        removeEmpButton.addActionListener(_ -> {
            namesArr.removeEmpty();
            Utils.refreshNames(panelContainer, namesArr);
        });

        JButton trimButton = new JButton("Aplicar Trim()");
        c.gridx = 0;
        c.gridy = 5;
        c.insets = new Insets(5, 10, 30, 10);
        this.add(trimButton, c);
        trimButton.addActionListener(_ -> {
            namesArr.applyTrim();
            Utils.refreshNames(panelContainer, namesArr);
        });

        JButton conUpperButton = new JButton("Converter MAIÚSCULO");
        c.gridx = 0;
        c.gridy = 6;
        c.insets = new Insets(0, 10, 5, 10);
        this.add(conUpperButton, c);
        conUpperButton.addActionListener(_ -> {
            namesArr.toUpperCase();
            Utils.refreshNames(panelContainer, namesArr);
        });

        JButton conLowerButton = new JButton("Converter minúsculo");
        c.gridx = 0;
        c.gridy = 7;
        c.insets = new Insets(5, 10, 5, 10);
        this.add(conLowerButton, c);
        conLowerButton.addActionListener(_ -> {
            namesArr.toLowerCase();
            Utils.refreshNames(panelContainer, namesArr);
        });

        JButton capButton = new JButton("Capitalizar");
        c.gridx = 0;
        c.gridy = 8;
        c.insets = new Insets(5, 10, 5, 10);
        this.add(capButton, c);
        capButton.addActionListener(_ -> {
            namesArr.capitalize();
            Utils.refreshNames(panelContainer, namesArr);
        });

        setVisible(true);
    }
}
