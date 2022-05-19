
import javax.swing.JOptionPane;
import controlador.ctrlInsertaUsuario;
import controlador.ctrlLogin;
import modelo.modeloCreacionUsuario;
import modelo.modelologin;
import modelo.usuario;
import vista.CreacionUsuarios;
import vista.Login;




public class Proyecto4toSemestre {

        public static void main(String args[]) {
            
            usuario mod = new usuario();
            modeloCreacionUsuario modc = new modeloCreacionUsuario();
            modelologin ml = new modelologin();
            CreacionUsuarios frm = new CreacionUsuarios();
            Login frmLogin = new Login();

            ctrlInsertaUsuario ctrl = new ctrlInsertaUsuario(mod, modc, frm);
            ctrlLogin ctrlLog = new ctrlLogin(mod, ml, frmLogin);
            

            ctrl.iniciar();
            /*frm.setVisible(true);*/
            frmLogin.setVisible(true);
            
            
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
            java.util.logging.Logger.getLogger(CreacionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreacionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreacionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreacionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }
    
    
    
}
