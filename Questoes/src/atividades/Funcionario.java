package atividades;

public class Funcionario {
    public static final String GetNome = null;
    private String nome;
    private float salario;
    private String data;

    public void SetNome(String nome) {
        this.nome = nome;
    }

    public void SetSalario(float salario) {
        this.salario = salario;
    }

    public void SetData(String data) {
        this.data = data;
    }

    public String GetNome() {
        return nome;
    }

    public float GetSalario() {
        return salario;
    }

    public String GetData() {
        return data;
    }

    public void Imprimir() {
        System.out.println("Dados da Pessoa:");
        System.out.println(""+nome);
        System.out.println(""+salario);
        System.out.println(""+data);
        System.out.println("");
    }
}
