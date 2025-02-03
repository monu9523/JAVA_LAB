public class PrimitiveDataTypes {
  public static void main(String[] args) {
        byte byteVar = 0;
        short shortVar = 0;
        int intVar = 0;
        long longVar = 0L;
        float floatVar = 0.0f;
        double doubleVar = 0.0d;
        char charVar = '\u0000'; 
        boolean booleanVar = false;
 // Print default values and sizes
        System.out.println("Data Type\tDefault Value\tSize (bytes)");
        System.out.println("byte\t\t" + byteVar + "\t\t" + Byte.BYTES);
        System.out.println("short\t\t" + shortVar + "\t\t" + Short.BYTES);
        System.out.println("int\t\t" + intVar + "\t\t" + Integer.BYTES);
        System.out.println("long\t\t" + longVar + "\t\t" + Long.BYTES);
        System.out.println("float\t\t" + floatVar + "\t\t" + Float.BYTES);
        System.out.println("double\t\t" + doubleVar + "\t\t" + Double.BYTES);
        System.out.println("char\t\t" + (int) charVar + "\t\t" + Character.BYTES); 
        System.out.println("boolean\t\t" + booleanVar + "\t\t1 (JVM-dependent)");
    }
}
