import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JsonDTO {
    private String cmd;
    private String param;
    private String path;
    private String nelem;
    private List sub_cond;
    private List global_sign;

    public JsonDTO(String cmd, String param, String path, String nelem, List sub_cond, List global_sign) {
        this.cmd = cmd;
        this.param = param;
        this.path = path;
        this.nelem = nelem;
        this.sub_cond = sub_cond;
        this.global_sign = global_sign;
    }

    public JsonDTO() {
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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getNelem() {
        return nelem;
    }

    public void setNelem(String nelem) {
        this.nelem = nelem;
    }

    public List getSub_cond() {
        return sub_cond;
    }

    public void setSub_cond(List sub_cond) {
        this.sub_cond = sub_cond;
    }

    public List getGlobal_sign() {
        return global_sign;
    }

    public void setGlobal_sign(List global_sign) {
        this.global_sign = global_sign;
    }

    public void append(SubCondDTO item) {
        if (this.getSub_cond() == null) {
            this.setSub_cond(new ArrayList());
        }
        this.getSub_cond().add(item);
    }
}
