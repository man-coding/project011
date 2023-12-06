package object;

public class quiz01 {

	public static void main(String[] args) {

		Date date1 = new Date(2022,10,26);
		Date date2 = new Date(2022,10,28);
		
		if(date1.equals(date2)) {
			System.out.println("두 날짜가 같다");
		}else {
			System.out.println("두 날짜가 다르다");
		}
	}

}

class Date {
	int year;
	int month;
	int day;

	public Date(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Date) {
			Date date = (Date) obj;
			
			if(this.year == date.year && this.month == date.month && this.day == date.day) {
				return true;
			}
		}
		return false;   //참이 나오는 경우가 훨씬 적기 때문에 false 처리
	}

}

