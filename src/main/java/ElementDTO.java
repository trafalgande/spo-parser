import java.util.ArrayList;
import java.util.List;

public class ElementDTO {
    private String elementKey;
    private Integer init_values_n;
    private List element_init_values;

    public ElementDTO(String elementKey, List element_init_values, Integer init_values_n) {
        this.elementKey = elementKey;
        this.element_init_values = element_init_values;
        this.init_values_n = init_values_n;
    }

    public ElementDTO() {
    }

    public String getElementKey() {
        return elementKey;
    }

    public void setElementKey(String elementKey) {
        this.elementKey = elementKey;
    }

    public List getElement_init_values() {
        return element_init_values;
    }

    public void setElement_init_values(List element_init_values) {
        this.element_init_values = element_init_values;
    }

    public Integer getInit_values_n() {
        return init_values_n;
    }

    public void setInit_values_n(Integer init_values_n) {
        this.init_values_n = init_values_n;
    }

    public void append(ElementInitValuesDTO item) {
        if (this.getElement_init_values() == null) {
            this.setElement_init_values(new ArrayList());
        }
        this.getElement_init_values().add(item);
    }
}
