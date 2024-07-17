class Mart{
static String chocolates[]={"kit kat","dairy milk","snickers","Milky bar","safari","temtation","silk"};
static String perfume[]={"fog","belovata"};
 
 public static void main(String[]newCollection){
 
 System.out.println("The Available Chocolates are : ");
 for (int index=0;index<chocolates.length;index++){
 System.out.println(chocolates[index]);
 }
 // Each For
 for (String chocolate:chocolates){
	 System.out.println(chocolate);
 }
 
 }


}