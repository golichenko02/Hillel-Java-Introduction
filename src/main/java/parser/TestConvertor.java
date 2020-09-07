package parser;

import java.util.HashMap;
import java.util.Map;

public class TestConvertor {
    private static Map<String, String> map = new HashMap<>();

//    public static void main(String[] args) throws IOException {
//
//        try (FileWriter writer = new FileWriter(map.entrySet())) {
//            writer.write(checkFormat(args[0]));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    private static String checkFormat(String s) {
        String substring = s.substring(s.indexOf("."), s.length());
        if (substring.equals(".yaml"))
            return map.put("C:\\Users\\38063\\IdeaProjects\\HomeworkIntro\\src\\main\\resources\\user.json", ConvertorFormats.convertToJson(s));
        if (substring.equals(".json"))
            return map.put("C:\\Users\\38063\\IdeaProjects\\HomeworkIntro\\src\\main\\resources\\user.yaml", ConvertorFormats.convertToYaml(s));
        return "";

    }
}

