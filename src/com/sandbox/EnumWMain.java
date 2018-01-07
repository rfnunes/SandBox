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

import java.util.function.BiFunction;

/**
 * Created by pt102933 on 06-06-2015.
 */
enum EnumWMain {

    LINK((visitor, arg) -> visitor.visitLink(arg)),
    RING((visitor, arg) -> visitor.visitRing(arg)),
    TUNNEL((visitor, arg) -> visitor.visitTunnel(arg));

    private final BiFunction<IRoutePathLinkTypeVisitor, Object, Object> function;

    EnumWMain(BiFunction<IRoutePathLinkTypeVisitor,Object,Object> x) {
        this.function = x;
    }

    public   <A, R> R accept(IRoutePathLinkTypeVisitor <A, R> visitor, A arg){
        return (R) function.apply(visitor,arg);
    }
}