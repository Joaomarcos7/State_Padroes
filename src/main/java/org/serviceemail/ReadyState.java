package org.serviceemail;

public class ReadyState implements IPlayerState {
    @Override
    public void play(Player player) {
        player.setState(new PlayingState());
        player.startPlayback();
    }

    @Override
    public void stop(Player player) {
        player.setState(new LockedState());
    }

    @Override
    public void next(Player player) {
        // Não faz nada
    }

    @Override
    public void previous(Player player) {
        // Não faz nada
    }
}
