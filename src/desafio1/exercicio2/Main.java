package desafio1.exercicio2;

import javax.swing.*;
class HelloWorld {
    public static void main(String[] args) {
        int numeroInicial;
        String numero = JOptionPane.showInputDialog(null, "Digite um número entre 1 e 7");
        numeroInicial = Integer.parseInt(numero);

        switch (numeroInicial) {
            case (DiasDaSemana.DOMINGO):
                JOptionPane.showMessageDialog(null, "Domingo");
                break;
            case (DiasDaSemana.SEGUNDA):
                JOptionPane.showMessageDialog(null, "Segunda");
                break;
            case (DiasDaSemana.TERCA):
                JOptionPane.showMessageDialog(null, "Terça");
                break;
            case (DiasDaSemana.QUARTA):
                JOptionPane.showMessageDialog(null, "Quarta");
                break;
            case (DiasDaSemana.QUINTA):
                JOptionPane.showMessageDialog(null, "Quinta");
                break;
            case (DiasDaSemana.SEXTA):
                JOptionPane.showMessageDialog(null, "Sexta");
                break;
            case (DiasDaSemana.SABADO):
                JOptionPane.showMessageDialog(null, "Sábado");
                break;
        }
    }
}