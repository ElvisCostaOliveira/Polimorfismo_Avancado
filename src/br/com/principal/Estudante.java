package br.com.principal;

class Estudante extends Pessoa {
    private int ano;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano < 1 || ano > 5) {
            throw new IllegalArgumentException("Ano deve estar entre 1 e 5");
        }
        this.ano = ano;
    }

    public void promoverAno() {
        if (ano < 5) {
            ano++;
        }
    }

    @Override
    public String atividadePrincipal() {
        return "Estudando";
    }
}