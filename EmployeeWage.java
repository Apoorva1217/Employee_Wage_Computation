import java.util.*;
class computeucEmployeeWage 
{
	private static final int PART_TIME = 1;
	private static final int FULL_TIME = 2;
	private static final int fullDayHour = 8;

	private static String company;
	private static int EMP_RATE_PER_HR;
	private static int MAX_HRS_IN_MONTH;
	private static int NUM_OF_WORKING_DAYS;
	private static int empWage=0;
	private static int total = 0;

	public static HashMap<Integer, Integer> companyWage = new HashMap<>();
	public static ArrayList <Integer> wagePerCompany = new ArrayList <>();
	public static HashMap<String, Integer> companyMonthlyWage = new HashMap<>();

	computeucEmployeeWage(String company, int EMP_RATE_PER_HR, int MAX_HRS_IN_MONTH, int NUM_OF_WORKING_DAYS) 
	{
		this.company=company;
		this.EMP_RATE_PER_HR = EMP_RATE_PER_HR;
		this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
		this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
	}

	public static int employeeDailyWage() 
	{
		empWage = fullDayHour * EMP_RATE_PER_HR;
		return empWage;
	}

	public static int employeeMonthlyWage() 
	{
		int empWage = 0;
		int empHrs = 0, totalEmpWage = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		int fullDayHour = 8;
		while ( totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays <= NUM_OF_WORKING_DAYS )
		{
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) 
			{
				case FULL_TIME:
					empHrs = fullDayHour;
					break;
				case PART_TIME:
					empHrs = fullDayHour / 2;
					break;
				default:
					empHrs = 0;
					break;
			}
			totalEmpHrs += empHrs;
			totalWorkingDays++;
			empWage = EMP_RATE_PER_HR * empHrs;
			totalEmpWage += empWage;
	      	}
		return totalEmpWage;
	}

	public static void dailyWageAndMonthlyWage() 
	{
		companyWage.put(employeeDailyWage(), employeeMonthlyWage());
	}

	public static void printWage() 
	{
		for (int i: companyWage.keySet())
			System.out.println(i+" : "+companyWage.get(i));
	}

	public static void companyWages() 
	{
		wagePerCompany.add(employeeMonthlyWage());
	}

	public static void printCompanyWage() 
	{
		System.out.println(wagePerCompany);
	}

	public static void putTotalWage() 
	{
		companyMonthlyWage.put(company, employeeMonthlyWage());
	}

	public static void getTotalWage(String company) 
	{
		System.out.println(company+" : "+companyMonthlyWage.get(company));
	}
}

public class EmployeeWage 
{
	public static void main(String args[])
	{
		computeucEmployeeWage company1 = new computeucEmployeeWage("DMart", 20, 110, 26);
		company1.putTotalWage();
		computeucEmployeeWage company2 = new computeucEmployeeWage("Reliance", 24, 135, 20);
		company2.putTotalWage();
		company2.getTotalWage("DMart");
	}
}
