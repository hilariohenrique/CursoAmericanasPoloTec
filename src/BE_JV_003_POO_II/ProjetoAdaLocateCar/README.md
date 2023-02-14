## Projeto Ada Locate Car

### Da criação carros para locadora.

Criado uma lista de carros parar preencer a locadora. Não consegui fazer um meio em que não 
fosse necessário passar a lista de carros para verificar que só há um veículo com placa única.

### Pesquisa por parte de nome do veiculo.
O filtro dos carros que contém parte do nome a ser pesquisado foi feito usando stream e filter. 
Cheguei a achar que essa funcionalidade poderia ser facilitada com generics mas tive difilculdades
em fazer essa parte. Portanto uma parte do nome é pesquisada e retornado uma lista dos veículos que a possuem.
  
### Criação dos clientes.
Tanto pessoa física como juridica foi implementado a interface cliente e deixando cada cadastro único usando a lista de clientes. 
Não consegui identificar outra forma de verificar a duplicidade de clientes a não ser passando a lista de clientes já cadastrada, 
assim como ocorrei com os veículos.

### Criação de datas
Foram criadas usando o LocalDateTime

### Criação de alugueis 
Os alugueis são objetos que contem objetos do tipo veiculo e cliente. Aqui um aluguel pode conter um único veículo 
trazido da lista de carros que não esteja alugado e que passa a está alugado a partir do momento em que se cria o 
aluguel estando assim indisponível. Um cliente pode alugar vários veículos, o limite é o número de veículos da locadora.
O aluguel é feito inserindo uma data de aluguel e uma de devolução, ajudando assim no pré calculo do valor e do desconto.

### Devolução de veículos 
Neste ponto pode ser atribuida uma nova data de devolução, assim se houver atraso ou adiamento da data de entrega do veículo
é possivel recalcular o valor do aluguel. O veiculo só passar a constar como disponível se for feita a devolução ou se por alguma
necessidade seja preciso mudar o estado de alugado do veículo.

              