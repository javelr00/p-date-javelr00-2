package es.unileon.prg.tema6;

public class Ecuacion2Grado{
	private int a, b, c, s;
	private double x1, x2;

	//Constructor 
	public Ecuacion2Grado(int a, int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}

	//Set and get
	public int getA(){
		return a;
	}
	public void setA(){
		this.a=a;
	}

	public int getB(){
		return b;
	}
	public void setB(){
		this.b=b;
	}

	public int getC(){
		return c;
	}
	public void setC(){
		this.c=c;
	}

	//Métodos
	public int numeroDeSoluciones(){
		if(((b*b)-(4*a*c))==0){
			s=0;
		}else{
			s=2;
		}
		return s;
	}

	public double solucionX1(){
			x1=((-b+Math.sqrt((b*b)-(4*a*c)))/(2*a));
			return x1;
		}

	public double solucionX2(){
			x2=((-b-Math.sqrt((b*b)-(4*a*c)))/(2*a));
			return x2;
			}

	public String toString() {
		StringBuffer salida = new StringBuffer();

		salida.append(numeroDeSoluciones());
		salida.append(solucionX1());
		salida.append(solucionX1());

		return salida.toString();

	}

}
