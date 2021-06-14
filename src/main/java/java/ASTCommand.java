public class ASTCommand extends SimpleNode {

    private String name;

    public ASTCommand(int i) {
        super(i);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Command: " + name;
    }

}
