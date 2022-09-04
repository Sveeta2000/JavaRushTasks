package com.javarush.task.pro.task15.task1505;

public class Test {

    public String getSomething() {
        return getVoice(new Animal() {
            @Override
            public String voice() {
                return new Pirate().voice();
            }
        });
    }

    private String getVoice(Animal fun) {
        return fun.voice();
    }

    interface GetVoice {
        String execute();
    }

    abstract class Animal {
        abstract public String voice();
    }

    class Cat extends Animal {

        @Override
        public String voice() {
            return "meaow";
        }
    }

    class Pirate {
        public String voice() {
            return "brrrr";
        }
    }

    class Guardian {
        public String guard() {
            return "guard";
        }
    }
}
