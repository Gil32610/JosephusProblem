public class Main {
    public static void main(String[] args) {
        int[] anArray = solve(4, 7);
        for(int i = 0; i< anArray.length; i++){
            System.out.println(anArray[i] + " ");
        }
    }
    public static int[] solve(int m, int n) {
        int []array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = i;
        }
        return array = kill(array, m);
    }
    public static boolean isDone(int[]array){
        for(int i = 0; i< array.length; i++){
            if(array[i]!= -1)return false;
        }
        return true;
    }
    public static int[] kill(int[] array, int m){
        int[] order = new int[array.length];
        int count =0;
        int next = m-1;
        for(int i = 0; !isDone(array); i++){
            if(array[i%array.length] == -1){
                continue;
            }
            if(next == 0){
                order[count] = array[i%array.length];
                array[i% array.length] = -1;
                count++;
                next =m-1;
                continue;
            }
            next--;

        }
        return order;

    }


}
