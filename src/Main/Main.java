package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados do funcionário
        System.out.print("Nome: ");
        String name = scanner.nextLine();
        
        System.out.print("Salário bruto: ");
        double grossSalary = scanner.nextDouble();
        
        System.out.print("Imposto: ");
        double tax = scanner.nextDouble();

        Employee employee = new Employee(name, grossSalary, tax);
        
        // Exibir salário líquido
        System.out.println(employee);

        // Aumento do salário
        System.out.print("Qual a porcentagem para aumentar o salário? ");
        double percentage = scanner.nextDouble();
        employee.increaseSalary(percentage);

        // Exibir dados atualizados
        System.out.println("Dados atualizados: " + employee);

        scanner.close();
    }
}
