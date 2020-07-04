package exercises.technology;

public class SmartPhone extends Computer{
    private String generation;
    public SmartPhone(String generation,String memory, String maker, double price ){
        super(memory, maker, price);
        this.generation = generation;
    }

    public String setDeviceName (String generation, String maker){
        if (maker =="Apple"){
            return "iPhone " + generation;
        } else if (maker == "Samsung"){
            return "Note" + generation;
        } else{
            return "Android" +generation;
        }
    }
}
