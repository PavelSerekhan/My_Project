package com.company;

public class Gremlen{
    static int gremlinCount = 0;
    private int guid;

    public Gremlen(){
        gremlinCount++;
    }
    static int getGremlinCount(){
        return gremlinCount;
    }
}


