USE sys;

# ---------------------------------------------------------------------- #
# Target DBMS:           MySQL                                           #
# Project name:          HelloWorld                                      #
# ---------------------------------------------------------------------- #
DROP DATABASE IF EXISTS HelloWorld;

CREATE DATABASE IF NOT EXISTS HelloWorld;

USE HelloWorld;

# ---------------------------------------------------------------------- #
# Tables                                                                 #
# ---------------------------------------------------------------------- #

CREATE TABLE greetings (
    greet_id INT NOT NULL AUTO_INCREMENT,
    greeting VARCHAR(50) NOT NULL,
    PRIMARY KEY (greet_id)
);

CREATE TABLE farewells (
    farewell_id INT NOT NULL AUTO_INCREMENT,
	farewell VARCHAR(50) NOT NULL,
    PRIMARY KEY (farewell_id)
);
# ---------------------------------------------------------------------- #
# Insert Sample Data                                                     #
# ---------------------------------------------------------------------- #

INSERT INTO greetings (greeting) VALUES
('Hello'),
('Hi'),
('Hey'),
('Howdy'),
('Good morning'),
('Good afternoon'),
('Good evening');

INSERT INTO farewells (farewell) VALUES
('Goodbye'),
('Bye'),
('Bye-ah!'),
('See you later'),
('Take care'),
('Farewell'),
('Have a nice day');

# ---------------------------------------------------------------------- #
# Create a Combined Messages Table                                       #
# ---------------------------------------------------------------------- #

CREATE TABLE conversations (
    convo_id INT NOT NULL AUTO_INCREMENT,
    greet_id INT NOT NULL,
    farewell_id INT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (convo_id),
    FOREIGN KEY (greet_id) REFERENCES greetings(greet_id)
        ON DELETE CASCADE
        ON UPDATE CASCADE,
    FOREIGN KEY (farewell_id) REFERENCES farewells(farewell_id)
        ON DELETE CASCADE
        ON UPDATE CASCADE
);

# ---------------------------------------------------------------------- #
# Insert Sample Conversation Records                                     #
# ---------------------------------------------------------------------- #

INSERT INTO conversations (greet_id, farewell_id) VALUES
(1, 1),
(2, 3),
(4, 6);
