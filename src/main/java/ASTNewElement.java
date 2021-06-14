public class ASTNewElement extends SimpleNode {

    private String name;

    public ASTNewElement(int i) {
        super(i);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "New Element: " + name;
    }

}