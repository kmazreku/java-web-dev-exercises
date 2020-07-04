package exercises.technology;

public class Laptop extends Computer {
    private double size;

    public Laptop (double size,  String memory, String maker, double price){
        super(memory, maker, price);
        this.size = size;
    }
public double getSize(){
        return size;
}

    public String screenSize(){
        if(size<=13){
            return "Small Screen Size Device";
        }else {
            return "Large Screen Size Device";
        }
    }
}
