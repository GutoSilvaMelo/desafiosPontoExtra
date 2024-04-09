package desafio3;
public class Employee {
        private String name, name1;
        private double grossSalary, grossSalary1;
        private double tax, tax1;
        public Employee() {
        }
        public String getName() {
            return this.name = name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public double getGrossSalary() {
            return this.grossSalary = grossSalary;
        }
        public void setGrossSalary(double grossSalary) {
            this.grossSalary = grossSalary;
        }
        public double getTax() {
            return this.tax = tax;
        }
        public void setTax(double tax) {
            this.tax = tax;
        }
        public Employee(String name, Double grossSalary, Double tax) {
            this.name = name;
            this.grossSalary = grossSalary;
            this.tax = tax;
        }
        public Employee(String name1, double grossSalary1, double tax1) {
            this.name1 = name1;
            this.grossSalary1 = grossSalary1;
            this.tax1 = tax1;
        }
        public void imprimirDados() {
            System.out.println("Nome: " + name);
            System.out.println("Salário bruto: " + grossSalary);
            System.out.println("Salário líquido: " + netSalary());
        }
}
