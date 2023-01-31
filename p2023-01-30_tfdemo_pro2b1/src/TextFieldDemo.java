import javax.swing.*;
import java.util.Random;

public class TextFieldDemo extends JFrame {
    private JTextField tfVstupniPole;
    private JButton btnGeneruj;
    private JPanel mainPanel;
    private JTextArea txtAreaVystup;
    private JButton btnKopiruj;

    public TextFieldDemo() {
        initComponents();
    }

    private void initComponents() {
        setContentPane(mainPanel);
        btnGeneruj.addActionListener(e -> buttonClickedAction());
        btnKopiruj.addActionListener(e -> kopirujAction());
    }

    private void kopirujAction() {
        txtAreaVystup.append(tfVstupniPole.getText()+"\n");
    }

    private void buttonClickedAction() {
        Random random = new Random();
        int nahodneCislo = random.nextInt(100)+1;
        tfVstupniPole.setText(""+nahodneCislo);
    }

    public static void main(String[] args) {
        TextFieldDemo okno = new TextFieldDemo();
        okno.setTitle("Textové pole");
        okno.pack();
        okno.setVisible(true);
        okno.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
