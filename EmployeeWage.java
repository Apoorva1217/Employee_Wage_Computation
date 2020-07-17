import java.util.*;
public class EmployeeWage
{
	public static final int PART_TIME=1;
	public static final int FULL_TIME=2;

	private static String company;
	private static int fullDayHour;
	private static int EMP_RATE_PER_HR;
	private static int MAX_HRS_IN_MONTH;
	private static int NUM_OF_WORKING_DAYS;
	
	EmployeeWage(String company, int EMP_RATE_PER_HR, int fullDayHour, int MAX_HRS_IN_MONTH, int NUM_OF_WORKING_DAYS) 
	{
		this.company=company;
		this.EMP_RATE_PER_HR = EMP_RATE_PER_HR;
		this.fullDayHour = fullDayHour;
		this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
		this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
	}
	public static int MonthlyWage()
	{
		int empHrs;
		int empWage;
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		int totalEmpWage=0;
		
		while(totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS)
		{
            		int empCheck=(int) Math.floor(Math.random()*10)%3;
            		switch(empCheck)
            		{
                	    case PART_TIME:
                        	    empHrs=fullDayHour/2;
                        	    break;
                    	    case(FULL_TIME):
				    empHrs=fullDayHour;
                                    break;
                            default:
                            	    empHrs=0;
            		}
            		totalEmpHrs+=empHrs;
            		totalWorkingDays++;
        		empWage=empHrs*EMP_RATE_PER_HR;
        		totalEmpWage+=empWage;
		}
		return totalEmpWage;
	}
	public static void main(String args[])
	{
		Map<String, Integer> company=new HashMap<String, Integer>();
		EmployeeWage company1 = new EmployeeWage("DMart", 20, 9, 110, 26);
		company.put("DMart",company1.MonthlyWage());
		EmployeeWage company2 = new EmployeeWage("Reliance", 24, 8, 135, 20);
		company.put("Reliance",company2.MonthlyWage());
		EmployeeWage company3 = new EmployeeWage("Big Bazaar", 20, 9, 120, 26);
		company.put("Big Bazaar",company3.MonthlyWage());
		System.out.println("Jio : "+company.get("DMart"));
		System.out.println("Reliance : "+company.get("Reliance"));
		System.out.println("Big Bazaar : "+company.get("Big Bazaar"));

	}
}
