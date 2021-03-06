DROP TABLE IF EXISTS tbl_invoices;
DROP TABLE IF EXISTS tbl_invoce_items;

CREATE TABLE tbl_invoce_items(
  id LONG AUTO_INCREMENT  PRIMARY KEY,
  product_id LONG NOT NULL,
  quantity DOUBLE NOT NULL,
  price DOUBLE NOT NULL
);

CREATE TABLE tbl_invoices(
  id LONG AUTO_INCREMENT  PRIMARY KEY,
  number_invoice VARCHAR(250) NOT NULL,
  description VARCHAR(250) NOT NULL,
  customer_id LONG NOT NULL,
  invoce_id LONG NOT NULL,
  foreign key (invoce_id) references tbl_invoce_items(id),
  create_at VARCHAR(250) NOT NULL,  
  state VARCHAR(250) NOT NULL
);


INSERT INTO tbl_invoce_items (product_id, quantity, price ) VALUES(1 , 1, 178.89);
INSERT INTO tbl_invoce_items (product_id, quantity, price)  VALUES(2 , 2, 12.5);
INSERT INTO tbl_invoce_items (product_id, quantity, price)  VALUES(3 , 1, 40.06);


INSERT INTO tbl_invoices (id, number_invoice, description, customer_id, invoce_id, create_at, state) VALUES(1, '0001', 'invoice office items', 1, 1, NOW(),'CREATED');

