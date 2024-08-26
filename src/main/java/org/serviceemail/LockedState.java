package org.serviceemail;

public class LockedState implements  IPlayerState{
    @Override
    public void play(Player player) {
        player.setState(new ReadyState());
    }

    @Override
    public void stop(Player player) {
        System.out.println("Player travado!");
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
