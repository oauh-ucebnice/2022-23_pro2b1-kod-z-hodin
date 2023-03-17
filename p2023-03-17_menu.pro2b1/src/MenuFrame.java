import javax.swing.*;
import java.awt.event.KeyEvent;

public class MenuFrame extends JFrame {
    private JPanel mainPanel;

    private JMenuBar menuBar;
    private JMenu menuFile;
    private JMenuItem miOpenFile;

    public MenuFrame() {
        initComponents();
    }

    private void initComponents() {
        menuBar = new JMenuBar();

        menuFile = new JMenu("File");
        menuFile.setMnemonic(KeyEvent.VK_F);
        menuBar.add(menuFile);

        miOpenFile = new JMenuItem("File");
        menuFile.add(miOpenFile);

        miOpenFile.addActionListener(e -> readFile());

        setJMenuBar(menuBar);

    }

    private void readFile() {
        // ...
    }
}
