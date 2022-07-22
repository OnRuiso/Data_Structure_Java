package Folder;

public class Tree
{
	private Node raiz;
	
	public Tree()
	{
		raiz = null;
	}
	
	public Node getRaiz() {		return raiz;	}
	public void setRaiz(Node raiz) {		this.raiz = raiz;	}

//-----------------------------------------------------------------------------------------------------
	public void insertContenido(int i , Object carpeta)
	{
		Node n  = new Node(i);
		n.setContenido(carpeta);
		
		if(raiz == null){
			raiz = n;
		}
		else 
		{
			Node aux = raiz;
			
			while(aux != null)
			{
				n.setMother(aux);
				
				//if(n.getLlave() >= aux.getLlave())
				if(n.getLlave() >= 100)
				{
					aux = aux.getRight(); //*
				}else
				{
					aux = aux.getLeft(); //*
				}
			}
			
			//if(n.getLlave() < n.getMother().getLlave())
			if(n.getLlave() < 100)
			{
				n.getMother().setLeft(n);
			}else {
				n.getMother().setRight(n);
			}
		}
		
	}
	
//-----------------------------------------------------------------------------------------------------
		public void recorrerMenorMayor(Node n)
		{
			if(n != null)
			{
				recorrerMenorMayor(n.getLeft());
				System.out.println("Indice: |"+n.getLlave()+"| Numero: |"+n.getContenido()+"| ");
				recorrerMenorMayor(n.getRight());
			}
		}
//-----------------------------------------------------------------------------------------------------

}
