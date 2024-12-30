package DesignPattern.Creational;

public class SingletonDesignPattern {
    public static void main(String[] args) {
        Singleton1.getInstance();

        Singleton2.getInstance();

        Singleton3.getInstance();
    }


    /**
     * Steps to create Singleton Design Pattern:
     * 1. Create a static instance of the class.
     * 2. Create a class with private constructor.
     * 3. Create a static method to return the instance.
     */

    static class Singleton1 {
        static Singleton1 instance = new Singleton1();

        private Singleton1() {
            System.out.println("Instance created from Singleton1");
        }

        public static Singleton1 getInstance() {
            return instance;
        }

    }

    /**
     * Steps to create Singleton Design Pattern:
     * 1. Create a static instance of the class.
     * 2. Create a class with private constructor.
     * 3. Create a static method to return the instance.
     * 4. Check if the instance is null, then create a new instance.
     */

    static class Singleton2 {
        static Singleton2 instance;

        private Singleton2() {
            System.out.println("Instance created from Singleton2");
        }

        public static Singleton2 getInstance() {
            if (instance == null) {
                instance = new Singleton2();
            }
            return instance;
        }
    }


    /**
     * Steps to create Singleton Design Pattern:
     * 1. Create a static instance of the class.
     * 2. Create a class with private constructor.
     * 3. Create a static method to return the instance.
     * 4. Check if the instance is null, then create a new instance.
     * 5. Make the method synchronized to make it thread safe.
     */

    static class Singleton3 {
        static Singleton3 instance;

        private Singleton3() {
            System.out.println("Instance created from Singleton3");
        }

        public static synchronized Singleton3 getInstance() {
            if (instance == null) {
                instance = new Singleton3();
            }
            return instance;
        }
    }
}

