package test_features.textBlocks_patternMatching;

public record Car(String name, String model, Integer year) {
    @Override
    public String toString() {
       return """
               Car{
               name = "%s",
               model = "%s",
               year = "%s"
               }""".formatted(name,model,year);
    }
}
