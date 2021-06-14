public class ASTDirOrNode extends SimpleNode {
    private String name;

    public ASTDirOrNode(int i) {
        super(i);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Param: " + name;
    }

}
