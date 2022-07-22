package Foresta;

public class Main
{
	Fruteria moll = new Fruteria();

	public static void main(String[] args)
	{
		Main m = new Main();
		m.moll = new Fruteria();
		
		m.moll.initFruteria();
		m.moll.recorrer();
		
		
	}

}
