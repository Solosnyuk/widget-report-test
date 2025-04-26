import java.util.List;

public class PostSendWidget {
    private String widgetType;
    private List<String> filterIds;
    private List<Filter> filters;

    public PostSendWidget() {
    }

    public PostSendWidget(String widgetType, List<String> filterIds, List<Filter> filters) {
        this.widgetType = widgetType;
        this.filterIds = filterIds;
        this.filters = filters;
    }

    public String getWidgetType() {
        return widgetType;
    }

    public void setWidgetType(String widgetType) {
        this.widgetType = widgetType;
    }

    public List<String> getFilterIds() {
        return filterIds;
    }

    public void setFilterIds(List<String> filterIds) {
        this.filterIds = filterIds;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }
}