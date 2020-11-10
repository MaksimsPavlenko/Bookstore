CREATE TABLE IF NOT EXISTS book
(
    book_id		int AUTO_INCREMENT PRIMARY KEY,
    title	   	varchar(20) UNIQUE,
    genre		varchar(20),
    stock		int(5),
    rating		int(2),
    price		int(11),
    author      int REFERENCES author (author_id)
);

CREATE TABLE IF NOT EXISTS author
(
    author_id	int AUTO_INCREMENT PRIMARY KEY,
    first_name	varchar(20),
    last_name	varchar(20)

);