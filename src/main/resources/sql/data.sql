INSERT INTO electronics_registry (id, name, country, brand, online_order, credit)
VALUES (uuid_generate_v4(), 'Телевизор', 'Япония', 'Sony', 'Да', 'Нет'),
       (uuid_generate_v4(), 'Телевизор', 'Южная Корея', 'Samsung', 'Да', 'Да'),
       (uuid_generate_v4(), 'Телевизор', 'Южная Корея', 'LG', 'Да', 'Да'),
       (uuid_generate_v4(), 'Компьютер', 'США', 'Apple', 'Да', 'Нет'),
       (uuid_generate_v4(), 'Компьютер', 'Тайвань', 'MSI', 'Да', 'Да'),
       (uuid_generate_v4(), 'Компьютер', 'Тайвань', 'Acer', 'Да', 'Да'),
       (uuid_generate_v4(), 'Смартфон', 'Южная Корея', 'Samsung', 'Да', 'Да'),
       (uuid_generate_v4(), 'Смартфон', 'США', 'Apple', 'Да', 'Да'),
       (uuid_generate_v4(), 'Смартфон', 'Китай', 'Huawei', 'Да', 'Да'),
       (uuid_generate_v4(), 'Холодильник', 'Южная Корея', 'LG', 'Да', 'Да'),
       (uuid_generate_v4(), 'Холодильник', 'Италия', 'Indesit', 'Да', 'Да'),
       (uuid_generate_v4(), 'Холодильник', 'Китай', 'Haier', 'Да', 'Да'),
       (uuid_generate_v4(), 'Пылесос', 'Россия', 'Redmond', 'Да', 'Да'),
       (uuid_generate_v4(), 'Пылесос', 'Южная Корея', 'Hyundai', 'Да', 'Да'),
       (uuid_generate_v4(), 'Пылесос', 'Китай', 'Xiaomi', 'Да', 'Да');


INSERT INTO models (id, type_id, name, serial_number, color, size, price, model_in_stock,
                    tv_category, tv_technology)
VALUES (uuid_generate_v4(), (SELECT id
                             FROM electronics_registry
                             WHERE electronics_registry.name = 'Телевизор'
                               AND brand = 'Sony'), 'Sony Model 1', 12345, 'Черный', 100, 15000, 'Да', 'LED',
        'Big Tech'),
       (uuid_generate_v4(), (SELECT id
                             FROM electronics_registry
                             WHERE electronics_registry.name = 'Телевизор'
                               AND brand = 'Sony'), 'Sony Model 2', 22345, 'Черный', 150, 25000, 'Да', 'QLED',
        'Big Tech'),
       (uuid_generate_v4(), (SELECT id
                             FROM electronics_registry
                             WHERE electronics_registry.name = 'Телевизор'
                               AND brand = 'Samsung'), 'Samsung Model 1', 32345, 'Черный', 155, 35000, 'Да', '4K',
        'Big Tech'),
       (uuid_generate_v4(), (SELECT id
                             FROM electronics_registry
                             WHERE electronics_registry.name = 'Телевизор'
                               AND brand = 'Samsung'), 'Samsung Model 2', 32345, 'Черный', 145, 50000, 'Да', 'QLED',
        'Big Tech'),
       (uuid_generate_v4(), (SELECT id
                             FROM electronics_registry
                             WHERE electronics_registry.name = 'Телевизор'
                               AND brand = 'LG'), 'LG Model 1', 32345, 'Черный', 110, 40000, 'Да', 'LED',
        'Big Tech'),
       (uuid_generate_v4(), (SELECT id
                             FROM electronics_registry
                             WHERE electronics_registry.name = 'Телевизор'
                               AND brand = 'LG'), 'LG Model 2', 32345, 'Черный', 120, 45000, 'Да', 'FULLHD',
        'Big Tech');

INSERT INTO models (id, type_id, name, serial_number, color, size, price, model_in_stock,
                    memory, cameras_quantity)
VALUES (uuid_generate_v4(), (SELECT id
                             FROM electronics_registry
                             WHERE electronics_registry.name = 'Смартфон'
                               AND brand = 'Apple'), 'Iphone 8', 21345, 'Черный', 10, 150000, 'Да', 128,
        3),
       (uuid_generate_v4(), (SELECT id
                             FROM electronics_registry
                             WHERE electronics_registry.name = 'Смартфон'
                               AND brand = 'Apple'), 'Iphone 10', 31345, 'Белый', 15, 200000, 'Да', 128,
        4),
       (uuid_generate_v4(), (SELECT id
                             FROM electronics_registry
                             WHERE electronics_registry.name = 'Смартфон'
                               AND brand = 'Samsung'), 'Samsung Galaxy S10', 41345, 'Белый', 16, 100000, 'Да', 128,
        4),
       (uuid_generate_v4(), (SELECT id
                             FROM electronics_registry
                             WHERE electronics_registry.name = 'Смартфон'
                               AND brand = 'Samsung'), 'Samsung Galaxy S20', 51345, 'Синий', 25, 100000, 'Да', 164,
        3),
       (uuid_generate_v4(), (SELECT id
                             FROM electronics_registry
                             WHERE electronics_registry.name = 'Смартфон'
                               AND brand = 'Huawei'), 'Huawei Model 1', 61345, 'Белый', 10, 110000, 'Да', 128,
        2),
       (uuid_generate_v4(), (SELECT id
                             FROM electronics_registry
                             WHERE electronics_registry.name = 'Смартфон'
                               AND brand = 'Huawei'), 'Huawei Model 2', 71345, 'Черный', 15, 120000, 'Да', 164,
        3);

INSERT INTO models (id, type_id, name, serial_number, color, size, price, model_in_stock,
                    pc_category, processor)
VALUES (uuid_generate_v4(), (SELECT id
                             FROM electronics_registry
                             WHERE electronics_registry.name = 'Компьютер'
                               AND brand = 'Apple'), 'Mac 1', 22345, 'Белый', 100, 230000, 'Да', 'Ноутбук',
        'Mac proc2'),
       (uuid_generate_v4(), (SELECT id
                             FROM electronics_registry
                             WHERE electronics_registry.name = 'Компьютер'
                               AND brand = 'Apple'), 'Mac 2', 23345, 'Белый', 200, 270000, 'Да', 'Ноутбук',
        'Mac proc3'),
       (uuid_generate_v4(), (SELECT id
                             FROM electronics_registry
                             WHERE electronics_registry.name = 'Компьютер'
                               AND brand = 'MSI'), 'MSI Model 1', 24345, 'Белый', 200, 270000, 'Да', 'Ноутбук',
        'Mac proc3'),
       (uuid_generate_v4(), (SELECT id
                             FROM electronics_registry
                             WHERE electronics_registry.name = 'Компьютер'
                               AND brand = 'MSI'), 'MSI Model 2', 25345, 'Белый', 200, 170000, 'Да', 'Ноутбук',
        'Mac proc3'),
       (uuid_generate_v4(), (SELECT id
                             FROM electronics_registry
                             WHERE electronics_registry.name = 'Компьютер'
                               AND brand = 'Acer'), 'Acer Model 2', 26345, 'Белый', 100, 140000, 'Да', 'Ноутбук',
        'Mac proc3'),
       (uuid_generate_v4(), (SELECT id
                             FROM electronics_registry
                             WHERE electronics_registry.name = 'Компьютер'
                               AND brand = 'Acer'), 'Acer Model 2', 27345, 'Белый', 200, 270000, 'Да', 'Ноутбук',
        'Mac proc3');

INSERT INTO models (id, type_id, name, serial_number, color, size, price, model_in_stock,
                    dust_collector_size, number_of_modes)
VALUES (uuid_generate_v4(), (SELECT id
                             FROM electronics_registry
                             WHERE electronics_registry.name = 'Пылесос'
                               AND brand = 'Redmond'), 'Redmond Model 1', 22225, 'Белый', 100, 20000, 'Да', 15,
        3),
       (uuid_generate_v4(), (SELECT id
                             FROM electronics_registry
                             WHERE electronics_registry.name = 'Пылесос'
                               AND brand = 'Redmond'), 'Redmond Model 2', 22235, 'Белый', 110, 22000, 'Да', 17,
        2),
       (uuid_generate_v4(), (SELECT id
                             FROM electronics_registry
                             WHERE electronics_registry.name = 'Пылесос'
                               AND brand = 'Hyundai'), 'Hyundai Model 1', 22245, 'Белый', 130, 32000, 'Да', 20,
        3),
       (uuid_generate_v4(), (SELECT id
                             FROM electronics_registry
                             WHERE electronics_registry.name = 'Пылесос'
                               AND brand = 'Hyundai'), 'HyundaiModel 2', 22255, 'Белый', 120, 28000, 'Да', 20,
        3),
       (uuid_generate_v4(), (SELECT id
                             FROM electronics_registry
                             WHERE electronics_registry.name = 'Пылесос'
                               AND brand = 'Xiaomi'), 'Xiaomi Model 1', 22265, 'Белый', 140, 42000, 'Да', 17,
        2),
       (uuid_generate_v4(), (SELECT id
                             FROM electronics_registry
                             WHERE electronics_registry.name = 'Пылесос'
                               AND brand = 'Xiaomi'), 'Xiaomi Model 2', 22275, 'Белый', 150, 32000, 'Да', 17,
        2);

INSERT INTO models (id, type_id, name, serial_number, color, size, price, model_in_stock,
                    doors_quantity, compressor)
VALUES (uuid_generate_v4(), (SELECT id
                             FROM electronics_registry
                             WHERE electronics_registry.name = 'Холодильник'
                               AND brand = 'LG'), 'LG Model 1', 22245, 'Белый', 1100, 23000, 'Да', 2,
        'XZ 123'),
       (uuid_generate_v4(), (SELECT id
                             FROM electronics_registry
                             WHERE electronics_registry.name = 'Холодильник'
                               AND brand = 'LG'), 'LG Model 2', 22345, 'Белый', 1000, 20000, 'Да', 2,
        'XZ 223'),
       (uuid_generate_v4(), (SELECT id
                             FROM electronics_registry
                             WHERE electronics_registry.name = 'Холодильник'
                               AND brand = 'Indesit'), 'Indesit Model 1', 22445, 'Белый', 900, 25000, 'Да', 3,
        'X 23'),
       (uuid_generate_v4(), (SELECT id
                             FROM electronics_registry
                             WHERE electronics_registry.name = 'Холодильник'
                               AND brand = 'Indesit'), 'Indesit Model 2', 22545, 'Белый', 910, 35000, 'Да', 3,
        'X 33'),
       (uuid_generate_v4(), (SELECT id
                             FROM electronics_registry
                             WHERE electronics_registry.name = 'Холодильник'
                               AND brand = 'Haier'), 'Haier Model 1', 22645, 'Белый',1900, 55000, 'Да', 3,
        'IE 200'),
       (uuid_generate_v4(), (SELECT id
                             FROM electronics_registry
                             WHERE electronics_registry.name = 'Холодильник'
                               AND brand = 'Haier'), 'Haier Model 2', 22745, 'Белый',1900, 65000, 'Да', 3,
        'IE 200');

