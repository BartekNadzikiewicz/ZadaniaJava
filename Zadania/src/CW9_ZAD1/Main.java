package CW9_ZAD1;

public class Main {

    public static void main(String[] args) {
        NullPointerException nullPointerVar = new NullPointerException();

        try {
            nullPointerVar.nullPointerMethod();
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
            System.out.println(e);

        }
    }

}