package Lista;

import java.util.ArrayList;

public interface SuaLista<E>{
    public void exibirLista(ArrayList<?> lista);
    public E pesquisar(String chaveBusca);
}
