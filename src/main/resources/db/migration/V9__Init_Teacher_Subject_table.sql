CREATE TABLE teachers_subjects
(
    id         serial PRIMARY KEY,
    teacher_id INT,
    subject_id INT,
    CONSTRAINT fk_teachers FOREIGN KEY (teacher_id) REFERENCES teachers (id),
    CONSTRAINT fk_subjects FOREIGN KEY (subject_id) REFERENCES subjects (id)
);