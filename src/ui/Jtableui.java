package ui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Jtableui extends JFrame {
    public Jtableui() {
        super("Ejemplo tabla");

        //array bidimencional de objetos con los datos de la tabla
        Object[][] data = {
                {"Juan", "Lopez", "Esquiar", 5, Boolean.FALSE},
                {"Maria", "Perez", "Patinar", 3, Boolean.TRUE},
                {"Perala", "Martínez", "Escalar", 2, Boolean.FALSE},
                {"Martha", "Zapata", "Correr", 7, Boolean.TRUE},
                {"Angela", "Martínez", "Nadar", 4, Boolean.FALSE}
        };

        //array de String's con los títulos de las columnas
        String[] columnNames = {"Nombre", "Apellido", "Pasatiempo",
                "Años de Practica", "Soltero(a)"};

        //se crea la Tabla
        final JTable table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        //Creamos un JscrollPane y le agregamos la JTable
        JScrollPane scrollPane = new JScrollPane(table);
        //Agregamos el JScrollPane al contenedor
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        pack();
        setVisible(true);

        //manejamos la salida
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
