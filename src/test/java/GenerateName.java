public class GenerateName {

    public static String getRandomNameDash(String name) {

        String RandomName = name + System.currentTimeMillis();
        return  RandomName;
    }
}
