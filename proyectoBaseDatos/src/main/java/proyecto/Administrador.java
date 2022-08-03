
package proyecto;

import javax.swing.*;

public class Administrador extends JFrame{
    JTabbedPane pestañas = new JTabbedPane();
    JPanel vendedores = new JPanel();
    JPanel clientes = new JPanel();
    JPanel productos = new JPanel();
    
    private void inicio(){
        setTitle("Administrador");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBounds(50, 30, 900, 700);
        setVisible(true);
        
        productos.setLayout(null);
        clientes.setLayout(null);
        vendedores.setLayout(null);
        
        Sucursales_Vistas sv = new Sucursales_Vistas();
        sv.ejecutar();
        
        pestañas.addTab("Sucursales", sv.sucursales);
        pestañas.addTab("Productos", productos);
        pestañas.addTab("Clientes", clientes);
        pestañas.addTab("Vendedores", vendedores);
        
        add(pestañas);
        
    }
    
    public void ejecutar(){
        inicio();
    }
    
    public static void main(String[] args) {
        Administrador ad = new Administrador();
        ad.ejecutar();
    }
}
