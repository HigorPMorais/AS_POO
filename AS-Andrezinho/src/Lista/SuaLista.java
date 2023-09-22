package Lista;

import java.util.List;

public interface SuaLista<E> extends List{
    public void exibirLista();
    public void exibirListaOrdenada();
    public void ordenar();
    public void ordenarDecrescente();
    public E pesquisar(String chaveBusca);
    public E pesquisarPorVariasChaves(String chaveBusca);
    public ListaGenerica<?> filtrar(String chaveBusca);
    public ListaGenerica<?> filtrarPorVariasChaves(String chaveBusca);
}
