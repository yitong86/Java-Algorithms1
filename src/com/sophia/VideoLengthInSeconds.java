package com.sophia;
import java.util.*;

public class VideoLengthInSeconds {
    public static void main(String[] args) {
        System.out.println(minutesToSeconds("01:00"));
    }
    public static int minutesToSeconds(String tm) {
    //"01:00"
    String[] arr = tm.split(":");
    int mins = Integer.parseInt(arr[0]);
    int seconds = Integer.parseInt(arr[1]);
		if (seconds >= 60) {
        return -1;
    }
		return (mins * 60)+seconds;


}
}
