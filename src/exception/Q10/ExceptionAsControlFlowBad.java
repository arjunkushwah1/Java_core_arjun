package exception.Q10;
public class ExceptionAsControlFlowBad
{
    public static void main(String[] args) {
        int num[]={1,2,0,4,5};
        for(int n:num)
        {
            try {
                if(n==0) {
                    throw new Exception("zero found, exiting from loop");// bad practice
                }
                System.out.println("Number: "+n);
            }
            catch (Exception e) {
                System.out.println("Exception caught: "+e.getMessage());
                break;
            }
        }
    }
}
