package com.company;
import java.util.*;

public class TimeDifference {
    private String time1, time2;

    public TimeDifference(String time1, String time2) {
        this.time1 = time1;
        this.time2 = time2;
    }

    public void Difference() {
        String[] time1HM = time1.split(":");
        String[] time2HM = time2.split(":");

        int time1Hours = Integer.parseInt(time1HM[0]);
        int time1Minutes = Integer.parseInt(time1HM[1]);
        int time2Hours = Integer.parseInt(time2HM[0]);
        int time2Minutes = Integer.parseInt(time2HM[1]);

        int time1InMinutes = (time1Hours * 60) + time1Minutes;
        int time2InMintues = (time2Hours * 60) + time2Minutes;

        int timeDiff = Math.abs(time1InMinutes - time2InMintues);

        int diffHours = timeDiff / 60;
        int diffMinutes = timeDiff % 60;

        System.out.printf("Difference in times: %02d:%02d\n", diffHours, diffMinutes);
    }
}