DROP TABLE IF EXISTS beyond_fitt;

CREATE TABLE collinskube (
  id SERIAL,
  username VARCHAR(255),
  message VARCHAR(1024),
  "timestamp" timestamp DEFAULT current_timestamp
);