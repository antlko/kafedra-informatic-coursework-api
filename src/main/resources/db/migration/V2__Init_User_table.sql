CREATE TABLE users
(
    id        serial PRIMARY KEY,
    username  VARCHAR(2048) NOT NULL,
    password  VARCHAR(2048) NOT NULL,
    email     VARCHAR(2048),
    first_name VARCHAR(2048)
);

INSERT INTO users (username, password, email, first_name)
VALUES ('admin', 'admin123', 'admin@gmail.com', 'Admin');