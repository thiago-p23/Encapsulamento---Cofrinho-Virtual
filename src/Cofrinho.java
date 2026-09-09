public class Cofrinho {

    private String nome;
    private double saldo;
    private double meta;

    // Construtor
    public Cofrinho(String nome, double meta) {
        this.nome = nome;
        this.saldo = 0;
        this.meta = meta;
    }

    // Getter do nome
    public String getNome() {
        return nome;
    }

    // Getter do saldo
    public double getSaldo() {
        return saldo;
    }

    // Getter da meta
    public double getMeta() {
        return meta;
    }

    // Adiciona dinheiro ao cofrinho
    public void adicionarDinheiro(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Dinheiro adicionado: R$ " + valor);
        } else {
            System.out.println("Erro: o valor deve ser positivo.");
        }
    }

    // Retira dinheiro do cofrinho
    public void retirarDinheiro(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: o valor deve ser positivo.");
        } else if (valor > saldo) {
            System.out.println("Erro: saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Dinheiro retirado: R$ " + valor);
        }
    }

    // Calcula o progresso da meta
    public double getProgresso() {
        if (meta <= 0) {
            return 0;
        }

        return (saldo / meta) * 100;
    }

    // Informa o status automaticamente
    public String getStatus() {
        if (saldo == 0) {
            return "Meta não iniciada";
        } else if (saldo < meta) {
            return "Economizando";
        } else {
            return "Meta alcançada";
        }
    }
}