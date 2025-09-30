import java.lang.Character;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        ArrayList<AbstractCharacter> characters = new ArrayList<>();
        characters.add(new Juca());
        while (true){
            for (AbstractCharacter c: characters) {
                c.Update();
                c.printStats();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}