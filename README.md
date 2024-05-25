Schema.sql
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
-----------------------------------------------------------------------------------------------------------
dat.sql
INSERT INTO persons (name) VALUES ('John Doe');
INSERT INTO persons (name) VALUES ('Jane Smith');

INSERT INTO addresses (person_id, type, address) VALUES (1, 'permanent', '123 Main St');
INSERT INTO addresses (person_id, type, address) VALUES (1, 'temporary', '456 Side St');
INSERT INTO addresses (person_id, type, address) VALUES (2, 'permanent', '789 Oak St');

INSERT INTO contacts (address_id, type, value) VALUES (1, 'email', 'john.doe@example.com');
INSERT INTO contacts (address_id, type, value) VALUES (1, 'phone', '555-1234');
INSERT INTO contacts (address_id, type, value) VALUES (2, 'email', 'john.temp@example.com');
INSERT INTO contacts (address_id, type, value) VALUES (3, 'phone', '555-5678');
