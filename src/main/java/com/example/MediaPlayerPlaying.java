package com.example;

public class MediaPlayerPlaying implements MediaPlayerState{
    
    public void pressButton(MediaPlayer mediaPlayer) {
        mediaPlayer.pause();
        mediaPlayer.setState(new MediaPlayerPaused());
    }



}
