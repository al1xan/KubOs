import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AutomountServiceAccountToken {
    static void mAutomountServiceAccountToken(String yamlFile) {
        try {
            String yaml = new String(Files.readAllBytes(Paths.get(yamlFile)));
            if (yaml.contains("automountServiceAccountToken")) {
                System.out.println("\u001B[33m" + "automountServiceAccountToken true" + "\u001B[0m");
            }
            else {
                System.out.println("\u001B[33m" + "automountServiceAccountToken false" + "\u001B[0m");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
