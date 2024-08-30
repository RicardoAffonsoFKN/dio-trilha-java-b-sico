import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    int numero;
    String agencia;
    String nomeCompleto;
    double saldo;

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).Locale(Locale.BR);

        System.out.println("Insira o Nome Completo");
        this.nomeCompleto = scanner.next()

        System.out.println("Insira a Agência");
        this.agencia = scanner.next()

        System.out.println("Insira o Número");
        this.numero = scanner.nextInt()

        System.out.println("Insira o Saldo");
        this.saldo = scanner.nextDouble()

        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
