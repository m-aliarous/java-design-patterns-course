package com.example;

public class MediaPlayerPaused implements MediaPlayerState{
    private MediaPlayer mediaPlayer;

    public MediaPlayerPaused(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    public void pressButton() {
        this.play();
        mediaPlayer.setState(new MediaPlayerPlaying(mediaPlayer));
    }

    public void play() {
        System.out.println("Playing");
        System.out.println("Displaying pause icon");
    }

}
