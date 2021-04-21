package fr.univ_amu.iut.exercice3;

public class ConvertisseurDeNombreRomain {
    public int enNombreArabe(String i) {
        switch (i){
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "Z":
                throw new IllegalArgumentException();
            case "II":
                return 2;
            case "III":
                return 3;
            default:
                throw new RuntimeException("Not yet implemented !");
        }
    }
}
