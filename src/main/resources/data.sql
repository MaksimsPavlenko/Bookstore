INSERT INTO book (title, publisher, published_date)
VALUES ('Java concepts', 'java publisher', '2020-11-10');
INSERT INTO book (title, publisher, published_date)
VALUES ('C++ concepts', 'Maksims', '2020-11-10');

INSERT INTO author (first_name, last_name, books_book_id)
VALUES ('Maksims', 'Pavlenko', 1);
INSERT INTO author (first_name, last_name, books_book_id)
VALUES ('Aleksejs', 'Berzins', 1);
INSERT INTO author (first_name, last_name, books_book_id)
VALUES ('Aleksejs', 'Berzins', 2);

INSERT INTO book_authors (book_book_id, authors_author_id)
VALUES (1, 1);
INSERT INTO book_authors (book_book_id, authors_author_id)
VALUES (1, 2);
INSERT INTO book_authors (book_book_id, authors_author_id)
VALUES (2, 3);
