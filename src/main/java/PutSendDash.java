public class PutSendDash {
        private Integer widgetId;
        private String widgetName;
        private String widgetType;

        public PutSendDash() {
        }

        public PutSendDash(Integer widgetId, String widgetName, String widgetType) {
            this.widgetId = widgetId;
            this.widgetName = widgetName;
            this.widgetType = widgetType;
        }

        public Integer getWidgetId() {
            return widgetId;
        }

        public void setWidgetId(int widgetId) {
            this.widgetId = widgetId;
        }

        public String getWidgetName() {
            return widgetName;
        }

        public void setWidgetName(String widgetName) {
            this.widgetName = widgetName;
        }

        public String getWidgetType() {
            return widgetType;
        }

        public void setWidgetType(String widgetType) {
            this.widgetType = widgetType;
        }

}
