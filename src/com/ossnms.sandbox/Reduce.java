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

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.BiConsumer;

/**
 * Created by pt102933 on 18/3/2016.
 */
public class Reduce {

    public static void main(String[] args) {
        new Reduce().go();
    }

    private void go() {

        int x;

        System.out.println((!false || !false) == !(false && false));
        System.out.println((!false || !true) == !(false && true));
        System.out.println((!true || !false) == !(true && false));
        System.out.println((!true || !true) == !(true && true));

        Collection<AClasss> acList = new ArrayList<>();
        acList.add(new AClasss());
        acList.add(new AClasss());
        acList.add(new AClasss());

        acList.forEach(System.out::println);

        cleanUp(acList, AClasss::setI);

        acList.forEach(System.out::println);
    }

    static <K, T> void cleanUp(Collection<K> col, BiConsumer<K, T> setter) {
        col.forEach(e -> setter.accept(e, null));
        col.clear();
    }

    class AClasss {

        Integer i = 999;

        void setI(Integer a) {
            i = null;
        }

        public Integer getI() {
            return i;
        }

        @Override
        public String toString() {
            return String.valueOf(i);
        }
    }
}