--TABELAS DA AULA 27-06-2025
-- Tabela de usuarios
CREATE TABLE usuario (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    senha VARCHAR(255) NOT NULL
);

-- Tabela de Cliente
CREATE TABLE cliente (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100),
    celular VARCHAR(20),
    cidade VARCHAR(100)
);

-- Tabela de Produtos
CREATE TABLE produto (
    id SERIAL PRIMARY KEY,
    descricao VARCHAR(200) NOT NULL,
    precocusto DECIMAL(10, 2),
    precovenda DECIMAL(10, 2) NOT NULL,
    estoque INTEGER DEFAULT 0,
    unidade VARCHAR(10)
);

-- Tabela de Cidades
CREATE TABLE cidade (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    estado VARCHAR(2) NOT NULL,-- SIGLA
    codigo_ibge INTEGER,
    populacao INTEGER,
    regiao_id INTEGER REFERENCES regioes(id)
);
-- Tabela de Regiões
CREATE TABLE regiao (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    descricao TEXT,
    estado VARCHAR(2),
    meta_vendas DECIMAL(12, 2),
    responsavel VARCHAR(100)
);

-- Tabela de Vendedor
CREATE TABLE vendedor (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(11) NOT NULL,
    email VARCHAR(100),
    telefone VARCHAR(20),
    comissao_percentual DECIMAL(5, 2),
    regiao_id INTEGER REFERENCES regiao(id)
);

-- Tabela de Pedidos
CREATE TABLE pedido (
    id SERIAL PRIMARY KEY,
    data_pedido DATE DEFAULT CURRENT_DATE,
    cliente_id INTEGER REFERENCES cliente(id),
    vendedor_id INTEGER REFERENCES vendedor(id),
    valor_total DECIMAL(12, 2),
    statuspedido VARCHAR(20),
    forma_pagamento VARCHAR(50)
);

-- Tabela de Itens do Pedido
CREATE TABLE itempedido (
    id SERIAL PRIMARY KEY,
    pedido_id INTEGER REFERENCES pedido(id),
    produto_id INTEGER REFERENCES produto(id),
    quantidade INTEGER,
    preco_custo_unitario DECIMAL(10, 2),
    preco_venda_unitario DECIMAL(10, 2),
    subtotal DECIMAL(12, 2)
);

-- Tabela de Fornecedores
CREATE TABLE fornecedores (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf_cnpj VARCHAR(14) NOT NULL,
    email VARCHAR(100),
    telefone VARCHAR(20),
    endereco VARCHAR(200),
    cidade_id INTEGER REFERENCES cidade(id),
    contato VARCHAR(100),
    observacoes TEXT,
    data_cadastro DATE DEFAULT CURRENT_DATE,
    status BOOLEAN DEFAULT true
);

-- Tabela de Contas a Pagar
CREATE TABLE contaspagar (
    id SERIAL PRIMARY KEY,
    descricao VARCHAR(200),
    data_vencimento DATE,
    valor DECIMAL(12, 2),
    fornecedor_id INTEGER,
    status_pagamento VARCHAR(20)
);

-- Tabela de Contas a Receber
CREATE TABLE contasreceber (
    id SERIAL PRIMARY KEY,
    cliente_id INTEGER REFERENCES cliente(id),
    data_vencimento DATE,
    valor DECIMAL(12, 2),
    status_recebimento VARCHAR(20)
);


