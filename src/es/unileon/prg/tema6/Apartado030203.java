package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias de repeticion:
 * sentencias con la instruccion "do-while".
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030203 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Instruccion do-while";
	}

	/**
	 * Instruccion do-while - Ejercicio1.
	 *
	 * Programar el codigo que ofrezca un menu de opciones al usuario  hasta que seleccione la opcion salir.
	 *
	 */
	public void ejercicio01() {
		cabecera("01","");

		// Inicio modificacion
		int e;

		do {
			System.out.println("1-Opción1");
		  System.out.println("2-Opción2");
			System.out.println("3-Opción3");
			System.out.println("4-Salir");
			e=Teclado.readInteger();
		} while (e!=4);
			System.out.println("Adiós");
			return;
        // Fin modificacion
	}

	/**
	 * Instruccion do-while - Ejercicio2.
	 *
	 * Programar el  codigo que lea numeros enteros hasta que el usuario introduzca un valor igual a cero
	 * o hasta que el usuario introduzca dos veces seguidas el mismo numero.
	 *
	 * Similar al  ejercicio02() de la clase Apartado030202 pero empleando la sentencia do-while).
	 *
	 */
	public void ejercicio02() {
		cabecera("02", "");

		// Inicio modificacion
		int e;

		do {
			e=Teclado.readInteger();
		} while (e!=0);

		// Fin modificacion
	}

	/**
	 * Instruccion do-while - Ejercicio3.
	 *
	 * Programar el codigo que lea la base y la altura de un numero indeterminado de rectangulos y
	 * cree los correspondientes objetos de tipo Rectangulo. Para cada rectangulo el programa mostrara
	 * por pantalla su area y si es un cuadrado o un rectangulo. El programa terminara cuando alguno
	 * de los lados del cuadrilatero sea menor o igual que  0.
	 *
	 */
	public void ejercicio03() {
		cabecera("03", "");

		// Inicio modificacion
		// Fin modificacion
	}

	/**
	 * Instruccion do-while - Ejercicio4.
	 *
	 * Programar el codigo que dado un numero entero introducido por teclado indique si es o no perfecto.
	 * Un numero entero es perfecto si es igual a la suma de los sus divisores positivos menores que el.
	 * Ejemplos
	 * <ul>
	 * <li>6 es perfecto porque
	 * <ul>
	 * <li>	Sus divisores menores que el  son 1, 2, 3  y
	 * <li> 1 + 2 + 3 = 6;
	 * </ul>
	 * <li> 8 no es perfecto porque
	 * <ul>
	 * <li>	Sus divisores menores que el son 1, 2,4  y
	 * <li> 1+2+4  !=  8
	 * </ul>
	 * </ul>
	 *
	 */
	public void ejercicio04() {
		cabecera("04", "");

		// Inicio modificacion
		int n, d=0;
		n=Teclado.readInteger();
		for(int i=0;i<n;i++){
			if(n%i==0){
				d=d+i;
			}
		}
		if(d==n){
			System.out.println("Es perfecto");
		}
		// Fin modificacion
	}
}
