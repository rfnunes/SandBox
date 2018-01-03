package com.ossnms.sandbox;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pt102933 on 19-12-2014.
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<MyObj, String> map = new HashMap<MyObj, String>();
        map.put(new MyObj(0), "v1");
        map.put(new MyObj(1), "v2");
        map.put(new MyObj(0), "v3");

        System.out.println(map.keySet().size());
        System.out.println(map.entrySet());

        for(MyObj m : map.keySet()) {
            System.out.println(m.getI());
        }
    }

    private static class MyObj {
        int i;
        MyObj(int i) {
            this.i = i;
        }
        int getI() {
            return i;
        }

        @Override
        public int hashCode() {
            return 31;
        }

        @Override
        public boolean equals(Object obj) {
            if(!(obj instanceof MyObj))
                return false;

            return i == ((MyObj)obj).i;
        }
    }

}
