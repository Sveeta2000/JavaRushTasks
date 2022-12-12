package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) {
        List<String> lines1 = new ArrayList<>();
        List<String> lines2 = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file1 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedReader file2 = new BufferedReader(new FileReader(reader.readLine()))){
            while (file1.ready()){
                lines1.add(file1.readLine());
            }
            while (file2.ready()){
                lines2.add(file2.readLine());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        lines1.add(null);
        lines2.add(null);

        for (int i = 0; i < Math.max(lines1.size(), lines2.size()); i++) {
            if (lines1.size() > i+1 && lines2.size() > i+1){
                if ((lines1.get(i)!=null) && (lines2.get(i)!=null) && lines1.get(i).equals(lines2.get(i))){
                    lines.add(new LineItem(Type.SAME, lines1.get(i)));
                    lines1.remove(i);
                    lines2.remove(i);
                    i--;
                } else if ((lines1.get(i)!=null) && (lines2.get(i+1)!=null) && lines1.get(i).equals(lines2.get(i+1))){
                    lines.add(new LineItem(Type.ADDED, lines2.get(i)));
                    lines2.remove(i);
                    i--;
                } else if ((lines2.get(i)!=null) && (lines1.get(i+1)!=null) && lines2.get(i).equals(lines1.get(i+1))){
                    lines.add(new LineItem(Type.REMOVED, lines1.get(i)));
                    lines1.remove(i);
                    i--;
                }
            } else if (lines1.size() == 2 && lines2.size()==1){
                lines.add(new LineItem(Type.REMOVED, lines1.get(i)));
                lines1.remove(i);
            } else if(lines2.size() == 2 && lines1.size()==1){
                lines.add(new LineItem(Type.ADDED, lines2.get(i)));
                lines2.remove(i);
            }

        }

    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
