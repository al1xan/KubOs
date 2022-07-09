import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AnonymousAuth {
    static void mAnonymousAuth(String yamlFile) {
        try {
            String yaml = new String(Files.readAllBytes(Paths.get(yamlFile)));
            if (yaml.contains("anonymous-auth")) {
                System.out.println("\033[31m" + "anonymous-auth true" + "\033[0m");
            }
            else {
                System.out.println("\033[31m" + "anonymous-auth false" + "\033[0m");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
