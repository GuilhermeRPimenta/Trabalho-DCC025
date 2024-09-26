package customPalette;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public abstract class Table extends JTable {

    protected DefaultTableModel tableModel;

    public Table() {
        initiateTable();
        populateTableFromCSV();
    }

    public abstract void initiateTable();

    public abstract void populateTableFromCSV();

    public void refreshTable() {
        tableModel.setRowCount(0);
        populateTableFromCSV();
    }
}
