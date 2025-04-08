package String;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        System.out.println("Default size of String Buffer: " + sb.capacity() + " Bites");
        //Add value to string buffer and check size
        StringBuffer sb2 = new StringBuffer("Hello String Buffer");
        System.out.println("Default size of String Buffer: " + sb2.capacity() + " Bites");

        //Display length of string use ".length()" method
        System.out.println("Length of \"Hello String Buffer\" string is " + sb2.length());

        //Append data to execting string
        System.out.println("\n#### Append String ####");
        System.out.println("Old String: " + sb2);
        sb2.append(": Hello Harsh");
        System.out.println("New String with append data: " + sb2);

        //Convert String to StringBuffer using ".toString()" method
        System.out.println("\n### Convert String to StringBuffer ###");
        String str = sb2.toString();
        System.out.println(str);

        //Delete character from provided index location using ".deleteCharAt(indexLocation)" method
        System.out.println("\n### Delete character from provided index location ###");
        System.out.println("Original String: \t\t" + sb2);
        sb2.deleteCharAt(0);
        System.out.println("String with deleted character: \t" + sb2);

        //Add string from particular location or somewhere in the existing string using ".insert()" method.
        StringBuffer sb3 = new StringBuffer("Hello worrld!!");
        System.out.println("\n#### Add string from particular location or somewhere in the existing string ####");
        System.out.println("Original String: \t\t\t" + sb3);
        sb3.insert(5 , ", Harsh's ");
        System.out.println("String with added another string: \t" + sb3);

        //Display the part of the string by passing starting point and ending point using ".substring(startPoint, endPoint)" method.
        System.out.println("\n#### Display the part of the string by passing starting point and ending point ####");
        System.out.println("Original String: \t\t\t" + sb3);
        System.out.println("String with added another string: \t" + sb3.substring(3, 10));

        //Set the minimum capacity or size of the string using ".ensureCapacity(size)" method
        System.out.println("\n#### Set the minimum capacity or size of the string ####");
        System.out.println("Original size: \t" + sb.capacity());
        sb.ensureCapacity(100);
        System.out.println("New Length: \t" + sb.capacity());
    }
}
