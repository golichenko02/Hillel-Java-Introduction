package parser;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;

public class Convertor {
    private static File path;

    public static void convert(String filePath) {
        Boolean state = checkFormat(filePath);
        if (state == null) System.out.println("Wrong format of file!");
        else if (state) convertToJson(filePath);
        else convertToYaml(filePath);
    }

    private static void convertToJson(String filePath) {
        String yamlStr = ReadFromFile.readToString(filePath);
        ObjectMapper yamlReader = new ObjectMapper(new YAMLFactory());
        Human human = null;
        try {
            human = yamlReader.readValue(yamlStr, Human.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        ObjectMapper jsonWriter = new ObjectMapper();
        try {
            jsonWriter.writeValue(path, human);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void convertToYaml(String filePath) {
        Gson gson = new Gson();
        String jsonStr = ReadFromFile.readToString(filePath);
        Human human = gson.fromJson(jsonStr, Human.class);
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);

        try {
            mapper.writeValue(path, human);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static Boolean checkFormat(String filePath) {
        String substring = filePath.substring(filePath.indexOf("."), filePath.length());
        if (substring.equals(".yaml")) {
            path = new File("src/main/java/parser/convert_results/humanFromYaml.json");
            return true;
        }
        if (substring.equals(".json")) {
            path = new File("src/main/java/parser/convert_results/humanFromJson.yaml");
            return false;
        }
        return null;
    }
}


