CREATE TABLE member (\
id BIGINT NOT NULL AUTO_INCREMENT, \
name varchar(255) DEFAULT NULL,
PRIMARY KEY (id)\
);

INSERT INTO member (name) values ('testuser01');

