public abstract class AbstractCharacter implements Character{
    private int hunger, fatigue;

    public void printStats(){
        System.out.println("Hunger:" + hunger);
        System.out.println("Fatigue:" + fatigue);
    }

    public void Update(){}
    public void changeState(FsmNode fsmNode){}

    public void addHunger(int add){hunger += add;}
    public void addFatigue(int add){fatigue += add;}

    public void setHunger(int hunger) { this.hunger = hunger; }
    public void setFatigue(int fatigue) { this.fatigue = fatigue; }

    public int getHunger() {return hunger;}
    public int getFatigue() {return fatigue;}

}
