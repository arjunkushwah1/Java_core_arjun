package exception.Q2;
class BankingException extends Exception {
    public BankingException(String str_msg) {
        super(str_msg);
    }
}
class InsufficientFundsException extends BankingException {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}
class InvalidAccountException extends BankingException
{
    public InvalidAccountException(String msg)
    {
        super(msg);
    }
}
public class BankTransactionDemo {
    public static  void transferFund(String fromAcc, String toAcc,double amo)
            throws InsufficientFundsException,InvalidAccountException
    {
        if(fromAcc==null||toAcc==null)
        {
            throw new InvalidAccountException("One of the accounts is invalid.");
        }
        if(amo > 1000)
        {
            throw new InsufficientFundsException("not too much fund for this trandsfer");
        }
        System.out.println("transferred "+amo+" from "+fromAcc+" to "+toAcc);
    }
    public static void main(String[] args) {
        try {
            transferFund("123","456",1500);
        }
        catch (InsufficientFundsException e) {
            System.out.println("insufficient fund : "+e.getMessage());
        }
        catch (InvalidAccountException e) {
            System.out.println("invalid account : "+e.getMessage());
        }

        try {
            transferFund(null, "456", 500); //  triggering InvalidAccountException
        }
        catch (BankingException e) {
            System.out.println("Banking error: " + e.getMessage());
        }
    }
}