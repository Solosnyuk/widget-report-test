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
        Condition condition0 = new Condition("name", "cnt", lauchGenerateName);
        Order order1 = new Order("number", false);
        //добавление в списки
        List<Condition> conditions = new ArrayList<>();
        conditions.add(condition0);
        List<Order> orders = new ArrayList<>();
        orders.add(order1);

        PostSendFiltr postSendFiltr = new PostSendFiltr(
                "dis test",
                filtrGenerateName,
                typeFiltr,
                conditions,
                orders);

        PostGetFiltr postGetFiltr = sendFiltr(postSendFiltr);
        getNewIdFiltr = postGetFiltr.getId();

        //создание виджета
        Integer getFilterIds0 = getNewIdFiltr;
        List<Integer> getFilterIds = new ArrayList<>();
        getFilterIds.add(getFilterIds0);

        List<String> contentFields = new ArrayList<>();
        contentFields.add("name");
        contentFields.add("number");
        contentFields.add("status");
        contentFields.add("statistics$executions$total");
        contentFields.add("statistics$executions$passed");
        contentFields.add("statistics$executions$failed");
        contentFields.add("statistics$executions$skipped");
        contentFields.add("statistics$defects$product_bug$pb001");
        contentFields.add("statistics$defects$automation_bug$ab001");
        contentFields.add("statistics$defects$system_issue$si001");
        contentFields.add("statistics$defects$to_investigate$ti001");
        contentFields.add("attributes");
        contentFields.add("user");
        contentFields.add("startTime");
        contentFields.add("endTime");
        contentFields.add("description");

        ContentParameters parameters = new ContentParameters(contentFields, 50);

        PostSendWidget postSendWidget = new PostSendWidget(
                filtrGenerateName,
                "launchesTable",
                parameters,
                getFilterIds
                );

        PostGetWidget postGetWidget = sendWidget(postSendWidget);
        getNewIdWidgetFiltr = postGetWidget.getId();

        //обновление виджета
        WidgetSize widgetSize = new WidgetSize(6,7);
        WidgetPosition widgetPosition = new WidgetPosition(0, 0);

        AddWidget addWidget = new AddWidget(
                filtrGenerateName,
                getNewIdWidgetFiltr,
                "launchesTable",
                widgetSize,
                widgetPosition);

        PutSendDash putSendDash = new PutSendDash(addWidget);

        PutGetDash putGetDash = putDashboard(putSendDash, getNewIdWidget);
        messagePutWidget = putGetDash.getMessage();

    }
}
