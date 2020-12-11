package factoryTests;

import org.testng.annotations.Test;

public class Test3 {
    private final String str1;
    public Test3(String s){
        this.str1 = s;
    }

    @Test
    public void test3(){
        System.out.println(str1);
    }

}
