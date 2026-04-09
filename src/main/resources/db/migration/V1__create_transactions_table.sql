CREATE TABLE transactions (
                              id BIGSERIAL PRIMARY KEY,
                              account_id BIGINT NOT NULL,
                              external_transaction_id VARCHAR(255),
                              booking_date DATE NOT NULL,
                              amount NUMERIC(19,2) NOT NULL,
                              currency VARCHAR(3) NOT NULL,
                              counterparty_name VARCHAR(255),
                              counterparty_iban VARCHAR(255),
                              description VARCHAR(1000),
                              direction VARCHAR(50) NOT NULL,
                              status VARCHAR(50) NOT NULL,
                              source VARCHAR(50) NOT NULL,
                              created_at TIMESTAMP WITH TIME ZONE NOT NULL
);