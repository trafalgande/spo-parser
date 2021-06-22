public class ASTSubElementValue extends SimpleNode {
    private String name;

    public ASTSubElementValue(int i) {
        super(i);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Element values";
    }
}
