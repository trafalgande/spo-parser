import java.util.ArrayList;

public class ElementInitValuesDTO {
    private String init_value_key;
    private Integer int_value;
    private String utf_value;

    public ElementInitValuesDTO(String init_value_key, Integer int_value, String utf_value) {
        this.init_value_key = init_value_key;
        this.int_value = int_value;
        this.utf_value = utf_value;
    }

    public ElementInitValuesDTO() {
    }

    public String getInit_value_key() {
        return init_value_key;
    }

    public void setInit_value_key(String init_value_key) {
        this.init_value_key = init_value_key;
    }

    public Integer getInt_value() {
        return int_value;
    }

    public void setInt_value(Integer int_value) {
        this.int_value = int_value;
    }

    public String getUtf_value() {
        return utf_value;
    }

    public void setUtf_value(String utf_value) {
        this.utf_value = utf_value;
    }


}
