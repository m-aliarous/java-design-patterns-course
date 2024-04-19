package com.example;

public class MediaPlayer {
    private MediaPlayerState state;



    public MediaPlayer() {
        this.state = new MediaPlayerPaused();
    }

    public void pressButton() {
        this.state.pressButton(this);
    }
        public void setState(MediaPlayerState state) {
        this.state = state;
    }
    public void play() {
        System.out.println("Playing");
        System.out.println("Displaying pause icon");
    }
    
    public void pause() {
        System.out.println("Paused");
        System.out.println("Displaying play icon");
    }

}
