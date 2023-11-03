package br.com.principal;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criando contatos
        Funcionario funcionario = new Funcionario();
        funcionario.setEmail("funcionario@example.com");
        funcionario.setIdade(30);
        funcionario.setSalario(3000);
        funcionario.adicionarBonus(500);
        funcionario.aplicarBonus();
        funcionario.aumentoSalario(10);

        Estudante estudante = new Estudante();
        estudante.setEmail("estudante@example.com");
        estudante.setIdade(20);
        estudante.setAno(3);
        estudante.promoverAno();

        // Criando a lista de contatos
        List<Pessoa> contatos = new ArrayList<>();
        contatos.add(funcionario);
        contatos.add(estudante);

        // Criando a agenda e adicionando contatos
        Agenda agenda = new Agenda();
        for (Pessoa contato : contatos) {
            agenda.adicionarContato(contato);
        }

        // Listando estudantes do último ano
        List<Estudante> estudantesUltimoAno = agenda.listarEstudantesDoUltimoAno();
        System.out.println("Estudantes do último ano:");
        for (Estudante estudanteUltimoAno : estudantesUltimoAno) {
            System.out.println("Email: " + estudanteUltimoAno.getEmail());
            System.out.println("Idade: " + estudanteUltimoAno.getIdade());
            System.out.println("Ano: " + estudanteUltimoAno.getAno());
            System.out.println("----------------------");
        }

        // Calculando e exibindo a média de idade dos contatos
        double mediaIdade = agenda.calcularMediaIdade();
        System.out.println("Média de idade dos contatos: " + mediaIdade);
    }
}
