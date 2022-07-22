--- Borrar una tabla es = DROP TABLE nombreTabla

--- conssultas en base de datos version 3

--- 1) Seleccionar los productos que tengan como tipo lacteo

--- ¿Que id es lacteo?

select * from product_type; --- Lacteo es = id_product_type: 1
select * from product_type WHERE upper(product_type_name) like upper('Lacteos');
select * from product_type WHERE lower(product_type_name) like lower('Lacteos');
select * from product_type WHERE id_product_type = 1;

--- ¿Porque FK esta unido producto?

select * from product; --- fk_id_product_type

--- Todos los productos que sean lacteos


select product_name from product where fk_id_product_type = 1;

select PT.product_type_name, PRD.product_name
from product_type PT
INNER JOIN product PRD ON PRD.fk_id_product_type = PT.id_product_type
WHERE PRD.fk_id_product_type=(
	select PT.id_product_type
	from product_type PT 
	WHERE upper(PT.product_type_name)  like upper('Lacteos')
	);

SELECT prd.product_name AS product_name, prty.product_type_name AS product_type_name
FROM product prd 
INNER JOIN product_type prty 
ON prd.fk_id_product_type = prty.id_product_type
WHERE

--- 2) Seleccionar todos los productos que tengan precio mayor de 1000 y menor de 5000

--- Los valores de los productos estan en la tabla "price_product".
--- los nombres de los productos estan en la tabla "product".
--- Segun el diagrama entidadRelacion o Logico la ruta seria "product"--->"product_provider"--->"price_product"
--- 

SELECT prd.id_product , prd.product_name AS "NombreProducto", p_prd.sale_price AS "Precio"
from product prd
INNER JOIN product_provider pp
ON pp.fk_id_product = prd.id_product
INNER JOIN price_product p_prd
ON p_prd.fk_id_product_provider = pp.id_product_provider
--AND (p_prd.sale_price>1000 and p_prd.sale_price<5000)
AND p_prd.sale_price BETWEEN 1000 and 5000
ORDER BY p_prd.sale_price DESC;

--- 3)Seleccionar los tipos de productos que tengan menos productos

--- Ver product_provider

SELECT * FROM product_provider

SELECT prd.product_name AS "NombreProducto" , pp.stock AS "CantidadProducto"
from product prd 
INNER JOIN product_provider pp
ON pp.fk_id_product = prd.id_product
AND pp.stock<50
ORDER BY pp.stock DESC;

---averiguando solo los tipos de producto

SELECT pt.product_type_name, COUNT(pt.product_type_name) AS "NumeroProductos"
FROM product_type pt
INNER JOIN product p
ON pt.id_product_type = p.fk_id_product_type
GROUP BY pt.product_type_name
ORDER BY COUNT (pt.product_type_name) DESC

--- 4) Seleccionar el proveedor que venda mas productos 

---¿Que proveedores hay?

SELECT * from provider

--- sera sumar el numero de productos en "stock" que hay en la tabla "product_provider"
--- El id de "provider" se haya como FK en la tabla "product_provider", solo hay que hacer un paso
--- product_provider" ----> "provider"

SELECT prv.id_provider AS "IdProveedor", SUM(pp.stock) AS "Existencias"
from provider prv
INNER JOIN product_provider pp
ON pp.fk_id_provider = prv.id_provider
--- AND prv.id_provider=11;
GROUP BY pp.stock , prv.id_provider
ORDER BY SUM(pp.stock) , prv.id_provider DESC;

---

SELECT pp.fk_id_provider AS "IdProveedor" , p."name" AS "NombreProveedor", COUNT(pp.fk_id_product) AS "CantidadProductoVendido"
FROM product_provider pp
INNER JOIN provider p
ON pp.fk_id_provider = p.id_provider
GROUP BY pp.fk_id_provider, p."name"
ORDER BY COUNT(pp.fk_id_product) DESC;

--- 5) Seleccionar que persona tiene mas de un tipo (admin, cliente, cajero)

--- ver los tipo de persona

SELECT * from person_person_type --- fk_id_person_type nos dice el tipo de la persona
SELECT * from person --- person_name nos dice el nombre de la persona

SELECT pe.person_name AS "NombrePersona", pepe.fk_id_person_type AS "RolPersona"
FROM person pe
INNER JOIN person_person_type pepe
ON pepe.fk_id_person = pe.id_person
AND (pepe.fk_id_person_type = 1 AND pepe.fk_id_person_type = 2 )
OR (pepe.fk_id_person_type = 2 AND pepe.fk_id_person_type  = 3 )
OR (pepe.fk_id_person_type = 1 AND pepe.fk_id_person_type = 3)
OR (pepe.fk_id_person_type = 1 AND pepe.fk_id_person_type = 2 AND pepe.fk_id_person_type = 3);


SELECT p.id_person, p.person_name, p.person_last_name, COUNT(ppt.fk_id_person_type) AS type_person
FROM person_person_type ppt
INNER JOIN person p
ON ppt.fk_id_person = p.id_person 
GROUP BY p.id_person, p.person_name, p.person_last_name
HAVING COUNT (ppt.fk_id_person_type) >= 2;


/*
SELECT pe.person_name AS "NombrePersona", pepe.fk_id_person_type AS "RolPersona"
FROM person_person_type pepe
INNER JOIN person pe
ON pepe.fk_id_person = pe.id_person
AND (pepe.fk_id_person_type = 1);
-- WHERE (pepe.fk_id_person_type = 1);
-- OR (pepe.fk_id_person_type BETWEEN 2 and 3)
-- OR (pepe.fk_id_person_type BETWEEN 1 and 3);
-- OR (pepe.fk_id_person_type = 1 AND pepe.fk_id_person_type = 2 AND pepe.fk_id_person_type = 3);
*/


--- 6) Seleccionar el cliente que mas compra en visitas a la tienda

SELECT pe.person_name AS "NombrePersona", COUNT(t.id_ticket) AS "NoTicketes"
FROM person pe
INNER JOIN ticket t
ON pe.id_person = t.fk_id_person_customer
GROUP BY pe.person_name
ORDER BY COUNT(t.id_ticket) DESC;

--- 7) Seleccionar el Cliente que mas compra en valor de tickets

SELECT pe.person_name AS "NombreCliente", SUM(t.half_payment) AS "TotalPago"
FROM person pe
INNER JOIN ticket t
ON pe.id_person = t.fk_id_person_customer
GROUP BY pe.person_name
ORDER BY SUM(t.half_payment) DESC;


SELECT tk.id_ticket,p.person_name, p.person_last_name, SUM(td.amount*(pd.sale_price+(pd.sale_price*tx.tax_value)))
FROM ticket_detail td 
INNER JOIN tax_price_product tpd
ON td.fk_id_tax_price_product = tpd.id_tax_price_product
INNER JOIN tax tx
ON tpd.fk_id_tax = tx.id_tax
INNER JOIN price_product pd
ON tpd.fk_id_price_product = pd.id_price_product
INNER JOIN ticket tk
ON td.fk_id_ticket = tk.id_ticket
INNER JOIN person p
ON tk.fk_id_person_customer = p.id_person
GROUP BY tk.id_ticket, p.person_name, p.person_last_name
ORDER BY SUM(td.amount*(pd.sale_price+(pd.sale_price*tx.tax_value))) DESC
LIMIT 1;
