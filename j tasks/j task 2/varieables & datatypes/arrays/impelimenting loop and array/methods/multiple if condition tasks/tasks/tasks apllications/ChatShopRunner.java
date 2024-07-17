class ChatShopRunner{
public static void main(String []newAdd){
     boolean   additem=Chatshop.addfood("Kachori");
	 System.out.println("the chat item added:"+additem);
	 additem=Chatshop.addfood("pani puri");
	 System.out.println("the chat item added:"+additem);
	  additem=Chatshop.addfood("bhel puri");
	 System.out.println("the chat item added:"+additem);
      additem=Chatshop.addfood("masal puri");
	 System.out.println("the chat item added:"+additem);
	  additem=Chatshop.addfood("dahi puri");
	 System.out.println("the chat item added:"+additem);
	  additem=Chatshop.addfood("sev puri");
	 System.out.println("the chat item added:"+additem);

  Chatshop.getChatNames();
  additem=Chatshop.addprice(3000.00);
System.out.println("The Pricess added to the list of chats"+additem);

   boolean cU=Chatshop.updateChatName();
   System.out.println("the chat names are updated :" + cU);
}

 

}