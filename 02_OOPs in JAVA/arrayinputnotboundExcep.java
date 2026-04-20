public class arrayinputnotboundExcep {
    public static void main(String[] args) {
        try {
            int[] a = new int[5]; // Fixed: Added missing semicolon
            a[5] = 10; // This will throw ArrayIndexOutOfBoundsException (valid indices are 0-4)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}   
