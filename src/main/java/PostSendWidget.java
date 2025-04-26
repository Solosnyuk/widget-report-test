import java.util.List;
import java.util.Map;

public class PostSendWidget {
    private String name;
    private String widgetType;
    private ContentParameters contentParameters;
    private List<Integer> filterIds;

    public PostSendWidget() {
    }

    public PostSendWidget(String name,
                          String widgetType,
                          ContentParameters contentParameters,
                          List<Integer> filterIds) {
        this.name = name;
        this.widgetType = widgetType;
        this.contentParameters = contentParameters;
        this.filterIds = filterIds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWidgetType() {
        return widgetType;
    }

    public void setWidgetType(String widgetType) {
        this.widgetType = widgetType;
    }

    public ContentParameters getContentParameters() {
        return contentParameters;
    }

    public void setContentParameters(ContentParameters contentParameters) {
        this.contentParameters = contentParameters;
    }

    public List<Integer> getFilterIds() {
        return filterIds;
    }

    public void setFilterIds(List<Integer> filterIds) {
        this.filterIds = filterIds;
    }
}

class ContentParameters {
    private List<String> contentFields;
    private Integer itemsCount;

    public ContentParameters() {
    }

    public ContentParameters(List<String> contentFields, Integer itemsCount) {
        this.contentFields = contentFields;
        this.itemsCount = itemsCount;
    }

    public List<String> getContentFields() {
        return contentFields;
    }

    public void setContentFields(List<String> contentFields) {
        this.contentFields = contentFields;
    }

    public Integer getItemsCount() {
        return itemsCount;
    }

    public void setItemsCount(Integer itemsCount) {
        this.itemsCount = itemsCount;
    }
}
