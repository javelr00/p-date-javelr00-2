package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias condicionales:
 * sentencias con la instrucciin "switch".
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030103 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Instruccion switch";
	}

	/**
	 * Instruccion switch - Ejercicio1.
	 *
	 * Modificar el metodo  para que al introducir un calificacion numerica  por teclado(1-10) se muestre
	 * la calificacion de forma textual (1-4 -> Insuficiente , 5 -> Suficiente, 6 -> Bien,
	 * 7-8 -> Notable, 9 -> Sobresaliente, 10 -> Matricula)
	 *
	 */
	public void ejercicio01() {
		cabecera("01","");

		// Inicio modificacion
		int nota = Teclado.readInteger();
		switch (nota){
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Insuficiente");
				break;
			case 5:
				System.out.println("Suficiente");
				break;
			case 6:
				System.out.println("Bien");
				break;
			case 7:
			case 8:
				System.out.println("Notable");
				break;
			case 9:
				System.out.println("Sobresaliente");
				break;
			case 10:
				System.out.println("Matricula");
				break;
			default:
				System.out.println("Nota incorrecta");
		}
    // Fin modificacion
	}

	/**
	 * Instruccion switch - Ejercicio2.
	 *
	 * Modificar el metodo  para que retorne el numero de anillos que tiene un digito entero
	 * introducido por el teclado. Se definen los anillos de un digito como el numero de circulos
	 * que tiene un digito. Ej.: 0 -> 1 anillo, 2 -> 0 anillos, 8 -> 2 anillos, etc.).
	 *
	 */
	public void ejercicio02() {
		cabecera("02", "");

		// Inicio modificacion
		int num, ult;
		num = Teclado.readInteger();
		ult= num%10;
		switch (ult){
			case 0:
			case 6:
			case 9:
				System.out.println(ult+"->1 anillo");
				break;
			case 8:
				System.out.println(ult+"->2 anillos");
				break;
			default:
				System.out.println(ult+"->0 anillos");
		}
		// Fin modificacion
	}

	/**
	 * Instruccion switch - Ejercicio3.
	 *
	 * Modificar el metodo ejercicio3() del Apartado030103, utilizando una sentencia switch,
	 * para que realice la misma funcionalidad que el metodo ejercicio4() del Apartado030102.
	 *
	 */
	public void ejercicio03() {
		cabecera("03", "");

		// Inicio modificacion
		float n1, n2, s, m;
		int elec;

		System.out.println("Introduzca un número: ");
		n1=Teclado.readFloat();
		System.out.println("Introduzca un segundo número: ");
		n2=Teclado.readFloat();
		System.out.println("Elija una opción:\n1-Sumar\n2-Multiplicar\n3-Divisores");
		elec=Teclado.readInteger();

		switch(elec){
			case 1:
				s=n1+n2;
				System.out.println("La suma de los dos números es: "+s);
				break;
			case 2:
				m=n1*n2;
				System.out.println("El producto de los dos números es: "+m);
				break;
			case 3:
				if(n1%n2==0){
					System.out.println("El segundo número es divisor del primero");
				}else if(n2%n1==0){
					System.out.println("El primer número es divisor del segundo");
				}else{
					System.out.println("Ningún número es divisor del otro");
				}
				break;
			default:
				System.out.println("Opción incorrecta");
		}
		// Fin modificacion
	}

	/**
	 * Instruccion switch - Ejercicio4.
	 *
	 * Modificar el metodo ejercicio4() del Apartado030103  para que al introducir una cadena de caracteres
	 * por teclado  se indique si el primer caracter de la cadena es una vocal escrita en minusculas,
	 * si es una vocal escrita en mayusculas o si es otro tipo de caracter.
	 *
	 */
	public void ejercicio04() {
		cabecera("04", "");

		// Inicio modificacion
		String cad;
		char a;
		int ascii;

		cad = Teclado.readString();
		a=cad.charAt(0);
		ascii= (int) a;

		switch (ascii){
			case 97:
			case 101:
			case 105:
			case 111:
			case 117:
				System.out.println("El primer caracter es una vocal minúscula");
				break;
			case 65:
			case 69:
			case 73:
			case 79:
			case 85:
				System.out.println("El primer caracter es una vocal mayúscula");
				break;
			default:
				System.out.println("Es otro tipo de carácter");
		}
		// Fin modificacion
	}
}
