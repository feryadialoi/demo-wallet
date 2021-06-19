CREATE TABLE mutations (
    id BIGINT UNSIGNED AUTO_INCREMENT,
    initial_balance DECIMAL(19, 2),
    balance DECIMAL(19, 2),
    wallet_sender_id BIGINT UNSIGNED,
    wallet_receiver_id BIGINT UNSIGNED,
    amount DECIMAL(19, 2),
    created_date TIMESTAMP,
    last_modified_date TIMESTAMP,
    PRIMARY KEY (id)
)