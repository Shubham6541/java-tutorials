package com.nklkarthi.algorithms.primechecker;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.nklkarthi.algorithms.primechecker.OptimisedPrimeChecker;
import com.nklkarthi.algorithms.primechecker.PrimeChecker;

public class OptimisedPrimeCheckerTest {

    OptimisedPrimeChecker primeChecker = new OptimisedPrimeChecker();
    
    @Test
    public void givenPrimeNumber_whenCheckIsPrime_thenTrue(){
        assertTrue(primeChecker.isPrime(13));
        assertTrue(primeChecker.isPrime(1009));
    }
    
    @Test
    public void givenNonPrimeNumber_whenCheckIsPrime_thenFalse(){
        assertTrue(!primeChecker.isPrime(50));
        assertTrue(!primeChecker.isPrime(1001));
    }
    
}
