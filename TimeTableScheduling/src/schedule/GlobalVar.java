package schedule;

public class GlobalVar {
	//Working days
	public static final int DAYS = 5;
	public static final String[] DayName = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
		
	//Timings on Monday , Wednesday and Friday
	public static final int EVEN = 10;
	public static final String[] EVEN_DAY_TIMING = {"8:00-9:00","9:00-10:00","10:00-11:00","11:00-12:00","12:00-1:00",
														"1:00-2:00","2:00-3:00","3:00-4:00","4-:00-5:00","5:00-6:00"};
		
	//Timings on Tuesday and Thursday
	public static final int ODD = 6;
	public static final String[] ODD_DAY_TIMING = {"8:00-9:30","9:30-11:00","11:00-12:30",
													   "1:00-2:30","2:30-4:00","4:-00-5:30"};
	
	//Number of Lecture Hall
	public static final int NUMBER_LH = 13;
}
