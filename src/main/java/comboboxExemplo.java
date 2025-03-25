import javax.swing.*;

public class comboboxExemplo extends JFrame {

    public comboboxExemplo() {
        setTitle("Exemplo JComboBox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JComboBox<String> comboBox = new JComboBox<>();

        // Adicionar itens ao JComboBox
        comboBox.addItem("Código");
        comboBox.addItem("Item 2");
        comboBox.addItem("Item 3");
        comboBox.addItem("Item 4");

        add(comboBox);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new comboboxExemplo();
            }
        });
    }
}
