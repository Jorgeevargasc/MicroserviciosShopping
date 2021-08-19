DROP TABLE IF EXISTS tbl_categories;
DROP TABLE IF EXISTS tbl_products;

CREATE TABLE tbl_categories(
  id LONG AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL
);


CREATE TABLE tbl_products(
  id LONG AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  description VARCHAR(250) NOT NULL,
  stock DOUBLE NOT NULL,
  price DOUBLE NOT NULL,
  status VARCHAR(250) NOT NULL,
  category_id LONG NOT NULL,
  create_at VARCHAR(250) NOT NULL,
  foreign key (category_id) references tbl_categories(id)  
);


INSERT INTO tbl_categories (id, name) VALUES (1, 'shoes');
INSERT INTO tbl_categories (id, name) VALUES (2, 'books');
INSERT INTO tbl_categories (id, name) VALUES (3, 'electronics');

INSERT INTO tbl_products (id, name, description, stock, price, status, create_at, category_id)
VALUES (1, 'adidas Cloudfoam Ultimate','Walk in the air in the black / black CLOUDFOAM ULTIMATE running shoe from ADIDAS',5,178.89,'CREATED','2018-09-05',1);

INSERT INTO tbl_products (id, name, description, stock, price, status, create_at, category_id)
VALUES (2, 'under armour Men ''s Micro G Assert – 7','under armour Men ''Lightweight mesh upper delivers complete breathability . Durable leather overlays for stability ',4,12.5,'CREATED','2018-09-05',1);


INSERT INTO tbl_products (id, name, description, stock, price, status, create_at, category_id)
VALUES (3, 'Spring Boot in Action','under armour Men '' Craig Walls is a software developer at Pivotal and is the author of Spring in Action',12,40.06,'CREATED','2018-09-05',2);
