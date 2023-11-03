package br.com.principal;

import java.util.ArrayList;
import java.util.List;

class Agenda {
    private List<Pessoa> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Pessoa pessoa) {
        contatos.add(pessoa);
    }

    public List<Pessoa> getContatos() {
        return contatos;
    }

    public List<Estudante> listarEstudantesDoUltimoAno() {
        List<Estudante> estudantesDoUltimoAno = new ArrayList<>();
        for (Pessoa contato : contatos) {
            if (contato instanceof Estudante) {
                Estudante estudante = (Estudante) contato;
                if (estudante.getAno() == 5) {
                    estudantesDoUltimoAno.add(estudante);
                }
            }
        }
        return estudantesDoUltimoAno;
    }

    public double calcularMediaIdade() {
        int totalIdade = 0;
        int totalContatos = contatos.size();
        for (Pessoa contato : contatos) {
            totalIdade += contato.getIdade();
        }
        return totalContatos > 0 ? (double) totalIdade / totalContatos : 0;
    }
}
