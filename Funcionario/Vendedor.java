public class Vendedor extends Funcionario{
    double valorVendas, metaMensal, bonus, percent,salarioFinal,faltamVendas;

    void exibirInfoVendedor() {
        exibirInfo();
         System.out.println("Valor de vendas: R$"+valorVendas);
         System.out.println("Meta Mensal: R$ "+metaMensal);
         if(valorVendas>=38000){
            percent=salario*0.35;
            salarioFinal=salario+percent;
            System.out.println("Bonus: R$"+percent);
            System.out.println("Salario final: R$"+salarioFinal);
            System.out.println("-------------------------------------");
         }
         else if(valorVendas>=72200){
            percent=salario*0.45;
            salarioFinal=salario+percent;
            System.out.println("Bonus: R$ "+percent);
            System.out.println("Salario final: R$"+salarioFinal+"\n");
            System.out.println("--------------------------------------------");
         }
         else{
             faltamVendas= 38000-valorVendas;
            System.err.println("Vendedor(a), "+nome+", nao alcancou a meta minima para o bonus. Quantidade que falta: "+faltamVendas+"\n");
            System.out.println("-------------------------------------------");

         }
    }

    
}