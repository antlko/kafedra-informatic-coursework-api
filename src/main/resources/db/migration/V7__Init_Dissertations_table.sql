CREATE TABLE dissertations
(
    id          serial PRIMARY KEY,
    name        VARCHAR(2048),
    description VARCHAR(2048),
    teacher_id  INT,
    CONSTRAINT fk_teachers FOREIGN KEY (teacher_id) REFERENCES teachers (id)
);