package estudos;
import java.util.Scanner;

public class EntradaDeDados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x;
        x = sc.nextLine();  // Alterado de sc.next() para sc.nextLine()
        System.out.println("Você Digitou: " + x);
        sc.close();
    }

}
