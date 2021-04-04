class EmpWage{
	public static  void main(String[] argv){
		int is_Full_Time = 1;
		int is_Part_time = 2;
		int total_hours;
		int wage_rate_per_hour = 20;
		int EmpWageForMonth=0;
		for(int i=1;i<=30;i++){
			int empCheck = (int)Math.floor(Math.random() * 10) % 3;
			switch (empCheck){
				case 1:
					total_hours = 8;
					break;

				case 2:
					total_hours = 4;
					break;

			default:
				total_hours = 0;
				break;
			}
			int EmpWage = wage_rate_per_hour * total_hours;
			EmpWageForMonth = EmpWage + EmpWageForMonth;
		}

		System.out.println("Employee Wage for Month ="+EmpWageForMonth);

	}

}

