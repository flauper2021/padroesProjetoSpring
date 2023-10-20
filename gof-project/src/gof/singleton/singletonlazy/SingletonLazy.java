package gof.singleton.singletonlazy;

public class SingletonLazy {

    /**
     * Singleton "preguiçoso".
     * 
     * @author Mauricio Juica
     */
    
    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }

}
