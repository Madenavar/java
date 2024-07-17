class AmazonRunner{
 
 public static void main(String[] login){
	 
	 boolean isAccountCreated = Amazon.creatAccount("CHANNAVEER",9654377145L,"channaveermmadi@gmail.com","Aland chockPost Ramtirtth Kalaburgi  ",2456);
	 
	 if(isAccountCreated==true){
		 Amazon.details();
	 }
	 else{
		 System.out.println("Details Not Found");
	 }
 }



}