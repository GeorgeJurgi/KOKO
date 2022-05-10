
package holamundo;

public class HolaMundo {
	
	public String miCadenadeTexto;
	
	/// tipos de datos 
	
	//Byte variable=-4;
	//Long variable =999L;
	float nunero = 9.6f;
	double numero2=10.55555555555555555;
	
	
	public String primermetodo() {
		return "ESTOY EN EL METODO";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Adios Mundo");
		System.out.println("Adios Mundo");
		
		HolaMundo hola= new HolaMundo(); //crear un objeto de la clase
		System.out.println(hola.primermetodo());
		
		hola.primermetodo(); // forma de llamar al metodo 
		
	}
	
	
	
	
	
	
	
	
}
