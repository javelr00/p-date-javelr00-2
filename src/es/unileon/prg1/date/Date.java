package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;

	// Constructor
	public Date(int day, int month, int year)throws DateException{

		this.year = year;

		if(month<1||month>12){
			throw new DateException("The month given is invalid");
		}else{
			this. month = month;
		}

		if(day>31||(month==2 && day>29)){
			throw new DateException("The day given is invalid");
		}else{
		this.day = day;
		}
	}

	//Setters and getters
	public int getYear(){
		return this.year;
	}

	public void setYear(int year){
		this.year=year;
	}

	public int getMonth(){
		return this.month;
	}

	public void setMonth(int month){
			this.month=month;
	}

	public int getDay(){
		return this.day;
	}

	public void setDay(int day){
		this.day = day;
}

	//Métodos que comparan si dos fechas son iguales,
	//tienen el mismo dia, el mismo mes o el mismo año
	boolean isSameYearIf(Date another){
		if ( this.year == another.getYear() ){
			return true;
		}
		return false;
	}

	boolean isSameMonthIf(Date another){
		if ( this.month == another.getMonth() ){
			return true;
		}
		return false;
	}

	boolean isSameDayIf(Date another){
		if ( this.day == another.getDay() ){
			return true;
		}
		return false;
	}

	boolean isSameIf(Date another){
		if ( (this.day == another.getDay())&&(this.month == another.getMonth())&&(this.year == another.getYear()) ){
			return true;
		}
		return false;
	}

	//Mismos métodos pero sin usar la sentencia if
	boolean isSameYear(Date another){
		boolean y;
		y = ( this.year == another.getYear() );
		return y;
	}

	boolean isSameMonth(Date another){
		boolean m;
		m = ( this.month == another.getMonth() );
		return m;
	}

	boolean isSameDay(Date another){
		boolean d;
		d = ( this.day == another.getDay() );
		return d;
	}

	boolean isSame(Date another){
		boolean s;
		s = ( (this.day == another.getDay())&&(this.month == another.getMonth())&&(this.year == another.getYear()) );
			return s;
	}

	//Método que imprime el nombre del mes
	public String getMonthName(){
		String month;

		switch(this.month){
						case 1:  month = "January";
                     break;
            case 2:  month = "February ";
                     break;
            case 3:  month = "March ";
                     break;
            case 4:  month = "April ";
                     break;
            case 5:  month = "May ";
                     break;
            case 6:  month = "June ";
                     break;
            case 7:  month = "July ";
                     break;
            case 8:  month = "August ";
                     break;
            case 9:  month = "September ";
                     break;
            case 10: month = "October ";
                     break;
            case 11: month = "November ";
                     break;
            case 12: month = "December ";
                     break;
            default: month = "Invalid month ";
                     break;
        }
				return month;
		}

	//Método que comprueba si el día del mes es correcto
	public boolean isDayRight(){
		boolean r;

		if(day>31||(month==2 && day>29)){
			r=false;
		}else{
			r=true;
		}
		return r;
	}

	//Método que imprime la estación a la que pertenece la fecha introducida
	public String getSeasonName(){
		String season;

		if ((this.month==3 && this.day>=20)||(this.month==4)||(this.month==5)||(this.month==6 && this.day<21)){
			season="Spring";
		}else if ((this.month==6 && this.day>=21)||(this.month==7)||(this.month==8)||(this.month==9 && this.day<23)){
			season="Summer";
		}else if ((this.month==9 && this.day>=23)||(this.month==10)||(this.month==11)||(this.month==12 && this.day<21)){
			season="Autumn";
		}else{
			season="Winter";
		}
		return season;
	}

	//Método que imprime los meses restantes hasta final de año
	public int getMonthsLeft(){
		int i;
		for(i=this.month;i==12;i++){
			i=i+1;
		}
		return i;
	}

	//Método que imprime una fecha
	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}

	//Método extra que devuelve el número de días de cada mes
	public int getDaysOfMonth(){
		int days;
		switch(this.month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 2:
				days = 28;
				break;
			default:
				days = 30;
				break;
		}
		return days;
	}

	//Método que imprime todas las fechas hasta el final del mes
	public String getDaysLeftOfMonth(){
  	StringBuffer next;
  	next= new StringBuffer();
  for(int i=this.day; i<=getDaysOfMonth();i++){
    Date n;
		try{
    	n= new Date(i,this.month,this.year);
			if(n.isDayRight()==true)
				next.append(n +"\n");
		}catch (DateException e){
		System.out.println(e.getMessage());
		}
  }
  return next.toString();
	}

	//Método que imprime los meses con los mismos días que el introducido
	public String getMonthsSameDays(){
	String months="";
		if(getDaysOfMonth()==31){
			months="January, March, May, July, August, October, December";
		}else if(getDaysOfMonth()==28){
			months="February";
		}else if(getDaysOfMonth()==30){
			months="April, June, September, November";
		}
		return months;
	}

 //Método que cuenta el número de días desde el primer día del año
	public int daysPast(){
	int days=0;
		switch(this.month){
			case 1:
				days=this.day;
				break;
			case 2:
				days=this.day+31;
				break;
			case 3:
				days=this.day+31+28;
				break;
			case 4:
				days=this.day+31+28+31;
				break;
			case 5:
				days=this.day+31+28+31+30;
				break;
			case 6:
				days=this.day+31+28+31+30+31;
				break;
			case 7:
				days=this.day+31+28+31+30+31+30;
				break;
			case 8:
				days=this.day+31+28+31+30+31+30+31;
				break;
			case 9:
				days=this.day+31+28+31+30+31+30+31+30;
				break;
			case 10:
				days=this.day+31+28+31+30+31+30+31+30+31;
				break;
			case 11:
				days=this.day+31+28+31+30+31+30+31+30+31+30;
				break;
			case 12:
				days=this.day+31+28+31+30+31+30+31+30+31+30+31;
				break;
		}
		return days;
	}

	//Método que cuenta el número de intentos para generar una fecha aleatoria igual a la fecha dada
	public int numRandomTriesEqualDate1(){
		int ranD=0, ranM=0, i=0;

		while(ranD!=this.day&&ranM!=this.month){
				ranD=(int) (Math.random()*31+1);
				ranM=(int) (Math.random()*12+1);
				i=i+1;
		}
	return i;
	}

	//Mismo método usando do-while
	public int numRandomTriesEqualDate2(){
		int ranD=0, ranM=0, i=0;

		do{
			ranD=(int) (Math.random()*31+1);
			ranM=(int) (Math.random()*12+1);
			i=i+1;
		}while(ranD!=this.day&&ranM!=this.month);
		return i;
		}

	//Método que imprime el día de la semana de una fecha, conociendo el dia de la semana del primer d
	public String dayOfWeek(){
		String week="";
		int p=0;//Cambiando p se introducirá el número correspondiente al primer día del año
		//0-Lunes 1-Martes 2-Miércoles 3-Jueves 4-Viernes 5-Sábado 6-Domingo

		if((daysPast()+p)%7==0){
			week="Sunday";
		}else if((daysPast()+1+p)%7==0){
			week="Saturday";
		}else if((daysPast()+2+p)%7==0){
			week="Friday";
		}else if((daysPast()+3+p)%7==0){
			week="Thursday";
		}else if((daysPast()+4+p)%7==0){
			week="Wednesday";
		}else if((daysPast()+5+p)%7==0){
			week="Tuesday";
		}else if((daysPast()+6+p)%7==0){
			week="Monday";
		}
		return week;
	}

}
