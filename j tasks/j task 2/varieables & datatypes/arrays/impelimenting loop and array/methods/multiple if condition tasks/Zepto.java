class Zepto{
public static double takeOrder(String foodName){
if(foodName == "tanddori chicken"){
return 399.00;
}
if(foodName == "riata"){
return 130.00;
}
if(foodName == "aloo gobi"){
return 225.00;
}
if(foodName == "dal makhani"){
return 260.00;
}
if (foodName == "rasam"){
return 50.00;
}
if (foodName == "bisibelebath"){
return 60.00;
}
if (foodName == "puliyogre"){
return 70.00;
}
if (foodName == "meduvada"){
return 40.00;
}
if (foodName == "upma"){
return 130.00;
}
if (foodName == "avrebele dose"){
return 120.00;
}
if (foodName == "coconut rice"){
return 120.00;
}
if(foodName == "corn rice"){
return 110.00;	
}
if(foodName == "lemon rice"){
return 80.00;
}
if (foodName == "aloo parath"){
return 50.00;
}
if(foodName == "menthi parath"){
return 80.00;
}	
else{
System.out.println(foodName +"Not Found");
}
return 0.0;
}

}