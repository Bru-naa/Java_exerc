import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

//Instancia gerente
         Gerente gerente1= new Gerente();
           gerente1.nome="Ana";
           gerente1.inicial="A";
           gerente1.salario=18000;
           gerente1.equipe=12;
           gerente1.metaAnual=800000;

           //Instancia vendedores

           Vendedor vendedor1= new Vendedor();
           vendedor1.nome="Benjamin";
           vendedor1.inicial="B";
           vendedor1.salario=2500;
           vendedor1.valorVendas=28000;
           vendedor1.metaMensal=30000;

            Vendedor vendedor2= new Vendedor();
           vendedor2.nome="Cassia";
           vendedor2.inicial="C";
           vendedor2.salario=2800;
           vendedor2.valorVendas=30000;
           vendedor2.metaMensal=38000;

            Vendedor vendedor3= new Vendedor();
           vendedor3.nome="Danilo";
           vendedor3.inicial="D";
           vendedor3.salario=3000;
           vendedor3.valorVendas=38000;
           vendedor3.metaMensal=40000;


            Vendedor vendedor4= new Vendedor();
           vendedor4.nome="Ellen";
           vendedor4.inicial="E";
           vendedor4.salario=5000;
           vendedor4.valorVendas=72200;
           vendedor4.metaMensal=78000;
       

            Vendedor vendedor5= new Vendedor();
           vendedor5.nome="Amanda";
           vendedor5.inicial="A";
           vendedor5.salario=4500;
           vendedor5.valorVendas=52500;
           vendedor5.metaMensal=62000;

           //Array List
           ArrayList<Vendedor> vendedores = new ArrayList<>();
         vendedores.add(vendedor1);
        vendedores.add(vendedor2);
        vendedores.add(vendedor3);
        vendedores.add(vendedor4);
        vendedores.add(vendedor5);

        //Comando de entrada, pedir que digite uma letra ou um cargo correspondente

        System.out.println("Cargos: Vendedor ou Gerente, busque iniciais de vendedores de A-E");
        System.out.println("Digite uma inicial para buscar informacoes de vendedores ou um cargo: ");
        Scanner scanner = new Scanner(System.in);
         String entrada = scanner.nextLine();
        
        //Busca por cargos
         if(entrada.equalsIgnoreCase("Gerente")){
            gerente1.exibirInfoGerente();
         }
         else if(entrada.equalsIgnoreCase("Vendedor")){
           vendedor1.exibirInfoVendedor();
            vendedor2.exibirInfoVendedor();
             vendedor3.exibirInfoVendedor();
              vendedor4.exibirInfoVendedor();
               vendedor5.exibirInfoVendedor();
         }

         //Busca por inicial de vendedor
    
     for (Vendedor v : vendedores) {
    if (v.inicial.equalsIgnoreCase(entrada)) {
        v.exibirInfoVendedor();
    }
}
   
    }
}
