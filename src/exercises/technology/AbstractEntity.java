package exercises.technology;

import java.util.ArrayList;

public abstract class AbstractEntity {
    private double id;
    public AbstractEntity (){

    }

    public double getID(){
        id = Math.round(Math.random()*100);
        int sku = (int) id;
        ArrayList<Integer> itemIDs = new ArrayList<>();
        while(itemIDs.contains(sku)){
          id = Math.round(Math.random()*100);
          sku = (int) id;
          itemIDs.add(sku);
        }
       return sku;
    }
}
