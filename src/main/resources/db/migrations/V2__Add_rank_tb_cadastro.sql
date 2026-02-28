--V2: Migrations para adicionar a coluna e RANK na tavela de cadastro

ALTER TABLE tb_cadastro
    ADD COLUMN rank_ninja VARCHAR(255);