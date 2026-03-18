public class Elevador {

    int andarAtual = 0;
    int totalAndares = 4;
    boolean portaAberta = false;

    public void abrirPorta() {
        this.portaAberta = true;
        System.out.println("Porta ABERTA!");
    }

    public void fecharPorta() {
        this.portaAberta = false;
        System.out.println("Porta FECHADA!");
    }

    public void subir(int destino) {
        if (this.portaAberta) {
            System.out.println("Erro: Feche a porta primeiro!");
        } else if (destino > andarAtual && destino <= totalAndares) {
            System.out.println("Subindo...");
            while (andarAtual < destino) {

                try { Thread.sleep(1000); } catch (Exception e) {}

                andarAtual++;
                System.out.println("Andar: " + andarAtual);
            }
            System.out.println("Chegou!!!");
        } else {
            System.out.println("Inválido para subir!");
        }
    }

    public void descer(int destino) {
        if (this.portaAberta) {
            System.out.println("Erro: Feche a porta primeiro!");
        } else if (destino < andarAtual && destino >= 0) {
            System.out.println("Descendo...");
            while (andarAtual > destino) {

                try { Thread.sleep(1000); } catch (Exception e) {}

                andarAtual--;
                System.out.println("Andar: " + andarAtual);
            }
            System.out.println("Chegou!");
        } else {
            System.out.println("Inválido para descer!");
        }
    }

    public void status() {
        String porta = portaAberta ? "ABERTA" : "FECHADA";
        System.out.println("\n###############################");
        System.out.println("#  ANDAR: " + andarAtual + " - PORTA: " + porta + "  #");
        System.out.println("###############################");
    }
}
