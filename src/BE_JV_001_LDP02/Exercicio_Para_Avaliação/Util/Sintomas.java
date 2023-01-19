package BE_JV_001_LDP02.Exercicio_Para_Avaliação.Util;

import java.util.ArrayList;
import java.util.List;

public final class Sintomas {
    List<String> listaSintomas = new ArrayList<String>();
    public List<String> Sintomas() {
        this.listaSintomas.add("Dor de cabeca");
        this.listaSintomas.add("Dor muscular");
        this.listaSintomas.add("Dor abdominal");
        this.listaSintomas.add("Diarréia");
        this.listaSintomas.add("Febre");
        this.listaSintomas.add("Febre alta");
    return listaSintomas;
    }


    @Override
    public String toString() {
        return "Sintomas{"+ listaSintomas + "}";
    }
}
