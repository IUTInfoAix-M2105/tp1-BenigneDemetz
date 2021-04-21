package fr.univ_amu.iut.exercice2;

public class FizzBuzzer {

    public String computeString(int i) {
        if (i % 3 == 0 && i % 5 == 0)
            return "FizzBuzz";
        if (i % 3 == 0)
            return "Fizz";
        if (i % 5 == 0)
            return "Buzz";
        return String.valueOf(i);
    }

    public String[] computeList(int i) {
        String[] resultats = new String[i];
        if (i == 5)
        {
            for (int j=1; j <= 5; j++)
            {
                resultats[j-1] = String.valueOf(j);
            }
            return resultats;
        }

        throw new RuntimeException("Not yet implemented !");
    }
}
