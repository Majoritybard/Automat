import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

// Annahme: Deine Klassen Token, Parser, Scanner sind entsprechend korrigiert und vorhanden.

public class VerwaltungGUI extends JFrame {

    private JTextField inputField;
    private JTextArea outputArea;
    private JButton parseButton;

    public VerwaltungGUI() {
        setTitle("Parser-Verwaltung");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        inputField = new JTextField(20);
        parseButton = new JButton("Parse Eingabe");
        outputArea = new JTextArea();
        outputArea.setEditable(false);

        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Eingabe:"));
        topPanel.add(inputField);
        topPanel.add(parseButton);

        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

        // Button-Listener
        parseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parseInput();
            }
        });
    }

    private void parseInput() {
        String eingabe = inputField.getText();
        if (eingabe == null || eingabe.isEmpty()) {
            outputArea.setText("Bitte eine Eingabe eingeben.");
            return;
        }

        // Liste für Tokens
        List<Token> tokenListe = new ArrayList<>();

        // Scanner erzeugen
        Scanner scanner = new Scanner(eingabe, (utils.List<Token>) tokenListe);
        scanner.scanne();

        if (tokenListe.isEmpty()) {
            outputArea.setText("Keine Tokens erkannt oder Scanner Fehler.");
            return;
        }

        // Parser erzeugen und parse starten
        Parser parser = new Parser(scanner.getTokenliste());
        boolean success = parser.parse();

        if (success) {
            outputArea.setText("Parsing erfolgreich!");
        } else {
            outputArea.setText("Parsing fehlgeschlagen.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VerwaltungGUI gui = new VerwaltungGUI();
            gui.setVisible(true);
        });
    }
}
