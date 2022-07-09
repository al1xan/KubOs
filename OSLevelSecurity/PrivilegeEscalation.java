import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PrivilegeEscalation {
    static void mPrivilegeEscalation(String yamlFile) {
        try {
            String yaml = new String(Files.readAllBytes(Paths.get(yamlFile)));
            if (yaml.contains("AllowPrivilegeEscalation: true")) {
                System.out.println("PrivilegeEscalation true");
            }
            else {
                System.out.println("PrivilegeEscalation false");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
