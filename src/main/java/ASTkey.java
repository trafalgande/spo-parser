public class ASTkey extends SimpleNode {

    private String name;

    public ASTkey(int i) {
        super(i);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "key: " + name;
    }

}