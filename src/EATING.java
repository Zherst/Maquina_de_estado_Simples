public class EATING extends FsmNode{
    public EATING(Juca juca){
        super("EATING", "Comendo. . .", "Bateu uma fome. . .", "Ufa! Já estou cheio. . .", juca);
    }

    public void Enter(){
        INState();
    }
    @Override
    public void Execute(){
        juca.hunger -= 5;
        if (juca.hunger <= 0){
            juca.hunger = 0;
            juca.changeState(new WORKING(juca));
        }
        else {
            CurrentState();
        }
    }

    public void Leave(){
        OUTState();
    }
}
