package com.main.Chapter3.genericEx.objectOnly;

public class ThreeDimensionPrinter {

    // 업캐스팅으로 받아서 모든 자료형을 일단 받을 수 있도록 generic 하게 대응
    private Object material;

    public static void main(String[] args) {
        ThreeDimensionPrinter printer = new ThreeDimensionPrinter();
        printer.setMaterial(new Powder());

        Powder powder = (Powder) printer.getMaterial();
    }

    public Object getMaterial() {
        return this.material;
    }

    public void setMaterial(Object material) {
        this.material = material;
    }

}

