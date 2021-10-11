import java.util.Scanner;

public class Hello {
    public static void main(String arg[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name ");
        String userName = scanner.nextLine();
        System.out.println("hello " + userName);

        String color = "Black";
        String boxColor = "black";

        if(color.equals(boxColor)) {
            System.out.println("Yes both are equal");
        } else {
            System.out.println("NO both are not equal");
        }

//        if(x > 5 && x < 10) {
//        }

        if(color.equalsIgnoreCase(boxColor)) {
            System.out.println("Yes both are equal");
        } else {
            System.out.println("NO both are not equal");
        }

        if(color.equalsIgnoreCase(boxColor) && color.length() == 5) {
            System.out.println("Yes both are equal and color length is 5 char");
        } else {
            System.out.println("NO both are not equal");
        }

        System.out.println("number =  "+  -45);
    }
}


// Laptop

// Screen, keyboard, procesing, storage
// Table screen,  procesing, storage

// car (Noun) ==> width, color, weight, modal, brand ===> run stop (verb)
// Human ==> Indian ===> Height, name, color, weight, DNA ====>  speak, eat, see, run

//class Human {
//    String name = "abc";
//}
//
//    Human ajay = new Human(); // object
//ajay.name
//
//        Human ravi = new Human(); // object
//        ravi.name