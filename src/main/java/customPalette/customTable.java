package customPalette;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class customTable extends JTable {

    private DefaultTableModel tableModel;

    public customTable() {
        initiateTable();
        populateTableFromCSV();
    }

    private void initiateTable() {
        String[] columns = {"Nome", "Email", "Senha", "Admin"};
        tableModel = new DefaultTableModel(columns, 0);
        this.setModel(tableModel);
    }

    public void populateTableFromCSV() {
        String path = "";
        String line;

        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            path = "src\\main\\resources\\userData\\userData.csv";
        } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            path = "src/main/resources/userData/userData.csv";
        }

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                tableModel.addRow(data);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void refreshTable() {
        tableModel.setRowCount(0);        
        populateTableFromCSV();
    }
    
}
