package BE_JV_003_POO_II.Aula_01;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarListaPessoas {



    public static void main(String[] args) {
    /*
        //Apenas por nome

        List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
        listaPessoas.add(new Pessoa("Pedro"));
        listaPessoas.add(new Pessoa("Paulo"));
        listaPessoas.add(new Pessoa("Aurora"));
        listaPessoas.add(new Pessoa("Zilneide"));
        System.out.println("Lista: "+listaPessoas);
        Collections.sort(listaPessoas);
        System.out.println("Lista ordenada: "+listaPessoas);
        */
    //Organizar por idade, da mais nova para mais velha
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
