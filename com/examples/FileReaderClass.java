import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReaderClass {
    public String[] fileRead(File fi ){
        
        BufferedReader br = null;
        String[] lines = new String[100] ;
        int i=0;
        try {
            br = new BufferedReader(new FileReader(fi));
            String line = null;
            while ((line = br.readLine()) != null) {
                lines[i] = line;
                i++;
            }
            
        }catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        return lines;
    }
   /* public static void main(String[] args)  {
        // TODO Auto-generated method stub
        try {
            FileReaderClass fr = new FileReaderClass();
            fr.fileRead();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }*/
}
