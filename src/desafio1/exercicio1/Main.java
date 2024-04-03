package desafio1.exercicio1;

import javax.swing.*;
class HelloWorld {
    public static void main(String[] args) {

        int numeroInicio = 0;
        String numero = JOptionPane.showInputDialog(null, "Digite um número");
        numeroInicio = Integer.parseInt(numero);

        if (numeroInicio <0) {
            JOptionPane.showMessageDialog(null, "Seu número é negativo");
        }
        else if (numeroInicio == 0) {
            JOptionPane.showMessageDialog(null, "Seu número é 0");

        }
        else {
            JOptionPane.showMessageDialog(null, "Seu número é positivo");
        }
    }
}