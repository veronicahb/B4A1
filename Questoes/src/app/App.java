package app;

import atividades.Agenda;
import atividades.Departamento;
import atividades.Empresa;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner l = new Scanner(System.in);
        System.out.println("--------- MENU ---------");
        System.out.println(" ");
        System.out.println("Escolha o programa:");
        System.out.println(" ");
        System.out.println("1 - Agenda");
        System.out.println("2 - Empresa");
        System.out.println(" ");
        System.out.println("Opção: ");
        String prog = l.next();
        int programa = Integer.parseInt(prog);
        if(programa == 1){
            Agenda ag = new Agenda();
            System.out.println("");
            ag.ArmazenarPessoa("Claudio", 1987, 1.74);
            ag.ArmazenarPessoa("Julia", 1989, 1.72);
            ag.ArmazenarPessoa("Miranda", 1993, 1.69);
            ag.RemoverPessoa("Miranda");
            System.out.println("");
            ag.BuscaPessoa("Julia");
            System.out.println("");
            ag.ImprimirAgenda();
            System.out.println("");
            ag.ImprimirPessoa(1);
        }else if(programa == 2){     
            Empresa em = new Empresa();
            Departamento dep = new Departamento();
            em.SetNomee("YOO");
            em.SetCNPJ(123456789);
            em.SetarDepartamentos("TI");
            em.SetarDepartamentos("Cozinha");
            em.SetarDepartamentos("Limpeza");
            dep.SetNomed("TI");
            dep.SetarFuncionarios("Marcus", 1000, "23/11/2015");
            dep.SetarFuncionarios("Baiana", 1000, "30/12/2016");
            dep.SetNomed("Cozinha");
            dep.SetarFuncionarios("Veronica", 1050, "27/08/2019");
            dep.SetarFuncionarios("Heloisa", 1050, "30/01/2020");
            dep.SetNomed("Limpeza");
            dep.SetarFuncionarios("Ana Clara", 1100, "13/08/2019");
            dep.SetarFuncionarios("José", 1100, "31/01/2021");
            em.Aumento("TI");
            em.Transferir("Limpeza", "Cozinha");
            System.out.println("");
            dep.ImprimirFuncionarios();
        }else{
            System.out.println("Número Invalido");
        }
        l.close();
    }
}
