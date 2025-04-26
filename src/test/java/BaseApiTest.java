import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class BaseApiTest {

    public static final String BASE_URL = "https://demo.reportportal.io/api/v1/";
    public static final String BASE_ADD_DASHBOARD = "/dashboard/";
    public static final String BASE_ADD_FILTR = "/filter/";
    public static final String BASE_ADD_WIDGET = "/widget/";
    public static final String BASE_UPDATED_WIDGET = "/dashboard/"; //+новый id
    public static final String PROJECT_NAME = "default_personal";
    //вставьте действующий токен
    public static final String ACCESS_TOKEN = "bbbb_dJVnbFOoTLmAiCbpGs1ccHX3Dix5B8y4vgxQfi04fW9UqvSrbiEjdC-ksWO5H6ut";
    // введите тип фильтра
    public static String typeFiltr = "launch";
    //введите тип виджета
    public static String widgetType = "launchesTable";
    public String dashboardGenerateName = GenerateName.getRandomNameDash("dash_");
    public String filtrGenerateName = GenerateName.getRandomNameDash("filtr_");
    public String lauchGenerateName = GenerateName.getRandomNameDash("launch_");

    public PostGetDash sendDashboard(PostSendDash postSendWidget) {
        return RestAssured.given()
                .log().all()
                .baseUri(BASE_URL + PROJECT_NAME + BASE_ADD_DASHBOARD)
                .header("Authorization", "Bearer " + ACCESS_TOKEN)
                .contentType(ContentType.JSON)
                .body(postSendWidget)
                .post()
                .then()
                .log().all()
                .extract()
                .as(PostGetDash.class);
    }

    public PostGetFiltr sendFiltr(PostSendFiltr postSendFiltr) {
        return RestAssured.given()
                .log().all()
                .baseUri(BASE_URL + PROJECT_NAME + BASE_ADD_FILTR)
                .header("Authorization", "Bearer " + ACCESS_TOKEN)
                .contentType(ContentType.JSON)
                .body(postSendFiltr)
                .post()
                .then()
                .log().all()
                .extract()
                .as(PostGetFiltr.class);
    }

    public PostGetWidget sendWidget(PostSendWidget postSendWidget) {
        return RestAssured.given()
                .log().all()
                .baseUri(BASE_URL + PROJECT_NAME + BASE_ADD_WIDGET)
                .header("Authorization", "Bearer " + ACCESS_TOKEN)
                .contentType(ContentType.JSON)
                .body(postSendWidget)
                .post()
                .then()
                .log().all()
                .extract()
                .as(PostGetWidget.class);
    }

    public PutGetDash putDashboard(PutSendDash putSendDash, Integer getNewIdWidget) {
        return RestAssured.given()
                .log().all()
                .baseUri(BASE_URL + PROJECT_NAME + BASE_ADD_DASHBOARD + getNewIdWidget + "/add")
                .header("Authorization", "Bearer " + ACCESS_TOKEN)
                .contentType(ContentType.JSON)
                .body(putSendDash)
                .put()
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .as(PutGetDash.class);
    }
}
