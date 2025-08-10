package skill2;

public class Stringbuffer {
	public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("Original StringBuffer: " + sb);

        // 1. append() - Add text to the end
        sb.append(" World");
        System.out.println("After append(): " + sb);

        // 2. insert() - Insert text at a given position
        sb.insert(5, ",");
        System.out.println("After insert(): " + sb);

        // 3. replace() - Replace characters between indexes
        sb.replace(0, 5, "Hi");
        System.out.println("After replace(): " + sb);

        // 4. delete() - Delete characters between indexes
        sb.delete(2, 4);
        System.out.println("After delete(): " + sb);

        // 5. reverse() - Reverse the string
        sb.reverse();
        System.out.println("After reverse(): " + sb);

        // 6. capacity() - Show current capacity of the buffer
        System.out.println("Capacity of StringBuffer: " + sb.capacity());

        // 7. length() - Show current length of the string
        System.out.println("Length of StringBuffer: " + sb.length());
    }

}
