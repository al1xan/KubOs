import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Privileged {
    static void mPrivileged(String yamlFile) {
        try {
            String yaml = new String(Files.readAllBytes(Paths.get(yamlFile)));
            if (yaml.contains("privileged: true")) {
                // color red print
                System.out.println("\u001B[31m" + "privileged true" + "\u001B[0m");
            }
            else {
                System.out.println("\u001B[31m" + "privileged false" + "\u001B[0m");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
