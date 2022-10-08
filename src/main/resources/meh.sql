
INSERT INTO address (id, street_name, district, country, pin_code) VALUES (10, 'Mushroom Street', 'Umami', 'Uganda', '55555');
INSERT INTO address (id, street_name, district, country, pin_code) VALUES (20, 'Pasta Street', 'Ortisei', 'Italy', '12345');
INSERT INTO address (id, street_name, district, country, pin_code) VALUES (30, 'Banana Street', 'Kochi', 'India', '67890');

INSERT INTO customer (id, email_address, first_name, last_name, address_id) VALUES (1, 'joerogan@gmail.com', 'Joe', 'Rogan', 10);
INSERT INTO customer (id, email_address, first_name, last_name, address_id) VALUES (2, 'wonderwoman@dc.com', 'Wonder', 'Woman', 20);
INSERT INTO customer (id, email_address, first_name, last_name, address_id) VALUES (3, 'batman@dc.com', 'Bruce', 'Wayne', 30);

INSERT INTO item (id, item_name, seller_name, item_description, amount, currency) VALUES (9999, 'Shield', 'Mars Tools', 'XYZ Description', 5, 'EUR');
INSERT INTO item (id, item_name, seller_name, item_description, amount, currency) VALUES (9988, 'Bat Mobile', 'BMW', 'Super Car', 20000, 'EUR');
INSERT INTO item (id, item_name, seller_name, item_description, amount, currency) VALUES (9998, 'Lasso', 'Souled Store', 'ABC Description', 15, 'EUR');

--INSERT INTO shop_order (id, amount, currency, item_id, customer_id, customer_email) VALUES (111, 20, 'EUR', 9999, 2, 'wonderwoman@dc.com');
INSERT INTO shop_order (id, amount, currency, customer_id, customer_email) VALUES (111, 20, 'EUR', 2, 'wonderwoman@dc.com');

