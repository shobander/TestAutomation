package org.example;

public class MainM_EnumExamples {
    enum PhoneType{
        SAMSUNG,
        IPHONE,
        HTC,
        XIAOMI,
        NOKIA,
        HUAWEI,
        LG,
        INFINIX;
    }

    public static void main(String[] args) {
        System.out.println(PhoneType.HUAWEI);
    }
}
