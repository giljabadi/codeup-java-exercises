package contactManager;

import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        Path dataFolder = Paths.get("contactManager/data");
        Path contactFile = Paths.get("contactManager/data/contact.txt");
//        ContactFunctions.fileExist(dataFolder);
        ContactFunctions.addContact(contactFile);
    }
}