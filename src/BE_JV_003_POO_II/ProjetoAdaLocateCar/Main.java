package BE_JV_003_POO_II.ProjetoAdaLocateCar;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        Criação de lista de carros da locadora. Não consegui fazer um meio em que não fosse
        necessário passar a lista de carros para verificar que só há um veículo com placa única.
        */
        List<Veiculo> carros = new ArrayList<>();
        carros.add(new Carro(carros, "asd1234", "Gol", TipoVeiculo.PEQUENO));
        carros.add(new Carro(carros, "asd1232", "Civic", TipoVeiculo.MEDIO));
        carros.add(new Carro(carros, "asd1235", "Sandero", TipoVeiculo.SUV));

        /*
        Aqui o filtro dos carros que contém parte do nome a ser pesquisado. Cheguei a achar que essa
        funcionalidade poderia ser facilitada com generics mas tive difilculdades em fazer essa parte.
        Portanto uma parte do nome é pesquisada e retornado uma lista dos veículos que a possuem.
         */
        List<Veiculo> filtroVeiculos = carros.stream().filter(veiculo -> veiculo.getNome().contains("Civ")).toList();
        System.out.println(filtroVeiculos);
        /*
        Criação dos clientes tanto pessoa física como juridica, implementando a interface cliente
        e deixando cada cadastro unico usando a lista de clientes. Não consegui identificar outra
        forma de verificar a duplicidade de clientes a não ser passando a lista de clientes já
        cadastrada, assim como foi nos veículos.
         */
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new PessoaFisica(clientes, "Hilario", "123456"));
        clientes.add(new PessoaJuridica(clientes, "ARCOMP Ltda", "11312134532"));
        /*
        Criação de datas usando o LocalDateTime
         */
        LocalDateTime diaInicio = LocalDateTime.of(2022, 1, 31, 17, 30, 00);
        LocalDateTime diaFinal01 = LocalDateTime.of(2022, 2, 1, 17, 25, 00);
        LocalDateTime diaFinal02 = LocalDateTime.of(2022, 2, 5, 17, 31, 00);
        /*
        Criação de alugueis como objetos que contem objetos do tipo veiculo e cliente.
        Aqui um aluguel pode conter um único veículo trazido da lista de carros que não
        esteja alugado e que passa a está alugado a partir do momento em que se cria o
        aluguel estando assim indisponível. Um cliente pode alugar vários veículos, o
        limite é o número de veículos da locadora. O aluguel é feito inserindo uma data
        de aluguel e uma de devolução, ajudando assim no pré calculo do valor e do desconto.
        */
        List<Aluguel> alugueis = new ArrayList<>();
        alugueis.add(new Aluguel(carros.get(0), clientes.get(0), diaInicio, diaFinal01));
        alugueis.add(new Aluguel(carros.get(1), clientes.get(1), diaInicio, diaFinal02));
        alugueis.add(new Aluguel(carros.get(2), clientes.get(1), diaInicio, diaFinal01));
        //Impressão dos alugueis realizados e seus custos antes da devolução

        alugueis.forEach(aluguel -> System.out.println(aluguel.toString()));

        /*
        Devolução de veículos podendo ser atribuida uma nova data de devolução, assim se
        houver atraso ou adiamento da data de entrega do veículo é possivel recalcular o
        valor do aluguel. O veiculo só passar a constar como disponível se for feita a devolução.
         */
        alugueis.get(0).devolverVeiculo(carros.get(0), alugueis.get(0).getDataDevolucao());
        alugueis.get(1).devolverVeiculo(carros.get(1), diaFinal02);
        alugueis.get(2).devolverVeiculo(carros.get(2), diaFinal01);

        //Impressão dos alugueis realizados após a devolução
        alugueis.forEach(aluguel -> System.out.println(aluguel.toString()));







    }
}
