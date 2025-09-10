//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int hunger = 0;
        int fatigue = 0;

        FsmNode state = new WORKING();
        final int TICKS_PER_SECOND = 1;
        final long SKIP_TICKS = 1000 / TICKS_PER_SECOND;

        while (true){
            long startTime = System.currentTimeMillis();

            switch (state.GetType()){
                case "WORKING": //Working
                    hunger += 2;
                    fatigue += 5;
                    if (fatigue > 50){
                        state = new SLEEPING();
                        state.INState();
                        break;
                    }
                    else if (hunger > 10) {
                        state = new EATING();
                        state.INState();
                        break;
                    }
                    else {
                        state.CurrentState();
                        break;
                    }
                case "EATING": //Eating
                    hunger -= 5;
                    if (hunger <= 0){
                        hunger = 0;
                        state.OUTState();
                        state = new WORKING();
                        state.INState();
                        break;
                    }
                    else {
                        state.CurrentState();
                        break;
                    }

                case "SLEEPING": //Sleeping
                    hunger += 1;
                    fatigue -= 10;
                    state.CurrentState();
                    if (fatigue <= 0){
                        fatigue = 0;
                        if (hunger <= 10){
                            state = new WORKING();
                            state.INState();
                            break;
                        }
                        else if ( hunger > 10){
                            state = new EATING();
                            state.INState();
                            break;
                        }
                    }
                    else {
                        state.CurrentState();
                        break;
                    }

                default:
                    System.out.println("Sem Estado");
                    break;
            }

            System.out.println("\n" + "Fome: " + hunger);
            System.out.println("Cansaço: " + fatigue);

            long elapsed = System.currentTimeMillis() - startTime;
            long sleepTime = SKIP_TICKS - elapsed;

            if (sleepTime > 0)
            {
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e){ e.printStackTrace();}
            }
        }

    }
}