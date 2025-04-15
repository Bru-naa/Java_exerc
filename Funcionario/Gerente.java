public class Gerente extends Funcionario{
    int equipe;
    double metaAnual;

    void exibirInfoGerente() {
        exibirInfo();
        System.out.println("Equipe: "+equipe+ " pessoas");
        System.out.println("Meta anual: "+metaAnual);
        System.out.println("---------------------------------------");
    }

    
}