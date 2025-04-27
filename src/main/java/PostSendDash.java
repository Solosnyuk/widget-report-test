public class PostSendDash {
    private String description;
    private String name;

    public PostSendDash(String description, String name) {
        this.description = description;
        this.name = name;
    }

    public PostSendDash() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
