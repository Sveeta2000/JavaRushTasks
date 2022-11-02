package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;


/**
 * @author sveet
 * @date 01.11.2022
 */
public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageTypes) {
        if (imageTypes == null) {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        return switch (imageTypes) {
            case BMP -> new BmpReader();
            case JPG -> new JpgReader();
            case PNG -> new PngReader();
            default -> throw new IllegalArgumentException("Неизвестный тип картинки");
        };


    }
}
