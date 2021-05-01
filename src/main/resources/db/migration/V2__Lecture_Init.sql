CREATE TABLE lectures
(
    id          serial PRIMARY KEY,
    photo       text,
    name        VARCHAR(255),
    description VARCHAR(255),
    email       VARCHAR(255),
    info_json   text
);
