CREATE TABLE IF NOT EXISTS author_book (
    author_id INT(11) NOT NULL,
    book_id INT(11) NOT NULL,
    FOREIGN KEY (author_id) REFERENCES author(id) ON DELETE RESTRICT ON UPDATE RESTRICT,
    FOREIGN KEY (book_id) REFERENCES book(id) ON DELETE CASCADE ON UPDATE RESTRICT
)