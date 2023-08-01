package listaLigada;


public class Main {

    public static void main(String[] args) {
        
        //Criando uma ListaLigada
        ListaLigada lista = new ListaLigada();
        
        //Adicionando elementos a ListaLigada
        lista.adicionar(new Nodo("Brasil"));
        lista.adicionar(new Nodo("Egito"));
        lista.adicionar(new Nodo("França"));
        
        
    }
}

