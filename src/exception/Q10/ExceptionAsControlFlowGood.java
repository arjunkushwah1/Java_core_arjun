package exception.Q10;
public class ExceptionAsControlFlowGood
{
        public static void main(String[] args) {
            int num[]={1,2,0,4,5};
            for(int n:num) {
                if (n == 0) {
                    System.out.println("Zero found, exiting loop."); //good practice , using break for normal flow
                    break;
                }
                System.out.println("Number: " + n);
            }
        }

}
