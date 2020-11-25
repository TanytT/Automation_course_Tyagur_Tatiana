package com.company.send_box;

public class ClApp {


        static final Object[][] tests = {
                {0, "nothing"},
                {123, "nothing"},
                {-1, "nothing"},
                {42, "everything"},
                {42 * 42, "everything squared"},
        };

    public static void main(String[] args) {
        for (Object[] t: tests) {
            System.out.println(t[1]);
            System.out.println(Cl.whatIs((Integer) t[0]));
        }
    }
    }


