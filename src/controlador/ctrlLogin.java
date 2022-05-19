
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.modelologin;
import vista.Login;
import vista.PaginaPrincipal;
import modelo.usuario;

public class ctrlLogin implements ActionListener{

    private usuario mod;
    private modelologin modLog;
    private Login frmLogin;
    
    public ctrlLogin(usuario mod, modelologin modLog,Login frmLogin){
        this.mod=mod;
        this.modLog=modLog;
        this.frmLogin=frmLogin;
        this.frmLogin.JbtnIngresar.addActionListener(this);
        this.frmLogin.JbtnSalir.addActionListener(this);
    }
    
    ctrlLogin(Login frmlogin) {
    }
    
    
    public void iniciar(){
        frmLogin.setTitle("Login");
        frmLogin.setLocationRelativeTo(null);
        frmLogin.JtxtID.setVisible(false);
    }  
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== frmLogin.JbtnIngresar) {
            mod.setUsuario(frmLogin.JtxtID.getText());
            mod.setPassword(frmLogin.JtxtPass.getText());
           
            try {
                if(modLog.consultaUserLogin(mod)){
                    System.out.println("Acceso Exitoso");
                    frmLogin.dispose();
                    PaginaPrincipal menu = new PaginaPrincipal();
                    menu.setVisible(true);
                 
                }else{
                    JOptionPane.showMessageDialog(null, "User o Pass Incorrecta");
                }
            } catch (SQLException ex) {
                Logger.getLogger(ctrlLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
        
    }
            
   }

   
    
   

    
    
    

