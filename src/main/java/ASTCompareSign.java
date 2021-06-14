public class ASTCompareSign extends SimpleNode {

    private String name;

    public ASTCompareSign(int i) {
        super(i);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Sign: " + name;
    }

}
