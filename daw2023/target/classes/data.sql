INSERT INTO recurso (id, nombre, descripcion) VALUES ('1', 'Proyector', 'Proyector marca Sony');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('2', 'Pizarra', 'Color verde');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('3', 'Computadora', 'Lenovo ThinkPad T14');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('4', 'Silla', 'Silla de oficina');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('5', 'Mesa', 'Mesa rectangular');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('6', 'Escritorio', 'Escritorio de madera');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('7', 'Cañón', 'Cañón de proyección');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('8', 'Pizarra magnética', 'Pizarra magnética blanca');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('9', 'Computadora portátil', 'HP EliteBook 840 G7');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('10', 'Mesa redonda', 'Mesa redonda de vidrio');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('11', 'Sofá', 'Sofá de cuero');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('12', 'Proyector HD', 'Proyector HD marca Epson');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('13', 'Pizarra interactiva', 'Pizarra interactiva SMART Board');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('14', 'Computadora de escritorio', 'Dell OptiPlex 3070');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('16', 'Impresora', 'Impresora láser');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('17', 'Pizarra magnética', 'Pizarra magnética negra');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('18', 'Silla ergonómica', 'Silla ergonómica ajustable');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('19', 'Escáner', 'Escáner de alta resolución');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('20', 'Mesa plegable', 'Mesa plegable de plástico');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('21', 'Proyector 4K', 'Proyector 4K de última generación');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('22', 'Pizarra de corcho', 'Pizarra de corcho para notas');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('23', 'Computadora iMac', 'Apple iMac Pro');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('24', 'Atril', 'Atril de metal ajustable');
INSERT INTO recurso (id, nombre, descripcion) VALUES ('25', 'Mesa de conferencia', 'Mesa de conferencia para reuniones');


insert into Lugar (id, nombre) values (1, 'SUM');
insert into Lugar (id, nombre) values (2, 'LAB 1');

insert into ESTADO_LUGAR (ID, NOMBRE) values (1, 'Ocupado');
insert into ESTADO_LUGAR (ID, NOMBRE) values (2, 'Libre');

insert into LUGAR_RECURSOS (LUGAR_ID, RECURSOS_ID) values (1,1);
insert into LUGAR_RECURSOS (LUGAR_ID, RECURSOS_ID) values (2,3);
