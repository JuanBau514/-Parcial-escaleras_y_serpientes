package visual;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer; 


class TableroRenderer extends JLabel implements TableCellRenderer {
    public TableroRenderer() {
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {

        // Define el ancho y alto de cada casilla
        int size = 10; // 1 cm = 10 px

        // Define el color de fondo de la casilla
        Color backgroundColor = (row + column) % 2 == 0 ? new Color(240, 217, 178) : new Color(195, 219, 71); // Color de las casillas de ajedrez

        // Establece el color de fondo y el tamaño de la fuente
        setBackground(backgroundColor);
        setFont(getFont().deriveFont((float) size));

        // Establece el texto en la casilla
        setText(value != null ? value.toString() : "");

        // Devuelve la casilla
        return this;
    }
}
