package Foresta;

public class Arbol 
{
	private Nodo raiz;
	
	public Arbol()
	{
		raiz = null;
	}

	public Nodo getRaiz() {		return raiz;	}
	public void setRaiz(Nodo raiz) {		this.raiz = raiz;	}

//-----------------------------------------------------------------------------------------------------
	public void insertContenido(int i , String fruta)
	{
		Nodo n  = new Nodo(i);
		n.setContenido(fruta);
		
		if(raiz == null){
			raiz = n;
		}
		else 
		{
			Nodo aux = raiz;
			
			while(aux != null)
			{
				n.setMother(aux);
								
				if(n.getLlave() >= aux.getLlave())
				{
					aux = aux.getRight(); //*
				}else
				{
					aux = aux.getLeft(); //*
				}
			}
			
			if(n.getLlave() < n.getMother().getLlave()){
				n.getMother().setLeft(n);
			}else {
				n.getMother().setRight(n);
			}
		}
		
	}
	
//-----------------------------------------------------------------------------------------------------
		public void recorrerMenorMayor(Nodo n)
		{
			if(n != null)
			{
				recorrerMenorMayor(n.getLeft());
				System.out.println("Indice: |"+n.getLlave()+"| fruta: |"+n.getContenido()+"| Version 2");
				recorrerMenorMayor(n.getRight());
			}
		}
//-----------------------------------------------------------------------------------------------------
}
