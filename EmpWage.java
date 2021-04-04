class EmpWage{
	public static  void main(String[] argv){
		int is_Full_Time = 1;
		int is_Part_time = 2;
		int total_hours=0;
		int hours;
		int wage_rate_per_hour = 20;
		int EmpWageForMonth=0;
		int days=1;
		while(total_hours<=100 && days<=20){
		int empCheck = (int)Math.floor(Math.random() * 10) % 3;
			switch (empCheck){
				case 1:
					hours = 8;
					break;

				case 2:
					hours = 4;
					break;

				default:
					hours = 0;
					break;
			}
			total_hours = hours + total_hours;
			days++;
		}
			int EmpWage = wage_rate_per_hour * total_hours;
			System.out.println("Employee Wage for Month ="+EmpWage);

	}

}

