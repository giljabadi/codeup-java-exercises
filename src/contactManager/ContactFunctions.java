package contactManager;

import utils.Input;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ContactFunctions {


    //This function can be used to check for existing
    //files or directories.
    public static void directoryExist(Path p) {
        Input input = new Input();
        try {
            if (Files.exists(p)) {
                System.out.println("Directory Exist");
            } else {
                System.out.println("The directory does not exist.\n");
                boolean createDirectory = input.yesNo("Would you like to create it(y/n):");
                if (createDirectory) {
                    Files.createDirectory(p);
                }
            }
        } catch (Exception e) {
            System.out.println("Function failed to load file. Check exception.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void fileExist(Path p) {
        Input input = new Input();
        try {
            if (Files.exists(p)) {
                System.out.println("File Exist");
            } else {
                System.out.println("The file does not exist.\n");
                boolean createFile = input.yesNo("Would you like to create it(y/n):");
                if (createFile) {
                    Files.createFile(p);
                }
            }
        } catch (Exception e) {
            System.out.println("Function failed to load file. Check exception.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void addContact(Path p, Contact contact) {
        String contactInfo = String.format("\n%s | %s", contact.getName(), contact.getPhoneNumber());

        try {
            Files.write(p, contactInfo.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
            System.out.println("Contact added successfully!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
//        try (FileOutputStream fos = new FileOutputStream(p.toFile());
//             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
//
//            Contact contact = new Contact("Bob", "3027892278");
//
//            oos.writeObject(contact);
//
//            oos.close();
//
//
//        } catch (FileNotFoundException fe) {
//            System.out.println(fe.getMessage());
//            fe.printStackTrace();
//        } catch (IOException ie) {
//            System.out.println(ie.getMessage());
//            ie.printStackTrace();
//        }
//    }
    }
}