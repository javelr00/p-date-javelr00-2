package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today, tomorrow;

		try{
			today = new Date(30, 4, 2018);
			System.out.println(today.toString());

			tomorrow = new Date(31, 1, 2018);
			System.out.println(tomorrow.toString());

			System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYearIf(tomorrow));
			System.out.println(today + " isSameMonth " + tomorrow + "? " + today.isSameMonthIf(tomorrow));
			System.out.println(today + " isSameDay " + tomorrow + "? " + today.isSameDayIf(tomorrow));
			System.out.println(today + " isSame " + tomorrow + "? " + today.isSameIf(tomorrow));

			System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYear(tomorrow));
			System.out.println(today + " isSameMonth " + tomorrow + "? " + today.isSameMonth(tomorrow));
			System.out.println(today + " isSameDay " + tomorrow + "? " + today.isSameDay(tomorrow));
			System.out.println(today + " isSame " + tomorrow + "? " + today.isSame(tomorrow));

			System.out.println(today.getMonthName());
			System.out.println(today.isDayRight());
			System.out.println(today.getSeasonName());

			System.out.println(today.getMonthsLeft());
			System.out.println(today.getDaysLeftOfMonth());
			System.out.println(today.getMonthsSameDays());
			System.out.println(today.daysPast());

			System.out.println(today.numRandomTriesEqualDate1());
			System.out.println(today.numRandomTriesEqualDate2());
			System.out.println(today.dayOfWeek());

		}catch (DateException e){
			System.out.println(e.getMessage());
		}
	}
}
