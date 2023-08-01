
package listaLigada;


public class ListaLigada {
    
    private Nodo primeiro;
    private Nodo ultimo;
    private int tamanho;

    public ListaLigada() {
        this.tamanho = 0;
    }

    public Nodo getPrimeiro() {
        return primeiro;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }
    
    public void adicionar(Nodo nodo) {
        //Adiciona novo nó na lista, apontando pro próximo
        if (this.primeiro == null && this.ultimo == null) {

            //Primeiro não tem próximo, então, vale null
            nodo.setProximo(null);
            this.primeiro = nodo;
            this.ultimo = nodo;
        } else {
            //Primeiro aponta pro próximo
            this.ultimo.setProximo(nodo);
            this.ultimo = nodo;
        }

        this.tamanho++;
    }
        
    public void remover (String valor){
        //Continuar...
    }
        
    public Nodo get (int posicao){
        
        //Lista Ligada começa do primeiro nó
        Nodo atual = this.primeiro;
        
        //Percorre até a posição desejada, encontrado o próximo do nodo atual
        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) atual = atual.getProximo();
        }
        
        return atual;
    }
        
}
