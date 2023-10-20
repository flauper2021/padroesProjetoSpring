package gof.strategy;

public class Robo {

    private Comportamento comportamento;

    public void SetComportamento(Comportamento comportamento){
        this.comportamento = comportamento;
    }

    public void mover(){
        comportamento.mover();
    }
    
}
