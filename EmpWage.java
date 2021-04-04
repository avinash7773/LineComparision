class EmpWage{
	public static  void main(String[] argv){
		int is_Full_Time = 1;
		int wage_rate_per_hour = 20;
		int total_hours_in_day = 8;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		int EmpWage;
		if(empCheck == is_Full_Time){
			EmpWage = wage_rate_per_hour * total_hours_in_day;
			System.out.println("Employee Daily Wage="+EmpWage);
		}else
			System.out.println(" Employee is absent");
	}

}

