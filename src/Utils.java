import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Utils {

    static FileWriter writer;

    static {
        try {
            writer = new FileWriter("Orders.txt", true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeToFile(List<Order> list) {
        for (int i = 0; i < list.size(); i++) {
            try {
                writer.write(list.get(i).toString());
                writer.write("\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
