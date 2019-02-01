public class Runner {


    public static void main(String[] args) {
        SortCompetition team7= new Team7SortCompetition();
        int[] randIntArr= sortHelper.randIntArr(10000);
        String[] randStringArr= sortHelper.randStringArr(5,5);

        System.out.println("Unsorted");
        printArr(randIntArr);

        long time= System.currentTimeMillis();
        int median= team1.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenege One Time Taken: " + time * 0.0001 + "Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        printArr(randIntArr);




    }

}
