package OOP_HW_1;

import java.io.FileWriter;
import java.io.IOException;

public interface SaveFiles {
    default void savefile(String string){
        try (FileWriter file = new FileWriter("file.txt")){
            file.append(string);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}