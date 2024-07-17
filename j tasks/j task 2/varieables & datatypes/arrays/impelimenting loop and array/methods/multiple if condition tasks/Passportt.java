class Passportt{
   
    static String  cpvlocationn;
	static int dcdrLocationn;
	static String givenNamee;
	static String surNamee;
	static String dobb;
	static String emaill;
	static boolean isEmailLoginSamee;
	static String loginIdd;
	static String pwdd;
	static String confirmPwdd;
	static String hintQuess;
	static String hintAnss;
	static String captchaa;
	
  public static boolean createPassport(String cpvlocation ,int dcdrLocation,String givenName,String surName,String dob,String email,
  boolean isEmailLoginSame,String loginId,String pwd,String confirmPwd,String hintQues,String hintAns,String captcha){
   
   boolean iscreatePassport=false;
   System.out.println("Creat passport Started");
   if (dcdrLocation>0 && surName!=null && cpvlocation!=null && givenName!=null&& dob!=null 
   && email!=null && isEmailLoginSame!=false && loginId!=null && pwd!=null && confirmPwd!=null && hintQues!=null && hintAns!=null && captcha!=null ){
   
   cpvlocationn=cpvlocation;
    dcdrLocationn=dcdrLocation;
	givenNamee=givenName;
	surNamee=surName;
	dobb=dob;
	emaill=email;
	isEmailLoginSamee=isEmailLoginSame;
	loginIdd=loginId;
	pwdd=pwd;
	confirmPwdd=confirmPwd;
	hintQuess=hintQues;
	hintAnss=hintAns;
	captchaa=captcha;
	
	iscreatePassport=true;
	System.out.println("the Passport Details are provided Successfulluy")
   }
   else{
	  System.out.println ("Entered the Details of passport....");
   }
  System.out.println("Creat passport Ended");
  return iscreatePassport;
  }
   public static void fetchDetails(){
	   System.out.println("The cpvlocation is : "+ cpvlocationn);
   System.out.println("The dcdrLocation is : "+ dcdrLocationn);
   System.out.println("The Name Is :" + givenNamee);
   System.out.println("The surName is : " +surNamee);
   System.out.println("The Date Of Birth is :"+dobb);
   System.out.println("The email id : "+ emaill);
   System.out.println("Is email login same : "+isEmailLoginSamee);
   System.out.println("The login id is : "+ loginIdd);
   System.out.println("the password is :"+pwdd);
   System.out.println("The confirmPwd is : "+confirmPwdd);
   System.out.println("The hidden question are :"+hintQuess);
   System.out.println("The hiddenAns are : "+ hintAnss);
   System.out.println("The captcha is :"+captchaa);
   
	   
   }
  
  
 
}