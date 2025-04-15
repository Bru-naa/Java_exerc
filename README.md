# Java_exerc
📊 Sistema de Gestão de Funcionários
Este projeto em Java simula a estrutura de uma equipe com Gerentes e Vendedores, permitindo visualizar informações específicas de cada funcionário a partir da inicial do nome ou do cargo.

🧱 Estrutura do Projeto
Funcionario.java: Classe base que armazena nome, inicial e salário.

Gerente.java: Herda de Funcionario e adiciona informações sobre equipe e meta anual.

Vendedor.java: Herda de Funcionario e calcula bônus com base em metas mensais e vendas.

Main.java: Classe principal que instancia os objetos e interage com o usuário via terminal.

🚀 Como Executar
Certifique-se de ter o Java JDK instalado.

Compile todos os arquivos

💡 Funcionalidades
Visualização das informações dos Gerentes.

Cálculo de bônus e salário final para os Vendedores, com base nas metas atingidas:

Vendas ≥ 38.000 → bônus de 35% sobre o salário.

Vendas ≥ 72.200 → bônus de 45% sobre o salário.

Vendas abaixo da meta mínima não recebem bônus, e o sistema informa quanto falta para atingir a meta.

Busca interativa por:

Cargo: "Vendedor" ou "Gerente"

Inicial do nome (de A a E, no exemplo)
