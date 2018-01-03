

package com.ossnms.sandbox;


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

/**
 * Created by pt102933 on 23-05-2015.
 */
public class Inher extends Cc {

    transient static int i = 0;

    public static void main(String[] args) {
        Aa a = new Aa();
        Bb b = new Bb();
        Cc c = new Cc();
        Inher d = null;

        System.out.println(new Integer(1).equals(new Long(1)));

        float f = 1L;
        System.out.println(f);

    }

    static void xxx(int x, int... ii) {
        Object o = 1;
        Double d = (double)1;

    }
}

abstract class Abs {
    public void mmm() throws Exception {
    }
}

abstract class Bbs extends Abs {
    public abstract void mmm();
}

class Aa extends Object {

}

class Bb extends Aa {

}

class Cc extends Bb {

}
