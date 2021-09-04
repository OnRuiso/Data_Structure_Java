package Solid;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//....................................... Interfaces...................................................
	public interface InterfazVuelo{
		public String volar();
	}

	public interface InterfazCantar{
		public String cantar();
	}

	public interface InterfazCaminar{
		public String caminar();
	}

	public interface InterfazNadar{
		public String nadar();
	}



	//......................................Ejemplos de uso ------------------------------------------------------------
	public class Loro implements InterfazVuelo, InterfazCantar, InterfazCaminar{

		public String volar() {
			return "vuelo de loro ";
		}
		
		public String cantar() {
			return "canto de loro ";
		}
		
		public String caminar() {
			return "pasos de loro ";
		}
		
		
	}


	public class Flamenco  implements InterfazVuelo, InterfazCantar, InterfazCaminar{

		public String volar() {
			return "vuelo de flamenco ";
		}
		
		public String cantar() {
			return "canto de flamenco ";
		}
		
		public String caminar() {
			return "pasos de flamenco ";
		}
		
	}

	public class Pinguino  implements InterfazNadar, InterfazCantar, InterfazCaminar{
	    /**/
		public String nadar() {
			return "nado de Pinguino ";
		}
		
		public String cantar() {
			return "canto de Pinguino ";
		}
		
		public String caminar() {
			return "pasos de Pinguino ";
		}
		
	}

}
