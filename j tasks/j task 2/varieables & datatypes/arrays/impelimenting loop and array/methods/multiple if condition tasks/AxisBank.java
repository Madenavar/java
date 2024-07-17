class AxisBank{




public static boolean creatAccount(String fullName, String dateOfBirth,long aadharNo,String addresss,String panNumber ){
    boolean isCreatedAccount=false;
	System.out.println("The creatAccount is Started");
	if(fullName!=null && dateOfBirth!=null && long>0 && addresss!=null && panNumber!=null ){
	
	
	
	isCreatedAccount=true;
	System.out.println("The details are provided successfully");
	}else{
	System.out.println("The creatAccount is Ended");
	}
	
	
	return isCreatedAccount;
}





}