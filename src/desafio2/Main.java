package desafio2;

import javax.swing.*;
import java.util.HashSet;
class HelloWorld {
    public static void main(String[] args) {
        HashSet<String> tarefas = new HashSet<>();
        boolean sair = false;
        JOptionPane.showMessageDialog(null, "Bem-vindo à Lista de Tarefas!");

        while (!sair) {
            String[] options = {"Adicionar tarefa", "Visualizar tarefas", "Remover tarefa", "Sair" };
            int escolhaDasOpcoesDoMenu = JOptionPane.showOptionDialog(null, "Menu:", "Gerenciador de tarefas",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, options, options[0]);

            if (tarefas.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Sua lista está vazia!");
                JOptionPane.showMessageDialog(null, "Retornando ao menu...");


            } else if (escolhaDasOpcoesDoMenu == Escolha.visualizar) {
            }

            else if {
                String listaDeTarefas="";
                for (int t = 0; t < tarefas.size(); t++) {
                    listaDeTarefas = listaDeTarefas + (t+1) + ". " + tarefas.contains(t) + "\n";

                }
                JOptionPane.showMessageDialog(null,listaDeTarefas);

                JOptionPane.showMessageDialog(null, "Retornando ao menu...");

            }
             else (escolhaDasOpcoesDoMenu){
                JOptionPane.showMessageDialog(null, "Até mais...");
                sair = true;
            }
        }
    }
}