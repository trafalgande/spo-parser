import java.util.List;

public class PathDTO {
    String actualPath;
    List<SubCondDTO> conds;
    List<Integer> operators;
    Integer cond_n;

    public PathDTO(String actualPath, List<SubCondDTO> conds, List<Integer> operators, int cond_n) {
        this.actualPath = actualPath;
        this.conds = conds;
        this.operators = operators;
        this.cond_n = cond_n;
    }

    public PathDTO(String actualPath) {
        this.actualPath = actualPath;
    }

    public List<Integer> getOperators() {
        return operators;
    }

    public void setOperators(List<Integer> operators) {
        this.operators = operators;
    }

    public String getActualPath() {
        return actualPath;
    }

    public void setActualPath(String actualPath) {
        this.actualPath = actualPath;
    }

    public List<SubCondDTO> getConds() {
        return conds;
    }

    public void setConds(List<SubCondDTO> conds) {
        this.conds = conds;
    }

    public int getCond_n() {
        return cond_n;
    }

    public void setCond_n(int cond_n) {
        this.cond_n = cond_n;
    }
}
