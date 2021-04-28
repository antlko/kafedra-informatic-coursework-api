-- auto-generated definition
create table role_table
(
    id   serial      not null
        constraint role_table_pk
            primary key,
    name varchar(20) not null
);

alter table role_table
    owner to postgres;

-- auto-generated definition
create table user_table
(
    id       serial not null
        constraint user_table_pk
            primary key,
    login    varchar(50),
    password varchar(500),
    role_id  int,
    CONSTRAINT fk_teachers FOREIGN KEY (role_id) REFERENCES role_table (id)
);

alter table user_table
    owner to postgres;

create unique index user_table_login_uindex
    on user_table (login);

insert into role_table(name)
values ('ROLE_ADMIN');
insert into role_table(name)
values ('ROLE_USER');

CREATE SEQUENCE hibernate_sequence START 1;