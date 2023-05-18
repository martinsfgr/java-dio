package estrutura_de_dados.src.com.lista_encadeada;

public class ListaEncadeada<T> {
    No<T> referenciaEntrada;

    public void listaEncadeada() {
        this.referenciaEntrada = null;
    }

    public int size() {
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;

        while (true) {
            if (referenciaAux != null) {
                tamanhoLista++;
                if (referenciaAux.getProximoNo() != null) {
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

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()) {
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size()-1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        noAuxiliar.setProximoNo(novoNo);
    }

    private No<T> getNo(int index) {

        if (index >= size()) {
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index);
        }

        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i < this.size()-1; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        return noRetorno;
    }

    public T remove(int index) {
        No<T> noPivo = this.getNo(index);

        if (index == 0) {
            referenciaEntrada = noPivo.getProximoNo();
            return noPivo.getConteudo();
        }

        No<T> noAnterior = getNo(index-1);
        noAnterior.setProximoNo(noPivo.getProximoNo());

        return noPivo.getConteudo();
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    public boolean isEmpty() {
        return referenciaEntrada == null;
    }
}
