package StopWatch;

public class StopWatch {
    private double startTime;
    private double endTime;

    public StopWatch(double start){
        this.startTime = start;
    }

    public void setStartTime(){
        this.startTime = System.currentTimeMillis();
    }

    public void setStopTime(){
        this.endTime = System.currentTimeMillis();
    }

    public double getElapsedTime(){
        double time = (this.endTime - this.startTime);
        return time;
    }
}
