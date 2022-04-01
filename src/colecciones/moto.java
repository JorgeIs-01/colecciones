package colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;


public class moto {

	private  String matricula;
	private  int anoMatriculacion;
	private  String ciudadMatriculacion;
	private  String color;
	private static  boolean verdadero;
	
	
	public moto(String matricula, int anoMatriculacion,String ciudadMatriculacion,String color){
      this.matricula=matricula;
      this.anoMatriculacion=anoMatriculacion;
      this.ciudadMatriculacion=ciudadMatriculacion;
      this.color=color;
    }
	
	public static void main(String[] args) {
		ArrayList<moto> moto1 = new ArrayList<moto>();
		
		moto moto2 = new moto("4837HRA",15,"Valencia","Azul");
		
		for (int i = 0; i < 1000; ++i) {
	    	moto1.add(moto2);
	      
	    }
		
		
		
		List<moto> linkedList = new LinkedList<moto>();
		 
		for (int i = 0; i < moto1.size(); ++i) {
			linkedList.add(moto1.get(i));
			
	      
	    }
		System.out.println("Listar LinkedList: "+linkedList);
		long t1= System.currentTimeMillis();
		moto1.add(moto2);
		System.out.println("Tiempo array: "+t1);
		t1= System.currentTimeMillis();
		linkedList.add(moto1.get(0));
		System.out.println("Tiempo linkedlist: "+t1);  
		
		TreeMap<String,moto> motos = new TreeMap<String,moto>();
		
		
		motos.put("4837HRA", new moto("4837HRA",15,"Barcelona","Azul"));
		motos.put("8337LRA", new moto("8337LRA",15,"Tarragona","Azul"));
		motos.put("3837PRA", new moto("3837PRA",15,"Girona","Azul"));
		motos.put("7837HRA", new moto("7837HRA",15,"Lleida","Azul"));
		motos.put("4837RQA", new moto("4837RQA",15,"Girona","Azul"));
		motos.put("6837BBA", new moto("6837BBA",15,"Barcelona","Azul"));
		motos.put("5237CRA", new moto("5237CRA",15,"Girona","Azul"));
		
		System.out.println("Los datos del treemap: "+motos.values());
	   
    }
	
	
	
	
	
	

	@Override
	public String toString() {
		return "moto [matricula=" + matricula + ", añoMatriculacion=" + anoMatriculacion + ", ciudadMatriculacion="
				+ ciudadMatriculacion + ", color=" + color + ", verdadero=" + verdadero + "]";
	}

	static boolean esMotoMayorAzul(TreeMap<String, moto> motos){
		
		if (motos.containsValue("Azul")) {
			System.out.println("Moto Azul");
				verdadero=true;
			
		}
		return verdadero;
		
	}
	static boolean esMotoJovenRojo(TreeMap<String, moto> motos){
		
		if (motos.containsValue("Rojo")) {
			
				verdadero=true;
			
		}
		return verdadero;
		
	}
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getAñoMatriculacion() {
		return anoMatriculacion;
	}

	public void setAñoMatriculacion(int añoMatriculacion) {
		this.anoMatriculacion = añoMatriculacion;
	}
	
	public String getCiudadMatriculacion() {
		return ciudadMatriculacion;
	}

	public void setCiudadMatriculacion(String ciudadMatriculacion) {
		this.ciudadMatriculacion = ciudadMatriculacion;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	
}
