import gof.facade.Facade;
import gof.singleton.singletoneager.SingletonEager;
import gof.singleton.singletonlazy.SingletonLazy;
import gof.singleton.singletonlazyholder.SingletonLazyHolder;
import gof.strategy.ComportamenteDefensivo;
import gof.strategy.ComportamentoAgressivo;
import gof.strategy.ComportamentoNormal;
import gof.strategy.Robo;

public class App {

    
    public static void main(String[] args) throws Exception {

        //Singleton:
        
        System.out.println("\n Teste singleton Lazy: \n");        
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy+"\n");

        System.out.println("\n Teste singleton Eager: \n");        
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager+"\n");

        System.out.println("\n Teste singleton Lazy Holder: \n");        
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder+"\n");
        

        //Strategy:

        ComportamentoNormal normal = new ComportamentoNormal();
        ComportamenteDefensivo defensivo = new ComportamenteDefensivo();
        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.SetComportamento(normal);
        robo.mover();
        robo.mover();
        robo.SetComportamento(defensivo);
        robo.mover();
        robo.SetComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.SetComportamento(normal);
        robo.mover();
        

        //Facade:

        Facade facade = new Facade();
        System.out.println("\n Teste facade:\n");
        facade.migrarCliente("Vanilton", "38052355");


    }
}
