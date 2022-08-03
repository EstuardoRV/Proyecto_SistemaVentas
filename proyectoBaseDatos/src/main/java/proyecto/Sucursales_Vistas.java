
package proyecto;

import javax.swing.*;

public class Sucursales_Vistas {
    
    JPanel sucursales = new JPanel();
    JTable tabla = new JTable();
    JScrollPane sp;
    
    private void botones(){
        sucursales.setLayout(null);
        JButton crear = new JButton("Crear");
        crear.setBounds(500,100,130,50);
        sucursales.add(crear);
        
        JButton carga = new JButton("Carga Masiva");
        carga.setBounds(670,100,130,50);
        sucursales.add(carga);
        
        JButton actualizar = new JButton("Actualizar");
        actualizar.setBounds(500,250,130,50);
        sucursales.add(actualizar);
        
        JButton eliminar = new JButton("Eliminar");
        eliminar.setBounds(670,250,130,50);
        sucursales.add(eliminar);
        
        JButton exportar = new JButton("Exportar PDF");
        exportar.setBounds(500,400,300,50);
        sucursales.add(exportar);
    }
    
    private void tabla(){
        String columnas []= {"Código","Nombre","Direccion","Correo","Teléfono"};
        Object filas [][] = {{"2020","arturo","km 36","correo","77777"}};
        
        tabla = new JTable(filas,columnas);
        sp = new JScrollPane(tabla);
        sp.setBounds(10,20,430,600);
        sucursales.add(sp);
    }
    
    
    public void ejecutar(){
        botones();
        tabla();
    }
}
