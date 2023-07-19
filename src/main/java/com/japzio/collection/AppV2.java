package com.japzio.collection;

import lombok.extern.slf4j.Slf4j;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Set Theory Exercise
 */

@Slf4j
public class AppV2 {

    public static void main( String[] args ) throws IOException {

        Set<Integer> arr1 = Set.of(1, 2, 3, 4, 5, 6);
        Set<Integer> arr2 = Set.of(2, 4, 6, 8, 10);
        Set<Integer> arr3 = Set.of(1, 4, 6, 7, 10);

        log.info("set1={}, set2={}, set{}", arr1, arr2, arr3);
        log.info("intersections={}", intersections(arr1, arr2, arr3));

        log.info("intersectionsV2={}", intersectionsV2(arr1, arr2, arr3));

    }

    public static List<Integer> intersections(Set<Integer> arr1, Set<Integer> arr2, Set<Integer> arr3){

        Set<Integer> intersection1 = new HashSet<>(intersection(arr1, arr2));
        Set<Integer> intersection2 = new HashSet<>(intersection(arr2, arr3));

        return intersection1.stream().filter(intersection2::contains).collect(Collectors.toList());
    }

    public static List<Integer> intersection(Set<Integer> a, Set<Integer> b){
        return a.stream().filter(b::contains).collect(Collectors.toList());
    }

    public static List<Integer> intersectionsV2(Set<Integer> arr1, Set<Integer> arr2, Set<Integer> arr3) {

        Set<Integer> hset1 = new HashSet<>(arr1);
        Set<Integer> hset2 = new HashSet<>(arr2);
        Set<Integer> hset3 = new HashSet<>(arr3);

        hset2.retainAll(hset3);
        hset1.retainAll(hset2);

        return hset1.stream().collect(Collectors.toUnmodifiableList());
    }

}
