import java.util.LinkedHashMap;
import java.util.Map;


public class DZ2 {
    public static void main(String[] args) {
        Map<String, String> given = new LinkedHashMap<>();
        given.put("name","Ivanov");
        given.put("country","Russia");
        given.put("city","Moskow");
        given.put("age",null);

        System.out.println(getQuery(given));
    }

    public static String getQuery(Map<String, String> parameter) {
        StringBuilder result = new StringBuilder();
        if (parameter == null || parameter.isEmpty())
            return result.toString();

        for (Map.Entry<String, String> pair : parameter.entrySet()) {
            if (pair.getKey() == null || pair.getValue() == null)
                continue;

            result.append(pair.getKey()).append(" = '").append(pair.getValue()).append("' and ");
        }

        if (result.length() > 5)
            result.delete(result.length() - 5, result.length());

        return result.toString();
    }
}