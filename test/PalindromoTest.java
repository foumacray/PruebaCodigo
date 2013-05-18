

import codingdojo.Palindromo;
import org.junit.Test;
import static org.junit.Assert.*;


public class PalindromoTest {
    @Test
    public void PalindromoOfLength1() {
       Palindromo myPalindromo = new Palindromo(1);
       assertTrue(myPalindromo.isPalindromo());
    }
    public void NotpalindromoOfLength2() {
        Palindromo myPalindromo = new Palindromo(56);
        assertFalse(myPalindromo.isPalindromo());
    }
    public void palindromoOfLength2() {
        Palindromo myPalindromo = new Palindromo(77);
        assertFalse(myPalindromo.isPalindromo());
    }
     public void palindromoOfLength3() {
        Palindromo myPalindromo = new Palindromo(77);
        assertFalse(myPalindromo.isPalindromo());
    }
      public void notPalindromoOfLength3() {
        Palindromo myPalindromo = new Palindromo(77);
        assertFalse(myPalindromo.isPalindromo());
    }
       public void palindromoOfAnyLength() {
        Palindromo myPalindromo = new Palindromo(7210127);
        assertFalse(myPalindromo.isPalindromo());
    }
        public void NotpalindromoOfAnyLength() {
        Palindromo myPalindromo = new Palindromo(712347);
        assertFalse(myPalindromo.isPalindromo());
    }
}
