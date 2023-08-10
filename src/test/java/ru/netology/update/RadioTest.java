package ru.netology.update;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.java.Radio;

public class RadioTest {
    @Test
    public void inputRadioWave() {
        Radio radio = new Radio(20);
        Assertions.assertEquals(19, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void inputNegativeRadioWave() {
        Radio radio = new Radio(-20);
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void nextRadioWaveIfMax() {
        Radio radio = new Radio(11);
        radio.setCurrentStation(10);
        radio.setNextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioWaveIfMin() {
        Radio radio = new Radio(33);
        radio.setCurrentStation(0);
        radio.setNextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioWaveIfMin() {
        Radio radio = new Radio(51);
        radio.setCurrentStation(0);
        radio.setPrevStation();

        int expected = 50;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioWaveIfMax() {
        Radio radio = new Radio(40);
        radio.setCurrentStation(39);
        radio.setPrevStation();

        int expected = 38;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseSoundLevelIfMax() {
        Radio radio = new Radio();
        radio.setCurrentSoundLevel(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundLevelIfMin() {
        Radio radio = new Radio();
        radio.setCurrentSoundLevel(0);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseSoundLevelIfMin() {
        Radio radio = new Radio();
        radio.setCurrentSoundLevel(0);
        radio.shrinkVolume();

        int expected = 0;
        int actual = radio.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseSoundLevelIfMax() {
        Radio radio = new Radio();
        radio.setCurrentSoundLevel(100);
        radio.shrinkVolume();

        int expected = 99;
        int actual = radio.getCurrentSoundLevel();

        Assertions.assertEquals(expected, actual);
    }
}

