package interfaz;

//import com.mysql.jdbc.Statement;
import java.sql.Connection;
import piratas3.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Interfaz extends JFrame {
    
    private String userName;
    
    //Ventana opciones
    public JFrame vCrearPersonaje;
    public JFrame vBorrarPersonaje;


    //Campos de texto
    public JFormattedTextField nombrePj;
    
    //static GraphicsDevice grafica = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();

    public Interfaz(String uN) {
        userName = uN;
        initComponents();
        //FullScreen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0,0,screenSize.width, screenSize.height);
        //grafica.setFullScreenWindow(this);
        jLabel24.setText(uN);
    }

    private Interfaz() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        imgPj1 = new javax.swing.JLabel();
        namePj1 = new javax.swing.JLabel();
        lvlPj1 = new javax.swing.JLabel();
        btnPj1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        imgPj2 = new javax.swing.JLabel();
        namePj2 = new javax.swing.JLabel();
        lvlPj2 = new javax.swing.JLabel();
        btnPj2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        imgPj3 = new javax.swing.JLabel();
        namePj3 = new javax.swing.JLabel();
        lvlPj3 = new javax.swing.JLabel();
        btnPj3 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        imgPj4 = new javax.swing.JLabel();
        namePj4 = new javax.swing.JLabel();
        lvlPj4 = new javax.swing.JLabel();
        btnPj4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(getToolkit().getScreenSize().width, getToolkit().getScreenSize().height));
        setResizable(false);
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.GridLayout(1, 4));

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.Y_AXIS));

        imgPj1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guybrush20threepwood.jpg"))); // NOI18N
        jPanel5.add(imgPj1);
        jPanel5.add(namePj1);
        jPanel5.add(lvlPj1);

        btnPj1.setText("Elegir");
        btnPj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPj1ActionPerformed(evt);
            }
        });
        jPanel5.add(btnPj1);

        jPanel1.add(jPanel5);

        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.Y_AXIS));

        imgPj2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/android.gif"))); // NOI18N
        jPanel6.add(imgPj2);

        namePj2.setText("Nombre: Android");
        jPanel6.add(namePj2);

        lvlPj2.setText("Nivel: 67");
        jPanel6.add(lvlPj2);

        btnPj2.setText("Elegir");
        btnPj2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPj2ActionPerformed(evt);
            }
        });
        jPanel6.add(btnPj2);

        jPanel1.add(jPanel6);

        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.Y_AXIS));

        imgPj3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/firefox.png"))); // NOI18N
        jPanel7.add(imgPj3);

        namePj3.setText("Nombre: Firefox");
        jPanel7.add(namePj3);

        lvlPj3.setText("Nivel: 34");
        jPanel7.add(lvlPj3);

        btnPj3.setText("Elegir");
        jPanel7.add(btnPj3);

        jPanel1.add(jPanel7);

        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.Y_AXIS));

        imgPj4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/emule.jpg"))); // NOI18N
        jPanel8.add(imgPj4);

        namePj4.setText("Nombre: eMule");
        jPanel8.add(namePj4);

        lvlPj4.setText("Nivel: 12");
        jPanel8.add(lvlPj4);

        btnPj4.setText("Elegir");
        jPanel8.add(btnPj4);

        jPanel1.add(jPanel8);

        jTabbedPane1.addTab("Inicio", jPanel1);

        jPanel2.setLayout(new java.awt.GridLayout(1, 2));

        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.Y_AXIS));
        jPanel9.add(jLabel13);

        jPanel2.add(jPanel9);

        jPanel10.setLayout(new javax.swing.BoxLayout(jPanel10, javax.swing.BoxLayout.Y_AXIS));

        jLabel14.setText("jLabel14");
        jPanel10.add(jLabel14);

        jLabel15.setText("jLabel15");
        jPanel10.add(jLabel15);

        jLabel16.setText("jLabel16");
        jPanel10.add(jLabel16);

        jLabel17.setText("jLabel17");
        jPanel10.add(jLabel17);

        jLabel18.setText("jLabel18");
        jPanel10.add(jLabel18);

        jLabel19.setText("jLabel19");
        jPanel10.add(jLabel19);

        jLabel20.setText("jLabel20");
        jPanel10.add(jLabel20);

        jLabel21.setText("jLabel21");
        jPanel10.add(jLabel21);

        jLabel22.setText("jLabel22");
        jPanel10.add(jLabel22);

        jLabel23.setText("jLabel23");
        jPanel10.add(jLabel23);

        jPanel2.add(jPanel10);

        jTabbedPane1.addTab("Personaje", jPanel2);

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 840, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Mercado", jPanel3);

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 840, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Barco", jPanel4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 211;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        getContentPane().add(jTabbedPane1, gridBagConstraints);

        jLabel24.setText("Usuario:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        getContentPane().add(jLabel24, gridBagConstraints);

        jButton5.setText("Desconectar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        getContentPane().add(jButton5, gridBagConstraints);

        jPanel11.setLayout(new javax.swing.BoxLayout(jPanel11, javax.swing.BoxLayout.Y_AXIS));

        jLabel25.setText("Menú");
        jPanel11.add(jLabel25);

        jButton6.setText("Crear personaje");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton6);

        jButton7.setText("Borrar personaje");
        jPanel11.add(jButton7);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        getContentPane().add(jPanel11, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPj1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPj1ActionPerformed

    private void btnPj2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPj2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPj2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
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
    }//GEN-LAST:event_jButton6ActionPerformed

    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Mac OS X".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPj1;
    private javax.swing.JButton btnPj2;
    private javax.swing.JButton btnPj3;
    private javax.swing.JButton btnPj4;
    private javax.swing.JLabel imgPj1;
    private javax.swing.JLabel imgPj2;
    private javax.swing.JLabel imgPj3;
    private javax.swing.JLabel imgPj4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lvlPj1;
    private javax.swing.JLabel lvlPj2;
    private javax.swing.JLabel lvlPj3;
    private javax.swing.JLabel lvlPj4;
    private javax.swing.JLabel namePj1;
    private javax.swing.JLabel namePj2;
    private javax.swing.JLabel namePj3;
    private javax.swing.JLabel namePj4;
    // End of variables declaration//GEN-END:variables
}
