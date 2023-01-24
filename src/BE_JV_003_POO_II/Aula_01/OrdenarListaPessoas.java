package BE_JV_003_POO_II.Aula_01;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarListaPessoas {


    //Apenas por nome
    /*
    public static void main(String[] args) {
        List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
        listaPessoas.add(new Pessoa("Pedro", date));
        listaPessoas.add(new Pessoa("Paulo", date));
        listaPessoas.add(new Pessoa("Aurora", date));
        listaPessoas.add(new Pessoa("Zilneide", date));
        System.out.println("Lista: "+listaPessoas);
        Collections.sort(listaPessoas);
        System.out.println("Lista ordenada: "+listaPessoas);
    }
    */
    public static void main(String[] args) {
        List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
        listaPessoas.add(new Pessoa("Pedro", LocalDate.of(1990, Month.JANUARY,02)));
        listaPessoas.add(new Pessoa("Paulo", LocalDate.of(1991, Month.MARCH,27)));
        listaPessoas.add(new Pessoa("Aurora", LocalDate.of(1991, Month.MARCH,26)));
        listaPessoas.add(new Pessoa("Zilneide", LocalDate.of(1990, Month.JANUARY,03)));
        System.out.println("Lista: "+listaPessoas);
        Collections.sort(listaPessoas);
        System.out.println("Lista ordenada: "+listaPessoas);
    }

}
