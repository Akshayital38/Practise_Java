package com.self.constructors;

class Super{
    public  int i =0;
    public Super(){
        i=1;
    }
}

class sub extends Super {

    public sub(String text) {
        super();
        i = 2;
    }
}

public class example{

    public static void main(String[] args) {
        sub s = new sub("Hello");
        System.out.println(s.i);
    }

}
