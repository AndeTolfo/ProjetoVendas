

CREATE DATABASE BDVENDAS;
CREATE USER 'teste'@'%' IDENTIFIED BY '123';
GRANT ALL ON *.* TO 'teste'@'%' WITH GRANT OPTION;


flush privileges;

USE BDVENDAS;

/***** TABELA CLIENTES *****/
CREATE TABLE tb_clientes (
  id int auto_increment primary key,
  nome varchar(100),
  rg varchar (30),
  cpf varchar (20),
  email varchar(200),
  telefone varchar(30),
  celular varchar(30),
  cep varchar(100),
  endereco varchar (255),
  numero int,
  complemento varchar (200),
  bairro varchar (100),
  cidade varchar (100),
  uf varchar (2)
);
/*****************/

/***** TABELA FORNECEDORES *****/
CREATE TABLE tb_fornecedores (
  id int auto_increment primary key,
  nome varchar(100),
  cnpj varchar (100),
  email varchar(200),
  telefone varchar(30),
  celular varchar(30),
  cep varchar(100),
  endereco varchar (255),
  numero int,
  complemento varchar (200),
  bairro varchar (100),
  cidade varchar (100),
  uf varchar (2)
);
/*****************/

/***** TABELA FUNCIONARIOS *****/
CREATE TABLE tb_funcionarios (
  id int auto_increment primary key,
  nome varchar(100),
  rg varchar (30),
  cpf varchar (20),
  email varchar(200),
  senha varchar(10),
  cargo varchar(100),
  nivel_acesso varchar(50),
  telefone varchar(30),
  celular varchar(30),
  cep varchar(100),
  endereco varchar (255),
  numero int,
  complemento varchar (200),
  bairro varchar (100),
  cidade varchar (100),
  uf varchar (2)
);
/*****************/


/***** TABELA PRODUTOS *****/
CREATE TABLE tb_produtos (
  id int auto_increment primary key,
  descricao varchar(100),
  preco decimal (10,2),
  qtd_estoque int,
  for_id int,

  FOREIGN KEY (for_id) REFERENCES tb_fornecedores(id)
);
/*****************/

/***** TABELA VENDAS *****/
CREATE TABLE tb_vendas (
  id int auto_increment primary key,
  cliente_id int,
  data_venda datetime,
  total_venda decimal (10,2),
  observacoes text,

  FOREIGN KEY (cliente_id) REFERENCES tb_clientes(id)
);
/*****************/

/***** TABELA ITENS_VENDAS *****/
CREATE TABLE tb_itensvendas (
  id int auto_increment primary key,
  venda_id int,
  produto_id int,
  qtd int,
  subtotal decimal (10,2),

  FOREIGN KEY (venda_id) REFERENCES tb_vendas(id),
  FOREIGN KEY (produto_id) REFERENCES tb_produtos(id)
);
/*****************/
INSERT INTO TB_CLIENTES (ID, NOME, RG, CPF, EMAIL, TELEFONE, CELULAR, CEP, ENDERECO, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, UF ) VALUES (1,'Anderson Tolfo','11.200.746-28','031.681.670-10','anderson.tolfo.5@hotmail.com', '(55) 3744 - 3880','(55) 9 9626 - 7134','98400-000','Rua do Comércio',534,'ap 301','Centro','Frederico Westphalen','RS');
INSERT INTO TB_CLIENTES (ID, NOME, RG, CPF, EMAIL, TELEFONE, CELULAR, CEP, ENDERECO, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, UF ) VALUES (2,'Mariah Beatriz Melo','28.136.306-74','533.839.486-33','mariahbeatrizmelo-97@andrediaz.com', '(92) 2550 - 8251','(92) 9 9877 - 2708','69060-810','Conjunto Portal D''Espanha',456,'sobreloja','Aleixo','Manaus','AM');
INSERT INTO TB_CLIENTES (ID, NOME, RG, CPF, EMAIL, TELEFONE, CELULAR, CEP, ENDERECO, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, UF ) VALUES (3,'Marcelo Julio Fábio Rodrigues','24.591.535-74','836.118.542-98','marcelojuliofabiorodrigues@mv1.com.br', '(71) 2780 - 9712','(71) 9 9340 - 4262','41341-665','Rua Monte Ipitanga',433,'aa','Cajazeiras XI','Salvador','BA');
INSERT INTO TB_CLIENTES (ID, NOME, RG, CPF, EMAIL, TELEFONE, CELULAR, CEP, ENDERECO, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, UF ) VALUES (4,'Lorenzo Alexandre Alves','28.022.808-93','536.338.369-18','lorenzoalexandrealves@pontofinalcafe.com.br', '(63) 3893 - 3434','(63) 9 9389 - 0343','77415-450','Rua 60',122,'abc','Parque Residencial','Gurupi','TO');
INSERT INTO TB_CLIENTES (ID, NOME, RG, CPF, EMAIL, TELEFONE, CELULAR, CEP, ENDERECO, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, UF ) VALUES (5,'Isadora Stefany Rezende','35.895.359-53','523.737.814-50','isadorastefanyrezende-95@holtmail.com', '(98) 2896 - 0767','(98) 9 8861 - 9846','65057-856','Rua Marly Abdalla',43,'centro','Loteamento do Valean','São Luís','MA');
INSERT INTO TB_FORNECEDORES (ID, NOME, CNPJ, EMAIL, TELEFONE, CELULAR, CEP, ENDERECO, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, UF ) VALUES (1,'Rafaela e Alexandre Publicidade e Propaganda ME','47.951.967/0001-12','compras@rafaelaealexandrepublicidadeepropagandame.com.br','(19) 3673 - 9942', '(19) 9 9904 - 5241','13401-853','Estrada Fazenda Dona Antonia',534,'ap 301','Campestre','Piracicaba','SP');
INSERT INTO TB_FORNECEDORES (ID, NOME, CNPJ, EMAIL, TELEFONE, CELULAR, CEP, ENDERECO, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, UF ) VALUES (2,'Enzo e Beatriz Assessoria Jurídica ME','27.615.334/0001-26','producao@enzoebeatrizassessoriajuridicame.com.br','(92) 2550 - 8251', '(92) 9 9877 - 2708','69060-810','Conjunto Portal D''Espanha',456,'sobreloja','Aleixo','Manaus','AM');
INSERT INTO TB_FORNECEDORES (ID, NOME, CNPJ, EMAIL, TELEFONE, CELULAR, CEP, ENDERECO, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, UF ) VALUES (3,'Jennifer e Melissa Assessoria Jurídica Ltda','54.951.517/0001-95','financeiro@jenniferemelissaassessoriajuridicaltda.com.br','(71) 2780 - 9712', '(71) 9 9340 - 4262','12919-150','Alameda Holanda',433,'condominio verde','Cajazeiras XI','Bragança Paulista','SP');
INSERT INTO TB_FORNECEDORES (ID, NOME, CNPJ, EMAIL, TELEFONE, CELULAR, CEP, ENDERECO, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, UF ) VALUES (4,'Mirella e Yuri Casa Noturna ME','08.174.592/0001-70','contabil@mirellaeyuricasanoturname.com.br','(63) 3893 - 3434', '(63) 9 9389 - 0343','05618-020','Rua Parnaíba',122,'abc','Vila Inah','São Paulo','SP');
INSERT INTO TB_FORNECEDORES (ID, NOME, CNPJ, EMAIL, TELEFONE, CELULAR, CEP, ENDERECO, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, UF ) VALUES (5,'Cecília e Manuela Informática Ltda','68.341.369/0001-00','administracao@ceciliaemanuelainformaticaltda.com.br','(98) 2896 - 0767', '(98) 9 8861 - 9846','12903-070','Rua São Roque',43,'centro','Lavapés','Bragança Paulista','SP');
INSERT INTO TB_FUNCIONARIOS (ID, NOME, RG, CPF, EMAIL, SENHA, CARGO, NIVEL_ACESSO,TELEFONE, CELULAR, CEP, ENDERECO, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, UF ) VALUES (1,'ANDERSON TOLFO','11.200.746-28','031.681.670-10','andrei@gmail.com', 123,'GERENTE','ADMINISTRADOR','(55) 3744 - 3880','(55) 9 9626 - 7134','98400-000','Rua do Comércio',534,'ap 301','CENTRO','Frederico Westphalen','RS');
INSERT INTO TB_FUNCIONARIOS (ID, NOME, RG, CPF, EMAIL, SENHA, CARGO, NIVEL_ACESSO,TELEFONE, CELULAR, CEP, ENDERECO, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, UF ) VALUES (2,'Isadora Stefany Rezende','28.022.808-93','536.338.369-18','isadorastefanyrezende-95@holtmail.com', 54321,'VENDEDOR','USUÁRIO','(63) 3893 - 3434','(63) 9 9389 - 0343','77415-450','Rua 60',456,'sobreloja','Parque Residencial','Gurupi','TO');
INSERT INTO TB_FUNCIONARIOS (ID, NOME, RG, CPF, EMAIL, SENHA, CARGO, NIVEL_ACESSO,TELEFONE, CELULAR, CEP, ENDERECO, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, UF ) VALUES (3,'Carolina Lívia Marli Barros','18.613.968-84','590.680.453-69','emanuelbeneditoosvaldonunes..emanuelbeneditoosvaldonunes@engenharia.ufjf.br', 6666,'TELE VENDAS','USUÁRIO','(41) 2549 - 0230','(41) 9 9252 - 0023','82970-120','Rua da Assembléia',433,'condominio verde','Cajuru','Curitiba','PR');
INSERT INTO TB_FUNCIONARIOS (ID, NOME, RG, CPF, EMAIL, SENHA, CARGO, NIVEL_ACESSO,TELEFONE, CELULAR, CEP, ENDERECO, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, UF ) VALUES (4,'Luciana Emanuelly Emily Bernardes','38.954.750-53','373.118.689-63','lucianaemanuellyemilybernardes__lucianaemanuellyemilybernardes@endoimplantes.com.br', 12345,'SUPERVISOR','ADMINISTRADOR','(14) 2669 - 6644','(14) 9 8740 - 8234','18680-390','Rua Antônio Vieira',122,'abc','Jardim São João','Lençóis Paulista','SP');
INSERT INTO TB_FUNCIONARIOS (ID, NOME, RG, CPF, EMAIL, SENHA, CARGO, NIVEL_ACESSO,TELEFONE, CELULAR, CEP, ENDERECO, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, UF ) VALUES (5,'Fábio Nelson Almada','24.218.694-43','862.572.860-00','fabionelsonalmada..fabionelsonalmada@lojaprincezinha.com.br', 12314,'OPERADOR','USUÁRIO','(84) 3566 - 9408','(84) 9 8862 - 6717','59020-065','Avenida Afonso Pena',43,'centro','Petrópolis','Natal','RN');
INSERT INTO TB_PRODUTOS (ID, Descricao, Preco, QTD_ESTOQUE, for_id) VALUES (1, 'Condicionador Seda Ceram',10.00,100,1);
INSERT INTO TB_PRODUTOS (ID, Descricao, Preco, QTD_ESTOQUE, for_id) VALUES (2, 'Café em pó',20.00,100,2);
INSERT INTO TB_PRODUTOS (ID, Descricao, Preco, QTD_ESTOQUE, for_id) VALUES (3, 'Cr Des D. H.',30.00,100,3);
INSERT INTO TB_PRODUTOS (ID, Descricao, Preco, QTD_ESTOQUE, for_id) VALUES (4, 'Cera Bravo Flash Verm Lc 75oml',40.00,100,4);
INSERT INTO TB_PRODUTOS (ID, Descricao, Preco, QTD_ESTOQUE, for_id) VALUES (5, 'Des. Pinho Frutas',50.00,100,5);
INSERT INTO TB_VENDAS (ID, CLIENTE_ID, DATA_VENDA, TOTAL_VENDA, OBSERVACOES) VALUES (1, 1,'2021-08-01 08:50:50',100,'Pago');
INSERT INTO TB_VENDAS (ID, CLIENTE_ID, DATA_VENDA, TOTAL_VENDA, OBSERVACOES) VALUES (2, 2,'2021-08-02 09:50:30',100,'Pago');
INSERT INTO TB_VENDAS (ID, CLIENTE_ID, DATA_VENDA, TOTAL_VENDA, OBSERVACOES) VALUES (3, 3,'2021-08-03 08:50:00',90,'Pago');
INSERT INTO TB_VENDAS (ID, CLIENTE_ID, DATA_VENDA, TOTAL_VENDA, OBSERVACOES) VALUES (4, 4,'2021-08-03 10:50:00',120,'Pago');
INSERT INTO TB_VENDAS (ID, CLIENTE_ID, DATA_VENDA, TOTAL_VENDA, OBSERVACOES) VALUES (5, 5,'2021-08-03 11:20:00',200,'Pago');
INSERT INTO TB_ITENSVENDAS (ID, VENDA_ID, PRODUTO_ID, QTD, SUBTOTAL) VALUES (1, 1,1,10,100);
INSERT INTO TB_ITENSVENDAS (ID, VENDA_ID, PRODUTO_ID, QTD, SUBTOTAL) VALUES (2, 2,2,5,100);
INSERT INTO TB_ITENSVENDAS (ID, VENDA_ID, PRODUTO_ID, QTD, SUBTOTAL) VALUES (3, 3,3,3,90);
INSERT INTO TB_ITENSVENDAS (ID, VENDA_ID, PRODUTO_ID, QTD, SUBTOTAL) VALUES (4, 4,4,3,120);
INSERT INTO TB_ITENSVENDAS (ID, VENDA_ID, PRODUTO_ID, QTD, SUBTOTAL) VALUES (5, 5,5,4,200);



