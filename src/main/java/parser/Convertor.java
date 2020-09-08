package parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.google.gson.Gson;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.File;
import java.io.IOException;

public class Convertor {
    private static File path;

    public static void convert(String filePath) {
        Boolean state = checkFormat(filePath);
        if (state == null) System.out.println("Wrong format of file!");
        else if (state) {
            Yaml yaml = new Yaml(new Constructor(Human.class));
            String yamlStr = ReadFromFile.readToString(filePath);
            Human human = yaml.load(yamlStr);
            ObjectMapper mapper = new ObjectMapper();
            try {
                mapper.writeValue(path, human);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            Gson gson = new Gson();
            String jsonStr = ReadFromFile.readToString(filePath);
            Human human = gson.fromJson(jsonStr, Human.class);
            ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
            try {
                mapper.writeValue(path,human);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    private static Boolean checkFormat(String filePath) {
        String substring = filePath.substring(filePath.indexOf("."), filePath.length());
        if (substring.equals(".yaml")) {
            path = new File("C:\\Users\\38063\\IdeaProjects\\HomeworkIntro\\src\\main\\java\\parser\\convert_results\\humanFromYaml.json");
            return true;
        }
        if (substring.equals(".json")) {
            path = new File("C:\\Users\\38063\\IdeaProjects\\HomeworkIntro\\src\\main\\java\\parser\\convert_results\\humanFromJson.yaml");
            return false;
        }
        return null;
    }
}


