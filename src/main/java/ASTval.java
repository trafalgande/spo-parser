public class ASTval extends SimpleNode {

    private String name;

    public ASTval(int i) {
        super(i);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "value: " + name;
    }

}