package CLASS_AND_OBJECT_JAVA;

public class check_access_modifier {
    public String checkAvability = "Hello i am public member ";
    protected String checkProtectedAvability = "Hello i am Protected member ";

    void printMsg(){
        System.out.println("WITHIN CLASS PUBLIC:: "+checkAvability);
    }
    void printMsgProtected(){
        System.out.println("WITHIN CLASS PROTECTED "+checkProtectedAvability);
    }
}
