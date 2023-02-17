public class InfiniteLoop {
    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }
        int count = 20;
        for(int i = 0; i < array.length; i++){
            if(count == 0)break;
            System.out.print(array[i] + " ");
            count--;

        }
    }
}
