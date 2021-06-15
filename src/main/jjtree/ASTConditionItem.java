public class ASTConditionItem extends SimpleNode {

    private String name;

    public ASTConditionItem(int i) {
        super(i);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Right Item: " + name;
    }
}