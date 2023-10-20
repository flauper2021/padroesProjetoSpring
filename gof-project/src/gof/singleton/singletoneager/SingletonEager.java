package gof.singleton.singletoneager;

/**
     * Singleton "apressado".
     * 
     * @author Mauricio Juica
     */   

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }

}
