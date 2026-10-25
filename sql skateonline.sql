CREATE DATABASE skateonline;
USE skateonline;

CREATE TABLE usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    senha VARCHAR(100)
);

SELECT * FROM usuario;

INSERT INTO usuario (nome, email, senha)
VALUES ('Matheus', 'matheus@email.com', '1234'),
       ('Ana', 'ana@email.com', 'abcd');

CREATE DATABASE IF NOT EXISTS skateonline;
USE skateonline;

DROP TABLE IF EXISTS produtos;

CREATE TABLE produtos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    valor DECIMAL(10,2) NOT NULL,
    quantidade INT NOT NULL
);

INSERT INTO produtos (nome, valor, quantidade) VALUES ('Shape Maple', 199.90, 10);
SELECT * FROM produtos;

ALTER TABLE produtos ADD COLUMN quantidade INT NOT NULL DEFAULT 0;


DESCRIBE produtos;

INSERT INTO produtos (nome, valor, quantidade) VALUES
('Shape Maple 8.0"', 199.90, 15),
('Roda 52mm Branca', 89.90, 30),
('Truck 139mm Alumínio', 159.90, 20),
('Rolamento ABEC-7', 59.90, 50),
('Lixa Antiderrapante', 29.90, 40),
('Capacete Skate Preto', 129.90, 10),
('Tênis Skate Vans', 349.90, 8),
('Camiseta Skateboard', 79.90, 25);