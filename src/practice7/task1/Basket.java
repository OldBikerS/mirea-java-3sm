package practice7.task1;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    static List <Furniture> basket= new ArrayList <Furniture> ();
    public Basket(){

    }

    static public void addFurniture(String strFurniture){
        if(strFurniture == "Bed"){
            basket.add(FurnitureShop.getBed());
        } else {
            basket.add(FurnitureShop.getSofa());
        }
    }

    static public List <Furniture> get(){
        return basket;
    }

}
