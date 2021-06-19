CREATE TABLE wallets (
    id BIGINT UNSIGNED AUTO_INCREMENT,
    address VARCHAR (255),
    balance DECIMAL (19, 2),
    created_date TIMESTAMP,
    updated_date TIMESTAMP,
    deleted BOOLEAN,
    PRIMARY KEY (id),
    UNIQUE (address)
)