class EmpWage{
	public static  void main(String[] argv){
		int is_Full_Time = 1;
		int is_Part_time = 2;
		int total_hours;
		int wage_rate_per_hour = 20;
		int empCheck = (int)Math.floor(Math.random() * 10) % 3;
		//System.out.println(empCheck);
		switch (empCheck){
			case 1:
				System.out.println("Employee is Full Time");
				total_hours = 8;
				break;

			case 2:
				System.out.println("Employee is Part Time");
				total_hours = 4;
				break;

			default:
				total_hours = 0;
				System.out.println(" Employee is absent");
				break;
		}

		int EmpWage = wage_rate_per_hour * total_hours;
		System.out.println("Employee Wage="+EmpWage);

	}

}

