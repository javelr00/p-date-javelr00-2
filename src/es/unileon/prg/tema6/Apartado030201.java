package es.unileon.prg.tema6;
/**
 * Clase con los ejercicios correspondientes a sentencias de repeticion:
 * sentencias con la instruccion "for".
 *
 * @author PRG
 * @version 1.0
 */
public class Apartado030201 extends Apartado {

	protected String obtenerPractica(){
		return "P-CTL";
	}

	protected String obtenerBloque() {
		return "Instruccion for";
	}

	/**
	 * Instruccion for - Ejercicio1.
	 *
	 * Programar el codigo que muestre la suma de los numeros comprendidos del 1 al 100
	 *
	 */
	public void ejercicio01() {
		cabecera("01","");

		// Inicio modificacion
		int cien = 0;

		for (int i=0;i<=100;i++) {
			cien = cien +i;
		}

		System.out.println(cien);
        // Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio2.
	 *
	 * Programar el codigo  que calcule la media de los numeros impares menores que 1000.
	 *
	 */
	public void ejercicio02() {
		cabecera("02", "");

		// Inicio modificacion
		int imp = 0, i;
		float media;
		for (i=0;i<=1000;i++) {
			if ((i%2)!=0)
				imp = imp +i;
		}
		media=imp/i;
		System.out.println(media);
		// Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio3.
	 *
	 * Programar el codigo que calcule la suma de todos los numeros comprendidos entre
	 * dos numeros n1 y n2 que introduzca el usuario.
	 *
	 */
	public void ejercicio03() {
		cabecera("03", "");

		// Inicio modificacion
		int n1, n2;
		int suma=0;

	  n1 = Teclado.readInteger();
		n2 = Teclado.readInteger();

		for (int i=n1;i<=n2;i++) {
			suma = suma +i;
		}

		System.out.println(suma);
		// Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio4.
	 *
	 * Programar el codigo  para que se lean 10 numeros enteros  del teclado y  se indique cuantas
	 * veces aparece el 3, cuantas el 5 y cuantas el 7.
	 *
	 */
	public void ejercicio04() {
		cabecera("04", "");

		// Inicio modificacion
		int n, t=0, c=0, s=0;

		for (int i=0;i<10;i++) {
			System.out.println("Introduce un número: ");
			n=Teclado.readInteger();
			if(n==3){
				t=t+1;
			}else if(n==5){
				c=c+1;
			}else if(n==7){
				s=s+1;
			}
		}
		System.out.println("Número de 5 introducidos: "+c+" Número de 3 introducidos: "+t+" Número de 7 introducidos: "+s);
		// Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio5.
	 *
	 * Programar el codigo que lea 10 numeros enteros por teclado y diga cual es el mayor y
	 * el menor de todos ellos.
	 *
	 */
	public void ejercicio05() {
		cabecera("05","");

		// Inicio modificacion
		int n, a=0, numMayor=0, numMenor=0;
		int[] num = new int[10];
		for (int i=0;i<10;i++){
			System.out.println("Introduce un número: ");
			n=Teclado.readInteger();
			num [i] = n;
		}

		for (int j=0;j<num.length;j++){
			if(num[j]>numMayor)
				numMayor=num[j];
		}
		System.out.println("El mayor número es "+numMayor);

		for (int k=0;k<num.length;k++){
			if(num[k]<numMenor)
				numMenor=num[k];
		}
		System.out.println("El menor número es "+numMenor);
    // Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio6.
	 *
	 * Programar el codigo  que sume los numeros pares por un lado y los impares por otro  entre dos numeros enteros
	 * introducidos por el usuario. Suponer que el primer numero es siempre par.
	 * <ul>
	 * <li>Nota 1: Solo se debe utilizar un unico  bucle for.
	 * </ul>
	 *
	 * [Falta enunciado]
	 */
	public void ejercicio06() {
		cabecera("06", "");

		// Inicio modificacion
		int a, pares=0, impares=0;

		for (int i=0;i<2;i++) {
			System.out.println("Introduzca un número: ");
			a= Teclado.readInteger();
			if(a%2==0){
				pares=pares+a;
			}else{
				impares=impares+a;
			}
		}
		System.out.println("Suma de los números pares="+pares);
		System.out.println("Suma de los números impares="+impares);
		// Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio7.
	 *
	 * Consultar las clases String, StringBuffer y Character del API de java y escribir un codigo
	 * que pida una cadena en minusculas y obtenga dos a partir de ella, una solo con vocales y
	 * la otra el resto de caracteres. Posteriormente deberan convertir todos los caracteres de las
	 * dos cadenas de minusculas a mayusculas.
	 *
	 */
	public void ejercicio07() {
		cabecera("07", "");

		// Inicio modificacion
		String cad;
		StringBuffer voc = new StringBuffer();
		StringBuffer dem = new StringBuffer();
		char a, v, d;
		int ascii;

		System.out.println("Introduce una cadena de minúsculas:");
		cad = Teclado.readString();
		cad.toLowerCase();

		for(int i=0;i<cad.length();i++){
			a=cad.charAt(i);
			ascii= (int) a;
			if((ascii==97)||(ascii==101)||(ascii==105)||(ascii==111)||(ascii==117)){
				voc.append(cad.charAt(i));
			}else{
				dem.append(cad.charAt(i));
			}
		}
		System.out.println(voc);
		System.out.println(dem);

		String svoc=voc.toString();
		String sdem=dem.toString();

		System.out.println(svoc.toUpperCase());
		System.out.println(sdem.toUpperCase());
		// Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio8.
	 *
	 * Programar el codigo que  muestre la cadena con mayor numero de caracteres de un conjunto de
	 * cadenas introducidas por el usuario (Si hay dos cadenas de igual tamanio se mostrara la primera
	 * que se ha introducido). Previamente se le pedira al usuario el numero de cadenas que
	 * desea introducir
	 *
	 * <pre>Ejemplo de ejecucion
	 *  Introduce el numero de cadenas a leer: 4
	 *
	 *  Cadena 1: hola que tal
	 *  Cadena 2: ayer fui
	 *  Cadena 3: en un lugar de la mancha
	 *  Cadena 4: la casa esta vacia
	 *
	 *  Cadena mas larga: en un lugar de la mancha
	 *  </pre>
	 *
	 */
	public void ejercicio08() {
		cabecera("08", "");

		// Inicio modificacion
		/*int ncad;

		System.out.println("Introduce el número de cadenas a leer");
		ncad=Teclado.readInteger();
		for (int i=0;i<=ncad;i++){
			System.out.println("Cadena "+i);
			String cadenai=Teclado.readString();
			if()
		}

		//int n, a=0, numMayor=0;*/
		int ncad;
		String n;
		String cadl="";

		System.out.println("Introduce el número de cadenas a leer");
		ncad=Teclado.readInteger();
		String[] cad = new String[ncad];
		for (int i=0;i<ncad;i++){
			System.out.println("Cadena "+(i+1));
			cad [i]=Teclado.readString();
		}
		for (int j=0;j<ncad ;j++) {
			if(cad[1].length()>cad[j+1].length()){
				cadl=cad[j];
			}
		}
		System.out.println(cadl);
		// Fin modificacion
	}

	/**
	 * Instruccion for - Ejercicio9.
	 *
	 * Se pide
	 * <ul>
	 * <li>Quitar los comentarios indicados y compilar  el metodo ejercicio03() de la clase Apartado030102.
	 * <li>Modificar la clase Rectangulo
	 * <ul>
	 * <li>	Implementar el metodo: int compareTo(Rectangulo rectangulo) para que
	 * <ul>
	 * <li>	retorne -1 si el area del Rectangulo sobre el que se ejecuta el metodo  es menor que
	 * 		el area del Rectangulo que se recibe como parametro del metodo.
	 * <li> retorne 0 si el area de los dos rectangulos es igual.
	 * <li> retorne 1 si el area del Rectangulo sobre el que se ejecuta el metodo  es mayor que
	 * 		el area del Rectangulo que se recibe como parametro del metodo.
	 * </ul>
	 * </ul>
	 * <li>Modificar el metodo ejercicio09() de la clase Apartado030201 para que al ejecutarlo se muestre la
	 *     informacion del rectangulo con mayor area.
	 * </ul>
	 *
	 */
	public void ejercicio09() {
		cabecera("09", "");

		// Inicio modificacion

		// Quitar comentarios
	   int n=4, base, altura; //Numero de rectangulos a leer
		 Rectangulo rectanguloMaximo,rectangulo;

		for (int i=0;i<=n;i++)
		{
			System.out.println("Introduce la base del rectangulo "+i+" :");
			base=Teclado.readInteger();
			System.out.println("Introduce la altura del rectangulo "+i+" :");
			altura=Teclado.readInteger();
			rectangulo=new Rectangulo(base,altura);
			System.out.println(Rectangulo.compareTo(rectangulo));
		}
		//System.out.println("El rectangulo con mayor area es "+ rectangulo);

		// Fin modificacion
	}



	/**
	 * Instruccion for - Ejercicio10.
	 *
	 * Modificar los metodos de la clase TablaConversion para que al ejecutar el metodo ejercicio010()
	 * de la clase Apartado030201 se muestre una tabla de conversion con el siguiente formato.
	 *
	 * Ejemplo
	 *
	 * <pre>C	F	C	F	C	F	C	F	C	F
	 * 0	32	1	33	2	35	3	37	4	39
	 * 5	41	6	42	7	44	8	46	9	48
	 * 10	50	11	51	12	53	13	55	14	57
	 * 15	59	16	60	17	62	18	64	19	66
	 * 20	68	21	69	22	71	23	73	24	75
	 * 25	77	26	78	27	80	28	82	29	84
	 * 30	86	31	87	32	89	33	91	34	93
	 * 35	95	36	96	37	98	38	100	39	102
	 * 40	104	41	105	42	107	43	109	44	111
	 * 45	113	46	114	47	116	48	118	49	120</pre>
	 */
	public void ejercicio10() {
		cabecera("10", "");

		TablaConversion tabla=new TablaConversion(5,10);
		tabla.imprimir();
	}
}
