package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
         String name="Guzel Z",
                buildingNumber="8Rf",
                streetName="Admiral 11",
                city="London",
                country="UK",
                postCode="LS123";
/**
 String name="Guzel Z";
 String buildingNumber="8Rf";
 String streetName="Admiral 11";
 String city="London";
 String country="UK";
 String postCode="LS123";
 */
        //System.out.println(name+ "\n"+buildingNumber +" "+streetName+ "\n"+city+", "+country+" "+postCode);
String address=name+ "\n"+buildingNumber + " "
        + streetName+ "\n"+city+", "+country+" "+postCode;

        System.out.println(address);
    }
}
/**
 1. Create a class called ShippingAddress.java 2. Declare the following variables:
 1. name 2. buildingNumber  3. streetName
 4. city 5. state 6. zipCode
 3. Use concatenation to print the full address

 EX:
 Jimmy Joe
 7925 Jones Branch Dr
 McLean, VA 20125

 */