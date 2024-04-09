package desafio3;

import javax.swing.*;
import java.awt.*;

class HelloWorld {
    public static void main(String[] args) {
        Employee employee = new Employee();

        String name = JOptionPane.showInputDialog(null, "Digite seu nome:");
        employee.setName(name);


        int grossSalary = Integer.valueOf(JOptionPane.showInputDialog(null,"Digite o salário bruto:"));
        employee.setGrossSalary(grossSalary);

        double tax = Double.valueOf(JOptionPane.showInputDialog(null,"Insira a taxa de imposto:"));
        employee.setTax(tax);

        Employee employee1 = new Employee(name, grossSalary1, tax);

        String name1 = JOptionPane.showInputDialog(null,"Digite seu nome:");
        employee1.setName(name1);
        System.out.println("Digite o salário bruto:");

        System.out.println("Insira a taxa de imposto:");

        // Imprimir os detalhes e seu salário
        System.out.println(employee);
        System.out.println("\nSalário líquido do funcionário " + employee.netSalary());

        System.out.println(employee1);
        System.out.println("\nSalário líquido do funcionário " + employee1.netSalary());

        employee.increaseSalary(10);
        System.out.println(employee);
        System.out.println(employee1);

        System.out.println(employee);
        System.out.println("\nSalário líquido do funcionário " + employee1.netSalary());

        System.out.println(employee1);
        System.out.println("\nSalário líquido do funcionário " + employee2.netSalary());
    }
}
