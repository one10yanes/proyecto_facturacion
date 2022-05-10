
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import proyecto4tosemestre.Login;
import proyecto4tosemestre.PaginaPrincipal;

public class ctrlLogin implements ActionListener{
    
    private Login login;
    private PaginaPrincipal pp;
    
    public ctrlLogin(Login vista){
    login=vista;
    login.JbtnIngresar.addActionListener(this);
    login.JbtnSalir.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource().equals(this.login.JbtnIngresar)){
            
            
            if (this.login.JtxtPass.getText().equals("one10yanes") && this.login.JtxtPass.getText().equals("qwet")) {
                pp = new PaginaPrincipal();
                pp.setVisible(true);
                ctrlPaginaPrincipal pantPrinc=new ctrlPaginaPrincipal(pp);
            }else
            {   
                JOptionPane.showMessageDialog(null, "User or Pass Invalida");
            } 
        }
    }
}
   
    
   

    
    
    

