create table Pessoa
(
   id integer not null,
   nome varchar(255) not null,
   localizacao varchar(255),
   data_nasc timestamp,
   primary key(id)
);

INSERT INTO Pessoa (ID, NOME, LOCALIZACAO, DATA_NASC) 
VALUES(10001,  'Raphael', 'Porto Alegre',sysdate());
INSERT INTO Pessoa (ID, NOME, LOCALIZACAO, DATA_NASC) 
VALUES(10002,  'Mateus', 'Concordia',sysdate());
INSERT INTO Pessoa (ID, NOME, LOCALIZACAO, DATA_NASC)
VALUES(10003,  'Renata', 'Alegrete',sysdate());