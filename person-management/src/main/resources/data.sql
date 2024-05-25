INSERT INTO persons (name) VALUES ('John Doe');
INSERT INTO persons (name) VALUES ('Jane Smith');

INSERT INTO addresses (person_id, type, address) VALUES (1, 'permanent', '123 Main St');
INSERT INTO addresses (person_id, type, address) VALUES (1, 'temporary', '456 Side St');
INSERT INTO addresses (person_id, type, address) VALUES (2, 'permanent', '789 Oak St');

INSERT INTO contacts (address_id, type, value) VALUES (1, 'email', 'john.doe@example.com');
INSERT INTO contacts (address_id, type, value) VALUES (1, 'phone', '555-1234');
INSERT INTO contacts (address_id, type, value) VALUES (2, 'email', 'john.temp@example.com');
INSERT INTO contacts (address_id, type, value) VALUES (3, 'phone', '555-5678');
