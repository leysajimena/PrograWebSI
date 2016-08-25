package pe.edu.upc.interfaces;

import pe.edu.upc.entity.Empleado;

public interface IEmpleado extends IGenerico<Empleado>{
	
	Empleado getByNroSegSocial(String nss);

}
