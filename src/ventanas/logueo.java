package ventanas;

import clase.conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class logueo extends javax.swing.JFrame {

    public logueo() {
        initComponents();
        this.setTitle("IESS Inventario");
        this.setSize(470, 585);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/recursos/logo.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblogo = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        txtclave = new javax.swing.JPasswordField();
        txtinput1 = new javax.swing.JLabel();
        txtinput2 = new javax.swing.JLabel();
        lbuser1 = new javax.swing.JLabel();
        lbuser = new javax.swing.JLabel();
        btnlogin = new javax.swing.JButton();
        lbfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo.png"))); // NOI18N
        getContentPane().add(lblogo);
        lblogo.setBounds(150, 8, 146, 140);

        txtuser.setBackground(new java.awt.Color(61, 167, 101));
        txtuser.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        txtuser.setForeground(new java.awt.Color(255, 255, 255));
        txtuser.setBorder(null);
        getContentPane().add(txtuser);
        txtuser.setBounds(120, 270, 230, 30);

        txtclave.setBackground(new java.awt.Color(61, 167, 101));
        txtclave.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        txtclave.setForeground(new java.awt.Color(255, 255, 255));
        txtclave.setBorder(null);
        getContentPane().add(txtclave);
        txtclave.setBounds(120, 360, 230, 30);

        txtinput1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/txtinput.png"))); // NOI18N
        getContentPane().add(txtinput1);
        txtinput1.setBounds(120, 280, 230, 30);

        txtinput2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/txtinput.png"))); // NOI18N
        getContentPane().add(txtinput2);
        txtinput2.setBounds(120, 360, 230, 40);

        lbuser1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbuser1.setForeground(new java.awt.Color(255, 255, 255));
        lbuser1.setText("Clave");
        lbuser1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lbuser1);
        lbuser1.setBounds(200, 330, 80, 30);

        lbuser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbuser.setForeground(new java.awt.Color(255, 255, 255));
        lbuser.setText("Usuario");
        lbuser.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lbuser);
        lbuser.setBounds(190, 240, 90, 30);

        btnlogin.setBackground(new java.awt.Color(171, 243, 173));
        btnlogin.setText("Ingresar");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin);
        btnlogin.setBounds(163, 433, 130, 30);

        lbfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpg"))); // NOI18N
        getContentPane().add(lbfondo);
        lbfondo.setBounds(0, 175, 460, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        String usuario = txtuser.getText();
        String clave = txtclave.getText();
        String sql = "SELECT * FROM usuarios WHERE nom_user = '"+usuario+"' AND pas_user = '"+clave+"'";
        if(txtuser.getText().equals("") || txtclave.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese todos los datos");
        }
        else {
            usuario = txtuser.getText();
            clave = txtclave.getText();
            //Conectar a la base de datos
            conexion con = new conexion().obtener();
            //Ejecutar el sql
            ResultSet resultado = con.consultar(sql);
            try {
                resultado.last();
                 if (resultado.getRow() > 0){
                    menu prin = new menu();
                    prin.setVisible(true);
                    //cerrar la ventana
                    this.setVisible(false);
                 }
                 else { JOptionPane.showMessageDialog(null, "Usuario o Clave Incorrecta"); }
            } catch (SQLException ex) {
                Logger.getLogger(logueo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }//GEN-LAST:event_btnloginActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(logueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logueo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel lbfondo;
    private javax.swing.JLabel lblogo;
    private javax.swing.JLabel lbuser;
    private javax.swing.JLabel lbuser1;
    private javax.swing.JPasswordField txtclave;
    private javax.swing.JLabel txtinput1;
    private javax.swing.JLabel txtinput2;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
