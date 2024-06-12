import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.List;

public class SalesPerformanceAnalysis extends JFrame {

    public SalesPerformanceAnalysis() {
        setTitle("Ανάλυση Απόδοσης Πωλήσεων");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        List<SalesData> salesData = new ArrayList<>();
        salesData.add(new SalesData("Ιανουάριος", 1500, 5));
        salesData.add(new SalesData("Φεβρουάριος", 1800, 6));
        salesData.add(new SalesData("Μάρτιος", 2000, 7));
        salesData.add(new SalesData("Απρίλιος", 2500, 8));
        salesData.add(new SalesData("Μάιος", 2300, 7));
        salesData.add(new SalesData("Ιούνιος", 2800, 9));

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JTable table = new JTable(new SalesTableModel(salesData));
        customizeTable(table);

        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane, BorderLayout.CENTER);

        getContentPane().add(panel);
    }

    private void customizeTable(JTable table) {
        table.setFont(new Font("Serif", Font.PLAIN, 16));
        table.setRowHeight(30);
        table.setGridColor(Color.LIGHT_GRAY);
        table.setFillsViewportHeight(true);

        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("Serif", Font.BOLD, 16));
        header.setBackground(Color.LIGHT_GRAY);
        header.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SalesPerformanceAnalysis frame = new SalesPerformanceAnalysis();
            frame.setVisible(true);
        });
    }
}

class SalesData {
    private final String month;
    private final int totalSales;
    private final int contracts;

    public SalesData(String month, int totalSales, int contracts) {
        this.month = month;
        this.totalSales = totalSales;
        this.contracts = contracts;
    }

    public String getMonth() {
        return month;
    }

    public int getTotalSales() {
        return totalSales;
    }

    public int getContracts() {
        return contracts;
    }
}

class SalesTableModel extends AbstractTableModel {
    private final List<SalesData> salesData;
    private final String[] columnNames = {"Μήνας", "Συνολικές Πωλήσεις (€)", "Αριθμός Συμβολαίων"};

    public SalesTableModel(List<SalesData> salesData) {
        this.salesData = salesData;
    }

    @Override
    public int getRowCount() {
        return salesData.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        SalesData data = salesData.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return data.getMonth();
            case 1:
                return data.getTotalSales();
            case 2:
                return data.getContracts();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return Integer.class;
            case 2:
                return Integer.class;
            default:
                return Object.class;
        }
    }
}
