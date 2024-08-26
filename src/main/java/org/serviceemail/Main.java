package org.serviceemail;

public class Main {
    public static void main(String[] args) {

        Player player = new Player();

        player.play(); // Deve iniciar a reprodução
        player.next(); // Deve avançar para a próxima música
        player.stop(); // Deve mudar para o estado locked
        player.play(); // Deve destravar e mudar para o estado ready
        player.stop(); // Deve mudar para o estado locked novamente
    }
}