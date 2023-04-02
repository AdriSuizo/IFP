
package practica1;

import java.util.Scanner;

	/**
 	* La clase notas permite ingresar las notas de un estudiante, realizar el
 	* cálculo de la nota definitiva y determinar si el estudiante aprobó o no la
	* materia.
    */

public class notas {

	/**
	 * Las notas que se van a ingresar.
	 */

	double uf1, uf2, uf3;

	/**
	 * El acumulado de cada una de las notas.
	 */

	double acu1, acu2, acu3, def;

	/**
	 * El objeto Scanner para recibir las entradas del usuario.
	 */

	Scanner entrada = new Scanner(System.in);

	/**
	 * Permite ingresar las notas del estudiante.
	 */

	public void IngresaNotas() {
		
	// cuando ejeuctamos este metodo lo primnero que queremos es que nos pida notas
		
		System.out.println("ingrese las notas del estudiante");

		System.out.print("ingrese nota 1: ");
		uf1 = entrada.nextDouble();

		System.out.print("ingrese nota 2: ");
		uf2 = entrada.nextDouble();

		System.out.print("ingrese nota 3: ");
		uf3 = entrada.nextDouble();

	}

	/**
	 * Comprueba que las notas se hayan ingresado correctamente.
	 */

	public void comprobarcion() {

		if (uf1 > 10) {
			System.out.println(" La nota ha sido introducida de manera incorrecta");

		} else {
			System.out.println(" nota1 correcta");
		}

		if (uf2 > 10) {
			System.out.println(" nota2 mal introducida");

		} else {
			System.out.println(" nota2 correcta");
		}
		if (uf3 > 10) {
			System.out.println(" nota3 mal introducida");

		} else {
			System.out.println(" nota3 correcta");
		}

	}

	/**
	 * Realiza el cálculo de la nota definitiva.
	 */

	public void Calculonotas() {
		acu1 = uf1 * 0.35;
		acu2 = uf2 * 0.35;
		acu3 = uf3 * 0.30;

		def = acu1 + acu2 + acu3;
		
	}

	/**
	* Muestra las notas ingresadas y la nota definitiva del estudiante.
	*/


	public void Mostrar() {
		
	// print ln lo que hace es que al terminar el print baja la linea
		
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);

		System.out.println(" acumuado 1 = " + acu1);
		System.out.println(" acumuado 2 = " + acu2);
		System.out.println(" acumuado 3 = " + acu3);

		System.out.println(" nota definitiva es = " + def);

	}

	/**
	 * Determina si el estudiante aprobó o no la materia, en función de su nota
	 * definitiva.
	 */

	public void aprobado() {

		if (def < 5 && def >= 0) {
			System.out.println("suspendio");
		} else {
			if (def >= 5 && def <= 10) {
				System.out.println("aprobado");
			} else {
				System.out.println(" error en la notas");
			}
		}
	}

	public static void main(String[] args) {

	// creamos mecanimos para llamar a cualquier metodo fuero de la clase
		notas fc = new notas();

		fc.IngresaNotas();

		fc.comprobarcion();

		fc.Calculonotas();

		fc.Mostrar();

		fc.aprobado();

	}

}
