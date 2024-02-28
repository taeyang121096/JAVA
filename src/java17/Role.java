package java17;

public enum Role {
    USER(1), ADMIN(2), TESTER(3);

    private final int value;
    Role(int value){this.value = value;}

    public int getValue() { return this.value; }

}
