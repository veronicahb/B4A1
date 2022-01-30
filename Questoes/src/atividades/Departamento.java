package atividades;

public class Departamento{
    private String nomed;
    private Funcionario funcionarios[] = new Funcionario[100];

    public Departamento(){
        for(int i=0; i<100; i++){
            funcionarios[i] = new Funcionario();
        }
    }

    public void SetNomed(String nomed) {
        this.nomed = nomed;
    }

    public String GetNomed() {
        return nomed;
    }

    public void SetarFuncionarios(String nome, float salario, String data){
        for(int i=0; i<100; i++){  
            if(funcionarios[i].GetNome() == null){
                funcionarios[i].SetNome(nome);
                funcionarios[i].SetSalario(salario);
                funcionarios[i].SetData(data);
                i=100;
            }else{
                if(i==100){
                    System.out.println("numero de funcionarios completo");
                }
            }
        }
    }

    public void Aumentof(){
        for(int i=0; i<100; i++){
            if(funcionarios[i].GetSalario()!=0){
                float s = funcionarios[i].GetSalario();
                funcionarios[i].SetSalario(s/100*10+s);
            }  
        }
        System.out.println("todos funcionarios com aumento");
    }

    public void ImprimirFuncionarios(){
        for(int i=0; i<100; i++){
            if(funcionarios[i].GetNome()!=null){
                funcionarios[i].Imprimir();
            }  
        }
    }
}
