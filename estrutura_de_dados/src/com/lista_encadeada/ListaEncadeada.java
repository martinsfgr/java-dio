package estrutura_de_dados.src.com.lista_encadeada;

public class ListaEncadeada<T> {
    No<T> referenciaEntrada;

    public void listaEncadeada() {
        this.referenciaEntrada = null;
    }

    public int size() {
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;

        while(true) {
            if(referenciaAux != null){
                tamanhoLista++;
                if(referenciaAux.getProximoNo() != null) {
                    referenciaAux = referenciaAux.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return tamanhoLista;
    }

    public boolean isEmpty() {
        return referenciaEntrada == null;
    }
}
