package org.serviceemail;

public interface IPlayerState {
    void play(Player player);
    void stop(Player player);
    void next(Player player);
    void previous(Player player);
}
