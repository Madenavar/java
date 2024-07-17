class SwiggyRunner{
public static void main(String []foodName){
double cost = Swiggy.getOrder("kajukurma");
System.out.println(cost);
double amount=Swiggy.getOrder("PaneerTikka",7);
System.out.println(amount);
}
}