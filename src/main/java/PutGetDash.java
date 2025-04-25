public class PutGetDash {
        private int widgetId;
        private String widgetName;
        private String widgetType;

        public PutGetDash() {
        }

        public PutGetDash(int widgetId, String widgetName, String widgetType) {
            this.widgetId = widgetId;
            this.widgetName = widgetName;
            this.widgetType = widgetType;
        }

        public int getWidgetId() {
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
}
