package Q1_jogo_da_velha;

import java.util.Scanner;

public class questão1 {

    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);
        String x = "X", o = "O", x1 = "x", o1 = "o";
        String player1name, player2name, usuario1, usuario2;
        String stop, put;
        int player1, player2;
        String game[][] = new String[3][3];
        game[0][0] = "1";
        game[0][1] = "2";
        game[0][2] = "3";
        game[1][0] = "4";
        game[1][1] = "5";
        game[1][2] = "6";
        game[2][0] = "7";
        game[2][1] = "8";
        game[2][2] = "9";

        //TELA INICIAL//
        System.out.print("'DESCOBRIR QUAL COLUNA E LINHA ESTÁ O NÚMERO DIGITADO'\n");
        for (int i = 0; i <= 2; i++) {
            System.out.print("--------------------------------------------------------------------------\n");
            for (int j = 0; j <= 2; j++) {
                System.out.print(" | LINE [" + i + "] COLUMN [" + j + "]" + " | ");
                if (j == 2) {
                    System.out.print("\n");
                }
            }
            if (i == 2) {
                System.out.print(""
                        + "==========================================================================\n");
            }
        }
        System.out.print("JOGO DA VELHA"
                + "\n====================\n");
        for (int i = 0; i <= 2; i++) {
            System.out.print("--------------------\n");
            for (int j = 0; j <= 2; j++) {
                System.out.print(" | " + game[i][j] + " | ");
                if (j == 2) {
                    System.out.print("\n");
                }
            }
            if (i == 2) {
                System.out.print("====================\n");
            }
        }
        //===========//

        //Jogadores//
        int g = 1;
        do {
            System.out.print("\n-> Digite o símbolo que deseja usar usar (O ou X): ");
            usuario1 = ex.nextLine();
            if ((usuario1.equals(x)) || (usuario1.equals(x1))) {
                x = x1;
                o = o1;
                usuario2 = o;
                g++;
            } else if ((usuario1.equals(o)) || (usuario1.equals(o1))) {
                o = o1;
                x = x1;
                usuario2 = x;
                g++;
            } else {
                System.out.print("\n!!Só é permitido " + o + "( ou " + o1 + ") ou " + x + "(ou " + x1 + ")!!");
                usuario2 = null;
            }
        } while (g == 1);

        //yes or not with name//
        int n = 1;
        do {
            System.out.print("->Deseja colocar nomes nos jogadores? \n(sim[s] ou não[nao ou n]): ");
            stop = ex.nextLine();
            switch (stop) {

                case "não":
                    n--;
                    player1name = "Player 1";
                    player2name = "Player 2";
                    break;
                case "nao":
                    n--;
                    player1name = "Player 1";
                    player2name = "Player 2";
                    break;
                case "n":
                    n--;
                    player1name = "Player 1";
                    player2name = "Player 2";
                    break;

                case "sim":
                    System.out.print("*Informe seu nome, jogador 1(" + usuario1 + "): ");
                    player1name = ex.nextLine();
                    System.out.print("*Informe seu nome jogador 2(" + usuario2 + "): ");
                    player2name = ex.nextLine();
                    n++;
                    break;
                case "s":
                    System.out.print("*Informe seu nome, jogador 1(" + usuario1 + "): ");
                    player1name = ex.nextLine();
                    System.out.print("*Informe seu nome jogador 2(" + usuario2 + "): ");
                    player2name = ex.nextLine();
                    n++;
                    break;

                default:
                    System.out.print("\n=>Digite uma resposta válida!\n");
                    player1name = null;
                    player2name = null;
                    break;
            }
        } while (n == 1);
        //================//
        //rules//
        System.out.print("\t*Funciona assim: Escolha um número onde deseja colocar o seu símbolo(X ou O) e divirta-se!");
        //end_rules//

        //COMEÇA O JOGO!//
        System.out.print("\n!!!!!!!!!!!!!!!!!!!!!!!!!"
                + "\nCOMEÇAAAAAAA A PARTIDA!"
                + "\n!!!!!!!!!!!!!!!!!!!!!!!!!"
                + "\n====================\n");
        int lo = 1;
        while (lo <= 6) {
            for (int i = 0; i <= 2; i++) {
                System.out.print("--------------------\n");
                for (int j = 0; j <= 2; j++) {
                    System.out.print(" | " + game[i][j] + " | ");
                    if (j == 2) {
                        System.out.print("\n");
                    }
                }
                if (i == 2) {
                    System.out.print(""
                            + "====================\n");
                    System.out.print("\nnº: " + lo);
                }
            }

            //LOOPING DO GAME//
            int l = 1, l1 = 1;
            //-----------------------------//

            //PLAYER 1//
            System.out.print("\n=> JOGADOR 1(" + usuario1 + "): É a sua vez, " + player1name + ".");
            do {
                System.out.print("\nposição: ");
                put = ex.nextLine();
                switch (put) {
                    case "1":
                        if (game[0][0].equals(usuario1) || game[0][0].equals(usuario2)) {
                            System.out.print("*A posição já está preenchida tente novamente!\n");
                            break;
                        } else {
                            game[0][0] = usuario1;
                            l++;
                            break;
                        }
                    case "2":
                        if (game[0][1].equals(usuario1) || game[0][1].equals(usuario2)) {
                            System.out.print("*A posição já está preenchida tente novamente!\n");
                            break;
                        } else {
                            game[0][1] = usuario1;
                            l++;
                            break;
                        }
                    case "3":
                        if (game[0][2].equals(usuario1) || game[0][2].equals(usuario2)) {
                            System.out.print("*A posição já está preenchida tente novamente!\n");
                            break;
                        } else {
                            game[0][2] = usuario1;
                            l++;
                            break;
                        }
                    case "4":
                        if (game[1][0].equals(usuario1) || game[1][0].equals(usuario2)) {
                            System.out.print("*A posição já está preenchida tente novamente!\n");
                            break;
                        } else {
                            game[1][0] = usuario1;
                            l++;
                            break;
                        }
                    case "5":
                        if (game[1][1].equals(usuario1) || game[1][1].equals(usuario2)) {
                            System.out.print("*A posição já está preenchida tente novamente!\n");
                            break;
                        } else {
                            game[1][1] = usuario1;
                            l++;
                            break;
                        }
                    case "6":
                        if (game[1][2].equals(usuario1) || game[1][2].equals(usuario2)) {
                            System.out.print("*A posição já está preenchida tente novamente!\n");
                            break;
                        } else {
                            game[1][2] = usuario1;
                            l++;
                            break;
                        }
                    case "7":
                        if (game[2][0].equals(usuario1) || game[2][0].equals(usuario2)) {
                            System.out.print("*A posição já está preenchida tente novamente!\n");
                            break;
                        } else {
                            game[2][0] = usuario1;
                            l++;
                            break;
                        }
                    case "8":
                        if (game[2][1].equals(usuario1) || game[2][1].equals(usuario2)) {
                            System.out.print("*A posição já está preenchida tente novamente!\n");
                            break;
                        } else {
                            game[2][1] = usuario1;
                            l++;
                            break;
                        }
                    case "9":
                        if (game[2][2].equals(usuario1) || game[2][2].equals(usuario2)) {
                            System.out.print("*A posição já está preenchida tente novamente!\n");
                            break;
                        } else {
                            game[2][2] = usuario1;
                            l++;
                            break;
                        }
                    default:
                        System.out.print("OPÇÃO DE POSIÇÃO INVÁLIDA!");
                        break;
                }
            } while (l == 1);

            //VERIFICAÇÃO DE VITÓRIA PLAYER 1//
            //LINE HORIZONTAL//
            //(line)[0] - (column)[x]// 
            if ((game[0][0].equals(game[0][1]) && game[0][0].equals(game[0][2])) || (game[0][2].equals(game[0][1]) && game[0][2].equals(game[0][0]))) {
                System.out.print("°°ººººººººººººººººººººººººººººººººººººº\nO " + player1name + " (" + usuario1 + ") é o vencedor!!!!!!!!!!!!\n°°ººººººººººººººººººººººººººººººººººººº\n");

                for (int i = 0; i <= 2; i++) {
                    System.out.print("--------------------\n");
                    for (int j = 0; j <= 2; j++) {
                        System.out.print(" | " + game[i][j] + " | ");
                        if (j == 2) {
                            System.out.print("\n");
                        }
                    }
                    if (i == 2) {
                        System.out.print(""
                                + "====================\n");
                    }
                }
                /*laço do segundo jogador*/
                l1 = 2;
                //laço das jogadas//
                lo = 10;
                //-------------------------//
                //(line)[1] - (column)[x]// 
            } else if ((game[1][0].equals(game[1][1]) && game[1][0].equals(game[1][2])) || (game[1][2].equals(game[1][1]) && game[1][2].equals(game[1][0]))) {
                System.out.print("°°ººººººººººººººººººººººººººººººººººººº\nO " + player1name + " (" + usuario1 + ") é o vencedor!!!!!!!!!!!!\n°°ººººººººººººººººººººººººººººººººººººº\n");
                for (int i = 0; i <= 2; i++) {
                    System.out.print("--------------------\n");
                    for (int j = 0; j <= 2; j++) {
                        System.out.print(" | " + game[i][j] + " | ");
                        if (j == 2) {
                            System.out.print("\n");
                        }
                    }
                    if (i == 2) {
                        System.out.print(""
                                + "====================\n");
                    }
                }
                /*laço do segundo jogador*/
                l1 = 2;
                //laço das jogadas//
                lo = 10;
                //-------------------------//
                //(line)[2] - (column)[2]// 
            } else if ((game[2][0].equals(game[2][1]) && game[2][0].equals(game[2][2])) || (game[2][2].equals(game[2][1]) && game[2][2].equals(game[2][0]))) {
                System.out.print("°°ººººººººººººººººººººººººººººººººººººº\nO " + player1name + " (" + usuario1 + ") é o vencedor!!!!!!!!!!!!\n°°ººººººººººººººººººººººººººººººººººººº\n");
                for (int i = 0; i <= 2; i++) {
                    System.out.print("--------------------\n");
                    for (int j = 0; j <= 2; j++) {
                        System.out.print(" | " + game[i][j] + " | ");
                        if (j == 2) {
                            System.out.print("\n");
                        }
                    }
                    if (i == 2) {
                        System.out.print(""
                                + "====================\n");
                    }
                }
                /*laço do segundo jogador*/
                l1 = 2;
                //laço das jogadas//
                lo = 10;
                //-------------------------//
                //-----------------------------------------------------//

                //LINE VERTICAL//
                //(line)[x] - (column)[0]// 
            } else if ((game[0][0].equals(game[1][0]) && game[0][0].equals(game[2][0])) || (game[2][0].equals(game[1][0]) && game[2][0].equals(game[0][0]))) {
                System.out.print("°°ººººººººººººººººººººººººººººººººººººº\nO " + player1name + " (" + usuario1 + ") é o vencedor!!!!!!!!!!!!\n°°ººººººººººººººººººººººººººººººººººººº\n");
                for (int i = 0; i <= 2; i++) {
                    System.out.print("--------------------\n");
                    for (int j = 0; j <= 2; j++) {
                        System.out.print(" | " + game[i][j] + " | ");
                        if (j == 2) {
                            System.out.print("\n");
                        }
                    }
                    if (i == 2) {
                        System.out.print(""
                                + "====================\n");
                    }
                }
                /*laço do segundo jogador*/
                l1 = 2;
                //laço das jogadas//
                lo = 10;
                //-------------------------//
                //(line)[x] - (column)[1]// 
            } else if ((game[0][1].equals(game[1][1]) && game[0][1].equals(game[2][1])) || (game[2][1].equals(game[1][1]) && game[2][1].equals(game[0][1]))) {
                System.out.print("°°ººººººººººººººººººººººººººººººººººººº\nO " + player1name + " (" + usuario1 + ") é o vencedor!!!!!!!!!!!!\n°°ººººººººººººººººººººººººººººººººººººº\n");
                for (int i = 0; i <= 2; i++) {
                    System.out.print("--------------------\n");
                    for (int j = 0; j <= 2; j++) {
                        System.out.print(" | " + game[i][j] + " | ");
                        if (j == 2) {
                            System.out.print("\n");
                        }
                    }
                    if (i == 2) {
                        System.out.print(""
                                + "====================\n");
                    }
                }
                /*laço do segundo jogador*/
                l1 = 2;
                //laço das jogadas//
                lo = 10;
                //-------------------------//
                //(line)[x] - (column)[2]// 
            } else if ((game[0][2].equals(game[1][2]) && game[0][2].equals(game[2][2])) || (game[2][2].equals(game[1][2]) && game[2][2].equals(game[0][2]))) {
                System.out.print("°°ººººººººººººººººººººººººººººººººººººº\nO " + player1name + " (" + usuario1 + ") é o vencedor!!!!!!!!!!!!\n°°ººººººººººººººººººººººººººººººººººººº\n");
                for (int i = 0; i <= 2; i++) {
                    System.out.print("--------------------\n");
                    for (int j = 0; j <= 2; j++) {
                        System.out.print(" | " + game[i][j] + " | ");
                        if (j == 2) {
                            System.out.print("\n");
                        }
                    }
                    if (i == 2) {
                        System.out.print(""
                                + "====================\n");
                    }
                }
                /*laço do segundo jogador*/
                l1 = 2;
                //laço das jogadas//
                lo = 10;
                //-------------------------//
                //(diagonal's line)//
                //esquerda//
            } else if ((game[0][0].equals(game[1][1]) && game[0][0].equals(game[2][2])) || (game[2][2].equals(game[1][1]) && game[2][2].equals(game[0][0]))) {
                System.out.print("°°ººººººººººººººººººººººººººººººººººººº\nO " + player1name + " (" + usuario1 + ") é o vencedor!!!!!!!!!!!!\n°°ººººººººººººººººººººººººººººººººººººº\n");
                for (int i = 0; i <= 2; i++) {
                    System.out.print("--------------------\n");
                    for (int j = 0; j <= 2; j++) {
                        System.out.print(" | " + game[i][j] + " | ");
                        if (j == 2) {
                            System.out.print("\n");
                        }
                    }
                    if (i == 2) {
                        System.out.print(""
                                + "====================\n");
                    }
                }
                /*laço do segundo jogador*/
                l1 = 2;
                //laço das jogadas//
                lo = 10;
                //-------------------------//
                //direita//
            } else if ((game[0][2].equals(game[1][1]) && game[0][2].equals(game[2][0])) || (game[2][0].equals(game[1][1]) && game[2][0].equals(game[0][2]))) {
                System.out.print("°°ººººººººººººººººººººººººººººººººººººº\nO " + player1name + " (" + usuario1 + ") é o vencedor!!!!!!!!!!!!\n°°ººººººººººººººººººººººººººººººººººººº\n");
                for (int i = 0; i <= 2; i++) {
                    System.out.print("--------------------\n");
                    for (int j = 0; j <= 2; j++) {
                        System.out.print(" | " + game[i][j] + " | ");
                        if (j == 2) {
                            System.out.print("\n");
                        }
                    }
                    if (i == 2) {
                        System.out.print(""
                                + "====================\n");
                    }
                }
                /*laço do segundo jogador*/
                l1 = 2;
                //laço das jogadas//
                lo = 10;
                //-------------------------//
                //condição de empate//
            } else {
                if (lo == 5) {
                    l1 = 2;
                    lo = 10;
                    System.out.print("\nEMPATE!\n");
                    for (int i = 0; i <= 2; i++) {
                        System.out.print("--------------------\n");
                        for (int j = 0; j <= 2; j++) {
                            System.out.print(" | " + game[i][j] + " | ");
                            if (j == 2) {
                                System.out.print("\n");
                            }
                        }
                        if (i == 2) {
                            System.out.print(""
                                    + "====================\n");
                        }
                    }
                }
            }
            //--------------------------------//
            //=============================//

            //PLAYER 2//
            while (l1 == 1) {
                if (l1 == 1) {
                    System.out.print("\n=> JOGADOR 2(" + usuario2 + "): É a sua vez, " + player2name + ".");
                }
                System.out.print(" posição: ");
                put = ex.nextLine();
                switch (put) {
                    case "1":
                        if (game[0][0].equals(usuario1) || game[0][0].equals(usuario2)) {
                            System.out.print("*A posição já está preenchida tente novamente!\n");
                            break;
                        } else {
                            game[0][0] = usuario2;
                            l1++;
                            break;
                        }
                    case "2":
                        if (game[0][1].equals(usuario1) || game[0][1].equals(usuario2)) {
                            System.out.print("*A posição já está preenchida tente novamente!\n");
                            break;
                        } else {
                            game[0][1] = usuario2;
                            l1++;
                            break;
                        }
                    case "3":
                        if (game[0][2].equals(usuario1) || game[0][2].equals(usuario2)) {
                            System.out.print("*A posição já está preenchida tente novamente!\n");
                            break;
                        } else {
                            game[0][2] = usuario2;
                            l1++;
                            break;
                        }
                    case "4":
                        if (game[1][0].equals(usuario1) || game[1][0].equals(usuario2)) {
                            System.out.print("*A posição já está preenchida tente novamente!\n");
                            break;
                        } else {
                            game[1][0] = usuario2;
                            l1++;
                            break;
                        }
                    case "5":
                        if (game[1][1].equals(usuario1) || game[1][1].equals(usuario2)) {
                            System.out.print("*A posição já está preenchida tente novamente!\n");
                            break;
                        } else {
                            game[1][1] = usuario2;
                            l1++;
                            break;
                        }
                    case "6":
                        if (game[1][2].equals(usuario1) || game[1][2].equals(usuario2)) {
                            System.out.print("*A posição já está preenchida tente novamente!\n");
                            break;
                        } else {
                            game[1][2] = usuario2;
                            l1++;
                            break;
                        }
                    case "7":
                        if (game[2][0].equals(usuario1) || game[2][0].equals(usuario2)) {
                            System.out.print("*A posição já está preenchida tente novamente!\n");
                            break;
                        } else {
                            game[2][0] = usuario2;
                            l1++;
                            break;
                        }
                    case "8":
                        if (game[2][1].equals(usuario1) || game[2][1].equals(usuario2)) {
                            System.out.print("*A posição já está preenchida tente novamente!\n");
                            break;
                        } else {
                            game[2][1] = usuario2;
                            l1++;
                            break;
                        }
                    case "9":
                        if (game[2][2].equals(usuario1) || game[2][2].equals(usuario2)) {
                            System.out.print("*A posição já está preenchida tente novamente!\n");
                            break;
                        } else {
                            game[2][2] = usuario2;
                            l1++;
                            break;
                        }
                    default:
                        System.out.print("OPÇÃO DE POSIÇÃO INVÁLIDA!");
                        break;
                }

                //VERIFICAÇÃO DE VITÓRIA PLAYER 2//
                //LINE HORIZONTAL//
                //(line)[0] - (column)[x]// 
                if ((game[0][0].equals(game[0][1]) && game[0][0].equals(game[0][2])) || (game[0][2].equals(game[0][1]) && game[0][2].equals(game[0][0]))) {
                    System.out.print("°°ººººººººººººººººººººººººººººººººººººº\nO " + player2name + " (" + usuario2 + ") é o vencedor!!!!!!!!!!!!\n°°ººººººººººººººººººººººººººººººººººººº\n");

                    for (int i = 0; i <= 2; i++) {
                        System.out.print("--------------------\n");
                        for (int j = 0; j <= 2; j++) {
                            System.out.print(" | " + game[i][j] + " | ");
                            if (j == 2) {
                                System.out.print("\n");
                            }
                        }
                        if (i == 2) {
                            System.out.print(""
                                    + "====================\n");
                        }
                    }
                    //laço das jogadas//
                    lo = 10;
                    //-------------------------//

                    //(line)[1] - (column)[x]// 
                } else if ((game[1][0].equals(game[1][1]) && game[1][0].equals(game[1][2])) || (game[1][2].equals(game[1][1]) && game[1][2].equals(game[1][0]))) {
                    System.out.print("°°ººººººººººººººººººººººººººººººººººººº\nO " + player2name + " (" + usuario2 + ") é o vencedor!!!!!!!!!!!!\n°°ººººººººººººººººººººººººººººººººººººº\n");
                    for (int i = 0; i <= 2; i++) {
                        System.out.print("--------------------\n");
                        for (int j = 0; j <= 2; j++) {
                            System.out.print(" | " + game[i][j] + " | ");
                            if (j == 2) {
                                System.out.print("\n");
                            }
                        }
                        if (i == 2) {
                            System.out.print(""
                                    + "====================\n");
                        }
                    }
                    //laço das jogadas//
                    lo = 10;
                    //-------------------------//
                    //(line)[2] - (column)[2]// 
                } else if ((game[2][0].equals(game[2][1]) && game[2][0].equals(game[2][2])) || (game[2][2].equals(game[2][1]) && game[2][2].equals(game[2][0]))) {
                    System.out.print("°°ººººººººººººººººººººººººººººººººººººº\nO " + player2name + " (" + usuario2 + ") é o vencedor!!!!!!!!!!!!\n°°ººººººººººººººººººººººººººººººººººººº\n");
                    for (int i = 0; i <= 2; i++) {
                        System.out.print("--------------------\n");
                        for (int j = 0; j <= 2; j++) {
                            System.out.print(" | " + game[i][j] + " | ");
                            if (j == 2) {
                                System.out.print("\n");
                            }
                        }
                        if (i == 2) {
                            System.out.print(""
                                    + "====================\n");
                        }
                    }
                    //laço das jogadas//
                    lo = 10;
                    //-------------------------//
                    //-----------------------------------------------------//

                    //LINE VERTICAL//
                    //(line)[x] - (column)[0]// 
                } else if ((game[0][0].equals(game[1][0]) && game[0][0].equals(game[2][0])) || (game[2][0].equals(game[1][0]) && game[2][0].equals(game[0][0]))) {
                    System.out.print("°°ººººººººººººººººººººººººººººººººººººº\nO " + player2name + " (" + usuario2 + ") é o vencedor!!!!!!!!!!!!\n°°ººººººººººººººººººººººººººººººººººººº\n");
                    for (int i = 0; i <= 2; i++) {
                        System.out.print("--------------------\n");
                        for (int j = 0; j <= 2; j++) {
                            System.out.print(" | " + game[i][j] + " | ");
                            if (j == 2) {
                                System.out.print("\n");
                            }
                        }
                        if (i == 2) {
                            System.out.print(""
                                    + "====================\n");
                        }
                    }
                    //laço das jogadas//
                    lo = 10;
                    //-------------------------//
                    //(line)[x] - (column)[1]// 
                } else if ((game[0][1].equals(game[1][1]) && game[0][1].equals(game[2][1])) || (game[2][1].equals(game[1][1]) && game[2][1].equals(game[0][1]))) {
                    System.out.print("°°ººººººººººººººººººººººººººººººººººººº\nO " + player2name + " (" + usuario2 + ") é o vencedor!!!!!!!!!!!!\n°°ººººººººººººººººººººººººººººººººººººº\n");
                    for (int i = 0; i <= 2; i++) {
                        System.out.print("--------------------\n");
                        for (int j = 0; j <= 2; j++) {
                            System.out.print(" | " + game[i][j] + " | ");
                            if (j == 2) {
                                System.out.print("\n");
                            }
                        }
                        if (i == 2) {
                            System.out.print(""
                                    + "====================\n");
                        }
                    }
                    //laço das jogadas//
                    lo = 10;
                    //-------------------------//
                    //(line)[x] - (column)[2]// 
                } else if ((game[0][2].equals(game[1][2]) && game[0][2].equals(game[2][2])) || (game[2][2].equals(game[1][2]) && game[2][2].equals(game[0][2]))) {
                    System.out.print("°°ººººººººººººººººººººººººººººººººººººº\nO " + player2name + " (" + usuario2 + ") é o vencedor!!!!!!!!!!!!\n°°ººººººººººººººººººººººººººººººººººººº\n");
                    for (int i = 0; i <= 2; i++) {
                        System.out.print("--------------------\n");
                        for (int j = 0; j <= 2; j++) {
                            System.out.print(" | " + game[i][j] + " | ");
                            if (j == 2) {
                                System.out.print("\n");
                            }
                        }
                        if (i == 2) {
                            System.out.print(""
                                    + "====================\n");
                        }
                    }
                    //laço das jogadas//
                    lo = 10;
                    //-------------------------//
                    //(diagonal's line)//
                } else if ((game[0][0].equals(game[1][1]) && game[0][0].equals(game[2][2])) || (game[2][2].equals(game[1][1]) && game[2][2].equals(game[0][0]))) {
                    System.out.print("°°ººººººººººººººººººººººººººººººººººººº\nO " + player2name + " (" + usuario2 + ") é o vencedor!!!!!!!!!!!!\n°°ººººººººººººººººººººººººººººººººººººº\n");
                    for (int i = 0; i <= 2; i++) {
                        System.out.print("--------------------\n");
                        for (int j = 0; j <= 2; j++) {
                            System.out.print(" | " + game[i][j] + " | ");
                            if (j == 2) {
                                System.out.print("\n");
                            }
                        }
                        if (i == 2) {
                            System.out.print(""
                                    + "====================\n");
                        }
                    }
                    //laço das jogadas//
                    lo = 10;
                    //-------------------------//
                } else if ((game[0][2].equals(game[1][1]) && game[0][2].equals(game[2][0])) || (game[2][0].equals(game[1][1]) && game[2][0].equals(game[0][2]))) {
                    System.out.print("°°ººººººººººººººººººººººººººººººººººººº\nO " + player2name + " (" + usuario2 + ") é o vencedor!!!!!!!!!!!!\n°°ººººººººººººººººººººººººººººººººººººº\n");
                    for (int i = 0; i <= 2; i++) {
                        System.out.print("--------------------\n");
                        for (int j = 0; j <= 2; j++) {
                            System.out.print(" | " + game[i][j] + " | ");
                            if (j == 2) {
                                System.out.print("\n");
                            }
                        }
                        if (i == 2) {
                            System.out.print(""
                                    + "====================\n");
                        }
                    }
                    //laço das jogadas//
                    lo = 10;
                    //-------------------------//
                    //==============================//
                    //VERIFICAÇÃO DE EMPATE//
                }
            }
            //==============================//
            lo++;
        }
    }
}
