package com.example;

public class MediaPlayerPlaying implements MediaPlayerState{
    private MediaPlayer mediaPlayer;
    
    
    public MediaPlayerPlaying(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }
    
    public void pressButton() {
        this.pause();
        mediaPlayer.setState(new MediaPlayerPaused(mediaPlayer));
    }



    public void pause() {
        System.out.println("Paused");
        System.out.println("Displaying play icon");
    }

}
