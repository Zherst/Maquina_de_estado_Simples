public class EATING extends FsmNode{
    public EATING(AbstractCharacter character){
        super("EATING", "Comendo. . .", "Bateu uma fome. . .", "Ufa! Já estou cheio. . .", character);
    }

    public void Enter(){
        INState();
    }
    @Override
    public void Execute(){
        character.addHunger(-5);
        if (character.getHunger() <= 0){
            character.setHunger(0);
            character.changeState(new WORKING(character));
        }
        else {
            CurrentState();
        }
    }

    public void Leave(){
        OUTState();
    }
}
