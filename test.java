import java.util.Arrays;
// import StdOut;

class SortArray
{
    public static void main(String[] args)
    {
        int[] array = {3, 5, 7, 8, 1, 0, 9};
        Arrays.sort(array);
        // StdOut.print("Hello!");
        for(int i = 0; i < array.length; i++)
        { 
            // System.out.print(array[i]);
            StdOut.print(array[i]);
        }
    }
}
