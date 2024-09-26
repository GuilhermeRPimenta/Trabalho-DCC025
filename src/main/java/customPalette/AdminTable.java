package customPalette;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

public class AdminTable extends Table {

    public AdminTable() {
        this.getTableHeader().setReorderingAllowed(false);
        for (int i = 0; i < this.getColumnModel().getColumnCount(); i++) {
            this.getColumnModel().getColumn(i).setResizable(false);
        }
    }

    @Override
    public void initiateTable() {
        String[] columns = {"Nome", "Email", "Senha"};
        tableModel = new DefaultTableModel(columns, 0);
        this.setModel(tableModel);
    }

    @Override
    public void populateTableFromCSV() {
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
                tableModel.addRow(data);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
