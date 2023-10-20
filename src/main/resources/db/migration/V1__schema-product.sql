create table products
(
    product_id          character varying(64)  not null primary key,
    product_name        character varying(100) not null,
    product_description text,
    price               numeric(8)                      default 0,
    stock               bigint                         default 1,
    last_updated        timestamp              not null default now()
);

insert into products(product_id, product_name, product_description, price, stock)
values ('mbp2017-13', 'MacBook Pro 13" (2017)', 'Second hand mulus no minus', 16000000, 1),
       ('ipadair6-64gb', 'iPad Air 6 (2021)', 'Second hand mulus like new', 10000000, 1);