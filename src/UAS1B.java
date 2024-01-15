import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class UAS1B {
    public static void main(String[] args) throws IOException {
        ArrayList<String> g = new ArrayList<>();
        char[] karakter_pertama;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input jumlah data yang akan di proses: ");
        int u = Integer.parseInt(reader.readLine());
        karakter_pertama = new char[u];
        int counter=0;

        for (int index = 0; index < u; index++) {
            System.out.println("Masukkan nama " + (index) + ": ");
            String name = reader.readLine();
            g.add(name);

            char hurufPertama = getHurufPertamaKapital(name);
            karakter_pertama[index] = hurufPertama;
        }


        for (String d : g) {
            System.out.println(g + " ");
        }

        System.out.println("Karakter Pertama Kapital:");
        for (char karakter : karakter_pertama) {
            System.out.println(karakter);
        }
    }

    public static char getHurufPertamaKapital(String input) {
        if (input == null || input.isEmpty()) {
            return '\0';
        }
        return Character.toUpperCase(input.charAt(0));
    }
}
