public class WORKING extends FsmNode implements State{

    public WORKING(AbstractCharacter character){
        super("WORKING","Trabalhando. . .", "Hora de ir para o Trabalho", "", character);
    }

    public void Enter(){
        INState();
    }
    @Override
    public void Execute(){
        character.addHunger(2);
        character.addFatigue(5);
        if (character.getFatigue() > 50){
            character.changeState(new SLEEPING(character));
        }
        else if (character.getHunger() > 10) {
            character.changeState(new EATING(character));
        }
        else {
            CurrentState();
        }
    }
    public void Leave(){
        OUTState();
    }
}
