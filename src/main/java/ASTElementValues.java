public class ASTElementValues extends SimpleNode {
    private String name;

    public ASTElementValues(int i) {
        super(i);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "New element:";
    }
}
