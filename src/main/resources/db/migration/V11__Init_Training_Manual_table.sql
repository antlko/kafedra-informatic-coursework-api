CREATE TABLE training_manuals
(
    id   serial PRIMARY KEY,
    name VARCHAR(2048),
    type VARCHAR(2048),
    subject_id INT,
    CONSTRAINT fk_subjects FOREIGN KEY (subject_id) REFERENCES subjects (id)
);