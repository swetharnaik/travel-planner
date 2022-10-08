
INSERT INTO address (id, street_name, district, country, pin_code) VALUES (10, 'Mushroom Street', 'Umami', 'Uganda', '55555');
INSERT INTO address (id, street_name, district, country, pin_code) VALUES (20, 'Pasta Street', 'Ortisei', 'Italy', '12345');
INSERT INTO address (id, street_name, district, country, pin_code) VALUES (30, 'Banana Street', 'Kochi', 'India', '67890');

INSERT INTO customer (id, email_address, first_name, last_name, address_id) VALUES (1, 'joerogan@gmail.com', 'Joe', 'Rogan', 10);
INSERT INTO customer (id, email_address, first_name, last_name, address_id) VALUES (2, 'wonderwoman@marvel.com', 'Wonder', 'Woman', 20);
INSERT INTO customer (id, email_address, first_name, last_name, address_id) VALUES (3, 'batman@dc.com', 'Bruce', 'Wayne', 30);
