package exercises.technology;

public class Computer {
    private String memory;
    private String maker;
    private double price;

    public Computer (String memory, String maker, double price){
        this.memory = memory;
        this.maker = maker;
        this.price = price;
    }

    public Computer ( String maker, double price){
        this.maker = maker;
        this.price = price;
    }

    public Computer ( double price){
        this.price = price;
    }

     public String getMemory(){
        return memory;
     }

    public void setMemory(String memory){
        this.memory = memory;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice( double price){
        this.price = price;
    }

    public String getMaker(){
        return maker;
    }
    public void setMaker(String maker){
        this.maker = maker;
    }


    public String deviceSpecs() {
        return "***************\n" +"Device Specifications: \n"+
                "Memory:"+memory+"\n"+
                "Maker:" +maker;
    }

    public String operatingSystem(){
        if(maker == "Apple"){
            return "iOS";
        } else if (maker == "Lenovo" ||maker == "DELL"){
            return "Windows";
        }else if (maker == "Samsung"){
            return "Android";
        } else {
            return "Unkown Operating System";
        }
    }
}
