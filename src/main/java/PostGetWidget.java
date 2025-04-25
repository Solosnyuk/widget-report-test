import io.qameta.allure.internal.shadowed.jackson.annotation.JsonIgnoreProperties;

public class PostGetWidget {
    private Integer id;

    public PostGetWidget(Integer id) {
        this.id = id;
    }

    public PostGetWidget() {

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

}
