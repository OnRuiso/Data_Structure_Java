package compraventa;

import java.util.Comparator;

public class OrdenModelo implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return (int) (((Vehiculo) o1).getModelo() - ((Vehiculo) o2).getModelo());
	}

}
