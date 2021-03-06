/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;

/**
 *
 * @author YanesH
 */
public class CrearArticulos extends javax.swing.JFrame {

    /**
     * Creates new form CrearArticulos
     */
    public CrearArticulos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        JetiNumArt = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        JrbtnInactivo = new javax.swing.JRadioButton();
        JrbtnActivo = new javax.swing.JRadioButton();
        JcbSujetoImpuesto = new javax.swing.JCheckBox();
        JtxtUndMed = new javax.swing.JTextField();
        JetiUndMed = new javax.swing.JLabel();
        JtxtCantidad = new javax.swing.JTextField();
        JetiCantidad = new javax.swing.JLabel();
        JtxtPrecioUnd = new javax.swing.JTextField();
        JetiPrecioUnd = new javax.swing.JLabel();
        JtxtCostoUnd = new javax.swing.JTextField();
        JetiCostoUnd = new javax.swing.JLabel();
        JetiPorcImp = new javax.swing.JLabel();
        JtxtPorcImp = new javax.swing.JTextField();
        JetiDescripcion1 = new javax.swing.JLabel();
        JtxtDescripcion1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        JtxtNumArt = new javax.swing.JTextField();
        JtxtDescripcion = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        JetiDescripcion = new javax.swing.JLabel();
        JresStock = new javax.swing.JLabel();
        JetiStock = new javax.swing.JLabel();
        JresSaldoStock = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JresSaldoStock1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 780, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jLabel1.setText("Creacion Articulos");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        JetiNumArt.setText("Num. Artic");
        jPanel2.add(JetiNumArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Crear / Actualizar / Buscar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 90, 20));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JrbtnInactivo.setBackground(new java.awt.Color(255, 255, 255));
        JrbtnInactivo.setText("Inactivo");
        jPanel1.add(JrbtnInactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, -1, -1));

        JrbtnActivo.setBackground(new java.awt.Color(255, 255, 255));
        JrbtnActivo.setText("Activo");
        jPanel1.add(JrbtnActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, -1, -1));

        JcbSujetoImpuesto.setBackground(new java.awt.Color(255, 255, 255));
        JcbSujetoImpuesto.setText("Sujeto a impuesto");
        jPanel1.add(JcbSujetoImpuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));
        jPanel1.add(JtxtUndMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 150, -1));

        JetiUndMed.setText("Nombre de unidad de medida de compras");
        jPanel1.add(JetiUndMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, 20));

        JtxtCantidad.setForeground(new java.awt.Color(204, 204, 204));
        JtxtCantidad.setText("(Opcional)");
        jPanel1.add(JtxtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 150, -1));

        JetiCantidad.setText("Cantidad");
        jPanel1.add(JetiCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        JtxtPrecioUnd.setForeground(new java.awt.Color(204, 204, 204));
        JtxtPrecioUnd.setText("(Opcional)");
        jPanel1.add(JtxtPrecioUnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 150, -1));

        JetiPrecioUnd.setText("Precio Und ");
        jPanel1.add(JetiPrecioUnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 20));

        JtxtCostoUnd.setForeground(new java.awt.Color(204, 204, 204));
        JtxtCostoUnd.setText("(Opcional)");
        jPanel1.add(JtxtCostoUnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 150, -1));

        JetiCostoUnd.setText("Costo Und ");
        jPanel1.add(JetiCostoUnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));

        JetiPorcImp.setText("Porc Imp.");
        jPanel1.add(JetiPorcImp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 20));
        jPanel1.add(JtxtPorcImp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 150, -1));

        JetiDescripcion1.setText("Descripcion");
        jPanel1.add(JetiDescripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, 20));
        jPanel1.add(JtxtDescripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 150, 80));

        jTabbedPane1.addTab("Datos General", jPanel1);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 730, 230));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, 20));

        JtxtNumArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtxtNumArtActionPerformed(evt);
            }
        });
        jPanel2.add(JtxtNumArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 150, -1));
        jPanel2.add(JtxtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 150, -1));

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Cancelar");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, 20));

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Salir");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel17))
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 90, -1));

        JetiDescripcion.setText("Nom. Artic");
        jPanel2.add(JetiDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        JresStock.setBackground(new java.awt.Color(255, 255, 255));
        JresStock.setText("1");
        JresStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(JresStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 90, 20));

        JetiStock.setText("Stock");
        jPanel2.add(JetiStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 80, 20));

        JresSaldoStock.setBackground(new java.awt.Color(255, 255, 255));
        JresSaldoStock.setText("1");
        JresSaldoStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(JresSaldoStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 90, 20));

        jLabel5.setText("Saldo Stock");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 80, 20));

        jLabel6.setText("Saldo Ponderado");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 100, 20));

        JresSaldoStock1.setBackground(new java.awt.Color(255, 255, 255));
        JresSaldoStock1.setText("1");
        JresSaldoStock1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(JresSaldoStock1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 90, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void JtxtNumArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtxtNumArtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtxtNumArtActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrearArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatLightLaf());
                }catch(Exception e){
                    e.printStackTrace();
                }
                new CrearArticulos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox JcbSujetoImpuesto;
    private javax.swing.JLabel JetiCantidad;
    private javax.swing.JLabel JetiCostoUnd;
    private javax.swing.JLabel JetiDescripcion;
    private javax.swing.JLabel JetiDescripcion1;
    private javax.swing.JLabel JetiNumArt;
    private javax.swing.JLabel JetiPorcImp;
    private javax.swing.JLabel JetiPrecioUnd;
    private javax.swing.JLabel JetiStock;
    private javax.swing.JLabel JetiUndMed;
    private javax.swing.JRadioButton JrbtnActivo;
    private javax.swing.JRadioButton JrbtnInactivo;
    private javax.swing.JLabel JresSaldoStock;
    private javax.swing.JLabel JresSaldoStock1;
    private javax.swing.JLabel JresStock;
    private javax.swing.JTextField JtxtCantidad;
    private javax.swing.JTextField JtxtCostoUnd;
    private javax.swing.JTextField JtxtDescripcion;
    private javax.swing.JTextField JtxtDescripcion1;
    private javax.swing.JTextField JtxtNumArt;
    private javax.swing.JTextField JtxtPorcImp;
    private javax.swing.JTextField JtxtPrecioUnd;
    private javax.swing.JTextField JtxtUndMed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
