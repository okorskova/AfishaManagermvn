package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaManagerTest {



    @Test
    public void shouldFindAllFilmsInAfisha() {

        AfishaManager manager = new AfishaManager();

        manager.add("title1");
        manager.add("title2");
        manager.add("title3");
        manager.add("title4");
        manager.add("title5");
        manager.add("title6");
        manager.add("title7");
        manager.add("title8");
        manager.add("title9");
        manager.add("title10");
        manager.add("title11");
        manager.add("title12");

        String[] expected = {"title1", "title2", "title3", "title4", "title5", "title6", "title7", "title8", "title9", "title10", "title11", "title12"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldFindLast10FilmsInAfisha() {

        AfishaManager manager = new AfishaManager(10);

        manager.add("title1");
        manager.add("title2");
        manager.add("title3");
        manager.add("title4");
        manager.add("title5");
        manager.add("title6");
        manager.add("title7");
        manager.add("title8");
        manager.add("title9");
        manager.add("title10");
        manager.add("title11");
        manager.add("title12");

        String[] expected = {"title12", "title11", "title10", "title9", "title8", "title7", "title6", "title5", "title4", "title3"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldFindLast5FilmsInAfisha() {

        AfishaManager manager = new AfishaManager(5);

        manager.add("title1");
        manager.add("title2");
        manager.add("title3");
        manager.add("title4");
        manager.add("title5");
        manager.add("title6");
        manager.add("title7");
        manager.add("title8");
        manager.add("title9");
        manager.add("title10");
        manager.add("title11");
        manager.add("title12");

        String[] expected = {"title12", "title11", "title10", "title9", "title8"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void shouldFindLast10FilmsUnderLimit() {

        AfishaManager manager = new AfishaManager(10);

        manager.add("title1");
        manager.add("title2");
        manager.add("title3");
        manager.add("title4");
        manager.add("title5");
        manager.add("title6");
        manager.add("title7");
        manager.add("title8");


        String[] expected = {"title8", "title7", "title6", "title5", "title4", "title3", "title2", "title1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}
