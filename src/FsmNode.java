import java.io.OutputStream;

public abstract class FsmNode {
    private String type;
    private String current;
    private String in;
    private String out;

    public String GetType(){return type;}

    public FsmNode(String type, String current, String in, String out){
        this.type = type;
        this.current = current;
        this.in = in;
        this.out = out;
    }

    public void CurrentState(){System.out.println("\n" + current);}

    public void INState(){System.out.println("\n" + in);}

    public void OUTState(){System.out.println("\n" + out);}





}
