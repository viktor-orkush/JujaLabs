package week10.laba43;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

        Person expectedPerson = new Person("John", 3333332);

        ByteArrayOutputStream outByteArray = new ByteArrayOutputStream();
        EntityOutputStream outEntity = new EntityOutputStream(outByteArray);

        outEntity.writePerson(expectedPerson);

        byte[] rawByteArray = outByteArray.toByteArray();


        //call
        ByteArrayInputStream in = new ByteArrayInputStream(rawByteArray);
        EntityInputStream stream = new EntityInputStream(in);

        Person actualPerson = stream.readPerson();

        //check

        if (!actualPerson.getName().equals(expectedPerson.getName()))
            throw new AssertionError("Expected Person name equals " + expectedPerson.getName() + " but found " + actualPerson.getName());

        if (actualPerson.getAge() != expectedPerson.getAge())
            throw new AssertionError("Expected Person age equals " + expectedPerson.getAge() + " but found " + actualPerson.getAge());

        System.out.print("OK");
    }
}