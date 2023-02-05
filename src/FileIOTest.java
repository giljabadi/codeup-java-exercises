import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.List;

public class FileIOTest {

    public static void main(String[] args) {
        String strDirectory = "Data";
        Path dataDirectory = Paths.get(strDirectory);
        Path dataFile = Paths.get("Data","testData.txt");


/****************Create Directory****************/
//        try {
//            if(Files.exists(dataDirectory)){
//                System.out.println("Path Exist!");
//            }else{
//               Path newDirectory = Files.createDirectory(dataDirectory);
//                System.out.println("New Directory created at: "+newDirectory.toString());
//            }
//
////            if(Files.exists(upperDataDirectory))
////                System.out.println("Upper Data Path Exist!");
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }

/****************Create File****************/
//        try {
//            if(Files.exists(dataFile)){
//                System.out.println("File exist");
//            }else{
//               Path doneFile = Files.createFile(dataFile);
//                System.out.println("New file created: "+ doneFile.toString());
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
/****************Read data****************/
//        try {
//            List<String> data = Files.readAllLines(dataFile);
//            data.forEach(System.out::println);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
/****************Write data****************/
//        try{
//            String content = "Hello world X10!";
//            Files.write(dataFile,content.getBytes(), StandardOpenOption.APPEND);
//            System.out.println("Data was written to "+ dataFile.toString());
//
//            Path newFile = Paths.get("Data/newTestData.txt");
//            Path p = Files.createFile(newFile);
//
//            List<String> data = Files.readAllLines(dataFile);
//            Files.write(newFile,data);
//
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
/****************Copy files****************/
        try{
            Path source = Paths.get("textFile.txt");
            Path destination = Paths.get("Data/copiedFile.txt");

            Files.copy(source, destination);
        }catch (Exception e){
            e.printStackTrace();
        }



//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(13);
//        numbers.add(new Integer(8)); // Line 7
//        numbers.add(3.6); // Line 8
//        for (Integer number: numbers) System.out.println(number);

    }
}