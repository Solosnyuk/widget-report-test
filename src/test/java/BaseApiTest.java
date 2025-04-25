import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;

public class BaseApiTest {

    public static final String BASE_URL = "https://demo.reportportal.io/api/v1/";
    public static final String BASE_ADD_DASHBOARD = "/dashboard/";
    public static final String BASE_ADD_FILTR = "/filter/";
    public static final String BASE_ADD_WIDGET = "/widget/";
    public static final String BASE_UPDATED_WIDGET = "/dashboard/"; //+новый id
    public static final String PROJECT_NAME = "default_personal";
    //вставьте действующий токен
    public static final String ACCESS_TOKEN = "token";
    // введите тип фильтра
    public static String typeFiltr = "launch";
    //введите тип виджета
    public static String widgerType = "launchesTable";
    public String dashboardGenerateName = GenerateName.getRandomNameDash("Bob_");
    public String filtrGenerateName = GenerateName.getRandomNameDash("Jo_");

    public PostGetDash sendDashboard(PostSendDash postSendWidget) {
        return RestAssured.given()
                .baseUri(BASE_URL + PROJECT_NAME + BASE_ADD_DASHBOARD)
                .header("Authorization", "Bearer " + ACCESS_TOKEN)
                .contentType(ContentType.JSON)
                .body(postSendWidget)
                .post()
                .then()
                .extract()
                .as(PostGetDash.class);
    }

    public PostGetFiltr sendFiltr(PostSendFiltr postSendFiltr) {
        return RestAssured.given()
                .baseUri(BASE_URL + PROJECT_NAME + BASE_ADD_FILTR)
                .header("Authorization", "Bearer " + ACCESS_TOKEN)
                .contentType(ContentType.JSON)
                .body(postSendFiltr)
                .post()
                .then()
                .extract()
                .as(PostGetFiltr.class);
    }

    public PostGetWidget sendWidget(PostSendWidget postSendWidget) {
        return RestAssured.given()
                .baseUri(BASE_URL + PROJECT_NAME + BASE_ADD_WIDGET)
                .header("Authorization", "Bearer " + ACCESS_TOKEN)
                .contentType(ContentType.JSON)
                .body(postSendWidget)
                .post()
                .then()
                .extract()
                .as(PostGetWidget.class);
    }

    public PutGetDash putDashboard(PutGetDash putGetDash) {
        return RestAssured.given()
                .baseUri(BASE_URL + PROJECT_NAME +BASE_ADD_DASHBOARD + "add")
                .header("Authorization", "Bearer " + ACCESS_TOKEN)
                .contentType(ContentType.JSON)
                .body(putGetDash)
                .put()
                .then()
                .extract()
                .as(PutGetDash.class);
    }
}
