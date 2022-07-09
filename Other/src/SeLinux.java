import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SeLinux {
    static void mSeLinux(String yamlFile) {
        try {
            String yaml = new String(Files.readAllBytes(Paths.get(yamlFile)));
            if (yaml.contains("SeLinux")) {
                System.out.println("\u001B[34m" + "SeLinux true" + "\u001B[0m");
            }
            else {
                System.out.println("\u001B[34m" + "SeLinux false" + "\u001B[0m");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
