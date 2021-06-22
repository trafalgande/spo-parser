public class SubCondDTO {
    public SubCondDTO() {
    }

    public SubCondDTO(String key, String sign, String utf_value, Integer int_value) {
        this.key = key;
        this.sign = sign;
        this.utf_value = utf_value;
        this.int_value = int_value;
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

    public String getUtf_value() {
        return utf_value;
    }

    public void setUtf_value(String utf_value) {
        this.utf_value = utf_value;
    }

    public Integer getInt_value() {
        return int_value;
    }

    public void setInt_value(Integer int_value) {
        this.int_value = int_value;
    }

    private String key;
    private String sign;
    private String utf_value;
    private Integer int_value;
}
