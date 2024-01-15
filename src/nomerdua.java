import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class nomerdua {

    public static void main(String[] args) throws IOException {
        ArrayList<String> g = new ArrayList<>();
        char[] karakter_pertama;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input jumlah data yang akan diproses");
        int u = Integer.parseInt(reader.readLine());
        karakter_pertama = new char[u];
        int counter = 0;

        for (int index = 0; index<u; index++) {
            counter++;
            System.out.println("Masukan Nama " + counter + ":");
            String name = reader.readLine();
            g.add(HurufPertamaJadikanKapital(name));
            karakter_pertama[index] = g.get(index).charAt(0);
        }

        for (String d : g) {
            System.out.println(g+"");
        }

        System.out.println("Karakter Pertama dari Setiap Nama:");
        for (char karakter : karakter_pertama) {
            System.out.println(karakter);
        }
    }
    private static String HurufPertamaJadikanKapital(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
}