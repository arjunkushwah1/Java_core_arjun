package exception.Q7;
class ResourceA implements AutoCloseable {
    @Override
    public void close() throws Exception {
        throw new Exception("Exception from ResourceA");
    }
}
class ResourceB implements AutoCloseable {
    @Override
    public void close() throws Exception {
        throw new Exception("Exception from ResourceB");
    }
}
public class SuppressedExceptionDemo
{
    public static void main(String[] args) {
        try(ResourceA resA=new ResourceA();
        ResourceB resB=new ResourceB()){
            System.out.println("using resources...");
        }
        catch (Exception e) {
            System.out.println("caught: "+e.getMessage());
        }
    }
}
