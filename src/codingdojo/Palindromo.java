package codingdojo;

public class Palindromo {

    String numberOnString;

    public Palindromo(int i) {
        numberOnString = String.valueOf(i);
    }

    public boolean isPalindromo() {
        for(int indice=0;indice<numberOnString.length();indice++){
            if (!(numberOnString.substring(indice, indice).equals(numberOnString.substring(numberOnString.length()-indice, numberOnString.length()-indice)))){
                return false;
            }
        }
        return true;
    }
}
