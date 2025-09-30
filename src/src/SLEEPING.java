public class SLEEPING extends FsmNode{
    public SLEEPING(AbstractCharacter character){
        super("SLEEPING", "Dormindo. . .", "Bateu um sono. . .","", character);
    }

    public void Enter(){
        INState();
    }

    public void Execute(){
        character.addHunger(1);
        character.addFatigue(-10);

        if (character.getFatigue() <= 0) {
            character.setFatigue(0);
            if (character.getHunger() <= 10) {
                character.changeState(new WORKING(character));
            } else {
                character.changeState(new EATING(character));
            }
        }
        else{CurrentState();}
    }

    public void Leave(){
        OUTState();
    }
}
