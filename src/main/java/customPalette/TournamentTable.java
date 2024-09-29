
package customPalette;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TournamentTable extends Table {
    
    public TournamentTable(){
    initiateTable();
    deleteSelectedRow();
    for (int i = 0; i < this.getColumnModel().getColumnCount(); i++) {
            this.getColumnModel().getColumn(i).setResizable(false);
        }
    }
    
    @Override
    public void initiateTable() {
        String[] columns = {"Nome do Torneio", "Número de Jogadores", "Data de Criação"};
        tableModel = new DefaultTableModel(columns, 0);
        this.setModel(tableModel);
        loadTournaments();
    }
    
    @Override
    public void deleteSelectedRow() {

    }
    
    private void loadTournaments() {
        tableModel.setRowCount(0);
        String directoryPath = "src/main/resources/tournaments";
        File directory = new File(directoryPath);
        Gson gson = new Gson();

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles((dir, name) -> name.endsWith(".json"));

            if (files != null) {
                for (File file : files) {
                    try(FileReader reader = new FileReader(file)){
                        String fileName = file.getName();
                        JsonObject fileContent = gson.fromJson(reader, JsonObject.class);
                        if(fileContent != null){
                            String starDateTime = fileContent.has("formattedStartDateTime") ? fileContent.get("formattedStartDateTime").getAsString() : "N/A";
                            String endDateTime = fileContent.has("numberOfPlayers") ? fileContent.get("numberOfPlayers").getAsString() : "N/A";
                            tableModel.addRow(new Object[]{fileName, starDateTime, endDateTime});
                        }
                        
                        
                    }catch(IOException e){
                        JOptionPane.showMessageDialog(this, "Erro ao ler um arquivo!");
                    }
                    
                }
            } else {
                JOptionPane.showMessageDialog(this,"Nenhum arquivo de replay encontrado!");
            }
        } else {
            JOptionPane.showMessageDialog(this,"Diretorio " + directoryPath + "não encontrado!");
        }
    }
    
    public void refreshTable(){
        loadTournaments();
    }
    

}
