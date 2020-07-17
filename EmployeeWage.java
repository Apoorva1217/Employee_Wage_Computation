public class EmployeeWage
{
	public static final int PART_TIME=1;
	public static final int FULL_TIME=2;
	public static final int EMP_RATE_PER_HR=20;
	public static final int NUM_OF_WORKING_DAYS=20;
        public static final int MAX_HRS_IN_MONTH=100;

	public static int computeEmpWage()
	{
		//variables
		int empHrs=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		//computation
		while(totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS)
		{
			totalWorkingDays++;
			int empCheck=(int) Math.floor(Math.random()*10)%3;
			switch(empCheck)
			{
				case PART_TIME:
					empHrs=4;
					break;
				case(FULL_TIME):
					empHrs=8;
					break;
				default:
					empHrs=0;
			}
			totalEmpHrs+=empHrs;
			System.out.println("Day:"+totalWorkingDays+" EmployeeHours:"+empHrs);
		}
		int totalEmpWage=totalEmpHrs*EMP_RATE_PER_HR;
		System.out.println("Total Employee Wage:"+totalEmpWage);
		return totalEmpWage;
	}
	public static void main(String[] args)
	{
		computeEmpWage();
	}
}
