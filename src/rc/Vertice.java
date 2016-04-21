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
            chegada[1] = new Aresta(5,7);
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
        Vertice inicial;

        int i = 1;
        while(i < 9){
            
            inicial = new Vertice(i);
            atual = inicial;
            
            System.out.println(inicial.getId()+ " inicial id "+ atual.getId() + " atual id");
            
            for(int j = 1; j < 9; j++){
                
                System.out.println("alg["+ j + "] " + alg[j]);
                atual = atual.walking(alg[j]);
            }
            
            if(atual.equals(inicial))
                i++;
            
            else
                return false;
            
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
        if(this.get_saida0().getColor() == alg){
            System.out.println("retorna0 " + get_saida0().getVertice_saida());
            return new Vertice(get_saida0().getVertice_saida());
        }
        else{
            System.out.println("retorna1 " + get_saida1().getVertice_saida());
            return new Vertice(get_saida1().getVertice_saida());
        }
    }

}
