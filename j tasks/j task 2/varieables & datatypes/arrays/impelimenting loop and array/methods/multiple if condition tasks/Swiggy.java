class Swiggy {
public static double getOrder(String foodName){
if(foodName == "TandooriRoti"){
return 40.00;
}
if (foodName=="ButterNan"){
return 45.00;
}
if (foodName=="tandooriRoast"){
return 65.00;
}
if (foodName=="kulcha"){
return 35.00;
}
if (foodName=="PaneerTikka"){
return 450.00;
}
if (foodName=="PalakSambar"){
return 60.00;
}
if (foodName=="MasalPapad"){
return 85.00;
}
if (foodName=="kajukurma"){
return 140.00;
}
if (foodName=="masal puri"){
return 90.00;
}
if (foodName=="dahipuri"){
return 65.00;
}
if (foodName=="kachori"){
return 44.00;
}
if (foodName=="Gulab jamun"){
return 15.00;
}
if (foodName=="palak pakoda"){
return 56.00;
}
if (foodName== "boti"){
return 58.00;
}
if (foodName=="sev puri"){
return 78.00;
}
else {
	System.out.println(foodName+"not found");
}
return 0.0;
}

 public static double getOrder(String foodName,int quantity){
	 if(foodName == "TandooriRoti"){
                return 40.00*quantity;
}
if (foodName=="ButterNan"){
return 45.00*quantity;
}
if (foodName=="tandooriRoast"){
return 65.00*quantity;
}
if (foodName=="kulcha"){
return 35.00*quantity;
}
if (foodName=="PaneerTikka"){
		return 450.00*quantity;
	}
	else{
		System.out.println("exceed order");

	}
if (foodName=="PalakSambar"){
return 60.00*quantity;
}
if (foodName=="MasalPapad"){
return 85.00*quantity;
}
if (foodName=="kajukurma"){
return 140.00*quantity;
}
if (foodName=="masal puri"){
return 90.00*quantity;
}
if (foodName=="dahipuri"){
return 65.00*quantity;
}
if (foodName=="kachori"){
return 44.00*quantity;
}
if (foodName=="Gulab jamun"){
return 15.00*quantity;
}
if (foodName=="palak pakoda"){
return 56.00*quantity;
}
if (foodName== "boti"){
return 58.00*quantity;
}
if (foodName=="sev puri"){
return 78.00*quantity;
}
else {
	System.out.println(foodName+"not found");
}
return 0.0;
 }
}