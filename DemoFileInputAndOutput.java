import java.util.*;
import java.nio.file.Path;
import java.nio.charset.StandardCharsets;
import java.io.IOException;

public class DemoFileInputAndOutput
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(Path.of("example_file.txt"), StandardCharsets.UTF_8);

        System.out.println("\nOriginal file content:\n");

        while (in.hasNextLine())
        {
            System.out.println(in.nextLine());
        }
    }
}
