public class EmployeeWage
{
	public static final int PART_TIME=1;
	public static final int FULL_TIME=2;
	public static final int EMP_RATE_PER_HR=20;

	public static void main(String[] args)
	{
		//variables
		int empHrs=0;
		int empWage=0;
		//computation
		int empCheck=(int) Math.floor(Math.random()*10)%3;
		switch(empCheck)
		{
			case PART_TIME:
				empHrs=4;
			case(FULL_TIME):
				empHrs=8;
			default:
				empHrs=0;
		}
		empWage=empHrs*EMP_RATE_PER_HR;
		System.out.println("Employee Wage:"+empWage):
	}
}
