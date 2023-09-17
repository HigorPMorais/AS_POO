package Lista;

import java.util.ArrayList;

public interface SuaLista<E>{
    public void exibirLista(ArrayList<?> lista);
    public void ordenarLista(ArrayList<E> lista);
    public E pesquisar(String chaveBusca);
    public void filtrar(String chaveBusca);
}
