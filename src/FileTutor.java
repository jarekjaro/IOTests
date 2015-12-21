import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class FileTutor {

    /**
     * The method must create a folder and file test.txt inside it
     * - the file test/test.txt
     * Also, output in the full path to the log file you created
     */
    File d = new File("test");
    File f = new File("test" + File.separator + "test.txt");

    //String separator = System.getProperty("file.separator"); <<== returns system name separator
    public void createFile() {
        try {
            d.mkdir();
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method should remove the folder and test file test / test.txt
     */

    @Test
    public void testCreateFile() {
        createFile();
        File f = new File("test/test.txt");
        assertTrue(f.exists());
    }

    @Test
    public void testDeleteFile() {
//        deleteFile();
        File f = new File("test/test.txt");
        assertFalse(f.exists());
        assertFalse(new File("test").exists());
    }


}
