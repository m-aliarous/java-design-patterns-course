package com.example;

public class MediaPlayerPaused implements MediaPlayerState{


    public void pressButton(MediaPlayer mediaPlayer) {
        mediaPlayer.play();
        mediaPlayer.setState(new MediaPlayerPlaying());
    }



}
