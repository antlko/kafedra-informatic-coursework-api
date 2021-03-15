CREATE TABLE subjects
(
    id          serial PRIMARY KEY,
    name        VARCHAR(2048),
    description VARCHAR(2048),
    language    VARCHAR(2048),
    grading     VARCHAR(2048),
    type        VARCHAR(2048)
);