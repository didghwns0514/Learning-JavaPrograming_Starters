package com.main.Chapter3.genericEx.genericOnly;

public class ThreeDimensionGeneric<T extends Material> {

    // 자료형 매개변수 받기
    private T material;

    public static void main(String[] args) {
        ThreeDimensionGeneric<Powder> printer = new ThreeDimensionGeneric<Powder>();
        printer.setMaterial(new Powder());

        Powder powder = printer.getMaterial();
    }

    public T getMaterial() {
        return this.material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

}

