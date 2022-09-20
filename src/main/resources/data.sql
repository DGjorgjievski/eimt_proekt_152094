create sequence IF NOT EXISTS local_seq;

CREATE TABLE IF NOT EXISTS local (id BIGINT NOT NULL, name VARCHAR(255), location VARCHAR(255), total_spaces INTEGER);

INSERT INTO local (id, name, location, total_spaces) VALUES (nextval('local_seq'), 'Cafe Li', 'Skopje', 1);
INSERT INTO local (id, name, location, total_spaces) VALUES (nextval('local_seq'), 'Circle', 'Skopje', 2);
INSERT INTO local (id, name, location, total_spaces) VALUES (nextval('local_seq'), 'Casa', 'Skopje', 2);
INSERT INTO local (id, name, location, total_spaces) VALUES (nextval('local_seq'), 'Cube', 'Skopje', 5);
INSERT INTO local (id, name, location, total_spaces) VALUES (nextval('local_seq'), 'Vox', 'Skopje', 7);

create sequence IF NOT EXISTS user_seq;

CREATE TABLE IF NOT EXISTS user_table
(id BIGINT NOT NULL,
 name VARCHAR(255),
 sur_name VARCHAR(255),
 user_name VARCHAR(255),
 password VARCHAR(255),
 points DOUBLE,
 is_manager BOOLEAN);

INSERT INTO user_table (id, name, sur_name, user_name, password, points, is_manager) VALUES (nextval('user_seq'), 'Tom', 'Stoic', 'tomStoic', 'pass', 10.00, false);
INSERT INTO user_table (id, name, sur_name, user_name, password, points, is_manager) VALUES (nextval('user_seq'), 'Lexi', 'Stevens', 'lexi', 'dog', 20.00, false);