class GiriasRunner{
public static void main (String[]addNew){
boolean addingHomeApliences=Girias.addNew("Refrigerator");
System.out.println("The HomeApliences are :"+addingHomeApliences);

addingHomeApliences=Girias.addNew("Oven");
System.out.println("The HomeApliences are :"+addingHomeApliences);

addingHomeApliences=Girias.addNew("Microwave");
System.out.println("The HomeApliences are :"+addingHomeApliences);

addingHomeApliences=Girias.addNew("Dishwasher");
System.out.println("The HomeApliences are :"+addingHomeApliences);

addingHomeApliences=Girias.addNew("roaster");
System.out.println("The HomeApliences are :"+addingHomeApliences);

addingHomeApliences=Girias.addNew("Blender");
System.out.println("The HomeApliences are :"+addingHomeApliences);

addingHomeApliences=Girias.addNew("Coffee Maker");
System.out.println("The HomeApliences are :"+addingHomeApliences);

addingHomeApliences=Girias.addNew("Washing Machine");
System.out.println("The HomeApliences are :"+addingHomeApliences);

addingHomeApliences=Girias.addNew("Dryer");
System.out.println("The HomeApliences are :"+addingHomeApliences);

addingHomeApliences=Girias.addNew("Vacuum Cleaner");
System.out.println("The HomeApliences are :"+addingHomeApliences);

addingHomeApliences=Girias.addNew("Mop");
System.out.println("The HomeApliences are :"+addingHomeApliences);

addingHomeApliences=Girias.addNew("Air Conditioner");
System.out.println("The HomeApliences are :"+addingHomeApliences);

addingHomeApliences=Girias.addNew("Heater");
System.out.println("The HomeApliences are :"+addingHomeApliences);

Girias.gethomeApliances();
 boolean hU=Girias.updateHomeApliances("Mop","Sofa");
 System.out.println("The HomeApliences Are updated");
Girias.gethomeApliances();

boolean dltHomeAplaince=Girias.deleteHomeAplaincens("Air Conditioner");
 System.out.println("The HomeApliences Are deleted");
 
 Girias.gethomeApliances();
    
}

}