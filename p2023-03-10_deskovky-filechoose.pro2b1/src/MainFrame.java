import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class MainFrame extends JFrame {

    private JFileChooser chooser = new JFileChooser(".");
    private JTextField textFieldNazevDeskovky;
    private JButton buttonLoadFromFile;
    private JPanel mainPanel;
    private JButton dalsiButton;

    private ArrayList<String> seznamDeskovek = new ArrayList<>();
    private int aktualniDeskovka = 0;

    public MainFrame() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Deskové hry s výběrem souboru a menu");
        setContentPane(mainPanel);
        buttonLoadFromFile.addActionListener(e -> selectFileAndLoadContents());
        dalsiButton.addActionListener(e -> dalsiDeskovka());
    }

    private void dalsiDeskovka() {
        int pocetDeskovek = seznamDeskovek.size();
        aktualniDeskovka++;
        if (aktualniDeskovka >= pocetDeskovek) {
            aktualniDeskovka = 0;
        }
        zobrazAktualniDeskovku();
    }

    private void zobrazAktualniDeskovku() {
        if (seznamDeskovek.size() == 0) {
            textFieldNazevDeskovky.setText("-- V seznamu nic není --");
        } else {
            textFieldNazevDeskovky.setText(seznamDeskovek.get(aktualniDeskovka));
        }
    }

    private void selectFileAndLoadContents() {
        int result = chooser.showOpenDialog(this);
        // Klikl uživatel na "Open"? Pokud ano, zpracuj událost:
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            // JOptionPane.showMessageDialog(
            //     this, "Uživatel zvolil soubor: "+ selectedFile.getAbsoluteFile());
            loadFileContents(selectedFile);
        }


    }

    private void loadFileContents(File selectedFile) {
        seznamDeskovek.clear();
        try (
                Scanner scanner =
                        new Scanner(new BufferedReader(
                                new FileReader(selectedFile)))
        ) {
            while (scanner.hasNextLine()) {
               seznamDeskovek.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        dalsiDeskovka();
    }

    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        //frame.pack();
        frame.setVisible(true);

    }
}
