import java.util.Arrays;



public class lab8
{ 
  
  public static void main(String[] args)
  {
    int n = 100;

    linkedList confirmedPrimes = new linkedList(-1);
    linkedList tail = confirmedPrimes;
    
    
    
    // -------------------------------- FIND PRIMES WITH SIEVE -------------------------------- \\
    
    boolean[] primes = new boolean[n + 1]; // false if not prime, true if prime
    Arrays.fill(primes, true); // true by default
    primes[0] = false;
    primes[1] = false;
    for (int i = 2; i <= n; i++)
    {
        if (primes[i] == true) // found prime number
        {
            tail.setData(i);
            tail.setNext(new linkedList(-1));
            tail = tail.getNext();
            for (int j = i * i; j <= n; j += i) primes[j] = false;
        }
    }
      
    // ----------------------------------------------------------------------------------------- \\

    linkedList thisPrime = confirmedPrimes; // set to head

    linkedList primesWithThree = new linkedList(-1);
    linkedList primesWithThreeTail = primesWithThree;
    while (!(thisPrime.getData() == -1))
    {
      // System.out.println(thisPrime.getData());
      if (Integer.toString(thisPrime.getData()).indexOf('3') != -1) {primesWithThreeTail.setData(thisPrime.getData()); primesWithThreeTail.setNext(new linkedList(-1)); primesWithThreeTail = primesWithThreeTail.getNext();}
      thisPrime = thisPrime.getNext();
    }
      
    int sumOfPrimesWithThree = 0;
    thisPrime = primesWithThree; // set to head
    while (!(thisPrime.getData() == -1))
    {
      System.out.println(thisPrime.getData());
      sumOfPrimesWithThree += thisPrime.getData();
      thisPrime = thisPrime.getNext();
    }
    System.out.println("Sum: " + sumOfPrimesWithThree);
  }
}
