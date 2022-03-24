package com.example.equalshascodetostring;

import java.util.Objects;

public class Color {
    private int x;
    private int y;

    public Color(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Color color = (Color) o;
        return x == color.x && y == color.y;
    }

    @Override
    public int hashCode() {
        int result=Integer.hashCode(x);
        result=result*31+Integer.hashCode(y);
        return result;
    }
}
