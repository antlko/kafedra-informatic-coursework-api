CREATE TABLE course_works
(
    id          serial PRIMARY KEY,
    name        VARCHAR(2048),
    description VARCHAR(2048),
    subject_id INT,
    CONSTRAINT fk_subjects FOREIGN KEY (subject_id) REFERENCES subjects (id)
);