package BE_JV_003_POO_II.ProjetoAdaLocateCar;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro(veiculos, "asd1234", "Gol", TipoVeiculo.PEQUENO));
        veiculos.add(new Carro(veiculos, "asd1232", "Civic", TipoVeiculo.MEDIO));
        veiculos.add(new Carro(veiculos, "asd1235", "Sandero", TipoVeiculo.SUV));
//        for(Veiculo veiculo: veiculos){
//            System.out.println(veiculo);
//        }
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new PessoaFisica(clientes, "Hilario", "123456"));
        clientes.add(new PessoaJuridica(clientes, "ARCOMP Ltda", "11312134532"));
//        for(Cliente cliente: clientes){
//            System.out.println(cliente);
//        }
        List<Aluguel> alugueis = new ArrayList<>();
        LocalDateTime diaInicio = LocalDateTime.of(2022, 1, 31, 17, 30, 00);
        LocalDateTime diaFinal01 = LocalDateTime.of(2022, 2, 1, 17, 25, 00);
        LocalDateTime diaFinal02 = LocalDateTime.of(2022, 2, 5, 17, 31, 00);

//        for (int c = 0; c < clientes.size(); c++) {
//            for (int v = 0; v < veiculos.size(); v++) {
//                alugueis.add(new Aluguel(veiculos.get(v), clientes.get(c), diaInicio, diaFinal01));
//                alugueis.add(new Aluguel(veiculos.get(v), clientes.get(c), diaInicio, diaFinal02));
//            }
//        }
        alugueis.add(new Aluguel(veiculos.get(0), clientes.get(0), diaInicio, diaFinal01));
        alugueis.add(new Aluguel(veiculos.get(1), clientes.get(1), diaInicio, diaFinal02));
        alugueis.add(new Aluguel(veiculos.get(2), clientes.get(1), diaInicio, diaFinal01));

        alugueis.get(0).devolverVeiculo(veiculos.get(0),diaFinal02);
        alugueis.get(1).devolverVeiculo(veiculos.get(1),diaFinal02);
        alugueis.get(2).devolverVeiculo(veiculos.get(2),diaFinal01);

        for (Aluguel aluguel : alugueis) {
            System.out.println(aluguel.toString());
        }


    }
}
