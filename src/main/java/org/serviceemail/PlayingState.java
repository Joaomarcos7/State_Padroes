package org.serviceemail;

public class PlayingState implements IPlayerState{
    @Override
    public void play(Player player) {
        player.setState(new ReadyState());
    }

    @Override
    public void stop(Player player) {
        player.setState(new LockedState());
    }

    @Override
    public void next(Player player) {
        player.nextTrack();
    }

    @Override
    public void previous(Player player) {
        player.previousTrack();
    }
}

