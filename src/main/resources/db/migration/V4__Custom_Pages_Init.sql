CREATE TABLE custom_pages_info
(
    id        serial PRIMARY KEY,
    url       text not null unique,
    info_json text not null
);