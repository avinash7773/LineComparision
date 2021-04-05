class LineComparision{

	void equality(){
	//Line_cartision_point;
	 	int x1=1;
         	int x2=2;
         	int y1=4;
         	int y2=1;
	//Line2_Cartision_point;
	 	int z1=2;
	 	int z2=1;
	 	int s1=1;
	 	int s2=4;
         	double Length_of_Line1=Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
	 	double Length_of_Line2=Math.sqrt((z2-z1) * (z2-z1) +(s2-s1) * (s2-s1));
		Double L1=Double.valueOf(Length_of_Line1);
		Double L2=Double.valueOf(Length_of_Line2);
         	if(L1.equals(L2)){
			System.out.println("Lines are equal");
		}
		else{
			System.out.println("Lines are not equal");
		}
	}
	public static void main(String[] argv){
		LineComparision obj = new LineComparision();
		obj.equality();
		}
}
