import java.nio.IntBuffer;

public class buffer1 {
    public static void main(String[] args) {
        IntBuffer obj = IntBuffer.allocate(4);
        obj.put(2,10);
        System.out.println(obj);

        int[] arr = obj.array();

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
