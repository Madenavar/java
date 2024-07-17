import java.util.*;
class Girias{
 
 static String homeApliances[]={null,null,null,null,null,null,null,null,null,null,null,null,null};
static int index;
public static boolean addNew (String items){
  System.out.println("The homeApliances  Started");
          boolean isAddingHomeApliances=false;
		  if(homeApliances!=null){
		  homeApliances[index]=items;
		  index++;
		  } else{
		  System.out.println("The homeApliances Are ended");
		  }
		  System.out.println("The null values are cannot be load");
		  return isAddingHomeApliances=true;
}
 
  public static void gethomeApliances(){
  System.out.println("The available homeApliances are :");
  for(String homeApliance:homeApliances )
  System.out.println(homeApliance);
  
  
  }
  public static boolean updateHomeApliances(String oldHomeApliances,String newHomeApliances){
	  System.out.println("The Home Apliances Updated");
	  boolean isHomeApliacensUpdated=false;
	  for (int index=0;index<homeApliances.length;index++){
		  if(oldHomeApliances == homeApliances[index]){
			  homeApliances[index]=newHomeApliances;
			  isHomeApliacensUpdated=true;
		  }
	  }
	  if(isHomeApliacensUpdated=false){
		  System.out.println("not found"+oldHomeApliances);
	  }
	  System.out.println("The Home Apliances ended ");
	 return isHomeApliacensUpdated ;
    }
	public static boolean deleteHomeAplaincens(String homeAplianceToBeDeleted){
	  System.out.println("The deletedHomeAplainces are started");
	  boolean isDeletedHomeAplaince=false;
	  int newIndex,oldIndex;
	  for(newIndex=0,oldIndex=0;oldIndex<homeApliances.length;oldIndex++){
		  if(homeApliances[oldIndex]!=homeAplianceToBeDeleted){
			  homeApliances[newIndex]=homeApliances[oldIndex];
			  newIndex++;
		  }
	  }
	  homeApliances= Arrays.copyOf(homeApliances,newIndex);
	  if(homeApliances!=null){
		  isDeletedHomeAplaince=true;
	  }
  if(isDeletedHomeAplaince==false){
	  System.out.println("not found"+homeAplianceToBeDeleted);
  }
  System.out.println("The deletedHomeAplainces are started");
  return isDeletedHomeAplaince;
  }
}