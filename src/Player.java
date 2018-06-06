import java.util.ArrayList;

public class Player {
    String namaPlayer="";
    int money;
    int rucksack;
    int kapasitas;
    int stamina;
    int distance;
    int attack;
    Player(String namaPlayer, int money, int rucksack, int stamina, int distance) {
        this.namaPlayer = namaPlayer;
        this.money = money;
        this.rucksack = rucksack;
        this.kapasitas = rucksack;
        this.stamina = stamina;
        this.distance = distance;
        this.attack = 1;
    }
}
