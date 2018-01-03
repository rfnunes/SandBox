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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Created by pt102933 on 27/1/2017.
 */
public class PathSorter {

    public static void main(String[] args) {
        new PathSorter().go();
    }

    private void go() {
        List<PathSegment> pathSegments = new ArrayList<>();

        /*
        pathSegments.add(new PathSegment(new Segment(1, 2, 1)));
        pathSegments.add(new PathSegment(new Segment(3, 4, 3)));
        pathSegments.add(new PathSegment(new Segment(3, 2, 2)));
        pathSegments.add(new PathSegment(new Segment(5, 2, 4)));
        */

        pathSegments.add(new PathSegment(new Segment(1, 2, 1)));
        pathSegments.add(new PathSegment(new Segment(1, 3, 2)));
        pathSegments.add(new PathSegment(new Segment(1, 4, 3)));
        pathSegments.add(new PathSegment(new Segment(3, 5, 4)));


        sort(pathSegments).forEach(System.out::println);
    }

    private static List<PathSegment> sort(List<PathSegment> pathSegments) {

        ArrayList<PathSegment> unsorted = new ArrayList<>(pathSegments);

        List<PathSegment> sorted = new ArrayList<>(unsorted.size());

        Map<Integer, List<PathSegment>> aSides = new HashMap<>();
        Map<Integer, List<PathSegment>> zSides = new HashMap<>();

        fillSidesMaps(unsorted, aSides, zSides);

        PathSegment segment = unsorted.remove(0);

        Integer curA = segment.getA();
        Integer curZ = segment.getZ();

        do {
            sorted.add(segment);

            List<PathSegment> curATunnels = aSides.get(curA);
            if (curATunnels != null) {
                curATunnels.remove(segment);
            }
            curATunnels = aSides.get(curZ);
            if (curATunnels != null) {
                curATunnels.remove(segment);
            }

            List<PathSegment> curZTunnels = zSides.get(curZ);
            if (curZTunnels != null) {
                curZTunnels.remove(segment);
            }
            curZTunnels = zSides.get(curA);
            if (curZTunnels != null) {
                curZTunnels.remove(segment);
            }

            PathSegment nextSegment = null;

            if(aSides.keySet().contains(curZ) && !aSides.get(curZ).isEmpty()) {
                nextSegment = aSides.get(curZ).remove(0);
                curA = curZ;
                curZ = nextSegment.getZ();
            }
            else if(zSides.keySet().contains(curZ) && !zSides.get(curZ).isEmpty()) {
                //nextSegment = zSides.get(curZ).iterator().next();
                nextSegment = zSides.get(curZ).remove(0);
                curA = curZ;
                curZ = nextSegment.getA();
            } else if(!unsorted.isEmpty()){
                nextSegment = unsorted.remove(0);
                if(nextSegment.getA().equals(curA)) {
                    curA = nextSegment.getA();
                    curZ = nextSegment.getZ();
                }
                else if(nextSegment.getZ().equals(curA)) {
                    curA = nextSegment.getZ();
                    curZ = nextSegment.getA();
                }
            }

            if(nextSegment != null) {
                segment = new PathSegment(nextSegment.getSegment(), curA, curZ);
            }

            if(!aSides.containsKey(curA)) {
                List<PathSegment> tunnels = new ArrayList<>();
                tunnels.add(segment);
                aSides.put(curA, tunnels);
                //aSides.get(curA).add(segment);
            }

            if(zSides.containsKey(curA)) {
                zSides.get(curA).remove(segment);
            }

            if(!zSides.containsKey(curZ)) {
                zSides.get(curZ).add(segment);
            }

            if(aSides.containsKey(curZ)) {
                aSides.get(curZ).remove(segment);
            }


        }
        while (sorted.size() < pathSegments.size());

        return sorted;
    }

    private static void fillSidesMaps(ArrayList<PathSegment> unsorted, Map<Integer, List<PathSegment>> aSides, Map<Integer, List<PathSegment>> zSides) {
        for (PathSegment pathSegment : unsorted) {
            if(!aSides.containsKey(pathSegment.getA())) {
                aSides.put(pathSegment.getA(), new ArrayList<>());
            }
            aSides.get(pathSegment.getA()).add(pathSegment);

            if(!zSides.containsKey(pathSegment.getZ())) {
                zSides.put(pathSegment.getZ(), new ArrayList<>());
            }
            zSides.get(pathSegment.getZ()).add(pathSegment);
        }
    }

    private static class Segment {

        Integer id;

        Integer a;

        Integer z;

        public Segment(Integer a, Integer z, Integer id) {
            this.a = a;
            this.z = z;
            this.id = id;
        }

        public Integer getA() {
            return a;
        }

        public void setA(Integer a) {
            this.a = a;
        }

        public Integer getZ() {
            return z;
        }

        public void setZ(Integer z) {
            this.z = z;
        }

        public Integer getId() {
            return id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Segment segment = (Segment) o;
            return Objects.equals(id, segment.id) &&
                    Objects.equals(a, segment.a) &&
                    Objects.equals(z, segment.z);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, a, z);
        }
    }

    private static class PathSegment {

        private Segment segment;

        private Integer a;

        private Integer z;

        public PathSegment(Segment segment, Integer a, Integer z) {
            this.segment = segment;
            this.a = a;
            this.z = z;
        }

        public PathSegment(Segment segment) {
            this.a = segment.a;
            this.z = segment.z;
            this.segment = segment;
        }

        public Segment getSegment() {
            return segment;
        }

        public void setSegment(Segment segment) {
            this.segment = segment;
        }

        public Integer getA() {
            return a;
        }

        public void setA(Integer a) {
            this.a = a;
        }

        public Integer getZ() {
            return z;
        }

        public void setZ(Integer z) {
            this.z = z;
        }

        @Override
        public String toString() {
            return a + " <--- " + segment.getId() + " ---> " + z;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PathSegment segment1 = (PathSegment) o;
            return Objects.equals(segment, segment1.segment) &&
                    Objects.equals(a, segment1.a) &&
                    Objects.equals(z, segment1.z);
        }

        @Override
        public int hashCode() {
            return Objects.hash(segment, a, z);
        }
    }
}

