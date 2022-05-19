
package modelo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class modeloCreacionUsuario extends conexion {
    
    public boolean crear (usuario usu) throws SQLException {
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO usuarios (nombre, apellido, usuario, password, tipo) VALUES (?,?,?,?,?)";
        
        try{
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, usu.getNombre());
            ps.setString(2, usu.getApellido());
            ps.setString(3, usu.getUsuario());
            ps.setString(4, usu.getPassword());
            ps.setString(5, usu.getTipo());
            ps.execute();
            return true;
            
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
    
    public boolean buscar (usuario usu) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql = "SELECT * FROM usuarios WHERE usuario=?";
        
        try{
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, usu.getUsuario());
            rs = (ResultSet) ps.executeQuery();
            
            if(rs.next()){
                usu.setId(Integer.parseInt(rs.getString("id")));
                usu.setNombre(rs.getString("nombre"));
                usu.setApellido(rs.getString("apellido"));
                usu.setUsuario(rs.getString("usuario"));
                usu.setPassword(rs.getString("password"));
                usu.setTipo(rs.getString("tipo"));
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
    
    public boolean eliminar (usuario usu) throws SQLException {
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "DELETE FROM usuarios WHERE id=?";
        
        try{
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setInt(1, usu.getId());
            ps.execute();
            return true;
            
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
}
      
      /*boolean res=true;
      try {
          
          
          Connection con = conexion.getConection();
          String sql="INSERT INTO usuarios (nombre, apellido, usuario, pass, tipo ) values(?,?,?,?,?)";
           System.out.println(sql);
           
           PreparedStatement crearuser=null;
           crearuser=(PreparedStatement) con.prepareStatement(sql);
           crearuser.setString(1, nom);
           crearuser.setString(2, ape);
           crearuser.setString(3, usu);
           crearuser.setString(4, pass);
           crearuser.setString(5, tipo);
           res=crearuser.execute();
           
      } catch (SQLException ex) {
          Logger.getLogger(modeloCreacionUsuario.class.getName()).log(Level.SEVERE, null, ex);
      }
    
      return res;
      
            }*/