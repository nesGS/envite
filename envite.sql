-- Creación de la tabla User
CREATE TABLE User (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL
);

-- Creación de la tabla Game
CREATE TABLE Game (
    game_id INT AUTO_INCREMENT PRIMARY KEY,
    game_name VARCHAR(100) NOT NULL,
    created_at DATETIME NOT NULL,
    updated_at DATETIME
);

-- Creación de la tabla Card
CREATE TABLE Card (
    card_id INT AUTO_INCREMENT PRIMARY KEY,
    card_name VARCHAR(50) NOT NULL,
    suit VARCHAR(20) NOT NULL,
    value INT NOT NULL
);

-- Creación de la tabla PlayerHand
CREATE TABLE PlayerHand (
    hand_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    game_id INT NOT NULL,
    card_id INT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES User(user_id),
    FOREIGN KEY (game_id) REFERENCES Game(game_id),
    FOREIGN KEY (card_id) REFERENCES Card(card_id)
);

-- Creación de la tabla PlayedCard
CREATE TABLE PlayedCard (
    played_card_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    game_id INT NOT NULL,
    card_id INT NOT NULL,
    played_at DATETIME NOT NULL,
    FOREIGN KEY (user_id) REFERENCES User(user_id),
    FOREIGN KEY (game_id) REFERENCES Game(game_id),
    FOREIGN KEY (card_id) REFERENCES Card(card_id)
);

-- Creación de la tabla Round
CREATE TABLE Round (
    round_id INT AUTO_INCREMENT PRIMARY KEY,
    game_id INT NOT NULL,
    winner_user_id INT NOT NULL,
    round_number INT NOT NULL,
    completed_at DATETIME NOT NULL,
    FOREIGN KEY (game_id) REFERENCES Game(game_id),
    FOREIGN KEY (winner_user_id) REFERENCES User(user_id)
);

-- Creación de la tabla Envite
CREATE TABLE Envite (
    envite_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    game_id INT NOT NULL,
    amount DECIMAL(10, 2) NOT NULL,
    created_at DATETIME NOT NULL,
    FOREIGN KEY (user_id) REFERENCES User(user_id),
    FOREIGN KEY (game_id) REFERENCES Game(game_id)
);