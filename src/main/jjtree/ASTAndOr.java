public class ASTAndOr extends SimpleNode {

    private String name;

    public ASTAndOr(int i) {
        super(i);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Command: " + name;
    }
}