CREATE TABLE persons (
                         id BIGINT IDENTITY PRIMARY KEY,
                         name VARCHAR(100) NOT NULL
);

CREATE TABLE addresses (
                           id BIGINT IDENTITY PRIMARY KEY,
                           person_id BIGINT,
                           type VARCHAR(20) CHECK (type IN ('permanent', 'temporary')),
                           address VARCHAR(255),
                           FOREIGN KEY (person_id) REFERENCES persons(id)
);

CREATE TABLE contacts (
                          id BIGINT IDENTITY PRIMARY KEY,
                          address_id BIGINT,
                          type VARCHAR(50),
                          value VARCHAR(100),
                          FOREIGN KEY (address_id) REFERENCES addresses(id)
);
