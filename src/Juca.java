public class Juca {
    public int hunger = 0; int fatigue;
    private FsmNode currentState;

    public Juca(){
        currentState = new WORKING(this);
        currentState.Enter();
    }

    public void doAction(){
        currentState.Execute();
        System.out.println("Hunger:" + hunger);
        System.out.println("Fatigue:" + fatigue);
    }

    public void changeState(FsmNode newState){
        currentState.Leave();
        currentState = newState;
        currentState.Enter();
    }
}
