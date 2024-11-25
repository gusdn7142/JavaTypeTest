package com.example.javaTypeTest;
import org.openjdk.jol.info.ClassLayout;


public class WrapperClassAnalysis {
    public static void main(String[] args) {

        //1) 각 Wrapper 클래스의 인스턴스 생성
        Byte byteObj = 1;
        Short shortObj = 1;
        Integer intObj = Integer.valueOf(1);
        Long longObj = 1L;
        Float floatObj = 1.0f;
        Double doubleObj = 1.0;
        Character charObj = 'A';
        Boolean boolObj = true;
        String strObj = "str";

        //2) JOL을 사용하여 각 객체의 메모리 레이아웃 출력
        printMemoryLayout("Byte", byteObj);
        printMemoryLayout("Short", shortObj);
        printMemoryLayout("Integer", intObj);
        printMemoryLayout("Long", longObj);
        printMemoryLayout("Float", floatObj);
        printMemoryLayout("Double", doubleObj);
        printMemoryLayout("Character", charObj);
        printMemoryLayout("Boolean", boolObj);
        printMemoryLayout("String", strObj);

    }

    private static void printMemoryLayout(String className, Object obj) {
        System.out.println(className + ": " + ClassLayout.parseInstance(obj).toPrintable());
    }


}
