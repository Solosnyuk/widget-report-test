import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NewWidgetTest extends BaseApiTest{
    private Integer getNewIdWidget;
    private Integer getNewIdFiltr;
    private Integer getNewIdWidgetFiltr;
    private String messagePutWidget;

    @Test
    public void newWidgetTest() {
        //создание дашборд
        PostSendDash postSendDash = new PostSendDash("Jo and Bob", dashboardGenerateName);
        PostGetDash postGetDash = sendDashboard(postSendDash);
        getNewIdWidget = postGetDash.getId();

        //создание фильтра
        PostSendFiltr postSendFiltr = new PostSendFiltr("test filtr", filtrGenerateName, typeFiltr);
        PostGetFiltr postGetFiltr = sendFiltr(postSendFiltr);
        getNewIdFiltr = postGetFiltr.getId();

        //создание виджета
        List<String> filterIds = Collections.singletonList(getNewIdWidget.toString());
        List<Filter> filters = new ArrayList<>();

        Filter filter = new Filter();
            filter.setValue(getNewIdWidget.toString());
            filter.setName(filtrGenerateName);
            filters.add(filter);

        PostSendWidget postSendWidget = new PostSendWidget(widgetType, filterIds, filters);
        PostGetWidget postGetWidget = sendWidget(postSendWidget);
        getNewIdWidgetFiltr = postGetWidget.getId();

        //обновление виджета
        PutSendDash putSendDash = new PutSendDash(getNewIdWidgetFiltr, filtrGenerateName, widgetType);
        PutGetDash putGetDash = putDashboard(putSendDash, getNewIdWidget);
        messagePutWidget = putGetDash.getMessage();

    }
}
