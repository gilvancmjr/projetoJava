insert into cargos(cargo, salario, aumento_anual, beneficio) values('Secretário', 7000, 1000, 20);
insert into cargos(cargo, salario, aumento_anual, beneficio) values('Vendedor', 12000, 1800, 30);
insert into cargos(cargo, salario, aumento_anual, beneficio) values('Gerente', 20000, 3000, 0);

insert into funcionarios(nome, data_contratacao) values('Jorge Carvalho', '01/2018');
insert into funcionarios(nome, data_contratacao) values('Maria Souza', '12/2015');
insert into funcionarios(nome, data_contratacao) values('Ana Silva', '12/2021');
insert into funcionarios(nome, data_contratacao) values('João Mendes', '12/2021');
insert into funcionarios(nome, data_contratacao) values('Juliana Alves', '07/2017');
insert into funcionarios(nome, data_contratacao) values('Bento Albino', '03/2014');

insert into funcionarios_cargos(cargos_id, funcionarios_id) values(1L, 1L),(1L, 2L),(2L, 3L), (2L, 4L), (3L, 5L),(3L, 6L);

insert into registro_vendas(data_venda, valor_vendido) values('12/2021', 5200);
insert into registro_vendas(data_venda, valor_vendido) values('01/2022', 4000);
insert into registro_vendas(data_venda, valor_vendido) values('02/2022', 4200);
insert into registro_vendas(data_venda, valor_vendido) values('03/2022', 5850);
insert into registro_vendas(data_venda, valor_vendido) values('04/2022', 7000);
insert into registro_vendas(data_venda, valor_vendido) values('12/2021', 3400);
insert into registro_vendas(data_venda, valor_vendido) values('01/2022', 7700);
insert into registro_vendas(data_venda, valor_vendido) values('02/2022', 5000);
insert into registro_vendas(data_venda, valor_vendido) values('03/2022', 5900);
insert into registro_vendas(data_venda, valor_vendido) values('04/2022', 6500);

insert into registro_vendas_funcionarios(funcionarios_id, registro_id) values(3L, 1L), (3L, 2L), (3L, 3L), (3L, 4L), (3L, 5L), (4L, 1L), (4L, 2L), (4L, 3L), (4L, 4L), (4L, 5L);
