public class ASTasterisk extends SimpleNode {

    private String name;

    public ASTasterisk(int i) {
        super(i);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "asterisk: " + name;
    }
}
