import Loggers.*;

public class Main {
    public static void main(String[] args) {
        Tarefas gerenciador = new Tarefas();

        gerenciador.adicionarTarefa("Estudar Java");
        gerenciador.adicionarTarefa("Praticar programação");
        gerenciador.listarTarefas();
        gerenciador.concluirTarefa("Estudar Java");
        gerenciador.listarTarefas();

    }
}