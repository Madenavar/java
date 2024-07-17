class BlinkIt{
public static double takeOrder(String foodName){
if(foodName == "onion"){
return 99.00;
}
if(foodName == "patato"){
return 120.00;
}
if(foodName == "garlic"){
return 220.00;
}
if(foodName == "ginger"){
return 60.00;
}
if (foodName == "green chillies"){
return 50.00;
}
if (foodName == "bell peppers"){
return 60.00;
}
if (foodName == "Eggplant"){
return 70.00;
}
if (foodName == "spinch"){
return 40.00;
}
if (foodName == "curry leavs"){
return 30.00;
}
if (foodName == "lemon"){
return 20.00;
}
if (foodName == "cucumber"){
return 20.00;
}
if(foodName == "carrots"){
return 110.00;	
}
if(foodName == "cauliflower"){
return 80.00;
}
if (foodName == "green beans"){
return 50.00;
}
if(foodName == "peas"){
return 80.00;
}	
else{
System.out.println(foodName +"Not Found");
}
return 0.0;
}

}