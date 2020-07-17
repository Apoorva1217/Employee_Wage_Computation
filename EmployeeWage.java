public class EmployeeWage 
{
	public static void main(String[] args) 
	{
		int PART_TIME=1;
		int FULL_TIME=2;
		int EMP_WAGE_PER_HR=20;
		int empHrs=0;
		int empWage=0;
		double empCheck=Math.floor(Math.random()*10)%3;
		if(empCheck==FULL_TIME)
			empHrs=8;
		else if(empCheck==PART_TIME)
			empHrs=4;
		else
			empHrs=0;
		empWage=empHrs*EMP_RATE_PER_HR;
		System.out.println("Daily Employee Wage:"+empWage):
	}
}
