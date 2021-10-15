package ejercicios.complementarios.level2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import ejercicios.modelo.Empleado;

/*Se dispone de una colección de Empleados, de cada empleado se conoce:
Nombre y Apellido
DNI
horasTrabajadas
valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo (horasTrabajadas x valorPorHora)
de toda esa lista para luego almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor (value)
es el sueldo calculado.*/ 

public class Ejercicio6 {

	public static void main(String[] args) {
		
		HashSet<Empleado> empleados = new HashSet<Empleado>();
		Map<Integer, Float> sueldos = new HashMap<>();
		
		
		empleados = cargaDeEmpleado();
		
		imprimir(empleados);
		
		for (Empleado empleado : empleados) {
			sueldos.put(empleado.getDni(), empleado.calcularSueldo());
		}
		
		imprimirSueldos(sueldos);
		
				
	}

	private static void imprimirSueldos(Map<Integer, Float> sueldos) {
		System.out.println("*******************************************************");
		sueldos.forEach((k,v) -> System.out.println("DNI: " + k + " ==> Sueldo: " + v));
		System.out.println("*******************************************************");
	}

	private static void imprimir(HashSet<Empleado> empleados) {
		for (Empleado empleado : empleados) {
			empleado.imprimir();
		}
	}

	private static HashSet<Empleado> cargaDeEmpleado() {
		HashSet<Empleado> empleados = new HashSet<Empleado>();
		Empleado empleado1 = new Empleado();
		empleado1.setDni(4528963);
		empleado1.setNombre("Juan");
		empleado1.setApellido("Servin");
		empleado1.setHorasTrabajadas(96);
		empleado1.setValorPorHora(23.5F);
		
		Empleado empleado2 = new Empleado();
		empleado2.setDni(2412589);
		empleado2.setNombre("Pedro");
		empleado2.setApellido("Bobadilla");
		empleado2.setHorasTrabajadas(106);
		empleado2.setValorPorHora(50F);
		

		empleados.add(empleado1);
		empleados.add(empleado2);
		
		return empleados;
	}

}
