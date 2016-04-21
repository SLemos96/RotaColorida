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
public class Vertice {

    private int id;
    private Aresta[] chegada;
    private Aresta[] saida;

    public Vertice(int id) {

        this.id = id;
        chegada = new Aresta[2];
        saida = new Aresta[2];

        if (id == 1) {
            chegada[0] = new Aresta(14, 1);
            chegada[1] = new Aresta(11, 1);
            saida[0] = new Aresta(13, 2);
            saida[1] = new Aresta(10, 4);
        }

        if (id == 2) {
            chegada[0] = new Aresta(13, 2);
            chegada[1] = new Aresta(12, 2);
            saida[0] = new Aresta(15, 5);
            saida[1] = new Aresta(16, 6);
        }

        if (id == 3) {
            chegada[0] = new Aresta(8, 3);
            chegada[1] = new Aresta(9, 3);
            saida[0] = new Aresta(11, 1);
            saida[1] = new Aresta(12, 2);
        }

        if (id == 4) {
            chegada[0] = new Aresta(7, 4);
            chegada[1] = new Aresta(10, 4);
            saida[0] = new Aresta(9, 3);
            saida[1] = new Aresta(6, 8);
        }

        if (id == 5) {
            chegada[0] = new Aresta(1, 5);
            chegada[1] = new Aresta(15, 5);
            saida[0] = new Aresta(2, 8);
            saida[1] = new Aresta(14, 1);
        }

        if (id == 6) {
            chegada[0] = new Aresta(3, 6);
            chegada[1] = new Aresta(16, 6);
            saida[0] = new Aresta(4, 7);
            saida[1] = new Aresta(1, 5);
        }

        if (id == 7) {
            chegada[0] = new Aresta(4, 7);
            chegada[1] = new Aresta(5, 7);
            saida[0] = new Aresta(7, 4);
            saida[1] = new Aresta(8, 3);
        }

        if (id == 8) {
            chegada[0] = new Aresta(2, 8);
            chegada[1] = new Aresta(6, 8);
            saida[0] = new Aresta(3, 6);
            saida[1] = new Aresta(5, 7);
        }

    }

    public boolean procura_rota(boolean[] alg) {

        Vertice atual;
        Vertice finaal = null;

        for (int passo_v = 1; passo_v <= 8; passo_v++) {
            
            atual = new Vertice(passo_v);

            //System.out.print(atual.getId());
            System.out.print(atual.getId());
            for (int passo_alg = 0; passo_alg < 9; passo_alg++) {

                //System.out.println("alg["+ passo_alg + "] " + alg[passo_alg] + "         " + passo_v + " pv " + passo_alg + " pa");
                atual = atual.walking(alg[passo_alg]);
                
                System.out.print(atual.getId());
            }
            System.out.println("\n");
            
            if (passo_v >= 2 && atual != finaal) {
                return false;
            } else {
                finaal = atual;
            }
            
            //System.out.println("\n\n");

        }
        return true;

    }

    public Aresta get_saida0() {
        return saida[0];
    }

    public Aresta get_saida1() {
        return saida[1];
    }

    public int getId() {
        return this.id;
    }

    private Vertice setId(int i) {
        return new Vertice(i);
    }

    private Vertice walking(boolean alg) {
        if (this.get_saida0().getColor() == alg) {
            //System.out.println("retorna0 " + get_saida0().getVertice_saida());
            return new Vertice(get_saida0().getVertice_saida());
        } else {
            //System.out.println("retorna1 " + get_saida1().getVertice_saida());
            return new Vertice(get_saida1().getVertice_saida());
        }
    }

}
