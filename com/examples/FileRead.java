import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FileRead {
    private void fileBasedMigration()  {
        File fin = new File("/Users/amansharma/Documents/ProjectDocs/MyChanges/data_dump4.txt");
        BufferedReader br = null;
        int numThreads=10;
        final int BATCH_COMMIT_SIZE = 150000 ;
        try {
            br = new BufferedReader(new FileReader(fin));
            ExecutorService threadPool = Executors.newFixedThreadPool(numThreads);
    
            int noOfLinesToReadPerThread = 100;
            String line = null;
            String[] lines = new String[noOfLinesToReadPerThread];
    
            
            int totalReadLines = 0 ;
            int i = 0;
            while ((line = br.readLine()) != null) {
                lines[i] = line;
                i++;
                totalReadLines++ ;
                if (i % noOfLinesToReadPerThread == 0) {
                    threadPool.submit(new Task(lines));
                    i = 0;
                    lines = new String[noOfLinesToReadPerThread];
                }
                
             // wait for all the threads to finish, so that we don't end up in out of memory
                if ( totalReadLines % BATCH_COMMIT_SIZE == 0 ) {
                    System.out.println("Going for shutdown processing: " + totalReadLines + ":Records");
                    threadPool.shutdown();
                    threadPool.awaitTermination(2, TimeUnit.MINUTES) ; 
                    System.out.println("Finished processing: " + totalReadLines + ":Records");
                    threadPool = Executors.newFixedThreadPool(numThreads);
                }

                if ( totalReadLines % (BATCH_COMMIT_SIZE/10) == 0 ) {
                    System.out.println("Finished processing: " + totalReadLines + ":Records");
                }
                System.out.println("LinesProcessed::" + totalReadLines);
            }
    
            
            if (i % noOfLinesToReadPerThread != 0) {
                threadPool.submit(new Task(lines));
            }
    
            threadPool.shutdown();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.exit(0);
        }
        
    }
    public class Task implements Callable<String> {

        private String[] data;

        public Task(String[] data) {
            this.data = data;
        }

        @Override
        public String call() throws Exception {
            Random rn= new Random();
            Thread.sleep(rn.nextInt(2000));
            System.out.println("Done Reading file");
            return null;
        }
    }
    public static void main(String[] args)  {
        // TODO Auto-generated method stub
        try {
            FileRead fr = new FileRead();
            fr.fileBasedMigration();
        } catch (Throwable e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

}
