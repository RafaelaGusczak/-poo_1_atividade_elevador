import java.util.Scanner;

public class MainElevador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Elevador e = new Elevador();
        String opcao = "";

        while (!opcao.equals("4")) {
            e.status();
            System.out.println("1 - Digitar andar de destino");
            System.out.println("2 - Abrir Porta");
            System.out.println("3 - Fechar Porta");
            System.out.println("4 - Sair do predio");
            System.out.print("\nEscolha a opcao: ");

            opcao = scanner.next();

            switch (opcao) {
                case "1":
                    System.out.print("Para qual andar deseja ir? (0 a 4): ");
                    if (scanner.hasNextInt()) {
                        int destino = scanner.nextInt();

                        if (destino > e.andarAtual) {
                            e.subir(destino);
                        } else if (destino < e.andarAtual) {
                            e.descer(destino);
                        } else {
                            System.out.println("Você já está neste andar!");
                        }
                    } else {
                        System.out.println("Digite uma opção válida!");
                        scanner.next();
                    }
                    break;
                case "2":
                    e.abrirPorta();
                    break;
                case "3":
                    e.fecharPorta();
                    break;
                case "4":
                    System.out.println("Bye ;)");
                    break;
                default:
                    System.out.println("Opção inválida ;(");
            }
        }
        scanner.close();
    }
}
