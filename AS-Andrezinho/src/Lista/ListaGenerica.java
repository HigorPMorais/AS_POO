package Lista;

import java.util.ArrayList;
import java.util.Collections;
import modelo.*;
import util.Input;

public class ListaGenerica<E extends IConsulta & IExibirInformacoes & Comparable> extends ArrayList<E>{

    public void exibirLista(ArrayList<E> lista){
        System.out.println("Digite qual opcao de exibicao que voce deseja:");
        System.out.println("0 - Sai do programa");
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
    
    public E pesquisar(String chaveBusca){
        chaveBusca = chaveBusca.toLowerCase();
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
        return null;
    }
}
