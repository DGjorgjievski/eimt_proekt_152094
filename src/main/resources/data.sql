create sequence IF NOT EXISTS local_seq;

CREATE TABLE IF NOT EXISTS local (id BIGINT NOT NULL, name VARCHAR(255), location VARCHAR(255), total_spaces INTEGER, local_image VARCHAR(5000));

INSERT INTO local (id, name, location, total_spaces, local_image) VALUES (nextval('local_seq'), 'Cafe Li', 'Skopje', 1, 'https://www.google.com/search?q=restaurant+image&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjMzKr85Kb6AhUjElkFHUSOATcQ_AUoAXoECAEQAw&biw=2550&bih=1273&dpr=1#imgrc=xKyttau6iI9LLM');
INSERT INTO local (id, name, location, total_spaces, local_image) VALUES (nextval('local_seq'), 'Circle', 'Skopje', 2, 'https://www.google.com/search?q=restaurant+image&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjMzKr85Kb6AhUjElkFHUSOATcQ_AUoAXoECAEQAw&biw=2550&bih=1273&dpr=1#imgrc=xKyttau6iI9LLM');
INSERT INTO local (id, name, location, total_spaces, local_image) VALUES (nextval('local_seq'), 'Casa', 'Skopje', 2, 'https://www.google.com/search?q=restaurant+image&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjMzKr85Kb6AhUjElkFHUSOATcQ_AUoAXoECAEQAw&biw=2550&bih=1273&dpr=1#imgrc=xKyttau6iI9LLM');
INSERT INTO local (id, name, location, total_spaces, local_image) VALUES (nextval('local_seq'), 'Cube', 'Skopje', 5, 'https://www.google.com/search?q=restaurant+image&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjMzKr85Kb6AhUjElkFHUSOATcQ_AUoAXoECAEQAw&biw=2550&bih=1273&dpr=1#imgrc=xKyttau6iI9LLM');
INSERT INTO local (id, name, location, total_spaces, local_image) VALUES (nextval('local_seq'), 'Vox', 'Skopje', 7, 'https://www.google.com/search?q=restaurant+image&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjMzKr85Kb6AhUjElkFHUSOATcQ_AUoAXoECAEQAw&biw=2550&bih=1273&dpr=1#imgrc=xKyttau6iI9LLM');

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

create sequence IF NOT EXISTS table_seq;

CREATE TABLE IF NOT EXISTS table_entity
(id BIGINT NOT NULL,
 id_number INTEGER,
 chair_number INTEGER,
 local_id BIGINT);

INSERT INTO table_entity (id, id_number, chair_number, local_id) VALUES (nextval('table_seq'), 1, 5, 1);
INSERT INTO table_entity (id, id_number, chair_number, local_id) VALUES (nextval('table_seq'), 2, 7, 2);

create sequence IF NOT EXISTS reservation_seq;

CREATE TABLE IF NOT EXISTS reservation (id BIGINT NOT NULL, user_id BIGINT, local_name VARCHAR(255) UNIQUE, number_of_tables INTEGER, date_time DATETIME, is_confirmed BOOLEAN);
INSERT INTO reservation (id, user_id, local_name, number_of_tables , date_time, is_confirmed) VALUES (nextval('reservation_seq'), 1, 'Vox',6, now(), false);
INSERT INTO reservation (id, user_id, local_name, number_of_tables, date_time, is_confirmed) VALUES (nextval('reservation_seq'), 2, 'Cube', 9, now(), false);