public class EmpWageMultComp
{
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static void main(String[] args)
	{
		calculate20Wage("Deloitte",20,5,30);
		calculate20Wage("Microsoft",30,10,40);

	}
	public static void calculate20Wage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrs)
	{
		int empHrs;
		int empWage;
		int totalMaxEmpHrs=12;
		int totalEmpHours=0;
		int totalWorkingDays=0;
		System.out.println("\nFor company "+company);
		while (totalEmpHours<maxHrs && totalWorkingDays<numOfWorkingDays)
		{
			totalWorkingDays++;
			int empCheck = (int)((Math.random()*10)%3);
			switch (empCheck)
			{
				case IS_FULL_TIME :
					empHrs=8;
					break;
				case IS_PART_TIME :
					empHrs=4;
					break;
				default :
					empHrs=0;
			}

			totalEmpHours=totalEmpHours+empHrs;
			if (totalEmpHours>maxHrs)
			{
				totalEmpHours=totalEmpHours-empHrs;
				totalWorkingDays--;
				break;
			}
			else
			{
				empWage=empHrs*empRatePerHr;
				System.out.println("On day "+totalWorkingDays+" = Employee daily wage :"+empWage);
			}
		}
		int totalEmpWage=totalEmpHours*empRatePerHr;
		System.out.println("Total employee wage :"+totalEmpWage);
		System.out.println("Total emp hours :"+totalEmpHours);
		System.out.println("Total working days :"+totalWorkingDays);
	}
}
