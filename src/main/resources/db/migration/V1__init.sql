CREATE TABLE About (
  id serial PRIMARY KEY,
  name VARCHAR (255),
  email VARCHAR (255),
  phone VARCHAR (255),
  description TEXT,
  date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
)

