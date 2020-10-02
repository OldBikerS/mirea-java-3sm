package practice7.task1;

public class FurnitureShop {
    //String furniture_name = "Furniture";
    static Bed bed = new Bed();
    static Sofa sofa = new Sofa();

    public FurnitureShop() {

    }

    public static Bed getBed(){
        return(bed);
    }

    public static Sofa getSofa(){
        return(sofa);
    }
}
