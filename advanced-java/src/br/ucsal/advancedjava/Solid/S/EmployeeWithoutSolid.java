package br.ucsal.advancedjava.Solid.S;

public class EmployeeWithoutSolid {

    private String name;
    private String role;
    private Double salary;

    public EmployeeWithoutSolid(String name, String role, Double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public void calculateSalary() {
        // Cálculo do salário com base na regra de negócio
    }

    public void saveToDatabase() {
        // Lógica para salvar os dados do funcionário no banco de dados
    }

    public void generatePayrollReport() {
        // Lógica para gerar um relatório de folha de pagamento
    }
}