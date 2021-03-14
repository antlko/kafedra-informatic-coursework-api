CREATE TABLE partners
(
    id              serial PRIMARY KEY,
    name            VARCHAR(2048),
    description     VARCHAR(2048),
    link_to_company VARCHAR(2048)
);

INSERT INTO partners (name, description, link_to_company)
VALUES ('Miratech', 'Something min info', 'https://miratech.ua/');

