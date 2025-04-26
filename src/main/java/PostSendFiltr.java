import java.util.List;

public class PostSendFiltr {
    private String description;
    private String name;
    private String type;
    private List<Condition> conditions;
    private List<Order> orders;

    public PostSendFiltr() {
    }

    public PostSendFiltr(String description, String name, String type, List<Condition> conditions, List<Order> orders) {
        this.description = description;
        this.name = name;
        this.type = type;
        this.conditions = conditions;
        this.orders = orders;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}

class Condition {
    private String filteringField;
    private String condition;
    private String value;

    public Condition() {
    }

    public Condition(String filteringField, String condition, String value) {
        this.filteringField = filteringField;
        this.condition = condition;
        this.value = value;
    }

    public String getFilteringField() {
        return filteringField;
    }

    public void setFilteringField(String filteringField) {
        this.filteringField = filteringField;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class Order {
    private String sortingColumn;
    private boolean isAsc;

    public Order() {
    }

    public Order(String sortingColumn, boolean isAsc) {
        this.sortingColumn = sortingColumn;
        this.isAsc = isAsc;
    }

    public String getSortingColumn() {
        return sortingColumn;
    }

    public void setSortingColumn(String sortingColumn) {
        this.sortingColumn = sortingColumn;
    }

    public boolean isAsc() {
        return isAsc;
    }

    public void setAsc(boolean asc) {
        isAsc = asc;
    }
}
