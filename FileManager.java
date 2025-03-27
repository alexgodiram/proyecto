import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
public class FileManager {
    public static String readFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(new File(filePath).toPath()));
    }

    public static void writeFile(String filePath, String content) throws IOException {
        Files.write(new File(filePath).toPath(), content.getBytes());
    }
}
