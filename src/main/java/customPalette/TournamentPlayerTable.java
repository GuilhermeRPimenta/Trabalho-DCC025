
package customPalette;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

public class TournamentPlayerTable extends Table {
    
    public TournamentPlayerTable(){
    initiateTable();
    populateTableFromCSV();
    }
    
    @Override
    public void initiateTable() {
        String[] columns = {"Nome", "Email", "MMR"};
        tableModel = new DefaultTableModel(columns, 0);
        this.setModel(tableModel);
    }
    
    @Override
    public void deleteSelectedRow() {

    }
    
    public void populateTableFromCSV() {
        String path = "";
        String line;

        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            path = "src\\main\\resources\\userData\\playerData.csv";
        } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            path = "src/main/resources/userData/playerData.csv";
        }

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String[] dataToTable = new String[3];
                dataToTable[0] = data[0];
                dataToTable[1] = data[1];
                dataToTable[2] = data[3];
                tableModel.addRow(dataToTable);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
