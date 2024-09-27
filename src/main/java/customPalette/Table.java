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
