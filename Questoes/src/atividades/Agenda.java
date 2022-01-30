package atividades;

public class Agenda {
    private Pessoa pessoas[] = new Pessoa[10];

    public Agenda(){
        for(int i=0; i<10; i++){
            pessoas[i] = new Pessoa();
        }
    }

    public void ArmazenarPessoa(String nome, int nascimento, double altura){
        for(int i=0; i<10; i++){
            if(pessoas[i].GetNome() == null){
                pessoas[i].SetNome(nome);
                pessoas[i].SetNascimento(nascimento);
                pessoas[i].SetAltura(altura);
                i=10;
            }else{
                if(i==10){
                    System.out.println("agenda cheia");
                }
            }
        }
    }

    public void RemoverPessoa(String nome){
        for(int i=0; i<10; i++){
            if(pessoas[i].GetNome() == nome){
                pessoas[i].SetNome("");
                pessoas[i].SetNascimento(0);
                pessoas[i].SetAltura(0);
                System.out.println("essa pessoa foi removida");
            }else{
                if(i==10){
                    System.out.println("essa pessoa nao esta na sua agenda");
                }
            }
        }
    }

    public void BuscaPessoa(String no){
        for(int i=0; i<10; i++){
            if(pessoas[i].GetNome() == no){
                System.out.println("essa pessoa esta na posicao "+i+" da sua agenda");
            }else{
                if(i==10){
                    System.out.println("essa pessoa nao esta na sua agenda");
                }
            }
        }
    }

    public void ImprimirAgenda() {
        for(int i=0; i<10; i++){
            pessoas[i].Imprimir();
        }
    }

    public void ImprimirPessoa(int i) {
        pessoas[i].Imprimir();
    }

}
