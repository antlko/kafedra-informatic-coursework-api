CREATE TABLE lectures
(
    id                       serial PRIMARY KEY,
    full_name                VARCHAR(2048),
    name_link                VARCHAR(2048),
    status                   VARCHAR(2048),
    avatar_bytes             TEXT,
    email                    VARCHAR(2048),
    achivments               VARCHAR(2048),
    kvalification_info       VARCHAR(2048),
    kvalification_link       VARCHAR(2048),
    science_publication      VARCHAR(2048),
    science_publication_link VARCHAR(2048),
    science_interest         VARCHAR(2048),
    discipline               VARCHAR(2048)
);
