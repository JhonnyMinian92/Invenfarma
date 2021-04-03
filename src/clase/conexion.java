package clase;

import java.sql.*;

public class conexion {
    
    private Connection conexion;
   
    public conexion obtener(){
       String cadcon="jdbc:mysql://localhost:3306/invenfarma";
       String user="root";
       String password="";
       try {
             Class.forName("com.mysql.jdbc.Driver");
             setConexion(DriverManager.getConnection(cadcon, user, password));

             if(getConexion() != null){
                 System.out.println("Conexion Exitosa!");
             }else{
                 System.out.println("Conexion Fallida!");                
             }

       } catch (Exception e) {
               e.printStackTrace();
   }

       return this;
    }
    public Connection getConexion() {
   return conexion;
    }    
    public void setConexion(Connection conexion) {
         this.conexion = conexion;
     }   

    public ResultSet consultar(String sql) {
         ResultSet resultado;
         try {
             Statement sentencia = getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
             resultado = sentencia.executeQuery(sql);
         } catch (SQLException e) {
             e.printStackTrace();
             return null;
         }        return resultado;
     }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
