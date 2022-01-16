public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        long sum = 0;
        stopWatch.start();
        for (int i = 0; i < 100000000; i++) {
            sum+= i;
        }
        stopWatch.stop();
        System.out.println("Thời gian chạy của chương trình là: " + stopWatch.getElapsedTime() + " ms");
    }
}
