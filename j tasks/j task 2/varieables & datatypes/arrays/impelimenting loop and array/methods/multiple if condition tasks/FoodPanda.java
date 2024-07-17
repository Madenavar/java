class FoodPanda{
public static double takeOrder(String foodName){
if(foodName == "kari leaf rice"){
return  499.00;
}
if(foodName == "tamirinder rice"){
return 320.00;
}
if(foodName == "vangi bath"){
return 220.00;
}
if(foodName == "pongal"){
return 160.00;
}
if (foodName == "appam"){
return 158.00;
}
if (foodName == "puttu"){
return 160.00;
}
if (foodName == "rava dosa"){
return 170.00;
}
if (foodName == "ragi dosa"){
return 240.00;
}
if (foodName == "adai"){
return 430.00;
}
if (foodName == "dahi rice"){
return 20.00;
}
if (foodName == "aviyal"){
return 320.00;
}
if(foodName == "poriyal"){
return 110.00;	
}
if(foodName == "kootu"){
return 80.00;
}
if (foodName == "varuval"){
return 150.00;
}
if(foodName == "avarekayi palya"){
return 80.00;
}	
else{
System.out.println(foodName +"Not Found");
}
return 0.0;
}

}