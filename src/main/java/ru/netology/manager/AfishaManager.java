package ru.netology.manager;


public class AfishaManager {
    private String[] items = new String[0];
    private int limit;

    public AfishaManager(int limit) {
        this.limit = limit;
    }

    public AfishaManager() {

    }

    public void add(String item) {
        String[] tmp = new String[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

   public  String[] findAll() {
        return items;
   }

    public String[] findLast() {
        int resultLength;
        if (items.length < limit) {
            resultLength = items.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = items[items.length - 1 - i];
        }
        return  tmp;
    }
}