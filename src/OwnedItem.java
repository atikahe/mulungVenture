import java.util.ArrayList;
import java.util.Random;

public class OwnedItem {
    ArrayList <Item> AlOwnedItem= new ArrayList<>();
    ItemTypes it = new ItemTypes();

    void addItem (Item vitem){
        AlOwnedItem.add(vitem);

        this.listItem();
    }

    void emptyRuckSack(Player vplayer) {
        AlOwnedItem.clear();
        vplayer.kapasitas = vplayer.rucksack;
    }

    void listItem (){
        for (Item vitem : AlOwnedItem ) {
            System.out.println(vitem.namaItem);
        }
    }
}
