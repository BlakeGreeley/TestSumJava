class TestSum {
    //first run:

    //public static void main(String[] args) {
        //long start = System.currentTimeMillis();
        //Integer sum = 0;
        //for (int i = 0; i < Integer.MAX_VALUE; i++) {
        //    sum += i;
        //}
        //System.out.println("Sum: " + sum);
        //long end = System.currentTimeMillis();
        //double total = (double) (end - start) / 1000;
        //System.out.println("Time of execution: " + total + " seconds");
        // outputs Sum: 1073741825
        //Time of execution: 3.342 seconds

    // second run to speed it up. 
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        // below is what was changed:
        int sum = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
        long end = System.currentTimeMillis();
        double total = (double) (end - start) / 1000;
        System.out.println("Time of execution: " + total + " seconds");
        // outputs: Sum: 1073741825
        // Time of execution: 0.84 seconds
        // much faster
    }
    
}
