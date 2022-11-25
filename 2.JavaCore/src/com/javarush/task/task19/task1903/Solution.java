package com.javarush.task.task19.task1903;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

/* 
Адаптация нескольких интерфейсов
*/

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Customer, Contact {

        private IncomeData data;

        public IncomeDataAdapter(IncomeData data){
            this.data = data;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {                   //+38(007)111-22-33
            StringBuilder resultNumber = new StringBuilder();
            resultNumber.append("+").append(data.getCountryPhoneCode()).append("(");  //getting the first part of the number
            int digits = data.getPhoneNumber();

            String strNumber = String.valueOf(digits);   //creating the second part of the number
            StringBuilder sb = new StringBuilder(strNumber);
            sb.reverse();
            while (sb.length()<10){
                sb.append(0);
            }
            sb.reverse();
            sb.insert(3, ")");
            sb.insert(7, "-");
            sb.insert(10, "-");
            resultNumber.append(sb);
            return resultNumber.toString();
        }
    }

    public interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example1: 501234567, For example2: 71112233
    }

    public interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example1: +38(050)123-45-67, For example2: +38(007)111-22-33
    }
}