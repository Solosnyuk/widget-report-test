import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NewWidgetTest extends BaseApiTest{
    private Integer getNewIdWidget;
    private Integer getNewIdFiltr;

    @Test
    public void newWidgetTest() {
        //создание дашборд
        PostSendDash postSendWidget = new PostSendDash("Jo and Bob", dashboardGenerateName);
        PostGetDash postGetWidget = sendDashboard(postSendWidget);
        getNewIdWidget = postGetWidget.getId();

        //создание фильтра
        PostSendFiltr postSendFiltr = new PostSendFiltr("test filtr", filtrGenerateName, typeFiltr);
        PostGetFiltr postGetFiltr = sendFiltr(postSendFiltr);
        getNewIdFiltr = postGetFiltr.getId();

        //создание виджета
        List<String> filterIds = Collections.singletonList(getNewIdFiltr.toString());
        List<Filter> filters = new ArrayList<>();
            Filter filter = new Filter();
            filter.setValue(getNewIdFiltr.toString());
            filter.setName(filtrGenerateName);
        filters.add(filter);

        PostSendWidget postSendWidget1 = new PostSendWidget(widgerType, filterIds, filters);

        //обновление виджета

    }
}
