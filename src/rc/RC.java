/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc;

/**
 *
 * @author Reinaldo
 */
public class RC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        boolean alfa[][] = new boolean[512][9];
        int lin;
        int col;
        int auxiliar;
        for (lin = 0; lin < 512; lin++) {
            auxiliar = lin;
            //for(col = 0; col<9; col++)
            {
                if (auxiliar - 256 >= 0) {
                    alfa[lin][0] = true;
                    auxiliar -= 256;
                } else {
                    alfa[lin][0] = false;
                }

                if (auxiliar - 128 >= 0) {
                    alfa[lin][1] = true;
                    auxiliar -= 128;
                } else {
                    alfa[lin][1] = false;
                }

                if (auxiliar - 64 >= 0) {
                    alfa[lin][2] = true;
                    auxiliar -= 64;
                } else {
                    alfa[lin][2] = false;
                }

                if (auxiliar - 32 >= 0) {
                    alfa[lin][3] = true;
                    auxiliar -= 32;
                } else {
                    alfa[lin][3] = false;
                }

                if (auxiliar - 16 >= 0) {
                    alfa[lin][4] = true;
                    auxiliar -= 16;
                } else {
                    alfa[lin][4] = false;
                }

                if (auxiliar - 8 >= 0) {
                    alfa[lin][5] = true;
                    auxiliar -= 8;
                } else {
                    alfa[lin][5] = false;
                }

                if (auxiliar - 4 >= 0) {
                    alfa[lin][6] = true;
                    auxiliar -= 4;
                } else {
                    alfa[lin][6] = false;
                }

                if (auxiliar - 2 >= 0) {
                    alfa[lin][7] = true;
                    auxiliar -= 2;
                } else {
                    alfa[lin][7] = false;
                }

                if (auxiliar - 1 >= 0) {
                    alfa[lin][8] = true;
                    auxiliar -= 1;
                } else {
                    alfa[lin][8] = false;
                }
            }
        }

        boolean line[] = new boolean[9];
        Vertice[] paper = new Vertice[8];

        paper[0] = new Vertice(1);
        paper[1] = new Vertice(2);
        paper[2] = new Vertice(3);
        paper[3] = new Vertice(4);
        paper[4] = new Vertice(5);
        paper[5] = new Vertice(6);
        paper[6] = new Vertice(7);
        paper[7] = new Vertice(8);

        for (lin = 0; lin < 512; lin++) {
            for (col = 0; col < 9; col++) {
                line[col] = alfa[lin][col];
            }

            for (int i = 0; i < 8; i++) {

                if (line[i] == false) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println("\n");

            if (paper[lin].procura_rota(line)) {
                System.out.println("sucesso");
            } else {
                System.out.println("deu ruim com essa");
            }

            System.out.println("");
        }

    }

}
