create table roles
(
    id   serial      not null primary key,
    name varchar(20) not null
);

create table users
(
    id       serial not null primary key,
    login    varchar(50) unique,
    password varchar(500),
    role_id  int,
    CONSTRAINT fk_roles FOREIGN KEY (role_id) REFERENCES roles (id)
);

insert into roles(name) values ('ROLE_ADMIN');
insert into roles(name) values ('ROLE_USER');

CREATE SEQUENCE hibernate_sequence;