package com.example;

public class MediaPlayer {
    private MediaPlayerState state;



    public MediaPlayer() {
        this.state = new MediaPlayerPaused(this);
    }

    public void pressButton() {
        this.state.pressButton();
    }
        public void setState(MediaPlayerState state) {
        this.state = state;
    }

}
