# PROG2-Locadora_TP1

### Trabalho prático da disciplina de Programação de Computadores 2, realizado em Java.

##

#### Sistema de locadora de filmes e jogos digitais.

###### Trabalho Final da Disciplina CSI032
###### Professora: Tatiana Alves Costa

####

Uma locadora de filmes aluga, através de seus funcionários, mídias de filmes, jogos e música aos seus clientes. Os clientes são caracterizados pelo nome, CPF e telefone. Os clientes podem pagar antecipadamente por um número de locações pelo preço de locação comum ou, podem pagar no dia da locação. Os que pagam antecipadamente podem ficar até dois dias após a data de locação e os que pagam no dia da locação tem que devolver no outro dia. Todo cliente pode ter no máximo cinco pessoas autorizadas a alugar mídias em seu nome. As mídias de locação possuem um número, idade de censura, título e quantidade de cópias disponíveis para locação. Uma mídia pode ser: DVD, caracterizado pelo gênero e idioma; CD, caracterizado pelo nome, grupo ou cantor e número de músicas; e GAME, caracterizado pelo nome do console. Os funcionários são caracterizados pelo nome, endereço, telefone e senha. Os funcionários podem ser administradores ou comum. Os administradores podem criar outros usuários comuns e administradores e os usuários comuns criam mídias quando elas são compradas, bem como cadastram clientes usuários da locadora . Para alugar, o cliente escolhe as mídias e recebe um cupom. Este cupom contém informações sobre o cliente e opcionalmente do dependente, das mídias alugadas, do funcionário que atendeu, da data de locação, da data de devolução e do preço. O preço é dado pela categoria que pertence a mídia: lançamento, comum ou acervo. Cada categoria possui um preço para DVD, CD ou GAME. Com base nessa descrição, pede-se desenvolver um projeto em Java para informatizar a locadora em questão, conforme especificações dadas. Além das funcionalidades já descritas anteriormente, o projeto deverá apresentar ainda as seguintes possibilidades:

   - Realizar pesquisa por uma mídia (utilizando seu número). Nessa pesquisa deve ser possível verificar quantas cópias dessa mídia estão alugadas e quantas ainda estão disponíveis para empréstimo.
   - Realizar uma pesquisa por gênero, nas mídias DVD.
   - Realizar uma pesquisa por grupo ou cantor nas mídias CD.
   - Realizar pesquisa de todos os empréstimos realizados por um cliente ou seus dependentes.
   - No momento da devolução das mídias, deve-se verificar se a mesma foi devolvida na data correta e, caso contrário, o usuário deverá pagar uma multa de R$2,00 por dia de atraso.
