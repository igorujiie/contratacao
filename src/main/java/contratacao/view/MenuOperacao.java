package contratacao.view;

import java.util.Scanner;

public class MenuOperacao {

    public void exibirMenuOperacao() {
        System.out.println("#############################################################");
        System.out.println("                                                            #");
        System.out.println("Escolha a operação desejada:                                #");
        System.out.println("                                                            #");
        System.out.println("1 - Gerenciamento cliente                                   #");
        System.out.println("2 - Gerenciamento Funcionario                               #");
        System.out.println("3 - Gerenciamento Moeda                                     #");
        System.out.println("4 - Listar cotação                                          #");
        System.out.println("5 - Comprar Moeda                                           #");
        System.out.println("6 - vender Moeda                                            #");
        System.out.println("7 - Sair                                                    #");
        System.out.println("                                                            #");
        System.out.println("#############################################################");


    }

    public int lerOpcao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a opção desejada: ");
        return scanner.nextInt();
    }
}
