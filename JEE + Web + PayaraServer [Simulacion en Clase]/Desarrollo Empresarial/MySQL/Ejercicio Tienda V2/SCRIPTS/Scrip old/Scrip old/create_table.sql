CREATE TABLE IF NOT EXISTS PRODUCT_TYPE (
  id_product_type Serial ,
  product_type_name VARCHAR(45) NOT NULL);

CREATE TABLE IF NOT EXISTS PRODUCT (
  id_product Serial ,
  product_name VARCHAR(45) NOT NULL,
  product_stock INT NOT NULL,
  fk_id_product_type INT NOT NULL);

CREATE TABLE IF NOT EXISTS PRICE_PRODUCT (
  id_price_product SERIAL ,
  sale_price DECIMAL(13,2) NOT NULL,
  shop_price DECIMAL(13,2) NOT NULL,
  start_date DATE NOT NULL,
  user_update VARCHAR(40) NOT NULL,
  date_update DATE NOT NULL,
  fk_id_product INT NOT NULL);

CREATE TABLE IF NOT EXISTS TAX (
  id_tax SERIAL ,
  tax_value DECIMAL(5,2) NOT NULL,
  tax_name VARCHAR(15) NOT NULL,
  creation_date DATE NULL);

CREATE TABLE IF NOT EXISTS DETAIL_TICKET (
  id_detail_ticket SERIAL ,
  amount INT NOT NULL,
  unit_value DECIMAL(13,2) NOT NULL,
  address VARCHAR(45) NOT NULL,
  devolution_request DATE NULL,
  devolution_approved DATE NULL,
  description VARCHAR(45) NULL);

CREATE TABLE IF NOT EXISTS TAX_PRICE_PRODUCT (
  id_price_product SERIAL ,
  fk_id_price_product INT NOT NULL,
  fk_id_tax INT NOT NULL,
  fk_id_detail_ticket INT NOT NULL);

CREATE TABLE IF NOT EXISTS PROVIDER (
  id_provider SERIAL ,
  provider_name VARCHAR(45) NOT NULL,
  provider_direction VARCHAR(20) NOT NULL,
  provider_phone VARCHAR(10) NOT NULL,
  provider_url VARCHAR(45) NOT NULL,
  provider_nit VARCHAR(45) NOT NULL);


CREATE TABLE IF NOT EXISTS PROVIDER_PRODUCT (
  id_provider_product SERIAL ,
  fk_id_provider INT NOT NULL,
  fk_id_product INT NOT NULL,
  bar_code VARCHAR(45) NOT NULL,
  stock INT NOT NULL);

CREATE TABLE IF NOT EXISTS PERSON_TYPE (
  id_person_type SERIAL ,
  person_type_name VARCHAR(45) NOT NULL);

CREATE TABLE IF NOT EXISTS PERSON (
  id_person SERIAL ,
  person_dni VARCHAR(20) NOT NULL,
  person_name VARCHAR(45) NOT NULL,
  person_last_name VARCHAR(45) NOT NULL,
  person_phone VARCHAR(45) NULL,
  person_address VARCHAR(45) NOT NULL,
  person_mail VARCHAR(45) NULL,
  fk_id_person_type INT NOT NULL);

CREATE TABLE IF NOT EXISTS TICKET (
  id_ticket SERIAL ,
  paid_value DECIMAL(13,2) NULL,
  ticket_date DATE NOT NULL,
  fk_id_person_customer INT NOT NULL,
  fk_id_person_cashier INT NOT NULL,
  fk_id_detail_ticket INT NOT NULL);