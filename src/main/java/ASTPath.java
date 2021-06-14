public class ASTPath extends SimpleNode {

    private String name;

    public ASTPath(int i) {
        super(i);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Path: " + name;
    }

}
