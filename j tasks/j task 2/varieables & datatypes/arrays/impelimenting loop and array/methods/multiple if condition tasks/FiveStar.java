class FiveStar{
public static double takeOrder(String foodName){
if(foodName == "Chicken Biryani"){
return 599.00;
}
if(foodName == "Chicken Popcorn"){
return 1320.00;
}
if(foodName == "Chicken Tenders"){
return 1520.00;
}
if(foodName == "Chicken Wings"){
return 460.00;
}
if (foodName == "Chicken Dominator"){
return 750.00;
}
if (foodName == "Grilled Chicken"){
return 1660.00;
}
if (foodName == "Chicken Combo Meals"){
return 1870.00;
}
if (foodName == "Family Meals"){
return 3340.00;
}
if (foodName == "Chicken Burger"){
return 730.00;
}
if (foodName == "Chicken Golden Deligh"){
return 2220.00;
}
if (foodName == "Chicken Sandwich"){
return 920.00;
}
if(foodName == "Chicken Hot Wing"){
return 510.00;	
}
if(foodName == "Chicken Strips"){
return 1680.00;
}
if (foodName == "Chicken Nuggets"){
return 3350.00;
}
if(foodName == "Chicken Rice Bowls"){
return 1280.00;
}	
else{
System.out.println(foodName +"Not Found");
}
return 0.0;
}

}