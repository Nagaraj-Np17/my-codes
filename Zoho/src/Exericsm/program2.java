package Exericsm;

import java.util.*;
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
       return this.birdsPerDay;
    }

    public int getToday() {
       return this.birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
       this.birdsPerDay[birdsPerDay.length-1]=birdsPerDay[birdsPerDay.length-1]+1;
    }

    public boolean hasDayWithoutBirds() {
       for(int i:birdsPerDay){
           if(i==0){
               return true;
           }
       }
        return  false;
    }

    public int getCountForFirstDays(int numberOfDays) {
     return  Arrays.stream(birdsPerDay).limit(numberOfDays).sum();
       
    }

    public int getBusyDays() {
        int busyCount=0;
      for(int i:birdsPerDay){
         if(i>=5){
             busyCount++;
         }
    }
        return busyCount;
}
}