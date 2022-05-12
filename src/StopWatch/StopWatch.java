package StopWatch;

import java.util.Date;
import java.util.Locale;

public class StopWatch {
    private long startTime, endTime;

    public StopWatch() {
    }

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long start() {
        startTime = new Date().getTime();
        return startTime;
    }

    public long stop() {
        endTime = new Date().getTime();
        return endTime;
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}
