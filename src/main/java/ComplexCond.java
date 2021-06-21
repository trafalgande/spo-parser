import java.util.List;

public class ComplexCond {

    private List<SubCondDTO> subCondList;

    public ComplexCond(List<SubCondDTO> subCondList) {
        this.subCondList = subCondList;
    }

    public ComplexCond() {
    }

    public List<SubCondDTO> getSubCondList() {
        return subCondList;
    }

    public void setSubCondList(List<SubCondDTO> subCondList) {
        this.subCondList = subCondList;
    }


}
