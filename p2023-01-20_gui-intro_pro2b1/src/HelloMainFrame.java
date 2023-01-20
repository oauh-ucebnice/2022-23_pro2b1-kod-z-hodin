import javax.swing.*;

public class HelloMainFrame extends JFrame {
    private JButton btSayHello;
    private JPanel pnMain;

    public static void main(String[] args) {
        HelloMainFrame frame =
                new HelloMainFrame();

        frame.setContentPane(frame.pnMain);
        frame.setTitle("Hello GUI");
        frame.pack();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
