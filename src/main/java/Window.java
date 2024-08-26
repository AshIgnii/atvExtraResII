import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window(NamesArray namesArr) {
        super("Atividade Extra Resolução de Problemas Estruturados II");
        setVisible(false);
        setLayout(new GridBagLayout());
        setSize(800, 500);
        setMinimumSize(new Dimension(800, 500));
        setBackground(Color.lightGray);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridBagConstraints c = new GridBagConstraints();

        JPanel panelContainer = new JPanel();
        panelContainer.setLayout(new BoxLayout(panelContainer, BoxLayout.Y_AXIS));
        panelContainer.setBorder(null);
        panelContainer.setBackground(Color.white);

        JLabel label = new JLabel("Adicionar nome:");
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10, 10, 5, 5);
        c.anchor = GridBagConstraints.WEST;
        this.add(label, c);

        NameAddBar addBar = new NameAddBar(20, panelContainer, namesArr);
        c.gridx = 1;
        c.gridy = 0;
        c.insets = new Insets(10, 5, 5, 10);
        c.fill = GridBagConstraints.HORIZONTAL;
        this.add(addBar, c);

        JScrollPane scrollPane = new JScrollPane(panelContainer);
        scrollPane.setPreferredSize(new Dimension(520, 200));
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        c.gridx = 0;
        c.gridy = 1;
        c.insets = new Insets(5, 10, 10, 10);
        c.gridwidth = 2;
        c.gridheight = 1;
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;
        c.anchor = GridBagConstraints.CENTER;
        this.add(scrollPane, c);

        ButtonPanel buttonPanel = new ButtonPanel(namesArr, panelContainer);
        c.gridx = 2;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0;
        c.weighty = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.NORTH;
        this.add(buttonPanel, c);

        setVisible(true);
    }

}
