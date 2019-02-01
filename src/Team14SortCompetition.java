public class Team14SortCompetition extends SortCompetition
{
    public static void swap(double[] arr, int x, int y) {
        double temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void swap(String[] arr, int x, int y) {
        String temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    //__________________________________________________________________________________________________________________

    public static int[] copyArr (int [] arr) {
        int[] out = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
            out[i] = arr[i];
        return out;
    }

    public static String[] copyArr (String [] arr) {
        String[] out = new String[arr.length];
        for(int i = 0; i < arr.length; i++)
            out[i] = arr[i];
        return out;
    }

    public static double[] copyArr (double [] arr) {
        double[] out = new double[arr.length];
        for(int i = 0; i < arr.length; i++)
            out[i] = arr[i];
        return out;
    }

    //__________________________________________________________________________________________________________________

    public static int[] randIntArr(int count) {
        int[] arr = new int[count];
        for (int x = 0; x < count; x++)
            arr[x] = (int) (Math.random() * 10001);
        return arr;
    }

    public static double[] randDoubleArr(int count) {
        double[] arr = new double[count];
        for (int x = 0; x < count; x++)
            arr[x] = (Math.random() * 10001);
        return arr;
    }

    public static String[] randStringArr(int count, int length) {
        String [] arr = new String [count];
        while (count > 0)
        {
            int i = 0;
            String s = "";
            while (i<length)
            {
                char c = (char) ((Math.random()*26)+97);
                s = s+c;
                i++;
            }
            count--;
            arr [count] = s;
        }
        return arr;
    }

    //__________________________________________________________________________________________________________________

    public static void printArr(int [] arr)
    {
        String out = "";
        for (int i = 0; i < arr.length; i++ )
        {
            out = out + "[" + arr[i] + "], ";
        }
        System.out.println(out+"\n");
    }

    public static void printArr(double [] arr)
    {
        String out = "";
        for (int i = 0; i < arr.length; i++ )
        {
            out = out + "[" + arr[i] + "], ";
        }
        System.out.println(out+"\n");
    }

    public static void printArr(String [] arr)
    {
        String out = "";
        for (int i = 0; i < arr.length; i++ )
        {
            out = out + "[" + arr[i] + "], ";
        }
        System.out.println(out+"\n");
    }

    // __________________________________________________________________________________________________________________

    public static boolean isSorted (int [] in)
    {
        for (int i = 0; i < in.length -1; i++)
        {
            if (in[i] > in [i+1])
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted (double [] in)
    {
        for (int i = 0; i < in.length -1; i++)
        {
            if (in[i] > in [i+1])
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted (String [] in)
    {
        for (int i = 0; i < in.length -1; i++)
        {
            if (in[i].compareTo(in [i+1]) > 0)
            {
                return false;
            }
        }
        return true;
    }

    //__________________________________________________________________________________________________________________

    public static boolean checkSum (double [] a, double [] b) {
        double sum1 = 0;
        double sum2 = 0;

        if (a.length != b.length)
        {
            return false;
        }
        for (int i = 0; i < a.length; i++)
        {
            sum2 = sum2 + b[i];
            sum1 = sum1 + a[i];
        }

        return sum1 == sum2;

    }
    //__________________________________________________________________________________________________________________






    @Override
    public int challengeOne(int[] arr)
    {
        return 0;

    }

    @Override
    public int challengeTwo(String[] arr, String query)
    {
        return 0;
    }

    @Override
    public int challengeThree(int[] arr)
    {
        return 0;
    }

    @Override
    public int challengeFour(int[][] arr)
    {
        return 0;
    }

    @Override
    public int challengeFive(Comparable[] arr, Comparable query)
    {
        return 0;
    }

    @Override
    public String greeting()
    {
        return "We are Team14, If we win, please send V-bucks to chenBrian@fortnite.edu";
    }
    //__________________________________________________________________________________________________________________
    // Sorting algorithms
    public static void insertionSort(int [] in)
    {
        for (int i =0; i < in.length; i++)
        {
            for(int a = i; a >0; a--)
            {
                if (in[a]<in[a-1])
                {
                    swap(in,a,a-1);
                }
                else a = 0;
            }
        }
    }

}