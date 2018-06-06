import java.util.Random;
import java.util.Scanner;

public class Event extends Main {
    OwnedItem oi = new OwnedItem();
    Scanner in = new Scanner(System.in);
    Random r = new Random();
    Enemy preman;
    private int random, random1;

    Player jalan(Player vplayer, ItemTypes it) {
        vplayer.stamina -= 1;
        vplayer.distance += 1;
        Item i = null;
        String pilihan;
        random = r.nextInt(100);
        if (random >= 0 && random < 75) {
            random1 = r.nextInt(100);
            if (random1 >= 0 && random1 < 30) {
                i = it.AlItem.get(0);
                System.out.println("U found " + it.AlItem.get(0).namaItem);
            } else if (random1 >= 30 && random1 < 45) {
                i = it.AlItem.get(1);
                System.out.println("U found " + it.AlItem.get(1).namaItem);
            } else if (random1 >= 45 && random1 < 60) {
                i = it.AlItem.get(2);
                System.out.println("U found " + it.AlItem.get(2).namaItem);
            } else if (random1 >= 60 && random1 < 75) {
                i = it.AlItem.get(3);
                System.out.println("U found " + it.AlItem.get(3).namaItem);
            } else if (random1 >= 75 && random1 < 90) {
                i = it.AlItem.get(4);
                System.out.println("U found " + it.AlItem.get(4).namaItem);
            } else if (random1 >= 90 && random1 < 97) {
                i = it.AlItem.get(5);
                System.out.println("U found " + it.AlItem.get(5).namaItem);
            } else if (random1 >= 97 && random1 < 100) {
                i = it.AlItem.get(6);
                System.out.println("U found " + it.AlItem.get(6).namaItem);
            }
            System.out.println("Ambil? [y/n] ");
            pilihan = in.next();
            if (pilihan.equalsIgnoreCase("Y")) {
                oi.addItem(i);
                vplayer.kapasitas -= i.beratItem;
            }
        } else if (random >= 75 && random < 95) {
            fight(vplayer);
//            System.out.println("Ini Preman");
        } else {
            System.out.println("Ini Petugas Dinas");
        }

        return vplayer;

    }

    Player makan(Player vplayer) {
        if (vplayer.money >= 5) {
            vplayer.stamina += 15;
            vplayer.money -= 5;
        } else {
            System.out.println("Uang anda tidak mencukupi. Bekerjalah lebih giat.");
        }
        return vplayer;
    }

    Player tidur(Player vplayer) {
        vplayer.stamina = 20;
        return vplayer;
    }

    Player jual(Player vplayer) {
        int totalHarga = 0;
        for (Item harga : oi.AlOwnedItem) {
            totalHarga += harga.hargaItem;
        }
        vplayer.money += totalHarga;
        oi.emptyRuckSack(vplayer);
        vplayer.kapasitas = vplayer.rucksack;
        return vplayer;
    }

    Player  pulang(Player vplayer) {
        vplayer.stamina -= vplayer.distance;
        vplayer.distance = 0;
        return vplayer;
    }

    Player fight(Player vPlayer){
        preman = new Enemy(vPlayer.stamina + r.nextInt(10));
        
        while(vPlayer.stamina > 0 || preman.stamina > 0){
            if(vPlayer.attack==preman.attack){
                //nge-random siapa yg bakal attack
            }else{
                if(vPlayer.attack==0){
                    //pilih attack (punch | rock)
                }else{
                    //
                }
            }
        }
    }
}