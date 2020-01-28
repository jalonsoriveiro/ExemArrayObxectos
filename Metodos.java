package exemarrayobxectos;
import meusmetodos.PedirDato;

/**
 *
 * @author jalonsoriveiro
 */
public class Metodos {
//Sobra en el metodo xogador    
    xogador[]xogadores = new Xogador[elementos()];
    
    public static int elementos(){
    
        System.out.println("Numero de xogadores");
    
        return PedirDato.PedirInt();       
        
    }        
    public Xogador[] crearArray(){    
        String nome;
        int dorsal;
        for(int i=0;i<xogadores.length;i++){
            nome=PedirDato.PedirString();
            dorsal = PedirDato.PedirInt();
            xogadores[i] = new Xogador(nome,dorsal);
            //SImplificado
            //xogadores[i] = new Xogador(PedirDato.PedirString(),PedirDato.PedirInt());                        
        }
    return xogadores;
    }
    public Xogador[] crearArrayProfe(Xogador[]xogadores){    
        String nome;
        int dorsal;
        for(int i=0;i<xogadores.length;i++){
            nome=PedirDato.PedirString();
            dorsal = PedirDato.PedirInt();
            xogadores[i] = new Xogador(nome,dorsal);
            //SImplificado
            //xogadores[i] = new Xogador(PedirDato.PedirString(),PedirDato.PedirInt());                        
        }
    return xogadores;
    }
    
    public void amosarArray(Xogador[]lista){
    
        for(Xogador elemento:lista)    
            System.out.println(elemento);    
    }
    
    
}
