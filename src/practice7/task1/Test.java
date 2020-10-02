package practice7.task1;
import java.util.List;

public class Test{
    public static void main ( String[] args ) {
        Person person = new Person();
        person.addFurnitureToBasket("Sofa");
        person.addFurnitureToBasket("Bed");
        person.addFurnitureToBasket("Sofa");
        person.addFurnitureToBasket("Sofa");
        person.addFurnitureToBasket("Bed");
        //List<Furniture> basket= new ArrayList<Furniture>();
        List<Furniture> basket = person.getPerson_Basket ();
        System.out.println("The Person's Basket of Furniture Objects:");
        System.out.println(basket);
    }
}
