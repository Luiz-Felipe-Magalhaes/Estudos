
INSERT INTO [TABELA DE PRODUTOS]
([CODIGO DO PRODUTO], [NOME DO PRODUTO], [EMBALAGEM], [TAMANHO], [SABOR], [PRECO DE LISTA])
VALUES
('1040107', 'Light - 350ml - Mel�ncia', 'Lata', '350ml', 'Mel�ncia', 4.56)

INSERT INTO [TABELA DE PRODUTOS]
([CODIGO DO PRODUTO], [NOME DO PRODUTO], [EMBALAGEM], [TAMANHO], [SABOR], [PRECO DE LISTA])
VALUES
('1037797', 'Clean - 2 Litros - Laranja', 'PET', '2 Litros', 'Laranja', 16.01)

INSERT INTO [TABELA DE PRODUTOS]
([CODIGO DO PRODUTO], [NOME DO PRODUTO], [EMBALAGEM], [TAMANHO], [SABOR], [PRECO DE LISTA])
VALUES
('1000889', 'Sabor da Montanha - 700 ml - Uva', 'Garrafa', '700 ml', 'Uva', 6.31)

SELECT * FROM [TABELA DE PRODUTOS]

DELETE FROM [TABELA DE PRODUTOS]
WHERE [CODIGO DO PRODUTO] = '1088126'

ALTER TABLE [TABELA DE PRODUTOS]
ADD CONSTRAINT PK_PRODUTOS
PRIMARY KEY CLUSTERED ([CODIGO DO PRODUTO])

ALTER TABLE [TABELA DE PRODUTOS]
ALTER COLUMN [CODIGO DO PRODUTO]
VARCHAR(10) NOT NULL
