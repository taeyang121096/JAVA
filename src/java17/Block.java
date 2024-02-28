package java17;

public class Block {
    public static void main(String[] args) {
        String preJson = "{\n" +
                "  \"name\": \"taeyang\",\n" +
                "  \"age\": 29,\n" +
                "  \"addr\": \"판교\"\n" +
                "}";
        String json = """
                {
                  "name": "taeyang",
                  "age": 29,
                  "addr": "판교"
                }
                """;
        System.out.println(preJson);
        System.out.println(json);
    }
}
