insert into cargo(cargo, salario, aumento_anual, beneficio) values('Secretário', 7000, 1000, 0.2);
insert into cargo(cargo, salario, aumento_anual, beneficio) values('Vendedor', 1200, 1800, 0.3);
insert into cargo(cargo, salario, aumento_anual, beneficio) values('Gerente', 20000, 3000, 0);

insert into funcionario(cargo_id, nome, data_contratacao) values(1,'Jorge Carvalho', '01/2018');
insert into funcionario(cargo_id, nome, data_contratacao) values(1,'Maria Souza', '12/2015');
insert into funcionario(cargo_id, nome, data_contratacao) values(2,'Ana Silva', '12/2021');
insert into funcionario(cargo_id, nome, data_contratacao) values(2,'João Mendes', '12/2021');
insert into funcionario(cargo_id, nome, data_contratacao) values(3,'Juliana Alves', '07/2017');
insert into funcionario(cargo_id, nome, data_contratacao) values(3,'Bento Albino', '03/2014');

--insert into funcionario_cargo(cargo_id, funcionario_id) values(1L, 1L),(1L, 2L),(2L, 3L), (2L, 4L), (3L, 5L),(3L, 6L);

insert into registro_venda(funcionario_id, data_venda, valor_vendido) values(3,'12/2021', 5200);
insert into registro_venda(funcionario_id, data_venda, valor_vendido) values(3,'01/2022', 4000);
insert into registro_venda(funcionario_id, data_venda, valor_vendido) values(3,'02/2022', 4200);
insert into registro_venda(funcionario_id, data_venda, valor_vendido) values(3,'03/2022', 5850);
insert into registro_venda(funcionario_id, data_venda, valor_vendido) values(3,'04/2022', 7000);
insert into registro_venda(funcionario_id, data_venda, valor_vendido) values(4,'12/2021', 3400);
insert into registro_venda(funcionario_id, data_venda, valor_vendido) values(4,'01/2022', 7700);
insert into registro_venda(funcionario_id, data_venda, valor_vendido) values(4,'02/2022', 5000);
insert into registro_venda(funcionario_id, data_venda, valor_vendido) values(4,'03/2022', 5900);
insert into registro_venda(funcionario_id, data_venda, valor_vendido) values(4,'04/2022', 6500);

--insert into funcionario_registro_venda(funcionario_id, registro_id) values(3L, 1L), (3L, 2L), (3L, 3L), (3L, 4L), (3L, 5L), (4L, 1L), (4L, 2L), (4L, 3L), (4L, 4L), (4L, 5L);
