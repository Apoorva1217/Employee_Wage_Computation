import java.util.*;
class computeucEmployeeWage 
{
	private static final int PART_TIME = 1;
	private static final int FULL_TIME = 2;
	
	private static String company;
	private static int EMP_RATE_PER_HR;
	private static int MAX_HRS_IN_MONTH;
	private static int NUM_OF_WORKING_DAYS;
	
	computeucEmployeeWage(String company, int EMP_RATE_PER_HR, int MAX_HRS_IN_MONTH, int NUM_OF_WORKING_DAYS) 
	{
		this.company=company;
		this.EMP_RATE_PER_HR = EMP_RATE_PER_HR;
		this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
		this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
	}

	public String getCompany() 
	{
		return this.company;
	}

	public static int MonthlyWage()
	{
		int empHrs;
		int empWage;
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		int totalEmpWage=0;
		int fullDayHour=8;
		
		while(totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS)
		{
            		int empCheck=(int) Math.floor(Math.random()*10)%3;
            		switch(empCheck)
            		{
                    		case PART_TIME:
                        		empHrs=fullDayHour/2;
                        		break;
                    		case FULL_TIME:
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
}
public class EmployeeWage 
{
	public static computeucEmployeeWage companyWage[] = new computeucEmployeeWage[3];
	public static void main(String args[])
	{
		companyWage[0] = new computeucEmployeeWage("DMart", 20, 110, 26);
		System.out.println(companyWage[0].getCompany()+" : "+companyWage[0].MonthlyWage());
		companyWage[1] = new computeucEmployeeWage("Reliance", 24, 135, 20);
		System.out.println(companyWage[1].getCompany()+" : "+companyWage[0].MonthlyWage());
		companyWage[2] = new computeucEmployeeWage("Big Bazaar", 20, 120, 26);
		System.out.println(companyWage[2].getCompany()+" : "+companyWage[0].MonthlyWage());
	}
}
