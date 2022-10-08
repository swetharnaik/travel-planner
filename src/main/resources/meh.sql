INSERT INTO customer (id, email_address, first_name, last_name) VALUES (1, 'joerogan@gmail.com', 'Joe', 'Rogan');
INSERT INTO customer (id, email_address, first_name, last_name) VALUES (2, 'wonderwoman@dc.com', 'Wonder', 'Woman');
INSERT INTO customer (id, email_address, first_name, last_name) VALUES (3, 'batman@dc.com', 'Bruce', 'Wayne');

INSERT INTO address (id, street_name, district, country, pin_code, customer_id, customer_email) VALUES (10, 'Mushroom Street', 'Umami', 'Uganda', '55555', 1, 'joerogan@gmail.com');
INSERT INTO address (id, street_name, district, country, pin_code, customer_id, customer_email) VALUES (20, 'Pasta Street', 'Ortisei', 'Italy', '12345', 2, 'wonderwoman@dc.com');
INSERT INTO address (id, street_name, district, country, pin_code, customer_id, customer_email) VALUES (30, 'Banana Street', 'Kochi', 'India', '67890', 1, 'joerogan@gmail.com');

INSERT INTO shop_order (id, amount, currency, customer_id, customer_email) VALUES (111, 20, 'EUR', 2, 'wonderwoman@dc.com');

INSERT INTO item (id, item_name, seller_name, item_description, amount, currency) VALUES (9999, 'Shield', 'Mars Tools', 'XYZ Description', 5, 'EUR');
INSERT INTO item (id, item_name, seller_name, item_description, amount, currency) VALUES (9988, 'Bat Mobile', 'BMW', 'Super Car', 20000, 'EUR');
INSERT INTO item (id, item_name, seller_name, item_description, amount, currency) VALUES (9998, 'Lasso', 'Souled Store', 'ABC Description', 15, 'EUR');

INSERT INTO order_item (order_id, item_id) VALUES (111, 9999);
INSERT INTO order_item (order_id, item_id) VALUES (111, 9998);

