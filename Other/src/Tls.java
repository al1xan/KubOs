import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Tls {
    static void mTls(String yamlFile) {
        try {
            String yaml = new String(Files.readAllBytes(Paths.get(yamlFile)));
            if (yaml.contains("tls")) {
                System.out.println("\u001B[32m" + "tls true" + "\u001B[0m");
            }
            else {
                System.out.println("\u001B[32m" + "tls false" + "\u001B[0m");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
