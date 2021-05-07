CREATE TABLE headers_objects
(
    id        serial PRIMARY KEY,
    id_header int,
    name      text not null,
    parent    int,
    url       text default '/'
);

INSERT INTO headers_objects (id_header, name, parent, url)
VALUES (1, 'ГОЛОВНА', null, '/');
INSERT INTO headers_objects (id_header, name, parent, url)
VALUES (2, 'ПРО КАФЕДРУ', null, null);
INSERT INTO headers_objects (id_header, name, parent, url)
VALUES (3, 'ІСТОРІЯ КАФЕДРИ', 2, null);
INSERT INTO headers_objects (id_header, name, parent, url)
VALUES (4, 'КОЛЕКТИВ КАФЕДРИ', 2, '/teachers');