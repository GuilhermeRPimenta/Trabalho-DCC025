//Victor Wingert de Almeida         - 202335036
//Guilherme Roldão dos Reis Pimenta - 202365085A
//Bruno Nascimento Rodrigues        - 202065114A
//Pablo Novaes Costa                - 202335031

package customPalette;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public abstract class Table extends JTable {

    protected DefaultTableModel tableModel;

    public Table() {
    }

    public abstract void initiateTable();
    
    public abstract void deleteSelectedRow();
}
