package me.itsmcb.logger;

public enum ansiColors {

    RESET("\u001B[0m"),
    YELLOW("\u001B[33m"),
    RED("\u001B[31m"),
    BLUE("\u001B[34m"),
    CYAN("\u001B[36m");

    private String color;

    ansiColors(String color) {
        this.color = color;
    }

    public String get() {
        return color;
    }
}