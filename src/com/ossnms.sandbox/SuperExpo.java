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

/**
 * Created by pt102933 on 28-06-2015.
 */
public class SuperExpo{

    public static void main(String args[]){

        try{

            try{
                throw new InterruptedException("Sun Certified ");
            }catch(Exception e){
                Throwable t=e;
                throw t;
            }finally{
                System.out.print("Finally-A ");
            }

        }catch(InterruptedException ie){
            System.out.print("Interrupted ");

        }catch(RuntimeException re){
            System.out.print("Runtime ");

        }catch(Throwable te){
            System.out.print("Throwable ");

        }finally{
            System.out.print("Finally-B ");
        }

    }

}