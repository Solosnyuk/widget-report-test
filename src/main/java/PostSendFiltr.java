public class PostSendFiltr {
    private String description;
    private String name;
    private String type;

    public PostSendFiltr(String description, String name, String type) {
        this.description = description;
        this.name = name;
        this.type = type;
    }

    public PostSendFiltr() {

    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return  type;
    }
}
