import io.qameta.allure.internal.shadowed.jackson.annotation.JsonIgnoreProperties;

public class PostGetFiltr {
    private Integer id;

    public void PostGetFiltr(Integer id) {
        this.id = id;
    }

    public void PostGetFiltr() {

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
