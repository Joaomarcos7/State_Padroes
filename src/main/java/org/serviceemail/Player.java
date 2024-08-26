package org.serviceemail;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private IPlayerState state;
    private List<String> playlist;
    private int currentTrack;

    public Player() {
        this.playlist = new ArrayList<>();
        // Povoamento automático da playlist
        for (int i = 1; i <= 12; i++) {
            playlist.add("Música " + i);
        }
        this.currentTrack = 0;
        this.state = new ReadyState(); // Estado inicial
    }

    public void setState(IPlayerState state) {
        this.state = state;
    }

    public void play() {
        state.play(this);
    }

    public void stop() {
        state.stop(this);
    }

    public void next() {
        state.next(this);
    }

    public void previous() {
        state.previous(this);
    }

    public void startPlayback() {
        System.out.println("Reproduzindo: " + playlist.get(currentTrack));
    }

    public void nextTrack() {
        currentTrack = (currentTrack + 1) % playlist.size();
        startPlayback();
    }

    public void previousTrack() {
        currentTrack = (currentTrack - 1 + playlist.size()) % playlist.size();
        startPlayback();
    }
}
