package Main;

import javax.swing.JOptionPane;

public class Matrix
{
	private String planilla[][] = {
			{"ID","Nombre","U1","U2","U3","U4","PF","Pp","NA","NB",},
			{"1","Joshua","00","00","00","00","00","00","00","00",},
			{"2","Thiago","00","00","00","00","00","00","00","00",},
			{"3","Evolet","00","00","00","00","00","00","00","00",},
			{"4","Ximena","00","00","00","00","00","00","00","00",},
			{"5","Darwin","00","00","00","00","00","00","00","00",},
			{"6","000000","00","00","00","00","00","00","00","00",},
			{"7","000000","00","00","00","00","00","00","00","00",},
			{"8","000000","00","00","00","00","00","00","00","00",},
			{"9","000000","00","00","00","00","00","00","00","00",},
			};
	
	
	
	public Matrix()	{	}
	
	

	public String[][] getPlanilla() {	return planilla;	}
	public void setPlanilla(String[][] planilla) {	this.planilla = planilla;	}
	
	//##-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public void iniMatriz()
	{
		/*
		for( int x =0 ; x < planilla.length ; x++)
		{
			for( int y =0 ; y < planilla.length ; y++)
			{
				planilla[x][y] = "00";
			}
		}
		
		planilla[0][0] = "[ ID ]";
		planilla[0][1] = "[ Nombre ]";       planilla[1][1] = "[ Joshua ]"; planilla[1][2] = "50"; planilla[1][3] = "50"; planilla[1][4] = "50"; planilla[1][5] = "50";
		planilla[0][2] = "U1";               planilla[2][1] = "[ Thiago ]"; planilla[2][2] = "50"; planilla[2][3] = "50"; planilla[2][4] = "50"; planilla[2][5] = "50";
		planilla[0][3] = "U2";               planilla[3][1] = "[ Evolet ]"; planilla[3][2] = "50"; planilla[3][3] = "50"; planilla[3][4] = "50"; planilla[3][5] = "50";
		planilla[0][4] = "U3";               planilla[4][1] = "[ Ximena ]"; planilla[4][2] = "50"; planilla[4][3] = "50"; planilla[4][4] = "50"; planilla[4][5] = "50";
		planilla[0][5] = "U4";               planilla[5][1] = "[ Darwin ]"; planilla[5][2] = "50"; planilla[5][3] = "50"; planilla[5][4] = "50"; planilla[5][5] = "50";
		planilla[0][6] = "PF";               planilla[6][1] = "[ 000000 ]"; 
		planilla[0][7] = "Pp";               planilla[7][1] = "[ 000000 ]"; 
		planilla[0][8] = "NA";               planilla[8][1] = "[ 000000 ]"; 
		planilla[0][9] = "NB";               planilla[9][1] = "[ 000000 ]"; 
		
		
		//solo generar la columna de ID		
		for(int i=1 ; i < 10 ; i++)
		{
			planilla[i][0] = "[ 0"+String.valueOf(i)+" ]";
		}
		*/
	}
	//##-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public void mostrarPlanilla()
	{		
		for( int x =0 ; x < planilla.length ; x++)
		{
			for( int y =0 ; y < planilla.length ; y++)
			{
				if( (x == 1 && y == 0) | (x == 2 && y == 0) | (x == 3 && y == 0) | (x == 4 && y == 0) | (x == 5 && y == 0) | (x == 6 && y == 0) | (x == 7 && y == 0) | (x == 8 && y == 0) | (x == 9 && y == 0) )
				{
					System.out.print("\n");
				}
				System.out.print(planilla[x][y]);
			}
		}
		
		JOptionPane.showMessageDialog(null, "Registro de Notas de los Estudiantes inscritos \n Cupo maximo: 10 Personas \n\n"
				+ "[ ID ][ Nombre ][ U1 ][ U2 ][ U3 ][ U4 ][ PF ][ Pp ][ NA ][ NB ] \n"
				+ "[ "+(planilla[1][0]+" ]" + "[ "+planilla[1][1]+" ]" + "[ "+planilla[1][2]+" ]" + "[ "+planilla[1][3]+" ]" + "[ "+planilla[1][4]+" ]" + "[ "+planilla[1][5]+" ]" + "[ "+planilla[1][6]+" ]" + "[ "+planilla[1][7]+" ]" + "[ "+planilla[1][8]+" ]" + "[ "+planilla[1][9]+" ]" + "\n")
				+ "[ "+(planilla[2][0]+" ]" + "[ "+planilla[2][1]+" ]" + "[ "+planilla[2][2]+" ]" + "[ "+planilla[2][3]+" ]" + "[ "+planilla[2][4]+" ]" + "[ "+planilla[2][5]+" ]" + "[ "+planilla[2][6]+" ]" + "[ "+planilla[2][7]+" ]" + "[ "+planilla[2][8]+" ]" + "[ "+planilla[2][9]+" ]" + "\n")
				+ "[ "+(planilla[3][0]+" ]" + "[ "+planilla[3][1]+" ]" + "[ "+planilla[3][2]+" ]" + "[ "+planilla[3][3]+" ]" + "[ "+planilla[3][4]+" ]" + "[ "+planilla[3][5]+" ]" + "[ "+planilla[3][6]+" ]" + "[ "+planilla[3][7]+" ]" + "[ "+planilla[3][8]+" ]" + "[ "+planilla[3][9]+" ]" + "\n")
				+ "[ "+(planilla[4][0]+" ]" + "[ "+planilla[4][1]+" ]" + "[ "+planilla[4][2]+" ]" + "[ "+planilla[4][3]+" ]" + "[ "+planilla[4][4]+" ]" + "[ "+planilla[4][5]+" ]" + "[ "+planilla[4][6]+" ]" + "[ "+planilla[4][7]+" ]" + "[ "+planilla[4][8]+" ]" + "[ "+planilla[4][9]+" ]" + "\n")
				+ "[ "+(planilla[5][0]+" ]" + "[ "+planilla[5][1]+" ]" + "[ "+planilla[5][2]+" ]" + "[ "+planilla[5][3]+" ]" + "[ "+planilla[5][4]+" ]" + "[ "+planilla[5][5]+" ]" + "[ "+planilla[5][6]+" ]" + "[ "+planilla[5][7]+" ]" + "[ "+planilla[5][8]+" ]" + "[ "+planilla[5][9]+" ]" + "\n")
				+ "[ "+(planilla[6][0]+" ]" + "[ "+planilla[6][1]+" ]" + "[ "+planilla[6][2]+" ]" + "[ "+planilla[6][3]+" ]" + "[ "+planilla[6][4]+" ]" + "[ "+planilla[6][5]+" ]" + "[ "+planilla[6][6]+" ]" + "[ "+planilla[6][7]+" ]" + "[ "+planilla[6][8]+" ]" + "[ "+planilla[6][9]+" ]" + "\n")
				+ "[ "+(planilla[7][0]+" ]" + "[ "+planilla[7][1]+" ]" + "[ "+planilla[7][2]+" ]" + "[ "+planilla[7][3]+" ]" + "[ "+planilla[7][4]+" ]" + "[ "+planilla[7][5]+" ]" + "[ "+planilla[7][6]+" ]" + "[ "+planilla[7][7]+" ]" + "[ "+planilla[7][8]+" ]" + "[ "+planilla[7][9]+" ]" + "\n")
				+ "[ "+(planilla[8][0]+" ]" + "[ "+planilla[8][1]+" ]" + "[ "+planilla[8][2]+" ]" + "[ "+planilla[8][3]+" ]" + "[ "+planilla[8][4]+" ]" + "[ "+planilla[8][5]+" ]" + "[ "+planilla[8][6]+" ]" + "[ "+planilla[8][7]+" ]" + "[ "+planilla[8][8]+" ]" + "[ "+planilla[8][9]+" ]" + "\n")
				+ "[ "+(planilla[9][0]+" ]" + "[ "+planilla[9][1]+" ]" + "[ "+planilla[9][2]+" ]" + "[ "+planilla[9][3]+" ]" + "[ "+planilla[9][4]+" ]" + "[ "+planilla[9][5]+" ]" + "[ "+planilla[9][6]+" ]" + "[ "+planilla[9][7]+" ]" + "[ "+planilla[9][8]+" ]" + "[ "+planilla[9][9]+" ]" + "\n")
				
				);
	}
	//##-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public void mostrarEstudiantes()
	{
		JOptionPane.showMessageDialog(null, "Los Estudiantes Inscritos en el programa son los siguientes: \n\n"
											+ planilla[1][1]+"\n"
											+ planilla[2][1]+"\n"
											+ planilla[3][1]+"\n"
											+ planilla[4][1]+"\n"
											+ planilla[5][1]+"\n"
											+ planilla[6][1]+"\n"
											+ planilla[7][1]+"\n"
											+ planilla[8][1]+"\n"
											);
		
	}


	
	
	
}
