//Como se crea una clase 
package Logica;

public class POO {
	public static void main(String[] args) {
		
		Alumno alu1 = new Alumno();
		Alumno alu2 = new Alumno(1525, "saul", "hidalgo");
		
		
		System.out.println("El id del alumno 2 es: " + alu2.getId());
		System.out.println("El nombre del alumno2 es: " + alu2.getNombre());
		System.out.println("El apellido del alumno2 es: " + alu2.getApellido());
		
		alu1.setId(1524);
		alu1.setNombre("Juan");
		alu1.setApellido("Perez");
		System.out.println("--------------------------");
		System.out.println("El id del alumno 1 es: " + alu1.getId());
		System.out.println("El nombre del alumno1 es: " + alu1.getNombre());
		System.out.println("El apellido del alumno1 es: " + alu1.getApellido());
		
	}
}
