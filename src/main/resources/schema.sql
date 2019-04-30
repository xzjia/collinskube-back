DROP TABLE IF EXISTS beyond_fitt;

CREATE TABLE beyond_fitt (
  id SERIAL,
  username VARCHAR(255),
  message VARCHAR(1024),
  created_at timestamp DEFAULT current_timestamp
);