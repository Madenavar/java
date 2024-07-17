class Dominos{
public static double takeOrder(String foodName){
if(foodName == "Pepperoni Pizza"){
return 599.00;
}
if(foodName == "Margherita"){
return 320.00;
}
if(foodName == "Veggie Paradise"){
return 520.00;
}
if(foodName == "Veggie Paradise"){
return 460.00;
}
if (foodName == "Chicken Dominator"){
return 650.00;
}
if (foodName == "Extravaganzzas"){
return 660.00;
}
if (foodName == "Farmhouse"){
return 870.00;
}
if (foodName == "Peppy Paneer"){
return 340.00;
}
if (foodName == "Deluxe Veggie"){
return 130.00;
}
if (foodName == "Chicken Golden Deligh"){
return 220.00;
}
if (foodName == "Non-Veg Supreme"){
return 920.00;
}
if(foodName == "Cheese & Tomato"){
return 510.00;	
}
if(foodName == "Paneer Makhani"){
return 680.00;
}
if (foodName == "Mexican Green Wave"){
return 350.00;
}
if(foodName == "Chicken Sausage"){
return 1080.00;
}	
else{
System.out.println(foodName +"Not Found");
}
return 0.0;
}

}