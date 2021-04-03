package ventanas;

import clase.conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class menu extends javax.swing.JFrame {
    
    DefaultTableModel modelo;
    
    public menu() {
        initComponents();
        this.setTitle("Menu Principal");
        this.setSize(630, 430);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/recursos/logo.png")).getImage());
        //Ocultar
        lbfound.setVisible(false);
        txtbusca.setVisible(false);
        lblog.setVisible(false);
        
        lbini.setVisible(true);
        tablainvent.setVisible(false);
        tablainvent.getTableHeader().setVisible(false);
        lbtitle.setVisible(false);
        lbnom.setVisible(false);
        txtnombre.setVisible(false);
        lbtipo.setVisible(false);
        cmbtipo.setVisible(false);
        txtpeso.setVisible(false);
        lbpeso.setVisible(false);
        lbpes.setVisible(false);
        lbmarca.setVisible(false);
        txtmarca.setVisible(false);
        lblote.setVisible(false);
        txtlote.setVisible(false);
        btncancel.setVisible(false);
        btnguarda.setVisible(false);
    }
    
    public void GuardarProducto(String sql) throws SQLException{
        conexion con = new conexion().obtener();
        Statement stmt = con.getConexion().createStatement();
        stmt.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Guardado Exitoso");
        txtlote.setText("");
        txtmarca.setText("");
        txtnombre.setText("");
        txtpeso.setText("");
        cmbtipo.setSelectedIndex(0);
    }
    
    public void LlenarTabla(String sql) throws SQLException{
        String titulos[] = {"id","Nombre","Tipo","Peso","Marca","Lote","Cantidad"};
        String fila[] = new String [7];
        conexion con = new conexion().obtener();
        ResultSet rs = con.consultar(sql);
        modelo = new DefaultTableModel(null,titulos);
        while(rs.next()) {
            fila[0] = ""+rs.getInt("id_prod");
            fila[1] = rs.getString("nom_prod");
            if(rs.getInt("tipo_prod") == 1){ fila[2] = "Tableta"; }
            if(rs.getInt("tipo_prod") == 2){ fila[2] = "Jarabe"; }
            if(rs.getInt("tipo_prod") == 3){ fila[2] = "Inyectable"; }
            fila[3] = ""+rs.getInt("peso_prod")+" gramos";
            fila[4] = ""+rs.getString("marca_prod");
            fila[5] = ""+rs.getString("lote_prod");
            fila[6] = ""+rs.getString("cant_inven");
            modelo.addRow(fila);     
        }
        tablainvent.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnproducto = new javax.swing.JButton();
        btninventario = new javax.swing.JButton();
        btncerrar = new javax.swing.JButton();
        lbnom = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        lbtitle = new javax.swing.JLabel();
        btnguarda = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        lbtipo = new javax.swing.JLabel();
        txtpeso = new javax.swing.JTextField();
        cmbtipo = new javax.swing.JComboBox<>();
        lbpeso = new javax.swing.JLabel();
        lbpes = new javax.swing.JLabel();
        lbmarca = new javax.swing.JLabel();
        txtmarca = new javax.swing.JTextField();
        lblote = new javax.swing.JLabel();
        txtlote = new javax.swing.JTextField();
        lbini = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablainvent = new javax.swing.JTable();
        btngest = new javax.swing.JButton();
        btncan = new javax.swing.JButton();
        btnactual = new javax.swing.JButton();
        txtbusca = new javax.swing.JTextField();
        lblog = new javax.swing.JLabel();
        lbfound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jToolBar1.setRollover(true);

        btnproducto.setText("Productos");
        btnproducto.setFocusable(false);
        btnproducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnproducto.setMaximumSize(new java.awt.Dimension(120, 25));
        btnproducto.setPreferredSize(new java.awt.Dimension(120, 25));
        btnproducto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproductoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnproducto);

        btninventario.setText("Inventario");
        btninventario.setFocusable(false);
        btninventario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btninventario.setMaximumSize(new java.awt.Dimension(120, 25));
        btninventario.setPreferredSize(new java.awt.Dimension(120, 25));
        btninventario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btninventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninventarioActionPerformed(evt);
            }
        });
        jToolBar1.add(btninventario);

        btncerrar.setText("Cerrar");
        btncerrar.setFocusable(false);
        btncerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncerrar.setMaximumSize(new java.awt.Dimension(120, 25));
        btncerrar.setPreferredSize(new java.awt.Dimension(120, 25));
        btncerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });
        jToolBar1.add(btncerrar);

        getContentPane().add(jToolBar1);
        jToolBar1.setBounds(0, 0, 755, 42);

        lbnom.setText("Nombre: ");
        getContentPane().add(lbnom);
        lbnom.setBounds(30, 130, 60, 14);
        getContentPane().add(txtnombre);
        txtnombre.setBounds(100, 120, 200, 20);

        lbtitle.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lbtitle.setText("Ingreso de Productos");
        getContentPane().add(lbtitle);
        lbtitle.setBounds(210, 60, 185, 22);

        btnguarda.setText("Guardar");
        btnguarda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardaActionPerformed(evt);
            }
        });
        getContentPane().add(btnguarda);
        btnguarda.setBounds(190, 330, 120, 34);

        btncancel.setText("Cancelar");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        getContentPane().add(btncancel);
        btncancel.setBounds(340, 330, 108, 34);

        lbtipo.setText("Tipo: ");
        getContentPane().add(lbtipo);
        lbtipo.setBounds(50, 160, 40, 14);

        txtpeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpesoActionPerformed(evt);
            }
        });
        getContentPane().add(txtpeso);
        txtpeso.setBounds(100, 200, 82, 20);

        cmbtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "< Seleccione >", "Tableta", "Jarabe", "Inyectable" }));
        getContentPane().add(cmbtipo);
        cmbtipo.setBounds(100, 160, 143, 20);

        lbpeso.setText("Peso: ");
        getContentPane().add(lbpeso);
        lbpeso.setBounds(50, 200, 40, 14);

        lbpes.setText("gramos");
        getContentPane().add(lbpes);
        lbpes.setBounds(190, 200, 60, 20);

        lbmarca.setText("Marca: ");
        getContentPane().add(lbmarca);
        lbmarca.setBounds(40, 240, 50, 14);
        getContentPane().add(txtmarca);
        txtmarca.setBounds(100, 240, 143, 20);

        lblote.setText("Lote: ");
        getContentPane().add(lblote);
        lblote.setBounds(50, 280, 40, 14);
        getContentPane().add(txtlote);
        txtlote.setBounds(100, 280, 143, 20);

        lbini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo.png"))); // NOI18N
        getContentPane().add(lbini);
        lbini.setBounds(220, 80, 190, 230);

        tablainvent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablainvent);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 100, 750, 360);

        btngest.setText("Gestionar");
        btngest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngestActionPerformed(evt);
            }
        });
        getContentPane().add(btngest);
        btngest.setBounds(230, 480, 110, 30);

        btncan.setText("Imprimir");
        btncan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanActionPerformed(evt);
            }
        });
        getContentPane().add(btncan);
        btncan.setBounds(380, 480, 110, 30);

        btnactual.setText("Actualizar");
        btnactual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualActionPerformed(evt);
            }
        });
        getContentPane().add(btnactual);
        btnactual.setBounds(640, 70, 110, 30);

        txtbusca.setBackground(new java.awt.Color(5, 156, 60));
        txtbusca.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txtbusca.setForeground(new java.awt.Color(255, 255, 255));
        txtbusca.setBorder(null);
        txtbusca.setOpaque(false);
        txtbusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscaActionPerformed(evt);
            }
        });
        txtbusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscaKeyTyped(evt);
            }
        });
        getContentPane().add(txtbusca);
        txtbusca.setBounds(30, 70, 160, 30);

        lblog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/found.png"))); // NOI18N
        getContentPane().add(lblog);
        lblog.setBounds(0, 70, 30, 30);

        lbfound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/foundfon.png"))); // NOI18N
        getContentPane().add(lbfound);
        lbfound.setBounds(0, 70, 190, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        this.dispose();
        System.exit(0); 
    }//GEN-LAST:event_btncerrarActionPerformed

    private void txtpesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpesoActionPerformed

    private void btnproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproductoActionPerformed
        this.setSize(630, 430);
        lbtitle.setText("Ingreso de Productos");
        lbtitle.setLocation(210, 60);
        lbini.setVisible(false);
        
        lbfound.setVisible(false);
        txtbusca.setVisible(false);
        lblog.setVisible(false);
        
        lbtitle.setVisible(true);
        lbnom.setVisible(true);
        txtnombre.setVisible(true);
        lbtipo.setVisible(true);
        cmbtipo.setVisible(true);
        txtpeso.setVisible(true);
        lbpeso.setVisible(true);
        lbpes.setVisible(true);
        lbmarca.setVisible(true);
        txtmarca.setVisible(true);
        lblote.setVisible(true);
        txtlote.setVisible(true);
        btncancel.setVisible(true);
        btnguarda.setVisible(true);
        tablainvent.setVisible(false);
        tablainvent.getTableHeader().setVisible(false);
    }//GEN-LAST:event_btnproductoActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // Ocultar
        this.setSize(630, 430);
        tablainvent.setVisible(false);
        tablainvent.getTableHeader().setVisible(false);
        
        lbfound.setVisible(false);
        txtbusca.setVisible(false);
        lblog.setVisible(false);
        
        lbini.setVisible(true);
        lbtitle.setVisible(false);
        lbnom.setVisible(false);
        txtnombre.setVisible(false);
        lbtipo.setVisible(false);
        cmbtipo.setVisible(false);
        txtpeso.setVisible(false);
        lbpeso.setVisible(false);
        lbpes.setVisible(false);
        lbmarca.setVisible(false);
        txtmarca.setVisible(false);
        lblote.setVisible(false);
        txtlote.setVisible(false);
        btncancel.setVisible(false);
        btnguarda.setVisible(false);
    }//GEN-LAST:event_btncancelActionPerformed

    private void btnguardaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardaActionPerformed
        // Guardar
        String nombre = txtnombre.getText();
        int tipo = cmbtipo.getSelectedIndex();
        String peso = txtpeso.getText();
        String marca = txtmarca.getText();
        String lote = txtlote.getText();
        String sql = "INSERT INTO producto VALUES('0','"+nombre+"','"+tipo+"','"+peso+"','"+marca+"','"+lote+"')";
        try {
            GuardarProducto(sql);
        } catch (SQLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnguardaActionPerformed

    private void btninventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninventarioActionPerformed
        this.setSize(765, 560);
        tablainvent.setVisible(true);
        tablainvent.getTableHeader().setVisible(true);
        
        lbfound.setVisible(true);
        txtbusca.setVisible(true);
        lblog.setVisible(true);
        
        lbini.setVisible(false);
        lbtitle.setVisible(true);
        lbtitle.setText("Inventario de Bodega");
        lbtitle.setLocation(310, 60);
        lbnom.setVisible(false);
        txtnombre.setVisible(false);
        lbtipo.setVisible(false);
        cmbtipo.setVisible(false);
        txtpeso.setVisible(false);
        lbpeso.setVisible(false);
        lbpes.setVisible(false);
        lbmarca.setVisible(false);
        txtmarca.setVisible(false);
        lblote.setVisible(false);
        txtlote.setVisible(false);
        btncancel.setVisible(false);
        btnguarda.setVisible(false);
    }//GEN-LAST:event_btninventarioActionPerformed

    private void btncanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanActionPerformed
        //Imprimir
        
    }//GEN-LAST:event_btncanActionPerformed

    private void btnactualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualActionPerformed
        // Actualizar Tabla
        String sql = "SELECT producto.id_prod, producto.nom_prod, producto.tipo_prod, producto.peso_prod, producto.marca_prod, producto.lote_prod, cant_inven FROM producto, inventario WHERE inventario.id_prod = producto.id_prod";
        try {
            LlenarTabla(sql);
        } catch (SQLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnactualActionPerformed

    private void txtbuscaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscaKeyTyped
        String datos = txtbusca.getText();
        String sql = "SELECT producto.id_prod, producto.nom_prod, producto.tipo_prod, producto.peso_prod, producto.marca_prod, producto.lote_prod, cant_inven FROM producto, inventario WHERE inventario.id_prod = producto.id_prod AND producto.nom_prod LIKE '%"+datos+"%'";
        try {
            LlenarTabla(sql);
        } catch (SQLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtbuscaKeyTyped

    private void btngestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngestActionPerformed
        inventario inv = new inventario();
        inv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btngestActionPerformed

    private void txtbuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscaActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactual;
    private javax.swing.JButton btncan;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btngest;
    private javax.swing.JButton btnguarda;
    private javax.swing.JButton btninventario;
    private javax.swing.JButton btnproducto;
    private javax.swing.JComboBox<String> cmbtipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbfound;
    private javax.swing.JLabel lbini;
    private javax.swing.JLabel lblog;
    private javax.swing.JLabel lblote;
    private javax.swing.JLabel lbmarca;
    private javax.swing.JLabel lbnom;
    private javax.swing.JLabel lbpes;
    private javax.swing.JLabel lbpeso;
    private javax.swing.JLabel lbtipo;
    private javax.swing.JLabel lbtitle;
    private javax.swing.JTable tablainvent;
    private javax.swing.JTextField txtbusca;
    private javax.swing.JTextField txtlote;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpeso;
    // End of variables declaration//GEN-END:variables
}
