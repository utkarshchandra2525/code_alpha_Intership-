// Online Java Compiler (Editor)
// Write and run Java online using this editor.


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class TaskAutomation {
    public static void main(String[] args) {
        Path file = Path.of("notes.txt");

        try {
            // Create file and write initial content
            Files.writeString(file, "Welcome to my Java project!\n");

            // Append additional content
            Files.writeString(
                file,
                "Task Automation completed successfully.\n",
                StandardOpenOption.APPEND
            );

            // Read and display file content
            String content = Files.readString(file);

            System.out.println("File created and updated!");
            System.out.println("File contents:");
            System.out.println(content);

        } catch (IOException e) {
            System.out.println("File operation failed: " + e.getMessage());
        }
    }
}
