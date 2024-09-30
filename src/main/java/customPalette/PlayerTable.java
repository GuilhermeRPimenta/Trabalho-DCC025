//Victor Wingert de Almeida         - 202335036
//Guilherme Roldão dos Reis Pimenta - 202365085A
//Bruno Nascimento Rodrigues        - 202065114A
//Pablo Novaes Costa                - 202335031

package customPalette;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;

public class PlayerTable extends Table {

    public PlayerTable() {
        initiateTable();
        populateTableFromCSV();
        this.getTableHeader().setReorderingAllowed(false);
        for (int i = 0; i < this.getColumnModel().getColumnCount(); i++) {
            this.getColumnModel().getColumn(i).setResizable(false);
        }

    }

    @Override
    public void initiateTable() {
        String[] columns = {"Nome", "Email", "Senha", "MMR"};
        tableModel = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        this.setModel(tableModel);
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
                tableModel.addRow(data);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void deleteSelectedRow() {
        int selectedRow = this.getSelectedRow();

        DefaultTableModel model = (DefaultTableModel) this.getModel();
        String emailToDelete = (String) model.getValueAt(selectedRow, 1);
        model.removeRow(selectedRow);

        updateCSVAfterDeletion(emailToDelete);
    }

    private void updateCSVAfterDeletion(String emailToDelete) {

        String path = "";
        String tempFile = "";

        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            path = "src\\main\\resources\\userData\\playerData.csv";
        } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            path = "src/main/resources/userData/playerData.csv";
        }

        if (os.contains("win")) {
            tempFile = "src\\main\\resources\\userData\\temp.csv";
        } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            tempFile = "src/main/resources/userData/temp.csv";
        }

        File originalFile = new File(path);
        File tempCSV = new File(tempFile);

        try (BufferedReader br = new BufferedReader(new FileReader(path)); BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String email = data[1];

                if (!email.equals(emailToDelete)) {
                    bw.write(line);
                    bw.newLine();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        if (originalFile.delete()) {
            tempCSV.renameTo(originalFile);
        }
    }

    public void refreshTable() {
        tableModel.setRowCount(0);
        populateTableFromCSV();
    }
}
