# To run it:
# mysql -u root -p < library.sql
# enter pwd: goodyear123!@#

DROP DATABASE IF EXISTS lib_db;
CREATE DATABASE lib_db;
USE lib_db;
CREATE TABLE authors(
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(255)
);
INSERT INTO authors (name) VALUES ("Jack London");
INSERT INTO authors (name) VALUES ("George Washington");

CREATE TABLE books(
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(255),
	author_id  INT);
INSERT INTO books (name, author_id) VALUES ("Great Expectation", 1);
INSERT INTO books (name, author_id) VALUES ("Twin City", 1);

