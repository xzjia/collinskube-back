CREATE TABLE IF NOT EXISTS collinskube (
  id SERIAL,
  username VARCHAR(255),
  message VARCHAR(1024),
  "timestamp" timestamp DEFAULT current_timestamp
);