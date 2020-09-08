package parser_test;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import parser.StartConvertor;

import java.io.File;
import java.io.IOException;

public class ConvertorTest {
    private String[] humanJson = {"C:\\Users\\38063\\IdeaProjects\\HomeworkIntro\\src\\main\\java\\parser\\resources\\human.json"};
    private String[] humanYaml = {"C:\\Users\\38063\\IdeaProjects\\HomeworkIntro\\src\\main\\java\\parser\\resources\\human.yaml"};
    private File resultsDir = new File("C:\\Users\\38063\\IdeaProjects\\HomeworkIntro\\src\\main\\java\\parser\\convert_results");


    @Before
    public void deleteAllFilesFolder() {
        File[] files = resultsDir.listFiles();
        for (File f: files) {
            if (f.isFile()) f.delete();
        }
    }


    @Test
    public void testConvertorJsonToYaml() {
        Assertions.assertEquals(0, resultsDir.list().length);
        try {
            StartConvertor.main(humanJson);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Assertions.assertTrue(resultsDir.exists());
        Assertions.assertEquals("humanFromJson.yaml", resultsDir.list()[0]);
        Assertions.assertEquals(1, resultsDir.list().length);
    }

    @Test
    public void testConvertorYamlToJson(){
        Assertions.assertEquals(0, resultsDir.list().length);
        try {
            StartConvertor.main(humanYaml);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Assertions.assertTrue(resultsDir.exists());
        Assertions.assertEquals("humanFromYaml.json", resultsDir.list()[0]);
        Assertions.assertEquals(1, resultsDir.list().length);
    }
}
