import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class FileCompare {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        BufferedWriter out;
       /* File file = new File("/Users/amansharma/Documents/Softwares/apache-cassandra-1.2.16/tempDelta.csv");
        Path p1 = Paths.get("/Users/amansharma/Documents/Softwares/apache-cassandra-1.2.16/lookuptest_local.csv");
        Path p2 = Paths.get("/Users/amansharma/Documents/Softwares/apache-cassandra-1.2.16/temp2.csv");
       */ 
        File file = new File("/Users/amansharma/Documents/miDiff.cql");
        Path p1 = Paths.get("/Users/amansharma/Documents/migration.cql");
        Path p2 = Paths.get("/Users/amansharma/Documents/privilege.cql");
        
        out = new BufferedWriter(new FileWriter(("/Users/amansharma/Documents/miDiff.cql")));
        HashSet<String> f1 = new HashSet<String>(Files.readAllLines(p1, StandardCharsets.UTF_8));
        HashSet<String> f2 = new HashSet<String>(Files.readAllLines(p2, StandardCharsets.UTF_8));
        TreeSet<String> myTreeSet = new TreeSet<String>();
        

        System.out.println("First file size: "+f1.size());
        System.out.println("Second file size: "+f2.size());
        
        //f1.removeAll(f2); // f1 now contains only the lines which are not in f2
        System.out.println("Final diff file size: "+f1.size());
        myTreeSet.addAll(f1);
        if (!file.exists()) {
            file.createNewFile();
        }
        // TODO Auto-generated method stub
        
        Iterator<String> treeSetIterator= myTreeSet.iterator();
        while (treeSetIterator.hasNext()) {
            //System.out.println(hashSetIterator.next());
          //   out.write("this is sample");
             out.write(treeSetIterator.next());
             out.newLine();
         }
         out.close();
        
        /*Iterator<String> hashSetIterator = f1.iterator();
        while (hashSetIterator.hasNext()) {
           //System.out.println(hashSetIterator.next());
         //   out.write("this is sample");
            out.write(hashSetIterator.next());
            out.newLine();
        }
        out.close();*/
        if (Files.isSameFile(p1, p2)) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }
    }

}
