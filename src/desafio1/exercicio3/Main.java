package desafio1.exercicio3;

import javax.swing.*;
class HelloWorld {
    public static void main(String[] args) {
        int numeroInicial;
        String numero = JOptionPane.showInputDialog(null, "Digite um número");
        numeroInicial = Integer.parseInt(numero);

        // Variável para o WHILE e DO-WHILE
        int contador = 0;
        int contadorDois = 0;

        for (int i = 0; i <= numeroInicial; i++) {
            JOptionPane.showMessageDialog(null, "for: " + i);
        }

        while(contador <= numeroInicial) {
        JOptionPane.showMessageDialog(null,"while: " + contador);
        contador++;
        }

        do {
            JOptionPane.showMessageDialog(null, "do-while: " + contadorDois);
            contadorDois++;
        } while (contadorDois <= numeroInicial);
    }
}