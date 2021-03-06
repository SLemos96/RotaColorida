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
        int lin=0;
        int col = 0;
        int auxiliar;
        
        preencheMatrizPossibilidades(lin, alfa);

        boolean line[] = new boolean[9]; // criando uma linha, para testar a solução
        boolean rotas[][] = new boolean[8][9]; // criando uma matriz para armazenar todas as soluções
        Vertice[] paper = new Vertice[8]; // criando 8 vértices para caminhar

        criaVertices(paper);

        cacaSolucoes(lin, col, line, alfa, paper, rotas);
        
        imprimeRotas(rotas);
        Windows janela = new Windows(rotas);
        janela.setVisible(true);
        
    }

    private static void cacaSolucoes(int lin, int col, boolean[] line, boolean[][] alfa, Vertice[] paper, boolean[][] rotas) {
        for (lin = 0; lin < 512; lin++) {
            for (col = 0; col < 9; col++) {
                line[col] = alfa[lin][col];
            }

            /*for (int i = 0; i <= 8; i++) {
            
            if (line[i] == false) {
            System.out.print("0");
            } else {
            System.out.print("1");
            }
            }*/
            //System.out.println("\n");

            switch(paper[1].procura_rota(line)){
                case 0:
                    for(int i = 0; i<9; i++){
                        rotas[0][i] = line[i];
                    }
                    break;
                case 1:
                    for(int i = 0; i<9; i++){
                        rotas[1][i] = line[i];
                    }
                    break;
                case 2:
                    for(int i = 0; i<9; i++){
                        rotas[2][i] = line[i];
                    }
                    break;
                case 3:
                    for(int i = 0; i<9; i++){
                        rotas[3][i] = line[i];
                    }
                    break;
                case 4:
                    for(int i = 0; i<9; i++){
                        rotas[4][i] = line[i];
                    }
                    break;
                case 5:
                    for(int i = 0; i<9; i++){
                        rotas[5][i] = line[i];
                    }
                    break;
                case 6:
                    for(int i = 0; i<9; i++){
                        rotas[6][i] = line[i];
                    }
                    break;
                case 7:
                    for(int i = 0; i<9; i++){
                        rotas[7][i] = line[i];
                    }
                    break;
            }
        }
    }

    private static void preencheMatrizPossibilidades(int lin, boolean[][] alfa) {
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
    }

    private static void criaVertices(Vertice[] paper) {
        paper[0] = new Vertice(1);
        paper[1] = new Vertice(2);
        paper[2] = new Vertice(3);
        paper[3] = new Vertice(4);
        paper[4] = new Vertice(5);
        paper[5] = new Vertice(6);
        paper[6] = new Vertice(7);
        paper[7] = new Vertice(8);
    }

    private static void imprimeRotas(boolean[][] rotas) {
        for(int i=0; i<8; i++){
            System.out.print("Rota para o vertice "+i+" :");
            for(int j=0; j<9; j++){
                if(rotas[i][j])
                    System.out.print("A ");
                else
                    System.out.print("V ");
            }
            System.out.println("");
        }
    }

}
