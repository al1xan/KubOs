import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadOnlyFileSystem {
    static void mReadOnlyFileSystem(String yamlFile) {
        try {
            String yaml = new String(Files.readAllBytes(Paths.get(yamlFile)));
            if (yaml.contains("readOnlyFileSystem")) {
                System.out.println("\033[32m" + "readOnlyFileSystem true");
            }
            else {
                System.out.println("\033[32m" + "readOnlyFileSystem false");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
