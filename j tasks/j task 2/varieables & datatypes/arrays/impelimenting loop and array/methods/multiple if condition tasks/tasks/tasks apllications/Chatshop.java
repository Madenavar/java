class Chatshop{
static String Name="Spicy Food";
static String ownerName="MankuTimma";
 static int index;
static int  priceindex;
static double chatprices[]={0.0,0.0,0.0,0.0,0.0,0.0};
           static String chatNames[]={null,null,null,null,null,null};
		   
		   public static boolean addfood(String chatName){
		   System.out.println("the food are adding Started :");
		   boolean isCreatfood=false;
		   if (chatName<chatNames.lenght){
		   if(chatName!=null){
		   chatNames[index]=chatName;
		   index++;
		   }else{
			  System.out.println("the chat are already full"); 
		   }
		   }else{
		    System.out.println("the null value is can't be loaded");
		   }
		   
		   System.out.println("the food are adding stoped");
		    
		   return isCreatfood=true;
		   
		   }
		    
			public static boolean addprice(double prices){
				System.out.println("Add prices on Chat is Started");
				boolean isPricesAdded=false;
				if(prices>0.0){
                   chatprices[priceindex]= prices;
               priceindex++;
					isPricesAdded=true;
				}else	System.out.println("The prices are can't be in Zero");
				
				System.out.println("Add prices on Chat is Ended");
				return isPricesAdded;
			}
          
		  public static void getChatNames(){
		  System.out.println("the available chats are :");
		  for(String chatName:chatNames)
		  System.out.println(chatName);
		  
		  }
		  
		  public static boolean updateChatName(String oldChatName,String newChatName){
			  System.out.println("update Chat Name started");
			      boolean isChatNameUpdated=false;
				  for (int index=0;index<chatNames.length;index++){
					  if(oldChatName==chatNames[index]){
						  chatNames[index]= newChatName;
						  isChatNameUpdated=true;
					  } 
						  
					  }
					  if(isChatNameUpdated==false){
						  System.out.println(oldChatName+"not found");
					  }
					  
				  
			  
			  System.out.println("update Chat Name started");
		  }

}