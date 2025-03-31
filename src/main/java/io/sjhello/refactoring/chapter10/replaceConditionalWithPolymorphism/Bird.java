package io.sjhello.refactoring.chapter10.replaceConditionalWithPolymorphism;

public class Bird {
    private String name;
    private BirdType type;
    private int numberOfCoconuts;
    private int voltage;
    private boolean isNailed;

    public Bird(String name, BirdType type) {
        this.name = name;
        this.type = type;
    }

    public Bird(String name, BirdType type, int numberOfCoconuts, int voltage) {
        this.name = name;
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
    }

    public Bird(String name, BirdType type, int numberOfCoconuts, int voltage, boolean isNailed) {
        this.name = name;
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public String getName() {
        return name;
    }

    public BirdType getType() {
        return type;
    }

    public int getNumberOfCoconuts() {
        return numberOfCoconuts;
    }

    public int getVoltage() {
        return voltage;
    }

    public boolean isNailed() {
        return isNailed;
    }
}
