import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RunAsNonRoot {
    static void mRunAsNonRoot(String yamlFile) {
        try {
            String yaml = new String(Files.readAllBytes(Paths.get(yamlFile)));
            if (yaml.contains("runAsNonRoot: true")) {
                System.out.println("runAsNonRoot true");
            }
            else {
                System.out.println("runAsNonRoot false");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
