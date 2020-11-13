# CREATE TABLE IF NOT EXISTS book
# (
#     book_id		int AUTO_INCREMENT PRIMARY KEY,
#     title	   	varchar(20) UNIQUE,
#     genre		varchar(20),
#     stock		int(5),
#     rating		int(2),
#     price		int(11),
#     author      int REFERENCES author (author_id)
# );
#
# CREATE TABLE IF NOT EXISTS author
# (
#     author_id	int AUTO_INCREMENT PRIMARY KEY,
#     first_name	varchar(20),
#     last_name	varchar(20)
#
# );
CREATE TABLE IF NOT EXISTS book
  (
      book_id			int AUTO_INCREMENT PRIMARY KEY,
      title			   	varchar(20) UNIQUE NOT NULL,
      publisher			varchar(20) NOT NULL,
      published_date	date NOT NULL
  );

CREATE TABLE IF NOT EXISTS author
(
    author_id	int AUTO_INCREMENT PRIMARY KEY,
    first_name	varchar(20) NOT NULL,
    last_name	varchar(20) NOT NULL

);


#
INSERT INTO book (title, publisher, published_date)
VALUES ('Java concepts', 'java publisher', '2020-11-10');
INSERT INTO book (title, publisher, published_date)
VALUES ('C++ concepts', 'Maksims', '2020-11-10');

INSERT INTO author (first_name, last_name, books_book_id)
VALUES ('Maksims', 'Pavlenko', 1);
INSERT INTO author (first_name, last_name, books_book_id)
VALUES ('Aleksejs', 'Berzins', 1);

INSERT INTO book_authors (book_book_id, authors_author_id)
VALUES (1, 1);
INSERT INTO book_authors (book_book_id, authors_author_id)
VALUES (1, 2);
INSERT INTO book_authors (book_book_id, authors_author_id)
VALUES (2, 1)