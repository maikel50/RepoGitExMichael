/**
 * creacion de la clase ClaseApp
 * @author alumno
 *
 */
public class ClaseApp {
	/*
	 * creacion de la array y el constructor y getter y setters y el metodo calcularEdad
	 */
	private int [] edad;

	public ClaseApp(int[] edad) {
		this.edad = edad;
	}

	public int[] getEdad() {
		return edad;
	}

	public void setEdad(int[] edad) {
		this.edad = edad;
	}
	public int calcularEdad(int [] edad) {
		int cantidad = 0;
		for(int i=0; i<edad.length; i++) {
			if (edad.length <18){
				return	cantidad ++;
			}
			if(edad.length>18) {
				return cantidad ++;
			}
			if(edad.length >=65) {
				return cantidad ++;
			}
			}
		return cantidad;
	}
	
}
