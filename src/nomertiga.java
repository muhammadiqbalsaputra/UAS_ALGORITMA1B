import java.util.ArrayList;
import java.util.Random;

public class nomertiga {

    public static void main(String[] args) {
        ArrayList<Integer> speeds = daftarKecepatan(200);

        System.out.println("Daftar kecepatan di antara 80 - 100 km/jam:");
        kecepatanRatarata(speeds, 80, 100);

        System.out.println("Daftar kecepatan di bawah 80 km/jam:");
        kecepatanDibawahrata(speeds, 80);
    }
    public static ArrayList<Integer> daftarKecepatan(int count) {
        ArrayList<Integer> kecepatan = new ArrayList<>();
        Random random = new Random();

        int i = 0;
        while (i < count) {
            int speed = random.nextInt(121);
            kecepatan.add(speed);
            i++;
        }
        return kecepatan;
    }
    public static void kecepatanDibawahrata(ArrayList<Integer> kecepatan, int maximal) {
        for (int speed : kecepatan) {
            if (speed < maximal) {
                System.out.println("Kecepatan: " + speed + " km/jam");
            }
        }
    }
    public static void kecepatanRatarata(ArrayList<Integer> kecepatan, int minimal, int maximal) {
        for (int speed : kecepatan){
            if (speed >= minimal && speed <= maximal) {
                System.out.println("Kecepatan: " + speed + " km/jam");
            }
        }
    }
}