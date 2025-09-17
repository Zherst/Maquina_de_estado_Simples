public class WORKING extends FsmNode implements State{

    public WORKING(Juca juca){
        super("WORKING","Trabalhando. . .", "Hora de ir para o Trabalho", "", juca);
    }

    public void Enter(){
        INState();
    }
    @Override
    public void Execute(){
        juca.hunger += 2;
        juca.fatigue += 5;
        if (juca.fatigue > 50){
            juca.changeState(new SLEEPING(juca));
        }
        else if (juca.hunger > 10) {
            juca.changeState(new EATING(juca));
        }
        else {
            CurrentState();

        }
    }
    public void Leave(){
        OUTState();
    }
}
