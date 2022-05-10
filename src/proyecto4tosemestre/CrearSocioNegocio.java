/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto4tosemestre;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.IntelliJTheme;
import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatCyanLightIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.multi.MultiLookAndFeel;
import javax.swing.plaf.synth.SynthLookAndFeel;

/**
 *
 * @author YanesH
 */
public class CrearSocioNegocio extends javax.swing.JFrame {

    /**
     * Creates new form CrearSocioNegocio
     */
    public CrearSocioNegocio() {
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

        JbtnGroupActivoInactivo = new javax.swing.ButtonGroup();
        ElegirFichero = new javax.swing.JFileChooser();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        JetiCodigo = new javax.swing.JLabel();
        JetiGrupo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JetiNombre = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        JpanelDatosGeneral = new javax.swing.JPanel();
        JetiTel1 = new javax.swing.JLabel();
        JetiTel2 = new javax.swing.JLabel();
        JetiDireccion = new javax.swing.JLabel();
        JetiCiudad = new javax.swing.JLabel();
        JetiDepartamento = new javax.swing.JLabel();
        JetiPais = new javax.swing.JLabel();
        JcbxPais = new javax.swing.JComboBox<>();
        JcbxCiudad = new javax.swing.JComboBox<>();
        JcbxDepartamento = new javax.swing.JComboBox<>();
        JrbtnInactivo = new javax.swing.JRadioButton();
        JrbtnActivo = new javax.swing.JRadioButton();
        JtxtDireccion = new javax.swing.JTextField();
        JtxtTel1 = new javax.swing.JTextField();
        JtxtTel2 = new javax.swing.JTextField();
        JtxtPagWeb = new javax.swing.JTextField();
        JetiPaginaWeb = new javax.swing.JLabel();
        JtxtCorreo = new javax.swing.JTextField();
        JetiCorreo = new javax.swing.JLabel();
        JpanelCondicionPago = new javax.swing.JPanel();
        JcbxCondPago = new javax.swing.JComboBox<>();
        JetiCondPago1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        JetiCondPago2 = new javax.swing.JLabel();
        JpanelFinanza = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        JcbxGrupo1 = new javax.swing.JComboBox<>();
        JcbxGrupo = new javax.swing.JComboBox<>();
        JtxtCodigo = new javax.swing.JTextField();
        JtxtNombre = new javax.swing.JTextField();
        JtxtRut = new javax.swing.JTextField();
        JetiCreacionSocioNegocio = new javax.swing.JLabel();
        JbtnSalir = new javax.swing.JButton();
        JbtnCAB = new javax.swing.JButton();
        JbtnCancelar = new javax.swing.JButton();
        JbtnCAB1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setExtendedState(6);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 780, -1));

        JetiCodigo.setText("Codigo");
        jPanel2.add(JetiCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));

        JetiGrupo.setText("Grupo");
        jPanel2.add(JetiGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));

        jLabel4.setText("RUT");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 20));

        JetiNombre.setText("Nombre");
        jPanel2.add(JetiNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        JpanelDatosGeneral.setBackground(new java.awt.Color(255, 255, 255));
        JpanelDatosGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JetiTel1.setText("Telefono 1");
        JpanelDatosGeneral.add(JetiTel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 16, -1, -1));

        JetiTel2.setText("Telefono 2");
        JpanelDatosGeneral.add(JetiTel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 45, -1, -1));

        JetiDireccion.setText("Direccion");
        JpanelDatosGeneral.add(JetiDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 74, -1, -1));

        JetiCiudad.setText("Ciudad");
        JpanelDatosGeneral.add(JetiCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 72, -1));

        JetiDepartamento.setText("Departamento");
        JpanelDatosGeneral.add(JetiDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, -1, -1));

        JetiPais.setText("Pais");
        JpanelDatosGeneral.add(JetiPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));

        JcbxPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COLOMBIA", " ", " " }));
        JpanelDatosGeneral.add(JcbxPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 130, -1));

        JcbxCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BARRANQUILLA\t", " ", " " }));
        JpanelDatosGeneral.add(JcbxCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 130, -1));

        JcbxDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATLANTICO", " ", " ", " " }));
        JpanelDatosGeneral.add(JcbxDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 130, -1));

        JrbtnInactivo.setBackground(new java.awt.Color(255, 255, 255));
        JbtnGroupActivoInactivo.add(JrbtnInactivo);
        JrbtnInactivo.setText("Inactivo");
        JpanelDatosGeneral.add(JrbtnInactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, -1, -1));

        JrbtnActivo.setBackground(new java.awt.Color(255, 255, 255));
        JbtnGroupActivoInactivo.add(JrbtnActivo);
        JrbtnActivo.setText("Activo");
        JpanelDatosGeneral.add(JrbtnActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, -1, -1));
        JpanelDatosGeneral.add(JtxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 150, -1));
        JpanelDatosGeneral.add(JtxtTel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 150, -1));
        JpanelDatosGeneral.add(JtxtTel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 150, -1));
        JpanelDatosGeneral.add(JtxtPagWeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 150, -1));

        JetiPaginaWeb.setText("Pagina Web");
        JpanelDatosGeneral.add(JetiPaginaWeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 20));
        JpanelDatosGeneral.add(JtxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 150, -1));

        JetiCorreo.setText("Correo Elect.");
        JpanelDatosGeneral.add(JetiCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 20));

        jTabbedPane1.addTab("Datos General", JpanelDatosGeneral);

        JpanelCondicionPago.setBackground(new java.awt.Color(255, 255, 255));
        JpanelCondicionPago.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JcbxCondPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CONTADO", "CREDITO", " " }));
        JpanelCondicionPago.add(JcbxCondPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 150, -1));

        JetiCondPago1.setText("Plazo de Pago");
        JpanelCondicionPago.add(JetiCondPago1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jCheckBox1.setText("60 Dias");
        jCheckBox1.setEnabled(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        JpanelCondicionPago.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        jCheckBox2.setText("30 Dias ");
        jCheckBox2.setEnabled(false);
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        JpanelCondicionPago.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jCheckBox3.setText("45 Dias");
        jCheckBox3.setEnabled(false);
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        JpanelCondicionPago.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        JetiCondPago2.setText("Condiciones de Pago");
        JpanelCondicionPago.add(JetiCondPago2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 16, -1, -1));

        jTabbedPane1.addTab("Condiciones de pago", JpanelCondicionPago);

        JpanelFinanza.setBackground(new java.awt.Color(255, 255, 255));
        JpanelFinanza.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setText("Fecha Cert. Bancaria");
        JpanelFinanza.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel14.setText("Banco");
        JpanelFinanza.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jLabel15.setText("N° Cuenta");
        JpanelFinanza.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel17.setText("Tipo de Cuenta");
        JpanelFinanza.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 86, -1, 20));
        JpanelFinanza.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 150, -1));

        jButton1.setText("Adjuntar Doc");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        JpanelFinanza.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));
        JpanelFinanza.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 150, -1));

        JcbxGrupo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CLIENTE", "PROVEEDOR", " " }));
        JcbxGrupo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcbxGrupo1ActionPerformed(evt);
            }
        });
        JpanelFinanza.add(JcbxGrupo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 150, -1));

        jTabbedPane1.addTab("Finanzas ", JpanelFinanza);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 730, 230));

        JcbxGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CLIENTE", "PROVEEDOR", " " }));
        JcbxGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcbxGrupoActionPerformed(evt);
            }
        });
        jPanel2.add(JcbxGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 150, -1));
        jPanel2.add(JtxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 48, 150, -1));
        jPanel2.add(JtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 150, -1));
        jPanel2.add(JtxtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 150, -1));

        JetiCreacionSocioNegocio.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        JetiCreacionSocioNegocio.setText("Creacion socio de Negocios");
        jPanel2.add(JetiCreacionSocioNegocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        JbtnSalir.setBackground(new java.awt.Color(153, 153, 153));
        JbtnSalir.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        JbtnSalir.setForeground(new java.awt.Color(255, 255, 255));
        JbtnSalir.setText("Salir");
        JbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(JbtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 110, -1));

        JbtnCAB.setBackground(new java.awt.Color(51, 153, 255));
        JbtnCAB.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        JbtnCAB.setForeground(new java.awt.Color(255, 255, 255));
        JbtnCAB.setText("Buscar");
        jPanel2.add(JbtnCAB, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 110, -1));

        JbtnCancelar.setBackground(new java.awt.Color(153, 153, 153));
        JbtnCancelar.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        JbtnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        JbtnCancelar.setText("Cancelar");
        JbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(JbtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 110, -1));

        JbtnCAB1.setBackground(new java.awt.Color(51, 153, 255));
        JbtnCAB1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        JbtnCAB1.setForeground(new java.awt.Color(255, 255, 255));
        JbtnCAB1.setText("Crear / Actualizar ");
        jPanel2.add(JbtnCAB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JcbxGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcbxGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JcbxGrupoActionPerformed

    private void JbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_JbtnSalirActionPerformed

    private void JbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JbtnCancelarActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   int resp;

    resp=ElegirFichero.showOpenDialog(jPanel2);

   if (resp==JFileChooser.APPROVE_OPTION) {
      JOptionPane.showMessageDialog(null,ElegirFichero.getSelectedFile().toString());         
        
   }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JcbxGrupo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcbxGrupo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JcbxGrupo1ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrearSocioNegocio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearSocioNegocio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearSocioNegocio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearSocioNegocio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FlatLightFlatIJTheme.setup();
                }catch(Exception e){
                    e.printStackTrace();
                }
                
                new CrearSocioNegocio().setVisible(true);
 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser ElegirFichero;
    private javax.swing.JButton JbtnCAB;
    private javax.swing.JButton JbtnCAB1;
    private javax.swing.JButton JbtnCancelar;
    private javax.swing.ButtonGroup JbtnGroupActivoInactivo;
    private javax.swing.JButton JbtnSalir;
    private javax.swing.JComboBox<String> JcbxCiudad;
    private javax.swing.JComboBox<String> JcbxCondPago;
    private javax.swing.JComboBox<String> JcbxDepartamento;
    private javax.swing.JComboBox<String> JcbxGrupo;
    private javax.swing.JComboBox<String> JcbxGrupo1;
    private javax.swing.JComboBox<String> JcbxPais;
    private javax.swing.JLabel JetiCiudad;
    private javax.swing.JLabel JetiCodigo;
    private javax.swing.JLabel JetiCondPago1;
    private javax.swing.JLabel JetiCondPago2;
    private javax.swing.JLabel JetiCorreo;
    private javax.swing.JLabel JetiCreacionSocioNegocio;
    private javax.swing.JLabel JetiDepartamento;
    private javax.swing.JLabel JetiDireccion;
    private javax.swing.JLabel JetiGrupo;
    private javax.swing.JLabel JetiNombre;
    private javax.swing.JLabel JetiPaginaWeb;
    private javax.swing.JLabel JetiPais;
    private javax.swing.JLabel JetiTel1;
    private javax.swing.JLabel JetiTel2;
    private javax.swing.JPanel JpanelCondicionPago;
    private javax.swing.JPanel JpanelDatosGeneral;
    private javax.swing.JPanel JpanelFinanza;
    private javax.swing.JRadioButton JrbtnActivo;
    private javax.swing.JRadioButton JrbtnInactivo;
    private javax.swing.JTextField JtxtCodigo;
    private javax.swing.JTextField JtxtCorreo;
    private javax.swing.JTextField JtxtDireccion;
    private javax.swing.JTextField JtxtNombre;
    private javax.swing.JTextField JtxtPagWeb;
    private javax.swing.JTextField JtxtRut;
    private javax.swing.JTextField JtxtTel1;
    private javax.swing.JTextField JtxtTel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
