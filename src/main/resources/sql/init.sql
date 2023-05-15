CREATE TABLE electronics_registry
(
    id                               uuid NOT NULL PRIMARY KEY,
    наименование                     varchar(50),
    страна_производитель             varchar(50),
    фирма_производитель              varchar(50),
    возможность_заказа_онлайн        varchar(3),
    возможность_оформления_рассрочки varchar(3)
);


CREATE TABLE models
(
    id                 uuid NOT NULL PRIMARY KEY,
    вид_техники        uuid REFERENCES electronics_registry (id),
    наименование       varchar(50),
    серийный_номер     int,
    цвет               varchar(50),
    размер             int,
    цена               int,
    модель_на_складе   varchar(3),
    категория_тв       varchar(50),
    технология_тв      varchar(50),
    память_смартфона   int,
    количество_камер   int,
    категория_пк       varchar(50),
    тип_процессора     varchar(50),
    количество_дверей  int,
    тип_компрессора    varchar(50),
    объем_пылесборника int,
    количество_режимов int
);
