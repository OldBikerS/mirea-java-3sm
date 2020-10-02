package practice7.task1;
import java.util.ArrayList;
import java.util.List;


public class Person {
    Basket person_Basket = new Basket();
    public Person(){

    }

    public void addFurnitureToBasket(String strFurniture){
        person_Basket.addFurniture(strFurniture);
    }

    public List<Furniture> getPerson_Basket (){
        return person_Basket.get();
    }
}
