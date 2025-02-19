package com.assignment.question;

// Part 3: Implement Factory
public class AudioPlayerFactory {
    public static AudioPlayer getAudioPlayer(MediaFormat mediaFormat, Integer volume, Double playBackRate) {
        switch (mediaFormat) {
            case FLAC:
                return new FLACPlayer(volume, playBackRate);
            case WAV:
                return new WAVPlayer(volume, playBackRate);
            case MP3:
                return new MP3Player(volume, playBackRate);
            default:
                throw new IllegalArgumentException("Invalid media format '" + mediaFormat + "'");
        }
    }
}