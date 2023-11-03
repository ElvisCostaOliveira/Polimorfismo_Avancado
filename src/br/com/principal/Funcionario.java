package br.com.principal;

class Funcionario extends Pessoa {
    private double salario;
    private double bonus;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("Salário não pode ser negativo");
        }
        this.salario = salario;
    }

    public double getBonus() {
        return bonus;
    }

    public void adicionarBonus(double valor) {
        this.bonus += valor;
    }

    public void aplicarBonus() {
        this.salario += bonus;
        this.bonus = 0;
    }

    public void aumentoSalario(double porcentagem) {
        this.salario *= (1 + porcentagem / 100);
    }

    @Override
    public String atividadePrincipal() {
        return "Trabalhando como Funcionário";
    }
}
