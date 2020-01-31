
CREATE TABLE product_price_history (
  product_id int(10) NOT NULL,
  price double(10,4) NOT NULL,
  start_date date NOT NULL,
  end_date date DEFAULT NULL,
  is_active BOOLEAN NOT NULL,
  PRIMARY KEY (product_id,start_date,is_active),
  CONSTRAINT fk_products FOREIGN KEY (product_id) REFERENCES products (product_id) 
  ON DELETE CASCADE
  ON UPDATE CASCADE,
  INDEX idx_product_current (product_id,is_active) 
);

 

CREATE TABLE products (
  product_id int(10) NOT NULL,
  product_name varchar(512),
  category varchar(255),
  PRIMARY KEY (product_id)
  );
  
  
  
 Get the list of products whose current prices are greater than the average price in each category?


select 
	p.product_name,
	p.product_id,
	ph.price
FROM
	price_history ph
INNER JOIN
	product p
ON	p.product_id = ph.product_id
INNER JOIN
( -- get the average price of products in each category
select 
	p.category,
	AVG(ph.price) avg_price
from 
	price_history ph
INNER JOIN
	product p
ON p.product_id = ph.product_id
WHERE
	is_active = 1					-- getting only the active prices, we can obtain the same results using end_date "WHERE end_date IS NULL"
GROUP BY p.category	
) cat_avg
ON p.category = cat_avg.category
WHERE
	ph.is_active = 1				-- getting only the active prices
AND ph.price > cat_avg.avg_price    -- Getting only the prices greater than average price within a category
	
	
	

  
  
  --MYSQL-5.6