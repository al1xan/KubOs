import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ProcessKprobe {
    static void mProcessKprobe(String yamlFile) {
        try {
            String yaml = new String(Files.readAllBytes(Paths.get(yamlFile)));
            if (yaml.contains("process_kprobe")) {
                System.out.println("\033[31m" + "process_kprobe true" + "\033[0m");
                int start = yaml.indexOf("process_exec");
                int end = yaml.indexOf("process_exec") + 100;
                System.out.println("\033[31m" + yaml.substring(start, end) + "\033[0m");
            }
            else {
                System.out.println("\033[31m" + "process_kprobe false" + "\033[0m");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
