package demo.immutables;

public class Main {
    public static void main(String[] args) {
        ImmutableFoo.builder().bar("message").build();
    }
}
