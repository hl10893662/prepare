package me.eno.algorithm.prepare.tree;

public class Htree {
    private Htree left;
    private Htree right;
    private int value;

    public Htree getLeft() {
        return left;
    }

    public Htree getRight() {
        return right;
    }

    public int getValue() {
        return value;
    }

    public void setLeft(Htree left) {
        this.left = left;
    }

    public void setRight(Htree right) {
        this.right = right;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
