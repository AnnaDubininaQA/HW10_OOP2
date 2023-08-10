package ru.netology.java;

public class Radio {
    private int maxStation;
    private int minStation;
    private int currentStation = minStation;
    private int maxVolume = 100;
    private int minVolume = 0;

    private int currentSoundLevel = minVolume;


    public Radio(int quantityStation) {
        maxStation = quantityStation - 1;
        if (quantityStation < 0) {
            maxStation = currentStation;
        }
    }

    public Radio() {
        maxStation = 9;
        minStation = 0;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentSoundLevel() {
        return currentSoundLevel;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (currentStation < minStation) {
            currentStation = minStation;
            return;
        }
        if (newCurrentStation > maxStation) {
            currentStation = minStation;
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setNextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation++;

        }
    }

    public void setPrevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation--;

        }
    }

    public void increaseVolume() {
        if (currentSoundLevel < maxVolume) {
            currentSoundLevel = currentSoundLevel + 1;
        }
    }

    public void shrinkVolume() {
        if (currentSoundLevel > minVolume) {
            currentSoundLevel = currentSoundLevel - 1;
        }
    }

    public void setCurrentSoundLevel(int newCurrentSoundLevel) {
        if (newCurrentSoundLevel > maxVolume) {
            return;
        }
        if (newCurrentSoundLevel < minVolume) {
            return;
        }
        currentSoundLevel = newCurrentSoundLevel;
    }
}

