package services;

import java.util.HashMap;
import java.util.Map;

public class PrimeNumbersService {

    public Map<Integer,Boolean> isPrimeRance(int start, int end){
        if(start > end){
            throw new IllegalArgumentException("Start must be before end");
        }
        Map<Integer, Boolean> numbers = new HashMap<>();
        for(int i = start; i <= end; ++i){
            numbers.put(i,isPrime(i));
        }

        return numbers;
    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }

        return true;
    }

}
