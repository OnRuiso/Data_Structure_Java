package Main;
import config.Conexion;
import Persistence.CoffeePersistence;
import config.ConexionPostgres;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ConexionMysql conexion= new ConexionMysql();
				ConexionPostgres conexion = new ConexionPostgres();
				
				CoffeePersistence persistencia=new CoffeePersistence(conexion);
				persistencia.getCofees();

	}

}	