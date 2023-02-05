package contactManager;

import java.io.Serializable;

public class Contact implements Serializable {
    private String name;
    private String phoneNumber;

    public Contact(String name, String number) {
        this.name = name;
        phoneNumber = number;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}