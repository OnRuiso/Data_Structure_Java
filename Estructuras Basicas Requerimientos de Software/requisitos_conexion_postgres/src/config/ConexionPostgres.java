package config;

import java.sql.Connection;
import java.sql.DriverManager;
import utils.Env;


public class ConexionPostgres implements Conexion{

	 public Connection getConnect() {
		     Env env =new Env();
		     
		    Connection connection = null;
		     
		    String  database = env.pr.getProperty("database");
			String	hostname = env.pr.getProperty("hostname");
			String	port = env.pr.getProperty("port");
			String	username = env.pr.getProperty("username");
			String	password = env.pr.getProperty("password");
		     
	        try {
	           
	            try { 
	                Class.forName("org.postgresql.Driver");
	            } catch (ClassNotFoundException ex) {
	                System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
	            }
	            
	            // Database connect
	            // Conectamos con la base de datos
	            connection = DriverManager.getConnection(
	                    "jdbc:postgresql://"+hostname+":"+port+"/"+database,
	                    username, password);
	            
	            boolean valid = connection.isValid(50000);
	            System.out.println(valid ? "TEST OK" : "TEST FAIL");
	        } catch (java.sql.SQLException sqle) {
	            System.out.println("Error: " + sqle);
	        }
	        return connection;
	        
	    } 
	   /*
	    public static void main(String[] args) {
	    	ConexionPostgres conexion = new ConexionPostgres();
	    	conexion.connectDatabase(); 
	    }
	    */
	    
    
}