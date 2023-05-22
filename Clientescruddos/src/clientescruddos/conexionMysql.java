package clientescruddos;
import java.sql.Connection;
import java.sql.DriverManager;

public class conexionMysql {
    Connection cn;
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/crudclientesdos","root","153125D.SSSm");
            System.out.println("CONECTADO!");
            
        } catch (Exception e) {
            System.out.println("ERROR" + e);
        }
        return cn;
    
    
    }
    
}
