package testNgUnitTests.factoryTests;

import org.testng.annotations.Test;


public class Test2 {
        private final String str2;

        public Test2(String s) {
            this.str2 = s;
        }

        @Test
        public void test2() {
            System.out.println(str2);

        }
    }
