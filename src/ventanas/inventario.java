package ventanas;

import clase.conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class inventario extends javax.swing.JFrame {

    int puntero = 0;
    int idultimo = 0;
    
    public inventario() {
        initComponents();
        this.setTitle("Gestion de Inventario");
        this.setLocationRelativeTo(null);
        this.setSize(520, 350);
        this.setIconImage(new ImageIcon(getClass().getResource("/recursos/logo.png")).getImage());
        txtbus.setVisible(false);
        txtcant.setVisible(false);
        txtnombre.setVisible(false);
        lbbus.setVisible(false);
        lbcant.setVisible(false);
        lbtitulo.setVisible(false);
        btnguar.setVisible(false);
        btncancel.setVisible(false);
        btnbus.setVisible(false);
    }
    
    public void ActualizarProducto(String sql) throws SQLException{
        conexion con = new conexion().obtener();
        Statement stmt = con.getConexion().createStatement();
        stmt.executeUpdate(sql);
    }
    
        public void EliminarProducto(String sql) throws SQLException{
        conexion con = new conexion().obtener();
        Statement stmt = con.getConexion().prepareStatement(sql);
        stmt.execute(sql);
    }
    
    public void IngresoInventario(String sql) throws SQLException{
        conexion con = new conexion().obtener();
        Statement stmt = con.getConexion().createStatement();
        stmt.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Guardado Exitoso");
        txtbus.setText("");
        txtcant.setText("");
        txtnombre.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btncarga = new javax.swing.JButton();
        btnmodif = new javax.swing.JButton();
        btnelim = new javax.swing.JButton();
        btnretun = new javax.swing.JButton();
        lbtitulo = new javax.swing.JLabel();
        lbbus = new javax.swing.JLabel();
        txtbus = new javax.swing.JTextField();
        btnbus = new javax.swing.JButton();
        txtnombre = new javax.swing.JTextField();
        txtcant = new javax.swing.JTextField();
        lbcant = new javax.swing.JLabel();
        btnguar = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jToolBar1.setRollover(true);

        btncarga.setText("Cargar");
        btncarga.setFocusable(false);
        btncarga.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncarga.setMaximumSize(new java.awt.Dimension(120, 25));
        btncarga.setPreferredSize(new java.awt.Dimension(120, 25));
        btncarga.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncargaActionPerformed(evt);
            }
        });
        jToolBar1.add(btncarga);

        btnmodif.setText("Modificar");
        btnmodif.setFocusable(false);
        btnmodif.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnmodif.setMaximumSize(new java.awt.Dimension(120, 25));
        btnmodif.setPreferredSize(new java.awt.Dimension(120, 25));
        btnmodif.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnmodif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodifActionPerformed(evt);
            }
        });
        jToolBar1.add(btnmodif);

        btnelim.setText("Eliminar");
        btnelim.setFocusable(false);
        btnelim.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnelim.setMaximumSize(new java.awt.Dimension(120, 25));
        btnelim.setPreferredSize(new java.awt.Dimension(120, 25));
        btnelim.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnelim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnelimActionPerformed(evt);
            }
        });
        jToolBar1.add(btnelim);

        btnretun.setText("Regresar");
        btnretun.setFocusable(false);
        btnretun.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnretun.setMaximumSize(new java.awt.Dimension(120, 25));
        btnretun.setPreferredSize(new java.awt.Dimension(120, 25));
        btnretun.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnretun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnretunActionPerformed(evt);
            }
        });
        jToolBar1.add(btnretun);

        getContentPane().add(jToolBar1);
        jToolBar1.setBounds(0, 0, 493, 31);

        lbtitulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbtitulo.setText("Cargar Productos");
        getContentPane().add(lbtitulo);
        lbtitulo.setBounds(189, 42, 150, 17);

        lbbus.setText("Codigo Producto: ");
        getContentPane().add(lbbus);
        lbbus.setBounds(29, 101, 110, 20);
        getContentPane().add(txtbus);
        txtbus.setBounds(150, 100, 90, 20);

        btnbus.setText("Buscar");
        btnbus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbusActionPerformed(evt);
            }
        });
        getContentPane().add(btnbus);
        btnbus.setBounds(250, 100, 90, 23);

        txtnombre.setEditable(false);
        getContentPane().add(txtnombre);
        txtnombre.setBounds(29, 131, 310, 30);
        getContentPane().add(txtcant);
        txtcant.setBounds(110, 170, 70, 20);

        lbcant.setText("Cantidad :");
        getContentPane().add(lbcant);
        lbcant.setBounds(29, 172, 70, 20);

        btnguar.setText("Guardar");
        btnguar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguar);
        btnguar.setBounds(95, 226, 120, 30);

        btncancel.setText("Cancelar");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        getContentPane().add(btncancel);
        btncancel.setBounds(236, 226, 120, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnretunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnretunActionPerformed
        this.setVisible(false);
        menu princi = new menu();
        princi.setVisible(true);
    }//GEN-LAST:event_btnretunActionPerformed

    private void btnbusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbusActionPerformed
        if(puntero == 1){
            String codigo = txtbus.getText();
            txtbus.setEditable(false);
            String sql = "SELECT nom_prod FROM producto WHERE id_prod = '"+codigo+"'";
            conexion con = new conexion().obtener();
            ResultSet rs = con.consultar(sql);
            try {
                while(rs.next()) {    
                    txtnombre.setText(rs.getString("nom_prod"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(inventario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(puntero == 2){
            String codigo = txtbus.getText();
            txtbus.setEditable(false);
            String sql = "SELECT * FROM inventario WHERE id_prod = '"+codigo+"'";
            conexion con = new conexion().obtener();
            ResultSet rs = con.consultar(sql);
            try {
                while(rs.next()) {    
                    //txtnombre.setText(rs.getString("nom_prod"));
                    txtcant.setText(rs.getString("cant_inven"));
                    idultimo = rs.getInt("id_inven");
                    JOptionPane.showMessageDialog(null, "Actualizacion Exitoso");
                    txtcant.setVisible(true);
                    lbcant.setVisible(true);
                    btncancel.setVisible(true);
                    btnguar.setVisible(true);
                }
            } catch (SQLException ex) {
                Logger.getLogger(inventario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(puntero == 3){
            String codigo = txtbus.getText();
            txtbus.setEditable(false);
            String sql = "SELECT * FROM inventario WHERE id_prod = '"+codigo+"'";
            conexion con = new conexion().obtener();
            ResultSet rs = con.consultar(sql);
            try {
                while(rs.next()) {
                    idultimo = rs.getInt("id_inven");
                }
                System.out.println(""+idultimo);
                sql = "DELETE FROM inventario WHERE id_prod = '"+idultimo+"'";
                //Eliminar Registro
                EliminarProducto(sql);
                JOptionPane.showMessageDialog(null, "Eliminado ultimo registro");
            } catch (SQLException ex) {
                Logger.getLogger(inventario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnbusActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        txtbus.setVisible(false);
        txtbus.setEditable(true);
        txtbus.setText("");
        txtnombre.setText("");
        txtcant.setText("");
        txtcant.setVisible(false);
        txtnombre.setVisible(false);
        lbbus.setVisible(false);
        lbcant.setVisible(false);
        lbtitulo.setVisible(false);
        btnguar.setVisible(false);
        btncancel.setVisible(false);
        btnbus.setVisible(false);
    }//GEN-LAST:event_btncancelActionPerformed

    private void btncargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncargaActionPerformed
        txtbus.setVisible(true);
        btnbus.setText("Buscar");
        txtbus.setText("");
        txtbus.setEditable(true);
        txtcant.setVisible(true);
        txtcant.setText("");
        txtnombre.setVisible(true);
        txtnombre.setText("");
        lbbus.setVisible(true);
        lbcant.setVisible(true);
        lbtitulo.setVisible(true);
        btnguar.setVisible(true);
        btncancel.setVisible(true);
        btnbus.setVisible(true);
        puntero = 1;
    }//GEN-LAST:event_btncargaActionPerformed

    private void btnguarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguarActionPerformed
        
        if(puntero == 1){
            if(!txtnombre.getText().equals("")){
                String sql = "INSERT INTO inventario VALUES('0','"+txtcant.getText()+"','"+txtbus.getText()+"')";
                try {
                    IngresoInventario(sql);
                } catch (SQLException ex) {
                    Logger.getLogger(inventario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        if(puntero == 2){
            int c = Integer.parseInt(txtcant.getText());
            String sql = "UPDATE inventario SET cant_inven = '"+c+"' WHERE id_inven = '"+idultimo+"'";
            try {
                ActualizarProducto(sql);
            } catch (SQLException ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnguarActionPerformed

    private void btnmodifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodifActionPerformed
        lbtitulo.setText("Modificar Inventario");
        btnbus.setText("Buscar");
        lbtitulo.setVisible(true);
        lbcant.setVisible(false);
        lbbus.setVisible(true);
        txtbus.setVisible(true);
        btnbus.setVisible(true);
        txtnombre.setVisible(false);
        txtcant.setVisible(false);
        btnguar.setVisible(false);
        btncancel.setVisible(false);
        puntero = 2;
        txtbus.setText("");
        txtcant.setText("");
        txtnombre.setText("");
    }//GEN-LAST:event_btnmodifActionPerformed

    private void btnelimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnelimActionPerformed
        lbtitulo.setText("Eliminar Inventario");
        btnbus.setText("Eliminar");
        lbtitulo.setVisible(true);
        lbcant.setVisible(false);
        lbbus.setVisible(true);
        txtbus.setVisible(true);
        btnbus.setVisible(true);
        txtnombre.setVisible(false);
        txtcant.setVisible(false);
        btnguar.setVisible(false);
        btncancel.setVisible(false);
        puntero = 3;
        txtbus.setText("");
        txtcant.setText("");
        txtnombre.setText("");
    }//GEN-LAST:event_btnelimActionPerformed

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
            java.util.logging.Logger.getLogger(inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbus;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btncarga;
    private javax.swing.JButton btnelim;
    private javax.swing.JButton btnguar;
    private javax.swing.JButton btnmodif;
    private javax.swing.JButton btnretun;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbbus;
    private javax.swing.JLabel lbcant;
    private javax.swing.JLabel lbtitulo;
    private javax.swing.JTextField txtbus;
    private javax.swing.JTextField txtcant;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
