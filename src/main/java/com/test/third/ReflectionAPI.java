package com.test.third;

import java.lang.reflect.Method;

public class ReflectionAPI {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("com.kusid.test");
        DummyDo d = (DummyDo)c.newInstance();

        Method m = c.getDeclaredMethod("show", null);
        m.setAccessible(true);
        m.invoke(d,null);

    }


}
