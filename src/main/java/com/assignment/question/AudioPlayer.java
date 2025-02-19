package com.assignment.question;

// Part 1: abstract common attrs and methods
public abstract class AudioPlayer {
    // common attrs
    private Integer volume;
    private Double playBackRate;

    // CTOR
    public AudioPlayer(Integer volume, Double playBackRate) {
        this.volume = volume;
        this.playBackRate = playBackRate;
    }

    public abstract MediaFormat supportsType();

    // common methods
    public abstract void play();

    public abstract void pause();

    public abstract void stop();

    public Integer getVolume() {
        return this.volume;
    }

    public Double getPlayBackRate() {
        return this.playBackRate;
    }

    public void setVolume(Integer volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println("Volume set to " + volume);
        }
        else
            System.out.println("Invalid volume level");
    }
}