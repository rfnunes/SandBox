/*
 * Copyright (C) Coriant
 * The reproduction, transmission or use of this document or its contents 
 * is not permitted without express written authorization.
 * Offenders will be liable for damages.
 * All rights, including rights created by patent grant or 
 * registration of a utility model or design, are reserved.
 * Modifications made to this document are restricted to authorized personnel only. 
 * Technical specifications and features are binding only when specifically 
 * and expressly agreed upon in a written contract.
 *
 */

package com.ossnms.sandbox;

import java.util.Objects;

/**
 * Created by pt102933 on 13/5/2016.
 */
public class TestObjectsEquals {

    public static void main(String[] args) {
        boolean res = true;
        
        res &= test(null, null);

        res &= test(null, new T());
        res &= test(new T(), null);
        res &= test(new T(), new T());

        res &= test(null, new T(1));
        res &= test(new T(1), null);

        res &= test(new T(), new T(1));
        res &= test(new T(1), new T());
        res &= test(new T(1), new T(2));
        res &= test(new T(1), new T(1));

        System.out.println(res);
    }
    
    private static boolean test(T one, T two) {
        return evaluateOld(one, two) == evaluateNew(one, two);
    }
    
    private static boolean evaluateNew(T one, T two) {
        return one != null && two != null &&
                Objects.equals(one.getI(), two.getI());
    }

    private static boolean evaluateOld(T one, T two) {
        return one != null && two != null &&
                one.getI() != null && two.getI() != null &&
                one.getI().equals(two.getI());
    }


    private static class T {
        Integer i;
        
        T() {
            
        }
        
        T(int i) {
            this.i = i;
        }
        
        public Integer getI() {
            return i;
        }
    }
}
