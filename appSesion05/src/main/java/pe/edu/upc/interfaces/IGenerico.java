package pe.edu.upc.interfaces;

import java.util.List;

public interface IGenerico<T>{

	String Insert(T o);
	String Update(T o);
	String Delete(int index);
	T get(int index);
	List<T> getAll();
	int count();
	
}
