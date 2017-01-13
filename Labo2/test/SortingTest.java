/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Utilities.MergeSort;
import Utilities.*;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MatthiasMaes
 */
public class SortingTest {
    
    private int[] randoms1;
    private int[] randoms2;
    
    @Before
    public void setUp() {
        int length = 50000;
        randoms1 = new int[length];
        randoms2 = new int[length];
        
        for (int i = 0; i < length; i++) {
            randoms1[i] = (int)(Math.random() * length + 0);
            randoms2[i] = (int)(Math.random() * length + 0);
        }
    }

    @Test
    public void testInsertionSort() {
        int j, key, i;                 
        for (j = 1; j < randoms1.length; j++) {
            key = randoms1[j];
            for (i = j - 1; (i >= 0) && (randoms1[i] < key); i--) randoms1[i + 1] = randoms1[i];
            randoms1[i + 1] = key;   
        }
    }
    
    
//    @Test
//    public void testMergeSort() {
//        MergeSort obj = new MergeSort(randoms2);
//    }
}
