
package modelo;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class modelologin extends conexion{
    
    public boolean consultaUserLogin(usuario usu) throws SQLException {
     
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql = "SELECT * FROM usuarios WHERE usuario=? and password=?";
         
        try{
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, usu.getUsuario());
            ps.setString(2, usu.getPassword());
            rs = (ResultSet) ps.executeQuery();
            
            if(rs.next()){
                usu.setUsuario(rs.getString("usuario"));
                usu.setPassword(rs.getString("password"));
                return true;
            }return false;
    
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }   
            
   /* boolean res=false;
    
        try {
            Connection con = conexion.getConection();
            ResultSet rs;
           PreparedStatement instruccion;
           String sql="select * from users where usuario=? and password=?";
           instruccion=(PreparedStatement) con.prepareStatement(sql);
           instruccion.setString(1, usu);
           instruccion.setString(2, pass);
           rs=instruccion.executeQuery();
            if (rs.next()) {
                res=true;
                
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(modelologin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
}*/

}
