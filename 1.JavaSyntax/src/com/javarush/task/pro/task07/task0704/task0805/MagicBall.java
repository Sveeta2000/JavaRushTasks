package com.javarush.task.pro.task07.task0704.task0805;

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        Random r = new Random();
        int n = r.nextInt(8);
        if (n == 0) {
            return CERTAIN;
        }
        else if (n==1) {
            return DEFINITELY;
        }
        else if (n==2) {
            return MOST_LIKELY;
        }
        else if (n==3) {
            return OUTLOOK_GOOD;
        }
        else if (n==4) {
            return ASK_AGAIN_LATER;
        }
        else if (n==5) {
            return TRY_AGAIN;
        }
        else if (n==6) {
            return NO;
        }
        else if (n==7) {
            return VERY_DOUBTFUL;
        } else
        return null;
    }
}
