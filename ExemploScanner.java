// Importar outros pacotes, métodos, etc
import java.util.Scanner;

class Main
{
    public static void main(String[] args) {


      // Exemplo Scanner
      // Tipo nomeDoObjeto = new Tipo();

      Scanner scanner = new Scanner(System.in);

      System.out.println("Test next line");
      String line = scanner.nextLine();
      System.out.println(line);

      System.out.println("Digite o seu nome");
      String nome = scanner.nextLine();

      System.out.println("Digite a sua idade");
      int idade = scanner.nextInt();

      System.out.println("Digite o sua altura");
      double altura = scanner.nextDouble();

      System.out.println(nome + " tem " + idade + " anos e " + altura + "m de altura");

      scanner.close();

    }
}
