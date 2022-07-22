package Enteros;

public class Nodo
{
	private Nodo mother;
	private Nodo right;
	private Nodo left;
		
	private int llave;
	private Integer contenido;
			
	public Nodo(int indice)
	{
		llave=indice;
		right=null;
		left=null;
		mother=null;
		contenido=null;
	}

	public Nodo getMother() {			return mother;		}
	public void setMother(Nodo mother) {			this.mother = mother;		}

	public Nodo getRight() {			return right;		}
	public void setRight(Nodo right) {			this.right = right;		}
			
	public Nodo getLeft() {			return left;		}
	public void setLeft(Nodo left) {			this.left = left;		}
		
	public int getLlave() {			return llave;		}
	public void setLlave(int llave) {			this.llave = llave;		}

	public Integer getContenido() {			return contenido;		}
	public void setContenido(Integer contenido) {			this.contenido = contenido;		}
			
}
