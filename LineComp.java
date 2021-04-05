class LineComparision{

		void length(){
			int x1=1;
         int x2=-2;
         int y1=4;
         int y2=1;
         double Length_of_Line=Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
         System.out.println(Length_of_Line);
		}
		public static void main(String[] argv){
			LineComparision obj = new LineComparision();
			obj.length();
		}
}
