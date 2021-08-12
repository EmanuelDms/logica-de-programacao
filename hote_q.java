package Q2_hotel;

import javax.swing.JOptionPane;

public class hote_q {

    public static void main(String[] args) {
        String menu, a = "livre", o = "Ocupado", numLine, numCol;
        String hotel[][] = new String[6][11];

        /*variável de repetição da lista da OPÇÃO 1*/
        int laco_caso1 = 0;
        /*-------------------------------------------------------*/

        //declaração de livre todos os quartos//
        int p = 1;
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 10; j++) {
                hotel[i][j] = a;
            }
        }
        //-------------------------------------------------//

        int laco_m = 0;
        JOptionPane.showMessageDialog(null, "BEM-VINDO � INAUGURA��O HOTEL CHEIRO DO QUEIJO");

        do {
            /* variável de repetição da OPÇÃO 2 do ANDAR DESEJADO*/
            int laco_caso2 = 0, laco_caso2_1 = 0;
            /* --------------------------------------------------------------------------*/

            menu = JOptionPane.showInputDialog("MENU\n"
                    + "1 - Imprimir a lista de quartos;\n"
                    + "2 - Definir a ocupação;\n"
                    + "3 - Sair;"
                    + "");
            switch (menu) {
                //OPÇÃO 1//
                case "1":
                    while (laco_caso1 == 0) {
                        System.out.print("LISTA DE QUARTOS:\n");
                        for (int i = 1; i <= 5; i++) {
                            System.out.print("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
                            System.out.print("| " + i + "� andar |");
                            for (int j = 1; j <= 10; j++) {
                                System.out.print(" Quarto " + j + ": " + hotel[i][j] + " | ");
                                if (j == 10) {
                                    System.out.println("");
                                }
                            }
                            if (i == 5) {
                                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                            }
                        }
                        laco_caso1++;
                    }
                    break;
                //OPÇÃO 2//
                case "2":
                    while (laco_caso2 == 0) {
                        numLine = JOptionPane.showInputDialog("Qual o n�mero do andar que voc� deseja ocupar?");
                        switch (numLine) {
                       //1º ANDAR//
                            case "1":
                                while (laco_caso2_1 == 0) {
                                    numCol = JOptionPane.showInputDialog("Qual o n�mero do quarto que voc� deseja ocupar?");
                                    switch (numCol) {
                                        case "1":
                                            if (hotel[1][1].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[1][1] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "2":
                                            if (hotel[1][2].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[1][2] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "3":
                                            if (hotel[1][3].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[1][3] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "4":
                                            if (hotel[1][4].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[1][4] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "5":
                                            if (hotel[1][5].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[1][5] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "6":
                                            if (hotel[1][6].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[1][6] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "7":
                                            if (hotel[1][7].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[1][7] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "8":
                                            if (hotel[1][8].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[1][8] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "9":
                                           if (hotel[1][9].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[1][9] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "10":
                                            if (hotel[1][10].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[1][10] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        default:
                                            JOptionPane.showMessageDialog(null, "DIGITE UM QUARTO V�LIDO!");
                                    }
                                }
                                break;
                           //=============================//
                                
                           //2º ANDAR//
                            case "2":
                               while (laco_caso2_1 == 0) {
                                    numCol = JOptionPane.showInputDialog("Qual o n�mero do quarto que voc� deseja ocupar?");
                                    switch (numCol) {
                                        case "1":
                                            if (hotel[2][1].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[2][1] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "2":
                                            if (hotel[2][2].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[2][2] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "3":
                                            if (hotel[2][3].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[2][3] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "4":
                                            if (hotel[2][4].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[2][4] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "5":
                                            if (hotel[2][5].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[2][5] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "6":
                                            if (hotel[2][6].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[2][6] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "7":
                                            if (hotel[2][7].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[2][7] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "8":
                                            if (hotel[2][8].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[2][8] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "9":
                                           if (hotel[2][9].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[2][9] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "10":
                                            if (hotel[2][10].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[2][10] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        default:
                                            JOptionPane.showMessageDialog(null, "DIGITE UM QUARTO V�LIDO!");
                                    }
                                }
                                break;
                            //=============================//
                            case "3":
                               while (laco_caso2_1 == 0) {
                                    numCol = JOptionPane.showInputDialog("Qual o n�mero do quarto que voc� deseja ocupar?");
                                    switch (numCol) {
                                        case "1":
                                            if (hotel[3][1].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[3][1] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "2":
                                            if (hotel[3][2].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[3][2] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "3":
                                            if (hotel[3][3].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[3][3] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "4":
                                            if (hotel[3][4].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[3][4] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "5":
                                            if (hotel[3][5].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[3][5] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "6":
                                            if (hotel[3][6].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[3][6] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "7":
                                            if (hotel[3][7].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[3][7] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "8":
                                            if (hotel[3][8].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[3][8] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "9":
                                           if (hotel[3][9].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[3][9] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "10":
                                            if (hotel[3][10].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[3][10] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        default:
                                            JOptionPane.showMessageDialog(null, "DIGITE UM QUARTO V�LIDO!");
                                    }
                                }
                                break;
                            case "4":
                               while (laco_caso2_1 == 0) {
                                    numCol = JOptionPane.showInputDialog("Qual o n�mero do quarto que voc� deseja ocupar?");
                                    switch (numCol) {
                                        case "1":
                                            if (hotel[4][1].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[4][1] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "2":
                                            if (hotel[4][2].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[4][2] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "3":
                                            if (hotel[4][3].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[4][3] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "4":
                                            if (hotel[4][4].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[4][4] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "5":
                                            if (hotel[4][5].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[4][5] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "6":
                                            if (hotel[4][6].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[4][6] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "7":
                                            if (hotel[4][7].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[4][7] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "8":
                                            if (hotel[4][8].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[4][8] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "9":
                                           if (hotel[4][9].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[4][9] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "10":
                                            if (hotel[4][10].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[4][10] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        default:
                                            JOptionPane.showMessageDialog(null, "DIGITE UM QUARTO V�LIDO!");
                                    }
                                }
                                break;
                            case "5":
                               while (laco_caso2_1 == 0) {
                                    numCol = JOptionPane.showInputDialog("Qual o n�mero do quarto que voc� deseja ocupar?");
                                    switch (numCol) {
                                        case "1":
                                            if (hotel[5][1].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[5][1] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "2":
                                            if (hotel[5][2].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[5][2] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "3":
                                            if (hotel[5][3].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[5][3] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "4":
                                            if (hotel[5][4].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[5][4] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "5":
                                            if (hotel[5][5].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[5][5] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "6":
                                            if (hotel[5][6].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[5][6] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "7":
                                            if (hotel[5][7].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[5][7] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "8":
                                            if (hotel[5][8].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[5][8] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "9":
                                           if (hotel[5][9].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[5][9] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        case "10":
                                            if (hotel[5][10].equals(o)) {
                                                JOptionPane.showMessageDialog(null, "ESTE QUARTO EST� OCUPADO!");
                                                break;
                                            }else{
                                                hotel[5][10] = o;
                                                laco_caso2_1++;
                                                laco_caso2++;
                                                laco_caso1 = 0;
                                                break;
                                            }
                                        default:
                                            JOptionPane.showMessageDialog(null, "DIGITE UM QUARTO V�LIDO!");
                                    }
                                }
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "DIGITE UM ANDAR V�LIDO");
                        }
                    }
                    break;

                //OPÇÃO 3 (SAIR)//
                case "3":
                    laco_m++;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "DIGITE UM VALOR V�LIDO!");
            }

        } while (laco_m
                == 0);
    }
}
