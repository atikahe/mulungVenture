import java.util.ArrayList;
import java.util.Random;

public class ItemTypes {
    ArrayList<Item> AlItem = new ArrayList<>();

    void ItemTypes(){
        Item a = new Item("Rock", 25,0,10);
        AlItem.add(a);
        a = new Item("bottle", 0,3,5);
        AlItem.add(a);
        a = new Item("glass", 0,4,7);
        AlItem.add(a);
        a = new Item("plastic bag", 0,1,1);
        AlItem.add(a);
        a = new Item("paper", 0,2,2);
        AlItem.add(a);
        a = new Item("gold", 0,20,10);
        AlItem.add(a);
        a = new Item("diamond", 0,50,20);
        AlItem.add(a);
    }
    Item getItemType(int index){
        ItemTypes it = new ItemTypes();
        Item a = it.AlItem.get(0);
        return a;
    }

    Integer randomIndex(){
        Random random = new Random();
        int randomValue = 1+random.nextInt(100);
        return randomValue;
    }

}
