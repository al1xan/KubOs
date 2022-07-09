import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StartupProbe {
    static void mStatupPrube(String yamlFile) {
        try {
            String yaml = new String(Files.readAllBytes(Paths.get(yamlFile)));
            if (yaml.contains("startupProbe")) {
                System.out.println("\u001B[34m" + "StartupProbe" + "\u001B[0m");
                int start = yaml.indexOf("startupProbe");
                int end = yaml.indexOf("startupProbe") + 86;
                System.out.println("\u001B[31m" + yaml.substring(start, end) + "\u001B[0m");
            }
            else {
                System.out.println("\u001B[34m" + "StartupProbe false" + "\u001B[0m");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
