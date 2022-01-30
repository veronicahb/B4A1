package atividades;

public class Pessoa {

    private String nome;
    private int nascimento;
    private double altura;

    public void SetNome(String nome) {
        this.nome = nome;
    }

    public void SetNascimento(int nascimento) {
        this.nascimento = nascimento;
    }

    public void SetAltura(double altura) {
        this.altura = altura;
    }

    public String GetNome() {
        return nome;
    }

    public int GetNascimento() {
        return nascimento;
    }

    public double GetAltura() {
        return altura;
    }

    public void Imprimir() {
        System.out.println("Dados da Pessoa:");
        System.out.println(""+nome);
        System.out.println(""+nascimento);
        System.out.println(""+altura);
        System.out.println("");
    }

    public void Idade() {
        System.out.print("Idade da Pessoa: ");
        int idade = 2022 - this.nascimento;
        System.out.println(""+idade);
    }
}
