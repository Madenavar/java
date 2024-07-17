class Factoriall{

public static int toGetFact(int factNum){
System.out.println("fact method started here");
int fact=1;
for(int num=1; num<=factNum; num++){

fact = num*fact;
}
System.out.println("the factorial number of" +factNum+ "is" + fact);
System.out.println("fact method eneded here");
return fact;

}
}