// import java.util.Scanner;

// class NegativeRadiusException extends Exception{

//     public String getMessage(){
//         return " Invalid Radius";
//     }
// }

// public class throw_Vs_Throws {
//     public static void main(String[] args) {

//          Scanner sc = new Scanner(System.in);

//          System.out.print("Enter The 1st Radius(r1) : ");
//          double r1 = sc.nextDouble();
//          System.out.print("Enter The 2nd Radius(r) : ");
//          double r =  sc.nextDouble();
//          double area;

//          sc.close();
//          if(r < 0 ){

//             try{
//             throw new NegativeRadiusException();
//          }
//          area = Math.PI * r1 * r;
//          System.out.println(+area);
//         }

//                catch(Exception e){
//                System.out.println(" r should not zero");
//                System.out.println(e.getMessage());
//           }
//          }

//     }

// }
