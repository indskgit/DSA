package CodingQNAs.saurabh;

//import java.util.Locale;

public class DetectSpaces {
    public static void main(String[] args) {
        //Write a programme to find double and triple spaces wothout using if and else statement

        String str = "CodingQNAs.saurabh  kumar   pandey";
        System.out.println("gives -1 if no double or triple spaces found ");

        System.out.print("double Space starts from index : ");

        System.out.println(str.indexOf("  "));

        System.out.print("Triple starts from index : ");
        System.out.println(str.indexOf("   "));

        System.out.println("All above character are in upper cases");
        str = str.toUpperCase();
        System.out.println(str);


    }
}
