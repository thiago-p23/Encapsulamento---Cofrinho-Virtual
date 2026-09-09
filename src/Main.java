public class Main {

    public static void main(String[] args) {

        // Criando um cofrinho
        Cofrinho cofrinho = new Cofrinho("Thiago", 1000);

        System.out.println("=== COFRINHO ===");
        System.out.println("Nome: " + cofrinho.getNome());
        System.out.println("Meta: R$ " + cofrinho.getMeta());
        System.out.println("Saldo: R$ " + cofrinho.getSaldo());
        System.out.println("Progresso: " + cofrinho.getProgresso() + "%");
        System.out.println("Status: " + cofrinho.getStatus());

        System.out.println("\n=== ADICIONANDO DINHEIRO ===");

        cofrinho.adicionarDinheiro(200);

        System.out.println("Saldo: R$ " + cofrinho.getSaldo());
        System.out.println("Progresso: " + cofrinho.getProgresso() + "%");
        System.out.println("Status: " + cofrinho.getStatus());

        System.out.println("\n=== ADICIONANDO MAIS DINHEIRO ===");

        cofrinho.adicionarDinheiro(500);

        System.out.println("Saldo: R$ " + cofrinho.getSaldo());
        System.out.println("Progresso: " + cofrinho.getProgresso() + "%");
        System.out.println("Status: " + cofrinho.getStatus());

        System.out.println("\n=== TESTANDO VALOR NEGATIVO ===");

        cofrinho.adicionarDinheiro(-100);

        System.out.println("\n=== RETIRANDO DINHEIRO ===");

        cofrinho.retirarDinheiro(200);

        System.out.println("Saldo: R$ " + cofrinho.getSaldo());
        System.out.println("Progresso: " + cofrinho.getProgresso() + "%");
        System.out.println("Status: " + cofrinho.getStatus());

        System.out.println("\n=== TESTANDO RETIRADA MAIOR QUE O SALDO ===");

        cofrinho.retirarDinheiro(1000);

        System.out.println("\n=== ALCANÇANDO A META ===");

        cofrinho.adicionarDinheiro(500);

        System.out.println("Saldo: R$ " + cofrinho.getSaldo());
        System.out.println("Progresso: " + cofrinho.getProgresso() + "%");
        System.out.println("Status: " + cofrinho.getStatus());

        System.out.println("\n=== ULTRAPASSANDO A META ===");

        cofrinho.adicionarDinheiro(200);

        System.out.println("Saldo: R$ " + cofrinho.getSaldo());
        System.out.println("Progresso: " + cofrinho.getProgresso() + "%");
        System.out.println("Status: " + cofrinho.getStatus());
    }
}