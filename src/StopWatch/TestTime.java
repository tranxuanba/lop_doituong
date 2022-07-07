package StopWatch;

import java.util.Arrays;

public class TestTime {
    public static void main(String[] args) {
        double start = System.currentTimeMillis();

        StopWatch stop = new StopWatch(start);

        stop.setStartTime();

        TestTime.setArray();

        stop.setStopTime();

        System.out.println(stop.getElapsedTime());
    }
    public static void setArray(){
        long[] array = new long[100000];
        for (int i=0; i<array.length; i++){
            array[i] = Math.round(Math.random()*100000+1);
        }
        Arrays.sort(array);
    }
}