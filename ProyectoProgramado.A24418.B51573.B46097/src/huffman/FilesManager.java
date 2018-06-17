package huffman;

import javax.swing.*;
import java.io.File;

public class FilesManager {

    public static File chooseFile() {
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        return chooser.getSelectedFile();
    }
}
