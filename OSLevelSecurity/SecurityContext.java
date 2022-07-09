import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SecurityContext {
    static void mSecurityContext(String yamlFile) {
        try {
            String yaml = new String(Files.readAllBytes(Paths.get(yamlFile)));
            if (yaml.contains("securityContext")) {
                System.out.println("SecurityContext true");
            }
            else {
                System.out.println("SecurityContext false");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
