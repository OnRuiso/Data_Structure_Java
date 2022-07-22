package Folder;

public class Node
{
	private Node mother;
	private Node right;
	private Node left;
		
	private int llave;
	private Object contenido;
			
	public Node(int indice)
	{
		llave=indice;
		right=null;
		left=null;
		mother=null;
		contenido=null;
	}

	public Node getMother() {			return mother;		}
	public void setMother(Node mother) {			this.mother = mother;		}

	public Node getRight() {			return right;		}
	public void setRight(Node right) {			this.right = right;		}
			
	public Node getLeft() {			return left;		}
	public void setLeft(Node left) {			this.left = left;		}
		
	public int getLlave() {			return llave;		}
	public void setLlave(int llave) {			this.llave = llave;		}

	public Object getContenido() {			return contenido;		}
	public void setContenido(Object contenido) {			this.contenido = contenido;		}
			
}

