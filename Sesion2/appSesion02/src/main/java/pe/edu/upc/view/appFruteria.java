package pe.edu.upc.view;

import pe.edu.upc.entity.Fruta;
import pe.edu.upc.entity.Mermelada;

public class appFruteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Fruta f1=new Fruta("Amarillo", "Dulce");
		
		Mermelada m=new Mermelada("Rojo", "Acido", 1,"Vidrio");
		
		System.out.println(f1.toString());
		f1.soyunMetodoObjeto();
		System.out.println(m.toString());
		m.soyunMetodoObjeto();
		Fruta.LugarOrigen="Tierra";
		Fruta.soyunMetodoGlobal();
	
		
		
		
		
	}

}
