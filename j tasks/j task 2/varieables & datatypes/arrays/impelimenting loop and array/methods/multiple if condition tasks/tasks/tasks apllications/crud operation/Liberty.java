import java.util.*;
class Liberty{

       static String brandNames[] ={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,};
        static int index ;
		
          public static boolean addShoeBrands(String names){
		  System.out.println("The Shoe Name Started");
		  boolean isShoeNameAdded = false;
		  if(index < brandNames.length){
		    if(names!=null){
			        brandNames[index] =names;
					   index++;
					isShoeNameAdded= true;
					   
			}else{
			   System.out.println("The Brand Name Should Not Be null");
			}
		  }else{
			    System.out.println("The Brand Place Is Already filled");
			}
		
		  System.out.println("The Shoe Name Ended");
		    return isShoeNameAdded;
		  
		  }
		  
		   public static void getAllShoeBrands(){
			   System.out.println("The Available Brands Are");
			   for(String brandName : brandNames)
				   System.out.println(brandName);
			   
		   }
		   
		   public static boolean updateShoeBrand(String oldBrand , String newBrand){
			   
			   System.out.println("Update Started");
			   boolean isShoeBrandUpdated = false;
			   for(int index = 0 ; index< brandNames.length ; index++){
				   if(oldBrand == brandNames[index]){
					       brandNames[index]= newBrand;
						   isShoeBrandUpdated = true;
				   }
			   }	   
				   if(isShoeBrandUpdated == false){
					   System.out.println(oldBrand + "Not Found");
			   }
			  
			   System.out.println("Update Ended");
			   
			   return isShoeBrandUpdated;
			   
		   }
		   
		    public static boolean deleteItemNames(String itemNameToBeDeleted){
		   			System.out.println("The Delete Item Name Started");
		   			     boolean isItemNameToBeDeleted=false;
         				 int newIndex,oldIndex;
           				 for(newIndex=0,oldIndex=0;oldIndex<goldItems.length;oldIndex++){
           					 if(goldItems[oldIndex]!=itemNameToBeDeleted){
           						 goldItems[newIndex]=goldItems[oldIndex];
           						 newIndex++;
           					 }
           				 }
           				goldItems= Arrays.copyOf(goldItems,newIndex);
           				 if(goldItems!=null){
           					 isItemNameToBeDeleted=true;
           				 }
           				 if(isItemNameToBeDeleted==false){
           					 System.out.println("not found"+itemNameToBeDeleted);
           				 }
           				 System.out.println("The Delete Item Name Started");
           				 return isItemNameToBeDeleted;
           
           }
		   public static boolean deleteBrands(String brandsToBeDeleted){
			System.out.println("The Delete  Brands Started");
			     boolean isBrandsToBeDeleted=false;
				 int newIndex,oldIndex;
				 for(newIndex=0,oldIndex=0;oldIndex<brandNames.length;oldIndex++){
					 if(brandNames[oldIndex]!=brandsToBeDeleted){
						 brandNames[newIndex]=brandNames[oldIndex];
						 newIndexindex++;
					 }
				 }
				 brandNames= Arrays.copyOf(brandNames,newIndex);
				 if(brandNames!=null){
					 isBrandsToBeDeleted=true;
				 }
				 if(isBrandsToBeDeleted==false){
					 System.out.println("not found"+brandsToBeDeleted);
				 }
				 System.out.println("The Delete Wine Brands Started");
				 return isWineBrandsToBeDeleted;
		}
		   
}