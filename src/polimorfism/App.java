package polimorfism;

public class App
{
    private static void ripening_fruit(GardenTree i) {
        i.maturation();
    }

    public static void main( String[] args ) {

        GardenTree apple = new Apple();
        GardenTree cherry = new Cherry();

        ripening_fruit(apple);
        ripening_fruit(cherry);
    }
}
