import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Primeiro coloque sua primeira nota:");
        System.out.print("Nota 1: ");
        float nota1 = console.nextFloat();

        System.out.println("Coloque sua segunda nota");
        System.out.print("Nota 2: ");
        float nota2 = console.nextFloat();

        System.out.println("Coloque sua terceira nota");
        System.out.print("Nota 3: ");
        float nota3 = console.nextFloat();

        System.out.println("Coloque sua quarta nota");
        System.out.print("Nota 4: ");
        float nota4 = console.nextFloat();

        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.print("Sua média é de " + media);

    }
}
