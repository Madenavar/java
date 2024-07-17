import java.util.*;
class RedChillisEntertinment{
   
static String actressNames[]={null,null,null,null,null,null,null,null,null};
static int index;
 
 public static boolean addName(String starName){
  System.out.println("The New Actress Name Adding Started");
      boolean isCreatingActress=false;
	  if(index<actressNames.length){
	  if(starName!=null){
	  actressNames[index]=starName;
	  index++;
	  
	  }else{
	  System.out.println("The null value can't be loaded");
	  }
	  }else{
		  System.out.println("The Names are already filled");
	  }
	  
	  System.out.println("The New actress Name Adding Started");
	  isCreatingActress=true;
	  return isCreatingActress;
  }
  public static void getActressName(){
  System.out.println("the available actress Name are :");
  for (String actressName:actressNames)
  System.out.println(actressName);
  }
public static boolean updateActressName(String oldActressName,String newActressName){
	System.out.println("The Actress Name are Updating started");
	boolean isActressNameUpdated=false;
	for (index=0;index<actressNames.length;index++){
		if(oldActressName== actressNames[index]){
			actressNames[index]= newActressName;
			isActressNameUpdated=true;
		}
	}
	if (isActressNameUpdated==false){
		System.out.println("not found"+oldActressName);
	}
	System.out.println("The Actress Name Updated");
	return isActressNameUpdated;
}
         public static boolean deleteActressName(String actressNameToBeDeleted){
			System.out.println("The Delete Actress Name Started");
			     boolean isActressNameToBeDeleted=false;
				 int newIndex,oldIndex;
				 for(newIndex=0,oldIndex=0;oldIndex<actressNames.length;oldIndex++){
					 if(actressNames[oldIndex]!=actressNameToBeDeleted){
						 actressNames[newIndex]=actressNames[oldIndex];
						 newIndex++;
					 }
				 }
				actressNames= Arrays.copyOf(actressNames,newIndex);
				 if(actressNames!=null){
					 isActressNameToBeDeleted=true;
				 }
				 if(isActressNameToBeDeleted==false){
					 System.out.println("not found"+actressNameToBeDeleted);
				 }
				 System.out.println("The Delete Actress Name Started");
				 return isActressNameToBeDeleted;

}
}