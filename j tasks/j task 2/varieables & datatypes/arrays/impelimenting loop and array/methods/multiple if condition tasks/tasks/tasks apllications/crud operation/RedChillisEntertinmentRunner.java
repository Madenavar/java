class RedChillisEntertinmentRunner{
public static void main(String[] item){
      boolean addingActressName=RedChillisEntertinment.addName("Ashika Rangnath");
	  System.out.println("The Actress Name  are Added :"+addingActressName);
	  
	    addingActressName=RedChillisEntertinment.addName("Rashmika Mandanna");
	  System.out.println("The Actress Name  are Added :"+addingActressName);
	  
	    addingActressName=RedChillisEntertinment.addName("Nishvika Naidu");
	  System.out.println("The Actress Name  are Added :"+addingActressName);
	  
	  addingActressName=RedChillisEntertinment.addName("Sai Pallavi");
	  System.out.println("The Actress Name  are Added :"+addingActressName);
	  
	    addingActressName=RedChillisEntertinment.addName("Rakkul Preet");
	  System.out.println("The Actress Name  are Added :"+addingActressName);
	  
	    addingActressName=RedChillisEntertinment.addName("Anupam Parameshwar");
	  System.out.println("The Actress Name  are Added :"+addingActressName);
	  
	    addingActressName=RedChillisEntertinment.addName("Athiya Shetty");
	  System.out.println("The Actress Name  are Added :"+addingActressName);
	  
	   addingActressName=RedChillisEntertinment.addName("Madhu Gowda");
	  System.out.println("The Actress Name  are Added :"+addingActressName);
	  
	   addingActressName=RedChillisEntertinment.addName("Yogita");
	  System.out.println("The Actress Name  are Added :"+addingActressName);
	  
	  RedChillisEntertinment.getActressName();
	  
	boolean  rU=RedChillisEntertinment.updateActressName("Athiya Shetty","Kiccha Sudeepa");
	   System.out.println("The Actress NameAre Updated" +rU);
	  
	  RedChillisEntertinment.getActressName();
	  
	  boolean  dltName=RedChillisEntertinment.deleteActressName("Athiya Shetty");
	   System.out.println("The Actress NameAre dlted" +dltName);
	   
	    RedChillisEntertinment.getActressName();
}
}