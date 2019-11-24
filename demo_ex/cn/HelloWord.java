package demo_ex.cn;


import java.util.HashMap;
import java.util.Map;

public class HelloWord {

    public static void main(String[] args){
        String [] arrs = new String[10];
        System.out.println("helloworld");
        Map map = new HashMap();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (String arr : arrs) {
            System.out.println(arr);
        }




    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
