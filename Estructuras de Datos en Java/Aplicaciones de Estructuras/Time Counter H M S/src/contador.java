import java.util.Arrays; //libreria necesaria para que funcionara el array para traducir mas adelante

public class contador //publico para que otros programas la puedan acceder
{
	public static void main(String[] args)
	{
		//int contador = 0;
		int hora = 0;
		int minutos = 0;
		int segundos = 0;
		
		int[] tiempo = {hora,minutos,segundos};//arreglo para crear el vector tiempo
		
		while(hora < 24)
		{			
			while(minutos < 60)
			{
				while(segundos < 60)
				{
					tiempo[0] = hora;
					tiempo[1] = minutos;
					tiempo[2] = segundos;
					
					System.out.println(Arrays.toString(tiempo));
					
					segundos = segundos +1;
										
				}
				minutos = minutos + 1;
				segundos = 0;
			}
			hora = hora + 1;
			minutos = 0;
		}
	}
}
