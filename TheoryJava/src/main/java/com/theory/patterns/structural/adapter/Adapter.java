package com.theory.patterns.structural.adapter;

/**
 * @author sveet
 * @date 23.11.2022
 */
public class Adapter {

    public static void main(String[] args) {
        //способ через наследование
        VectorGraphicsInterface vgi = new VectorAdapterFromRaster();
        vgi.drawLine();
        vgi.drawSquare();

        //способ через композицию
        VectorGraphicsInterface vgi2 = new VectorAdapterFromRaster2(new RasterGraphics());
        vgi2.drawLine();
        vgi2.drawSquare();

    }
}

interface VectorGraphicsInterface{
    void drawLine();
    void drawSquare();
}

class RasterGraphics{
    void drawRasterLine(){
        System.out.println("I draw a line");
    }
    void drawRasterSquare(){
        System.out.println("I draw a square");
    }
}
//данный адаптер наследуется от класса, чьи методы хочет использовать класс-клиент
//и реализует интерфейс, который реализует клиент
//в реализации методов интерфейса мы обращаемся к методам класса, от которого унаследовались,
//тк нам они как наследнику этого класса доступны
class VectorAdapterFromRaster extends RasterGraphics implements VectorGraphicsInterface{
    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}

//способ без наследования
class VectorAdapterFromRaster2 implements VectorGraphicsInterface{

    private RasterGraphics rasterGraphics; //переменную можно сразу инициализировать, если она имеет тип класса, а не интерфейса

    public VectorAdapterFromRaster2(RasterGraphics rasterGraphics){
        this.rasterGraphics = rasterGraphics;
    }
    @Override
    public void drawLine() {              //методы вызываем у экземпляра класса
        rasterGraphics.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        rasterGraphics.drawRasterSquare();
    }
}