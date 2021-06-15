public class JsonDTO {
    public JsonDTO() {
    }

    public JsonDTO(String cmd, String param, String path, String nelem, String sign, String right) {
        this.cmd = cmd;
        this.param = param;
        this.path = path;
        this.nelem = nelem;
        this.sign = sign;
        this.right = right;
    }

    public String getCmd() {
        return cmd;
    }

    public String getParam() {
        return param;
    }

    public String getPath() {
        return path;
    }

    public String getNelem() {
        return nelem;
    }

    public String getSign() {
        return sign;
    }

    public String getRight() {
        return right;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setNelem(String nelem) {
        this.nelem = nelem;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setRight(String right) {
        this.right = right;
    }

    private String cmd;
    private String param;
    private String path;
    private String nelem;
    private String sign;
    private String right;

    @Override
    public String toString() {
        return "JsonDTO{" +
                "cmd='" + cmd + '\'' +
                ", param='" + param + '\'' +
                ", path='" + path + '\'' +
                ", nelem='" + nelem + '\'' +
                ", sign='" + sign + '\'' +
                ", right='" + right + '\'' +
                '}';
    }
}
