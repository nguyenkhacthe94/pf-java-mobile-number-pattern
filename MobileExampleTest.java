public class MobileExampleTest {
    private static MobileExample MobileExample;
    public static final String[] validMobile = new String[] { "(84)-(0978489648)" };
    public static final String[] invalidMobile = new String[] { "(a8)-(22222222)" };

    public static void main(String args[]) {
        MobileExample = new MobileExample();
        for (String Mobile : validMobile) {
            boolean isvalid = MobileExample.validate(Mobile);
            System.out.println("Mobile is " + Mobile +" is valid: "+ isvalid);
        }
        for (String Mobile : invalidMobile) {
            boolean isvalid = MobileExample.validate(Mobile);
            System.out.println("Mobile is " + Mobile +" is valid: "+ isvalid);
        }
    }
}

