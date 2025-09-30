public class Juca extends AbstractCharacter {
    private FsmNode currentState;

    public Juca(){
        currentState = new WORKING(this);
        currentState.Enter();
    }

    @Override
    public void Update(){
        currentState.Execute();
    }

    @Override
    public void changeState(FsmNode newState){
        currentState.Leave();
        currentState = newState;
        currentState.Enter();
    }



}
