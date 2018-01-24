DROP TABLE IF EXISTS customer;

CREATE TABLE customer (
    CUSTID Bigserial PRIMARY KEY NOT NULL,
    NAME varchar(100) NOT NULL,
    AGE smallint NOT NULL
);