package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    @Test
    public void TestWenfirstPlayerTwoWin(){
        Player Max = new Player(1, "Максим", 100);
        Player Nikita = new Player(2,"Никита", 120);
        Game game = new Game();

        game.register(Max);
        game.register(Nikita);
        int actual = game.round("Никита", "Максим");
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestWenfirstPlayerOneWin(){
        Player Max = new Player(1, "Максим", 130);
        Player Nikita = new Player(2,"Никита", 120);
        Game game = new Game();

        game.register(Max);
        game.register(Nikita);
        int actual = game.round("Никита", "Максим");
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestWenfirstPlayerEquals(){
        Player Max = new Player(1, "Максим", 120);
        Player Nikita = new Player(2,"Никита", 120);
        Game game = new Game();

        game.register(Max);
        game.register(Nikita);
        int actual = game.round("Никита", "Максим");
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestWenfirstPlayerNotExist(){
        Player Max = new Player(1, "Максим", 100);
        Player Nikita = new Player(2,"Никита", 120);
        Game game = new Game();

        game.register(Max);
        game.register(Nikita);

        Assertions.assertThrows(NotRegisteredException.class, ()-> game.round("Артем","Евгений"));
    }
    @Test
    public void TestWenfirstPlayerTwoNotExist(){
        Player Max = new Player(1, "Максим", 100);
        Player Nikita = new Player(2,"Никита", 120);
        Game game = new Game();

        game.register(Max);
        game.register(Nikita);

        Assertions.assertThrows(NotRegisteredException.class, ()-> game.round("Артем","Максим"));
    }

    @Test
    public void TestWenfirstPlayerOneNotExist(){
        Player Max = new Player(1, "Максим", 100);
        Player Nikita = new Player(2,"Никита", 120);
        Game game = new Game();

        game.register(Max);
        game.register(Nikita);

        Assertions.assertThrows(NotRegisteredException.class, ()-> game.round("Артем","Никита"));
    }


}