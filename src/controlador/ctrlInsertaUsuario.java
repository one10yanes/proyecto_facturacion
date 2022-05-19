
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.usuario;
import modelo.modeloCreacionUsuario;
import vista.CreacionUsuarios;

public class ctrlInsertaUsuario implements ActionListener {
    
    private usuario mod;
    private modeloCreacionUsuario modc;
    private CreacionUsuarios frm;

    public ctrlInsertaUsuario (usuario mod, modeloCreacionUsuario modc, CreacionUsuarios frm_usu){
        this.mod=mod;
        this.modc = modc;
        this.frm=frm_usu;
        this.frm.btnCrear.addActionListener(this);
        this.frm.btnBuscar.addActionListener(this);
        this.frm.btnLimpiar.addActionListener(this);  
    }

    ctrlInsertaUsuario(CreacionUsuarios frmusu) {
    }

    public void iniciar(){
        frm.setTitle("Usuarios");
        frm.setLocationRelativeTo(null);
        frm.txtId.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == frm.btnCrear){
            mod.setNombre(frm.txtNombre.getText());
            mod.setApellido(frm.txtApellido.getText());
            mod.setUsuario(frm.txtUsuario.getText());
            mod.setPassword(frm.txtPassword.getText());
            mod.setTipo(String.valueOf(frm.cBoxTipo.getSelectedItem()));
            
            try {
                if(modc.crear(mod)){
                    JOptionPane.showMessageDialog(null, "Registro Guardado");
                    limpiar();
                }else{
                    JOptionPane.showMessageDialog(null, "Error al guardar");
                    limpiar();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ctrlInsertaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(e.getSource() == frm.btnBuscar){
            mod.setNombre(frm.txtNombre.getText());
            mod.setApellido(frm.txtApellido.getText());
            mod.setUsuario(frm.txtUsuario.getText());
            mod.setPassword(frm.txtPassword.getText());
            mod.setTipo(String.valueOf(frm.cBoxTipo.getSelectedItem()));
            
            try {
                if(modc.buscar(mod)){
                    JOptionPane.showMessageDialog(null, "Registro Encontrado");
                    frm.txtId.setText(String.valueOf(mod.getId()));
                    frm.txtNombre.setText(mod.getNombre());
                    frm.txtApellido.setText(mod.getApellido());
                    frm.txtUsuario.setText(mod.getUsuario());
                    frm.txtPassword.setText(mod.getPassword());
                    frm.cBoxTipo.setSelectedItem(mod.getTipo());
                }else{
                    JOptionPane.showMessageDialog(null, "No se encuentra el registro");
                }
            } catch (SQLException ex) {
                Logger.getLogger(ctrlInsertaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(e.getSource() == frm.btnLimpiar){
            limpiar();
        }
    }
    public void limpiar(){
        frm.txtId.setText(null);
        frm.txtNombre.setText(null);
        frm.txtApellido.setText(null);
        frm.txtUsuario.setText(null);
        frm.txtPassword.setText(null);
        frm.cBoxTipo.setSelectedIndex(1);
    }
}

