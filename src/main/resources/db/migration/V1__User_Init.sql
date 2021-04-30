create table roles
(
    id   serial      not null
        constraint role_table_pk
            primary key,
    name varchar(20) not null
);

alter table roles
    owner to postgres;


create table users
(
    id       serial not null
        constraint user_table_pk
            primary key,
    login    varchar(50),
    password varchar(500),
    role_id  int,
    CONSTRAINT fk_teachers FOREIGN KEY (role_id) REFERENCES roles (id)
);

alter table users
    owner to postgres;

create unique index user_table_login_uindex
    on users (login);

insert into roles(name)
values ('ROLE_ADMIN');
insert into roles(name)
values ('ROLE_USER');

CREATE SEQUENCE hibernate_sequence START 1;