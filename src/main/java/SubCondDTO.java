public class SubCondDTO {
    public SubCondDTO() {
    }

    public SubCondDTO(String key, String sign, String value) {
        this.key = key;
        this.sign = sign;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private String key;
    private String sign;
    private String value;
}
