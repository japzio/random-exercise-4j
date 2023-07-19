package com.japzio;

import com.japzio.collection.AppV2;
import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */

public class AppV2Test {
    /**
     * Rigorous Test :-)
     */

    @Test
    public void test_setIntersection() {
        Set<Integer> arr1 = Set.of(1, 2, 3, 4, 5, 6);
        Set<Integer> arr2 = Set.of(2, 4, 6, 8, 10);
        Set<Integer> arr3 = Set.of(1, 4, 6, 7, 10);
        assertEquals(AppV2.intersections(arr1, arr2, arr3), List.of(4, 6));
        assertEquals(AppV2.intersectionsV2(arr1, arr2, arr3), List.of(4, 6));
    }
}
