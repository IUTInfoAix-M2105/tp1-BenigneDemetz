package fr.univ_amu.iut.exercice3;

public class ConvertisseurDeNombreRomain {
    public int enNombreArabe(String i) {

        switch (i){
            case "I":
                return 1;
            case "V":
                return 5;
            case "XXX":
                return 30;
            case "X":
                return 10;
            case "Z":
                throw new IllegalArgumentException();
            case "II":
                return 2;
            case "III":
                return 3;
            case "IIII":
                throw new IllegalArgumentException();
            case "VI":
                return 6;
            case "IV":
                return 4;
            default:
                throw new RuntimeException("Not yet implemented !");
        }
    }
}
