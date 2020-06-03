package MacExport;

import java.io.PrintWriter;

public class MacExport {

    /**
     * saveStringArrayToFile() saves an Object[] consisting of Strings to a filepath
     */
    public static void saveStringArrayToFile(Object[] localarrayString, String filename) {
        try {
            PrintWriter pr = new PrintWriter(filename);

            for (Object o : localarrayString) pr.println(o);
            pr.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No such file exists.");
        }
    }
}
