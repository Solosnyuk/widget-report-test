import java.util.Map;

public class PutSendDash {
    private AddWidget addWidget;

    // Конструкторы
    public PutSendDash() {
    }

    public PutSendDash(AddWidget addWidget) {
        this.addWidget = addWidget;
    }

    // Геттеры и сеттеры
    public AddWidget getAddWidget() {
        return addWidget;
    }

    public void setAddWidget(AddWidget addWidget) {
        this.addWidget = addWidget;
    }
}

class AddWidget {
    private String widgetName;
    private Integer widgetId;
    private String widgetType;
    private WidgetSize widgetSize;
    private WidgetPosition widgetPosition;
    private Map<String, Object> widgetOptions;

    public AddWidget() {
    }

    public AddWidget(String widgetName, Integer widgetId, String widgetType,
                     WidgetSize widgetSize, WidgetPosition widgetPosition) {
        this.widgetName = widgetName;
        this.widgetId = widgetId;
        this.widgetType = widgetType;
        this.widgetSize = widgetSize;
        this.widgetPosition = widgetPosition;

    }

    public String getWidgetName() {
        return widgetName;
    }

    public void setWidgetName(String widgetName) {
        this.widgetName = widgetName;
    }

    public Integer getWidgetId() {
        return widgetId;
    }

    public void setWidgetId(Integer widgetId) {
        this.widgetId = widgetId;
    }

    public String getWidgetType() {
        return widgetType;
    }

    public void setWidgetType(String widgetType) {
        this.widgetType = widgetType;
    }

    public WidgetSize getWidgetSize() {
        return widgetSize;
    }

    public void setWidgetSize(WidgetSize widgetSize) {
        this.widgetSize = widgetSize;
    }

    public WidgetPosition getWidgetPosition() {
        return widgetPosition;
    }

    public void setWidgetPosition(WidgetPosition widgetPosition) {
        this.widgetPosition = widgetPosition;
    }

    public Map<String, Object> getWidgetOptions() {
        return widgetOptions;
    }

    public void setWidgetOptions(Map<String, Object> widgetOptions) {
        this.widgetOptions = widgetOptions;
    }
}

class WidgetSize {
    private Integer width;
    private Integer height;

    public WidgetSize() {
    }

    public WidgetSize(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}

class WidgetPosition {
    private Integer positionX;
    private Integer positionY;

    public WidgetPosition() {
    }

    public WidgetPosition(Integer positionX, Integer positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public Integer getPositionX() {
        return positionX;
    }

    public void setPositionX(Integer positionX) {
        this.positionX = positionX;
    }

    public Integer getPositionY() {
        return positionY;
    }

    public void setPositionY(Integer positionY) {
        this.positionY = positionY;
    }
}
