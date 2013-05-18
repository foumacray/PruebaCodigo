package codingdojo;

public class Palindromo {

    String numberOnString;

    public Palindromo(int i) {
        numberOnString = String.valueOf(i);
    }

    public boolean isPalindromo() {
        String front;
        String back;
        for (int indice = 0; indice < numberOnString.length(); indice++) {
            front = numberOnString.substring(indice, indice + 1);
            back = numberOnString.substring(numberOnString.length() - indice - 1, numberOnString.length() - indice);
            if (!front.equals(back)) {
                return false;
            }
        }
        return true;
    }
   
}
