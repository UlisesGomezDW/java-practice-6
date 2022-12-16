CREATE DATABASE Banco;

USE Banco;

CREATE TABLE cuentas(
    numCuenta int(4) NOT NULL,
    nombre varchar(100),
    saldo double,
    sucursal varchar(3),
    PRIMARY KEY (numCuenta)
);

INSERT INTO cuentas VALUES('1020', "Juan Hidalgo", 1780, "AZC");
INSERT INTO cuentas VALUES('1021', "Luis Castro", 2258, "AZC");
INSERT INTO cuentas VALUES('1120', "Maria Villanueva", 1698, "CUA");
INSERT INTO cuentas VALUES('1121', "Guillermo Parra", 880, "CUA");
INSERT INTO cuentas VALUES('1220', "Jorge Padilla", 4710, "XOC");
INSERT INTO cuentas VALUES('1221', "Fernanda Oseguera", 3690, "XOC");
INSERT INTO cuentas VALUES('1222', "Alondra Rojas", 1200, "XOC");
INSERT INTO cuentas VALUES('1022', "Jaime Ortiz", 1250, "AZC");
INSERT INTO cuentas VALUES('1122', "Lucia Guerrero", 800, "CUA");
INSERT INTO cuentas VALUES('1123', "Gina Morales", 900, "CUA");
INSERT INTO cuentas VALUES('1124', "Alberto Cuadros", 1100, "CUA");
INSERT INTO cuentas VALUES('1125', "Milton Quiroz", 1600, "CUA");
INSERT INTO cuentas VALUES('1223', "Andrea Cardona", 1350, "XOC");
INSERT INTO cuentas VALUES('1224', "Pedro Flores", 1150, "XOC");
INSERT INTO cuentas VALUES('1024', "Luis Piza", 1600, "AZC");
INSERT INTO cuentas VALUES('1025', "Jorge Fuentes", 1400, "AZC");
INSERT INTO cuentas VALUES('1126', "Alicia Martínez", 1250, "CUA");
INSERT INTO cuentas VALUES('1127', "Oscar Pérez", 1457, "CUA");
INSERT INTO cuentas VALUES('1128', "Samuel Vieyra", 1697, "CUA");
INSERT INTO cuentas VALUES('1225', "Noé Castro", 1236, "XOC");
INSERT INTO cuentas VALUES('1226', "Raúl Pinto", 1345, "XOC");
INSERT INTO cuentas VALUES('1227', "Mireya Vidal", 1310, "XOC");

SELECT * FROM cuentas ORDER BY saldo DESC;
