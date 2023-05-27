CREATE TABLE electronics_registry
(
    id           uuid NOT NULL PRIMARY KEY,
    name         varchar(50),
    country      varchar(50),
    brand        varchar(50),
    online_order varchar(3),
    credit       varchar(3)
);


CREATE TABLE models
(
    id                  uuid NOT NULL PRIMARY KEY,
    type_id             uuid REFERENCES electronics_registry (id),
    name                varchar(50),
    serial_number       int,
    color               varchar(50),
    size                int,
    price               int,
    model_in_stock      varchar(3),
    tv_category         varchar(50),
    tv_technology       varchar(50),
    memory              int,
    cameras_quantity    int,
    pc_category         varchar(50),
    processor           varchar(50),
    doors_quantity      int,
    compressor          varchar(50),
    dust_collector_size int,
    number_of_modes     int
);
