import java.util.ArrayList;

public class PlayerTypes {
    ArrayList<Player> AlPlayer = new ArrayList<>();

    PlayerTypes(){
        Player a = new Player("Thanos", 0,50,20,0);
        AlPlayer.add(a);
        a = new Player("Loki", 0,30,40,0);
        AlPlayer.add(a);
        a = new Player("Venom", 0,40,30,0);
        AlPlayer.add(a);
    }

}
