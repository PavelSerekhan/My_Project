package Lessom_1_Level_10;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;
import java.util.Base64;

public class UserInfo implements Externalizable {

    private String firstName;
    private String lastName;
    private String superSecretInformation;

    private static final long SERIAL_VERSION_UID = 0L;

    public UserInfo() {
    }

    public UserInfo(String firstName, String lastName, String superSecretInformation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.superSecretInformation = superSecretInformation;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.getFirstName());
        out.writeObject(this.getLastName());
        out.writeObject(this.encryptString(getSuperSecretInformation()));
        //encryptString шифрует строку!!!
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        firstName = (String) in.readObject();
        lastName = (String) in.readObject();
        superSecretInformation = (String) in.readObject();
    }

    private String encryptString(String data) {   //шифровать!
        String encryptedData = Base64.getEncoder().encodeToString(data.getBytes());
        System.out.println(encryptedData);
        return encryptedData;
    }

    private String decryptString(String data) {    //расшифровать!
        String decrypted = new String(Base64.getDecoder().decode(data));
        System.out.println(decrypted);
        return decrypted;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "first Name = " + firstName + "," +
                "last Name = " + lastName + "," +
                "super Secret Information = " + superSecretInformation +
                '}';
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuperSecretInformation() {
        return superSecretInformation;
    }

    public void setSuperSecretInformation(String superSecretInformation) {
        this.superSecretInformation = superSecretInformation;
    }
}
