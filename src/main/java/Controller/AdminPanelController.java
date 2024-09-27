package Controller;

import com.mycompany.chess.swingComponents.contentPanel.adminPanel.AdminPanel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AdminPanelController {

    private final AdminPanel adminPanel;

    public AdminPanelController(AdminPanel adminPanel) {
        this.adminPanel = adminPanel;
    }

    public void populateTableFromCSV(JTable tabela) {
        DefaultTableModel modeloTabela = (DefaultTableModel) tabela.getModel();
        modeloTabela.setRowCount(0);
        
        String path = "";
        String line;

        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            path = "src\\main\\resources\\userData\\adminData.csv";
        } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            path = "src/main/resources/userData/adminData.csv";
        }

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (!adminPanel.getEmail().equals(data[1])) {
                    modeloTabela.addRow(data);
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
