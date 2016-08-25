package pe.edu.upc.model.dao;

import java.util.ArrayList;
import java.util.List;

import pe.edu.upc.model.entity.Persona;
import pe.edu.upc.service.IPersona;


public class ListaPersonas implements IPersona {

	
	private List<Persona> lPersona;
	
	public ListaPersonas(){
		lPersona=new ArrayList<Persona>();
	}

	public int contar() {
		// TODO Auto-generated method stub
		return lPersona.size();
	}

	public Persona obtenerElemento(int pos) {
		// TODO Auto-generated method stub
		return lPersona.get(pos);
	}

	public String insertar(Persona o) {
		// TODO Auto-generated method stub
		lPersona.add(o);
		return "Registro ok";
	}

	public Persona buscarporDNI(String DNI) {
		// TODO Auto-generated method stub
		for (Persona persona : lPersona) {
			if(persona.getDNI().equals(DNI)){
				return persona;
			}
		}
		return null;//DNI no existe
	}

	
	
}
