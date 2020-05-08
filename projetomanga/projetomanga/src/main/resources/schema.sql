drop table if exists HQ;

create table HQ(
 id_livro bigint auto_increment,
 nome varchar(100) not null,
 valor double(00.00) not null,
 data_lancamento varchar(50),
 volumes varchar(50) not null,
 primary key(id_livro));