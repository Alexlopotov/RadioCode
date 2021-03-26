package ru.netology.domain;


public class Radio {

    private int currentStation;
    private int firstStation;
    private int lastStation = 10;
    private int currentVolume;
    private int minVolume;
    private int maxVolume = 100;

    public Radio() {
    }

    public Radio(int lastStation) {
        this.lastStation = lastStation;
    }

    public int getLastStation() {
        return lastStation;
    }

    public int getCurrentStation() {
        return this.currentStation;
    }

    public void setCurrentStation(int pressedStation) {
        if (pressedStation > lastStation || pressedStation < firstStation) {
            return;
        }
        this.currentStation = pressedStation;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setCurrentVolume(int pressedVolume) {
        if (pressedVolume > maxVolume || pressedVolume < minVolume) {
            return;
        }
        this.currentVolume = pressedVolume;
    }

    public void stationNumberNext() {

        if (currentStation == lastStation) {
            setCurrentStation(firstStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void stationNumberPrev() {
        if (currentStation == firstStation) {
            setCurrentStation(lastStation);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public void stationVolumeUp() {
        setCurrentVolume(currentVolume + 1);
    }

    public void stationVolumeDown() {
        setCurrentVolume(currentVolume - 1);
    }
}
