package com.Lamar.Chapter10Exercises;

//        UML DIAGRAM

//****************************************
//            TIME
//
//-hour: long
//-minute: long
//-second: long
//Time()
//Time(elapseTime: long)
//Time(hour:  long minute: long second)
//getHour(): long
//getMinute():long
//getSecond(): long
//setTime(elapseTime: long)

//****************************************


public class Time {
        private long hour;
        private long minute;
        private long second;

//        Create a Time Object for the current time
    Time(){
        this(0);
    }

//    Construct Time object with a specified elapsed time since midnight 1/1/1970 in ms

    Time(long elapseTime){
        setTime(elapseTime);
    }


    public Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

//    getters


    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public void setTime(long elapseTime){
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds/1000;
        second = totalSeconds % 60;
        long totalMinutes = totalSeconds/60;
        minute = totalMinutes % 60;
        long totalHours = totalMinutes /60;
        hour = totalHours % 24;

        if(elapseTime >0){
            totalSeconds = elapseTime/1000;
            second = totalSeconds % 60;
            totalMinutes = totalSeconds /60;
            minute = totalMinutes %60;
            totalHours = totalMinutes/60;
            hour = totalHours % 24;
        }

    }
}
