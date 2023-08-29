package br.ucsal.advancedjava.Solid.L;

class Ex3 {

}

class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public boolean withdraw(double amount) {
        // Lógica específica para uma conta poupança
        if (balance >= amount && amount > 0) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public boolean withdraw(double amount) {
        // Lógica específica para uma conta corrente
        if (balance >= amount + 1) { // Taxa de retirada
            balance -= amount + 1;
            return true;
        }
        return false;
    }
}
