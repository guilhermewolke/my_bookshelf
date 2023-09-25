CREATE TABLE IF NOT EXISTS book (
    id INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    publisher_id INT(11) NOT NULL,
    title VARCHAR(100) NOT NULL,
    category VARCHAR(50) NOT NULL,
    bought TINYINT(1) NOT NULL DEFAULT 1,
    ISBN VARCHAR(20) NOT NULL,
    pages INT(11) NULL DEFAULT 0,
    format VARCHAR(25) NOT NULL DEFAULT "IMPRESSO",
    FOREIGN KEY (publisher_id) REFERENCES publisher(id) ON UPDATE CASCADE ON DELETE CASCADE
);