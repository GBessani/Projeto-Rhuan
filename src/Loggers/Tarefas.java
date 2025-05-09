package Loggers;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;

public class Tarefas {
    private static final Logger logger = Logger.getLogger(Tarefas.class.getName());
    private List<String> tarefas;

    public Tarefas() {
        tarefas = new ArrayList<>();
        try {
            FileHandler fileHandler = new FileHandler("tarefas.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.setLevel(Level.ALL);
        } catch (Exception e) {
            logger.severe("Erro ao configurar o logger: " + e.getMessage());
        }
    }

    public void adicionarTarefa(String tarefa) {
        tarefas.add(tarefa);
        logger.info("Tarefa adicionada: " + tarefa);
    }

    public void concluirTarefa(String tarefa) {
        if (tarefas.contains(tarefa)) {
            tarefas.remove(tarefa);
            logger.info("Tarefa concluída: " + tarefa);
        } else {
            logger.warning("Tentativa de concluir tarefa não encontrada: " + tarefa);
        }
    }

    public void listarTarefas() {
        System.out.println("Lista de tarefas:");
        for (String tarefa : tarefas) {
            System.out.println("- " + tarefa);
        }
    }


}
