package CW10_ZAD5;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean bool = true;
        String numerKonta;
        System.out.println("Wprowadź 3 cyfry");

        numerKonta = reader.readLine();

        BufferedReader reader2 = new BufferedReader(new FileReader("src/CW10_ZAD5/plewibnra.txt"));

        do {
            String line = reader2.readLine();
            if (line != null && line.trim().startsWith(numerKonta)){
                System.out.println(line);
                bool = false;
            }else if(line == null){
                System.out.println("Nie znaleziono numeru");
                break;
            }
        }while (bool);

    }
}