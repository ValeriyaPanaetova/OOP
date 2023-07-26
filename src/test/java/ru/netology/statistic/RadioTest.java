package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setCurrentStationRegular(){
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setCurrentStationOver9(){
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.setCurrentStation(10);
        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentStationBellowZero(){
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.setCurrentStation(-1);
        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextRegular(){
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.nex();
        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextAfterNine(){
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.nex();
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevAfterNine(){
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.prev();
        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevPreviousZero(){
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setVolumeOver100(){
        Radio radio = new Radio();

        radio.setCurrentVolume(15);
        radio.setCurrentVolume(101);
        int expected = 15;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setVolumeBelloZero(){
        Radio radio = new Radio();

        radio.setCurrentVolume(15);
        radio.setCurrentVolume(-1);
        int expected = 15;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeOver100(){
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumeBelloZero(){
        Radio radio = new Radio();

        radio.setCurrentVolume(15);
        radio.decreaseVolume();
        int expected = 14;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeRegular(){
        Radio radio = new Radio();

        radio.setCurrentVolume(20);
        radio.increaseVolume();
        int expected = 21;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumeRegular(){
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
