// This file is optional to edit and can be used for manual testing.

public class Main {
    /**
     * The entry point of the application.
     * 
     * This method creates a StringUtilities object and manually tests its method by calling it several times with varying arguments and printing out the results.
     * 
     * @param args - Command line arguments (not used in this application)
     */
    public static void main(String[] args) {
        System.out.println("The combine method from the StringUtilities file should combine two Strings together.");
        StringUtilities stringUtil = new StringUtilities();

        System.out.println("Here's what stringUtil.combine returns when provided values \"abc\" and \"xyz\":");
        String p1val1 = "abc";
        String p1val2 = "xyz";
        String output1 = stringUtil.combine(p1val1, p1val2);
        System.out.println(output1);

        System.out.println("Here's what stringUtil.combine returns when provided the value \"hello\" and \"world\":");
        String p2val1 = "hello";
        String p2val2 = "world";
        String output2 = stringUtil.combine(p2val1, p2val2);
        System.out.println(output2);
    }
}
