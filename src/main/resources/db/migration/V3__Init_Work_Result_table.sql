CREATE TABLE work_results
(
    id                     serial PRIMARY KEY,
    student_name           VARCHAR(2048),
    group_name             VARCHAR(2048),
    student_comment        VARCHAR(2048),
    year_finish_university INT,
    faculty                VARCHAR(2048),
    specialize             VARCHAR(2048),
    work_company           VARCHAR(2048),
    work_position          VARCHAR(2048),
    programming_languages   VARCHAR(2048),
    date_create            DATE
);

INSERT INTO work_results(student_name, group_name, student_comment, year_finish_university, faculty, specialize,
                         work_company, work_position, programming_languages, date_create)
VALUES ('Лавошнік Ілля',
        'ІНФм16-1',
        'В ході навчання я отримав безцінні знання і навички, які використовую у своїй роботі. Колектив кафедри Інформатики та всього університету всіляко сприяє як технічному, так і особистісному розвитку студентів, за що їм велика подяка.',
        2007,
        'ІТМ',
        'Інформатика',
        '',
        'IOS Developer',
        'Swift, Objective-C, Бази даних, HTTP, REST, SCRUM',
        '2019-11-15')