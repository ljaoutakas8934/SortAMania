public class Team6SortCompetition extends SortCompetition{

    public int challengeOne(int[] arr)
    {
        int i = 0;
        int j = arr.length-1;
        int median = 0;
        int[] sortedArr = quickSort(arr,0,arr.length-1);
        while(i != j)
        {
            i++;
            j--;
            if((i+1) == j || (j-1) == i)
            {
                int total = sortedArr[i] + sortedArr[j];
                median = (total/2);
                break;
            }
            else
            {
                median = sortedArr[i];
            }
        }
        return median;
    }

    public int challengeTwo(String[] arr, String query)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if(query.equals(arr[i]))
            {
                return i;
            }
        }
        return -1;
    }

    public int challengeThree(int[] arr)
    {
        int i = 0;
        int j = arr.length-1;
        int median = 0;
        int[] sortedArr = insertionSort(arr);
        while(i != j)
        {
            i++;
            j--;
            if((i+1) == j || (j-1) == i)
            {
                int total = sortedArr[i] + sortedArr[j];
                median = (total/2);
                break;
            }
            else
            {
                median = sortedArr[i];
            }
        }
        return median;
    }

    public int challengeFour(int[][] arr)
    {
        int[] arr2 = new int[arr.length];
        int x = 0;
        int y = 0;
        int median = 0;
        for(int i = 0; i<arr.length; i++)
        {
            int[] subarr = new int[arr[i].length];
            for(int j = 0; j<arr[i].length; j++)
            {
                subarr[j] = arr[i][j];
            }
            int[] sortedArr = quickSort(subarr,0,arr.length-1);
            int x2 = 0;
            int y2 = 0;
            int median2 = 0;
            while(x2 != y2)
            {
                x2++;
                y2--;
                if((x2+1) == y2 || (y2-1) == x2)
                {
                    int total = sortedArr[x2] + sortedArr[y2];
                    median2 = (total/2);
                    break;
                }
                else
                {
                    median2 = sortedArr[x2];
                }
            }
            arr2[i] = median2;
        }
        while(x != y)
        {
            x++;
            y--;
            if((x+1) == y || (y-1) == x)
            {
                int total = arr2[x] + arr2[y];
                median = (total/2);
                break;
            }
            else
            {
                median = arr2[x];
            }
        }
        return median;
    }

    public int challengeFive(Comparable[] arr, Comparable query)
    {
        //return position of the object, or -1 if not found;
    }

    public String greeting()
    {
        return "Yo what's good? Back in my day I was known as the sorting champion! I'm a little old now, but I can still sort like there's no tomorrow!";
    }

    public int[] quickSort(int[] arr, int left, int right)
    {
        if(left<right)
        {
            int pivot = partition(arr,left,right);
            quickSort(arr,left,pivot-1);
            quickSort(arr,pivot+1,right);
        }
    }

    public int partition(int[] arr, int left, int right)
    {
        int temp;
        int pivot = arr[right];
        int i = left-1;
        for(int j = left; j<right; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i+1];
        arr[i+1]=arr[right];
        arr[right]=temp;
        return i+1;
    }

    public int[] insertionSort(int[] list1)
    {
        int min;
        for(int i = 1; i < list1.length; i++)
        {
            min = list1[i];
            int temp = min;
            for(int x = i-1; x>=0; x--)
            {
                if(list1[x]>temp)
                {
                    list1[x+1] = list1[x];
                    list1[x] = temp;
                }
            }
        }
    }
}
