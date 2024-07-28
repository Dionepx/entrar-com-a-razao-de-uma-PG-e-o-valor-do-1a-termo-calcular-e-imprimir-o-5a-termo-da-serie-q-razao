import java.util.Scanner;

// formula: an = a1 * qn-1

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double termo_1, quintoTermo, razao;

        System.out.println("Entre com o primeiro termo da PG: ");
        termo_1 = scanner.nextInt();

        System.out.println("Entre com a razão: ");
        razao = scanner.nextInt();

        quintoTermo = termo_1 * Math.pow(razao, 5 - 1);

        System.out.println("O 5a termo da PG é " + quintoTermo);

        scanner.close();
    }
}