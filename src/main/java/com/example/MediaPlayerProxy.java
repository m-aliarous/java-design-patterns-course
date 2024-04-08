/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author mstf
 */
public class MediaPlayerProxy implements MediaPlayer{
    private  MediaPlayer mediaPlayer;

    @Override
    public void playMedia() {
        if(mediaPlayer == null) 
            mediaPlayer = new MovieMediaPlayer();
        mediaPlayer.playMedia();
    }
    
    
    
    
}
