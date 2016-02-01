package com.agualis.refactoring.longmethod;

class Order {

    private int foo;
    private int baz;
    private int bar;

    public Order() {
        foo = 23;
        bar = 34;
        baz = 9;
    }

    public double price() {
        double primaryBasePrice = 23;
        double secondaryBasePrice = 34;
        double tertiaryBasePrice = 54;


        // long computation with intertwined local variables

        for (int i = 0; i < 13; i++) {
            primaryBasePrice += this.bar;
        }

        for (int i = 0; i < 26; i++) {
            tertiaryBasePrice -= this.foo/2;
        }

        for (int i = 0; i < 5; i++) {
            secondaryBasePrice *= this.baz +3;
        }

        return primaryBasePrice / secondaryBasePrice - tertiaryBasePrice;

    }
}
