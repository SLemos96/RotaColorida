/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc;

// true == azul
// false == red
/**
 *
 * @author Reinaldo
 */
public class Aresta {

    private int id;
    private boolean cor;
    private int id_vertice_dest;

    public Aresta(int id, int destino) {//, Vertice origem, Vertice id_vertice_dest) {

        this.id = id;
        //this.origem = origem;
        this.id_vertice_dest = destino;

        if (id == 1) 
            cor = true;

        if (id == 2)
            cor = true;
        
        if (id == 3)
            cor = false;
        
        if (id == 4)
            cor = false;
        
        if (id == 5)
            cor = true;
        
        if (id == 6)
            cor = true;
        
        if (id == 7)
            cor = true;
        
        if (id == 8)
            cor = false;
        
        if (id == 9)
            cor = false;
        
        if (id == 10)
            cor = true;
        
        if (id == 11)
            cor = false;
        
        if (id == 12)
            cor = true;
        
        if (id == 13)
            cor = false;
        
        if (id == 14)
            cor = false;
        
        if (id == 15)
            cor = false;
        
        if (id == 16)
            cor = true;
        
    }

    void setId(int i) {
        this.id = i;
    }

    public int getVertice_saida() {
        return this.id_vertice_dest;
    }

    public boolean getColor() {
        return this.cor;
    }

}
