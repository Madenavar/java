
class SwapNumber{
public static void main(String []args){
	
int a=25;
int b=50;
int c=0;

System.out.println("value of a and b before swapping "+a+" & "+b);

c=a;
a=b;
b=c;
System.out.println("value of a and b before swapping "+a+" & "+b)	;
	
	//without third varieable
	
	int x=10;
	int y=20;
	
	x=x+y;
	
	System.out.println("value of x and y before swapping "+x+" & "+y)	;
	
	//30-20=10
	y=x-y;
	x=x-y;
	System.out.println("value of x and y before swapping "+x+" & "+y)	;
	
	
	
	
}
	
	
}