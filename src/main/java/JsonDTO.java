import java.util.ArrayList;
import java.util.List;

public class JsonDTO {
    private String cmd;
    private String param;
    private Integer paths_n;
    private List paths;
    private List global_sign;
    private ElementDTO nelem;
    private int from_root = 1;

    public int getFrom_root() {
        return from_root;
    }

    public void setFrom_root(int from_root) {
        this.from_root = from_root;
    }

    public JsonDTO() {
    }

    public Integer getPaths_n() {
        return paths_n;
    }

    public void setPaths_n(Integer paths_n) {
        this.paths_n = paths_n;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public ElementDTO getNelem() {
        return nelem;
    }

    public void setNelem(ElementDTO nelem) {
        this.nelem = nelem;
    }

    public List getGlobal_sign() {
        return global_sign;
    }

    public void setGlobal_sign(List global_sign) {
        this.global_sign = global_sign;
    }

    public List getPaths() {
        return paths;
    }

    public void setPaths(List paths) {
        this.paths = paths;
    }

    public void append(PathDTO item) {
        if (this.getPaths() == null) {
            this.setPaths(new ArrayList());
        }
        this.getPaths().add(item);
    }
}
