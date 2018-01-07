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

import java.util.Arrays;
import java.util.List;

/**
 * Created by pt102933 on 17/5/2016.
 */
public class VisitorTest {
    public static void main(String[] args) {

        IVisitor<String> v = new IVisitor<String>() {
            @Override
            public String visit(IDomainObject dobj) {
                return null;
            }

            @Override
            public String visit(DOInteger i) {
                return "Integer "+i.getI();
            }

            @Override
            public String visit(DOString s) {
                return "String: "+s.getS();
            }
        };

        final List<DomainObject> nunes = Arrays.asList(new DOInteger(999), new DOString("Nunes"));

        nunes.forEach(domainObject -> System.out.println(domainObject.dispatch(v)));

    }
}

interface IVisitor<T> {
    T visit(IDomainObject dobj);

    T visit(DOInteger i);

    T visit(DOString s);
}

interface IDomainObject {
    <T> T dispatch(IVisitor<T> visitor);
}

abstract class DomainObject implements IDomainObject {

}

class DOInteger extends DomainObject {
    private Integer i;

    DOInteger(Integer i) {
        this.i = i;
    }

    public Integer getI() {
        return i;
    }

    @Override
    public <T> T dispatch(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class DOString extends DomainObject{
    private String s;

    DOString(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    @Override
    public <T> T dispatch(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}


