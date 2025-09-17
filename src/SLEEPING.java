public class SLEEPING extends FsmNode{
    public SLEEPING(Juca juca){
        super("SLEEPING", "Dormindo. . .", "Bateu um sono. . .","", juca);
    }

    public void Enter(){
        INState();
    }

    public void Execute(){
        juca.hunger += 1;
        juca.fatigue -= 10;

        if (juca.fatigue <= 0) {
            juca.fatigue = 0;
            if (juca.hunger <= 10) {
                juca.changeState(new WORKING(juca));
            } else {
                juca.changeState(new EATING(juca));
            }
        }
        else{CurrentState();}
    }

    public void Leave(){
        OUTState();
    }
}
