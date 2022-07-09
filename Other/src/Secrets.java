import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Secrets {
    static void mSecrets(){
        String command = "kubectl get secrets --all-namespaces";
        try {
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("\033[31m" + line + "\033[0m");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
