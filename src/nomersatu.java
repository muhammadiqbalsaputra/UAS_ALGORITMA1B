import java.util.ArrayList;

public class nomersatu {

    public static void main(String[] args) {
        ArrayList<Integer> hasil = angkaAngka();
        System.out.println(hasil);
    }
    private static ArrayList<Integer> angkaAngka() {
        ArrayList<Integer> angka= new ArrayList<>();
        angka.add(7);
        angka.add(30);
        angka.add(10);
        angka.add(23);
        return angka;
    }
}