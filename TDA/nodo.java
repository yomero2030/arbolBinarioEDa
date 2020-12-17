package TDA;

public class nodo {

    Fruta frut;
    nodo der;
    nodo izq;

    nodo(Fruta frut){
        this.frut = frut;
        this.der = null;
        this.izq = null;
    }

}
