public class Principal {

    /*
     * Criar um sistema em Java que leia os dados de entrada do funcionário e
     * calcule seu
     * salário bruto, descontos, contribuições e salário líquido, conforme as
     * tabelas fornecidas.
     * O sistema deverá ser interativo e continuar operando até que a opção de saída
     * seja
     * selecionada pelo usuário.
     * 
     * -------------------Requisitos Funcionais-------------------------------
     * • Após cada cálculo, o sistema deve exibir os resultados e retornar ao menu
     * principal.
     * • O sistema encerra suas operações quando a opção de saída é selecionada.
     * • Os únicos métodos estáticos que devem existir no sistema são os métodos de
     * entrada de dados e o método main
     * • Deve-se utilizar orientação a objetos
     * • No mínimo 3 classes são esperadas:
     * o Console, para entrada de dados
     * o FolhaPagamento, para os dados do objeto
     * o Principal, para a execução do roteiro do exercício.
     */

    public static void main(String[] args) {

        
        int op;
    
        do {

            System.out.println("MENU");
            System.out.println("1) Folha de Pagamento");
            System.out.println("2) Saída");
            op = Console.lerInt();
            

            switch (op) {
                case 1:
                    FolhaPagamento folha = new FolhaPagamento();
                    System.out.println("\nCadastro de Funcionário");
                    System.out.print("Nome: ");
                    folha.setNomefunc(Console.lerString());

                    System.out.print("Horas trabalhadas: ");
                    folha.setHorastrab(Console.lerDouble());

                    System.out.print("Valor das horas: ");
                    folha.setValorhora(Console.lerDouble());

                    System.out.println("\nNome Funcionário:" + folha.getNomefunc() + "\n" + 
                    "\nSalário Bruto: " + folha.salBruto() + "\n" + 
                    "\nValor do Imposto de Renda: " + folha.calcularIr() + "\n" + 
                    "\nValor do INSS: " + folha.calcularInss() + "\n" + 
                    "\nValor do FGTS: " + folha.calcularFgts() + "\n" + 
                    "\nSalário Liquído: " + folha.calcularSalLiquido() + "\n");

                    break;

                case 2:

                    System.out.println("\nPrograma finalizado...");
                    break;

                default:

                    System.out.println("\nOpção inválida. Digite novamente...");
                    break;
            }

            System.out.println();

        } while (op != 0);

    }

}
