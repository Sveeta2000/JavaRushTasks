package com.training;

import java.util.Objects;

/**
 * @author sveet
 * @date 28.11.2022
 */
public class TestClass {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestClass testClass = (TestClass) o;
        return test == testClass.test;
    }

    @Override
    public int hashCode() {
        return Objects.hash(test);
    }

    private int test = 9;

    public static void main(String[] args) {
        String line = "  12 text var2 14 8ю 1 p0 6.7";
        for(String item : line.split("\\s")){
            if (!item.matches("(.*)\\D(.*)")){
                try{
                    int n = Integer.parseInt(item);
                    System.out.print(n + " ");
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        }



    }


}

