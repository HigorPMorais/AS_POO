package Lista;

import java.util.ArrayList;
import java.util.Collections;
import modelo.*;
import util.Input;

public class ListaGenerica<E extends IConsulta & IExibirInformacoes & Comparable> extends ArrayList<E>{

    public void exibirLista(ArrayList<E> lista){
        System.out.println("Digite qual opcao de exibicao que voce deseja:");
        System.out.println("0 - Sair do programa");
        System.out.println("1 - Exibir a lista");
        System.out.println("2 - Exibir a lista de forma ordenada");
        int exLis = Input.nextInt();
        
        System.out.println("");
        switch(exLis){
            case 1 -> {
                for (E elemento : this) {  
                    elemento.exibirInformacoes();
                }
                System.out.println("Total de registros: "+size());
                break;
            }
            case 2 -> {
                Collections.sort(lista);
                for (E elemento : this) {  
                    elemento.exibirInformacoes();
                }
                System.out.println("Total de registros: "+size());
                break;
            }
        }
        
    }
    
    public void ordenarLista(ArrayList<E> lista){
        System.out.println("Digite qual tipo de ordenação você deseja:");
        System.out.println("0 - Sair do programa");
        System.out.println("1 - Ordenar lista Crescente");
        System.out.println("2 - Ordenar lista Decrescente");
        int exLis = Input.nextInt();
        
        System.out.println("");
        switch(exLis){
            case 1 -> {
                Collections.sort(lista);
            }
            case 2 -> {
                Collections.sort(lista, Collections.reverseOrder());
            }
        }
    }

    public E pesquisarLista(String chaveBusca){
        chaveBusca = chaveBusca.toLowerCase();
        System.out.println("Digite qual tipo de pesquisa você deseja:");
        System.out.println("0 - Sair do programa");
        System.out.println("1 - Pesquisar por uma chave");
        System.out.println("2 - Pesquisar por duas chave");
        int exLis = Input.nextInt();
        
        System.out.println("");
        switch(exLis){
            case 1 -> {
                for (E elemento : this) {
                    if(elemento.getChavePrincipal() instanceof String){
                        String chaveP = (String) elemento.getChavePrincipal();

                        if(chaveP.equalsIgnoreCase(chaveBusca)){
                            return elemento;
                        }
                    }
                }
                    }
            case 2 -> {
                for (E elemento : this) {
                    if(elemento.getChavePrincipal() instanceof String && 
                            elemento.getChaveSecundaria() instanceof String){
                        String chaveP = (String) elemento.getChavePrincipal();
                        String chaveS = (String) elemento.getChaveSecundaria();

                        if(chaveP.equalsIgnoreCase(chaveBusca) ||
                                chaveS.equalsIgnoreCase(chaveBusca)){
                            return elemento;
                        }
                    }
                    else if(elemento.getChavePrincipal().equals(chaveBusca)
                            || elemento.getChaveSecundaria().equals(chaveBusca)){
                        return elemento;
                       }
                }
            }
        }
        return null;
    }

    //Filtro utilizar o for do pesquisa, porém exibir mais de um.
    
    public void filtrar(){
        
    }
}
