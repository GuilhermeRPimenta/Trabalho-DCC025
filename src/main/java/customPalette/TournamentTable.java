
package customPalette;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
    }
    
    @Override
    public void deleteSelectedRow() {

    }
    

}
