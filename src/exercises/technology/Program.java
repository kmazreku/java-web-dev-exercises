package exercises.technology;

public class Program {
    public static void main(String[] args){
        Laptop item1 = new Laptop(13, "1Tb","Lenovo", 800);
        System.out.println("***************\n"+"SKU "+item1.getID());
        System.out.println(item1.deviceSpecs());
        System.out.println(item1.screenSize() +": "+item1.getSize());

        SmartPhone item2 = new SmartPhone("SE","64GB", "Apple", 1200 );
        System.out.println("\n***************\n"+"SKU " +item2.getID());
        System.out.println(item2.deviceSpecs());
        System.out.println("Type: "+item2.setDeviceName("SE", "Apple"));
    }


}
