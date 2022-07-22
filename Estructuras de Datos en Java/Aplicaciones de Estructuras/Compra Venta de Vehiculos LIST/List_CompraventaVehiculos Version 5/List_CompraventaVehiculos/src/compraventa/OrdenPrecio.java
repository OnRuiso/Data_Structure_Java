package compraventa;

import java.util.Comparator;

public class OrdenPrecio implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return (int) (((Vehiculo) o1).getValor() - ((Vehiculo) o2).getValor());
	}
	
	
}
