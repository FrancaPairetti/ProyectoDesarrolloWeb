insert into recurso (id, nombre) values (1, 'Proyector');
insert into recurso (id, nombre) values (2, 'Televisión');
insert into recurso (id, nombre) values (3, 'Pizarra');

insert into Lugar (id, nombre) values (1, 'SUM');
insert into Lugar (id, nombre) values (2, 'LAB 1');

insert into ESTADO_LUGAR (ID, NOMBRE) values (1, 'Ocupado');
insert into ESTADO_LUGAR (ID, NOMBRE) values (2, 'Libre');

insert into LUGAR_RECURSOS (LUGAR_ID, RECURSOS_ID) values (1,1);
insert into LUGAR_RECURSOS (LUGAR_ID, RECURSOS_ID) values (2,3);
