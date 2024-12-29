/*
package CodingQNAs.CWH;

// Dynamic Method Dispatch Where,
// We make Object By taking Parent Class As Reference And Child As a New Object.
//Possible Only When we OVERRIDE The Same Method Which is Present In Parent Class Also,
//It Depends On us Which Method We Want to Override.

class FirstClass {

    public void ShowTime() {
        System.out.println("Displaying Time...");
    }

    public void On() {
        System.out.println("Switching On...");
    }
}
     class Dynamic extends FirstClass{
       public void Music(){
           System.out.println("Playing Music");
       }

        @Override
        public void On(){
            System.out.println("Switching On...");
        }
    }


 public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        System.out.println("******Using Dynamic Method Dispatch\n *****");

        //Making The Object By TaKing Refrence Of Inherited Class And Object Of  The Same
        Dynamic D = new Dynamic();
        D.Music();

        //Making The Object By TaKing Refrence Of Parent Class And Object Of  The Child Class
       FirstClass d = new Dynamic();
       d.On();
       d.ShowTime();
    }
}
*/