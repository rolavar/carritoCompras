INSERT INTO carrito.producto
(nombre, descripcion, valor, stock, idcategoria)
VALUES('test', 'test', 10, 2, 1);

INSERT INTO carrito.categoria
(nombre)
VALUES('categoria test');

select * from carrito.producto