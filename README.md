# Library_managment
Ablisio
Huzeif
Celeste
Ernilda

documentação explicativa do projeto Biblioteca JavaWeb feito com PrimeFaces, MySQL e Java, com dois tipos de usuários perfis: cliente e bibliotecário.

1. Introdução
O objetivo deste projeto é desenvolver um sistema de biblioteca online usando tecnologias JavaWeb, PrimeFaces e MySQL. O sistema contém dois tipos de usuários perfis: cliente e bibliotecário. Os clientes irão pesquisar, reservar e emprestar livros, enquanto os bibliotecários serão responsáveis pelo gerenciamento dos livros, clientes e empréstimos.

2. Requisitos
Os requisitos do sistema incluem são:
- Cadastro clientes e bibliotecários.
- Pesquisa de livros por título, autor ou categoria.
- Reserva de livros disponíveis.
- Empréstimo e devolução de livros.
- Gerenciamento de estoque de livros.
- Histórico de empréstimos para cada cliente.
- Interface amigável e responsiva.

3. Banco de Dados
- foi criada um banco de dados MySQL para armazenar os dados do sistema.
- de seguida foram  criadas as tabelas necessárias, como "clientes", "bibliotecários" e "livros", com as colunas apropriadas para cada uma.
- Foi estabelecida as relações entre as tabelas, como a chave estrangeira "cliente_id" na tabela "empréstimos" referenciando a tabela .
  

4. Implementação
- foram implementadas  as classes de modelo com os atributos , getters e setters.
- de seguida foi feita a implementação da classes do Pacote DAO, onde foi criado uma classe ConexaoDAO para fazer conexão com a base dados e o outras classes como […]DAO  para acessar o banco de dados e realizar operações como inserção, atualização, exclusão logica e consulta de dados.
-  foi  feita a implementação das classes de serviço para lidar com a lógica de negócios, como validações e regras de empréstimo.
- foi necessário fazer a implementação das classes controladoras para processar as requisições dos usuários e interagir com as classes de serviço.
- foram implementadas as páginas JSF para exibir informações aos usuários e receber entradas de dados.
- foi feita a utilização dos componentes do PrimeFaces para criar uma interface amigável e responsiva.

5. Testes
- foi realizada os  testes unitários para garantir o bom funcionamento das classes de modelo, DAOs e serviços.
- foram testadas as integração para verificar se os componentes do sistema estão funcionando correctamente juntos.
- foi feitos os  testes funcionais para garantir que os requisitos do sistema estão sendo atendidos.

6. Conclusão
Esta documentação explicativa foi fornecida uma visão geral do projeto JavaWeb usando PrimeFaces, MySQL e Java, com dois tipos de usuários perfis: cliente e bibliotecário.
