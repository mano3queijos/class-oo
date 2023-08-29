package br.ucsal.advancedjava.Solid.S;

class Employee {
    private String name;
    private String role;
    private double salary;

    public Employee(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

}

class EmployeeRepository {
    public void save(Employee employee) {
        // Lógica para salvar os dados do funcionário no banco de dados
    }
}

class PayrollReportGenerator {
    public void generate(Employee employee) {
        // Lógica para gerar um relatório de folha de pagamento
    }
}

class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("João", "Desenvolvedor", 5000.0);

        EmployeeRepository employeeRepository = new EmployeeRepository();
        employeeRepository.save(employee);

        PayrollReportGenerator payrollReportGenerator = new PayrollReportGenerator();
        payrollReportGenerator.generate(employee);
    }
}
