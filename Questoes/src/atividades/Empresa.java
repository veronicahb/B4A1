package atividades;

public class Empresa{
    private String nomee;
    private int CNPJ;
    private Departamento departamentos[] = new Departamento[100];

    public Empresa(){
        for(int i=0; i<10; i++){
            departamentos[i] = new Departamento();
        }
    }

    public void SetNomee(String nomee) {
        this.nomee = nomee;
    }

    public String GetNomee() {
        return nomee;
    }

    public void SetCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    public int GetCNPJ() {
        return CNPJ;
    }

    public void SetarDepartamentos(String nomed){
        for(int i=0; i<10; i++){  
            if(departamentos[i].GetNomed() == null){
                departamentos[i].SetNomed(nomed);
                i=10;
            }else{
                if(i==10){
                    System.out.println("numero de departamentos completo");
                }
            }
        }
    }

    public void Aumento(String nomed){
        for(int i=0; i<10; i++){  
            if(departamentos[i].GetNomed() == nomed){
                departamentos[i].Aumentof();
            }else{
                if(i==10){
                    System.out.println("departamento nao registrado");
                }
            }
        }
    }

    public void Transferir(String ptransferir, String transferido){
        int ptransf = 15;
        int transfid = 15;
        for(int i=0; i<10; i++){
            if(departamentos[i].GetNomed() == ptransferir){
                ptransf = i;
            }else if(departamentos[i].GetNomed() == transferido){
                transfid = i;
            }
        }
        if(ptransf == 15){
            System.out.println("um dos departamentos não existe");
        }else if(transfid == 15){
            System.out.println("um dos departamentos não existe");
        }else{
            String nomez = departamentos[transfid].GetNomed();
            String nomep = departamentos[ptransf].GetNomed();
            departamentos[transfid].SetNomed(nomep);
            departamentos[ptransf].SetNomed(nomez);
        }
    }
}
