import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int karakter;
        Scanner in = new Scanner(System.in);
        PlayerTypes pt = new PlayerTypes();
        ItemTypes it = new ItemTypes();
        it.ItemTypes();
        Event ev = new Event();
        Player pl;

        System.out.println("Silahkan Pilih Karakter: ");
        for(int count=0;count<pt.AlPlayer.size();count++){
            System.out.println("["+ (count+1) +"] "+pt.AlPlayer.get(count).namaPlayer);
            System.out.println("    Stamina: "+pt.AlPlayer.get(count).stamina+" Kapasitas: "+pt.AlPlayer.get(count).kapasitas+" Rucksack: "+pt.AlPlayer.get(count).rucksack+" Money: "+pt.AlPlayer.get(count).money);
        }
        System.out.println("Pilih :");
        karakter = in.nextInt();

        switch (karakter) {
            case 1:
                pl = pt.AlPlayer.get(0);
                break;
            case 2:
                pl = pt.AlPlayer.get(1);
                break;
            case 3:
                pl = pt.AlPlayer.get(2);
                break;
            default:
                pl = pt.AlPlayer.get(0);
        }

        do {
            System.out.println("Player: " + pl.namaPlayer);
            System.out.println("Uang anda: " + pl.money);
            System.out.println("Stamina: " + pl.stamina);
            System.out.println("Sisa Rucksuck: " + pl.kapasitas);

            System.out.println("[1] Jalan");
            System.out.println("[2] Jual");
            System.out.println("[3] Makan");
            System.out.println("[4] Tidur");
            System.out.println("Pilih: ");
            int pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    ev.jalan(pl, it);
                    break;
                case 2:
                    ev.jual(pl);
                    break;
                case 3:
                    ev.makan(pl);
                    break;
                case 4:
                    ev.tidur(pl);
                    break;
                default:

            }
        }while(pl.stamina>0);


    }

}
