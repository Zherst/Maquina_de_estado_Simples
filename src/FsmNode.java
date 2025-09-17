import java.io.OutputStream;

public abstract class FsmNode implements State {
    protected Juca juca;


    private String type;
    private String current;
    private String in;
    private String out;

    public String GetType(){return type;}

    public FsmNode(String type, String current, String in, String out, Juca juca){
        this.type = type;
        this.current = current;
        this.in = in;
        this.out = out;
        this.juca = juca;
    }

    @Override
    public void Enter(){}

    @Override
    public void Execute(){}

    @Override
    public void Leave(){}

    public void CurrentState(){System.out.println("\n" + current);}

    public void INState(){System.out.println("\n" + in);}

    public void OUTState(){System.out.println("\n" + out);}





}
