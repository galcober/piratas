package piratas3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class JFrame extends javax.swing.JFrame {
    
    private Connection connection;
    
    //Datos servidor
    private String url ="jdbc:mysql://localhost:8889/piratas";
    private String login ="root";
    private String password ="root";
    
    //static GraphicsDevice grafica = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    private JFrame vCrearPersonaje;
    
    

    public JFrame() {
        
        initComponents();
        PanelFondo F = new PanelFondo(); //Objeto F de Tipo PanelFondo
        this.add(F);
        this.pack();
        //FullScreen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0,0,screenSize.width, screenSize.height);
        //grafica.setFullScreenWindow(this);
        
        
        //Conectar con base da datos
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection=DriverManager.getConnection(url,login,password);
            
        } catch (Exception ex){
            JOptionPane.showMessageDialog(this, "No se ha podido conectar al servidor. Puede que esté caido.", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(getToolkit().getScreenSize().width, getToolkit().getScreenSize().height));
        setResizable(false);
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jTextField1.setText("Usuario");
        jTextField1.setMaximumSize(new java.awt.Dimension(60, 20));
        jTextField1.setMinimumSize(new java.awt.Dimension(60, 28));
        jTextField1.setPreferredSize(new java.awt.Dimension(60, 28));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 118;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 176, 0, 154);
        getContentPane().add(jTextField1, gridBagConstraints);

        jPasswordField1.setText("Contraseña");
        jPasswordField1.setMaximumSize(new java.awt.Dimension(60, 28));
        jPasswordField1.setMinimumSize(new java.awt.Dimension(60, 28));
        jPasswordField1.setPreferredSize(new java.awt.Dimension(60, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 120;
        gridBagConstraints.insets = new java.awt.Insets(0, 176, 0, 154);
        getContentPane().add(jPasswordField1, gridBagConstraints);

        jButton1.setText("Entrar");
        jButton1.setMaximumSize(new java.awt.Dimension(100, 29));
        jButton1.setMinimumSize(new java.awt.Dimension(100, 29));
        jButton1.setPreferredSize(new java.awt.Dimension(100, 29));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        getContentPane().add(jButton1, gridBagConstraints);

        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        getContentPane().add(jButton2, gridBagConstraints);

        pack();
    }// </editor-fold>                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        vCrearPersonaje = new JFrame();
        vCrearPersonaje.setTitle("¡Crea tu personaje!");
        vCrearPersonaje.setSize(280,375);
        vCrearPersonaje.setLocationRelativeTo(null);
        vCrearPersonaje.getContentPane().setLayout(new FlowLayout());
        vCrearPersonaje.setBackground(Color.LIGHT_GRAY);
        vCrearPersonaje.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        //Botones  de Ventana Insertar
        JButton crearPersonaje = new JButton("Crear");

        //Pedir los Container a la ventana y añadirle los botones
        vCrearPersonaje.getContentPane().add(crearPersonaje);
        vCrearPersonaje.setVisible(true);

        //Tamaño y Posición de botones
        crearPersonaje.setBounds(new Rectangle(30, 10, 220, 80));
        
        crearPersonaje.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                vCrearPersonaje.dispose();
            }
        });
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        char[] arrayC = jPasswordField1.getPassword();
        String pass = new String(arrayC);
        
        if (AprobacionUsuario(getjTextField1().getText(), pass)){
            JOptionPane.showMessageDialog(this, "Bienvenido a Piratas.", "BIENVENIDO", JOptionPane.INFORMATION_MESSAGE);
            new interfaz.Interfaz(getjTextField1().getText()).setVisible(true);
        } else{
            JOptionPane.showMessageDialog(this, "Error al entrar. Se ha introducido mal el nombre o la contraseña.", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.println("Usuario y/o Pass Incorrectas");
        }
    }                                        

    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Mac OS X".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    private JTextField getjTextField1() {
        return jTextField1;
    }
    
    private boolean AprobacionUsuario(String uN, String uP){
        
        boolean encontrado = true;
        try{
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM usuario");
            
            while(rs.next() & encontrado){
                if(rs.getString(1).equalsIgnoreCase(uN)){
                    //Se comprueba el usuario
                    if(rs.getString(2).equalsIgnoreCase(uP)){
                        //Se comprueba la contraseña
                        return true;
                    } else{
                        //FALLO DE PASS
                    }
                    encontrado=false;
                }
            }
        } catch (SQLException sqlEx){
            System.out.println("FALLO SQL");
        }
        return false;
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration                   
}
