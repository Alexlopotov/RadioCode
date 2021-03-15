package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void changeNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void changePrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);
        radio.prevStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void pressNextButton() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void pressPrevButton() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void toSetStationNumberMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(-6);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void toSetStationNumberMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(11);
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void volumeUp() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        radio.plusVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void volumeDown() {
        Radio radio = new Radio();

        radio.setCurrentVolume(3);
        radio.minusVolume();
        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void volumeUpOverMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(102);
        radio.plusVolume();
        assertEquals(100 , radio.getCurrentVolume());
    }

    @Test
    public void volumeDownUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}
