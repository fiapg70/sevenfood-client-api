--INSERT INTO public.tb_restaurant(
--	id, name, cnpj, create_by, created_date, last_modified_by, last_modified_date, status)
--	VALUES (1, 'Seven Food', '02.365.347/0001-63', 'root@localhost.com','2023-05-14 18:38:20','root@localhost.com','2023-05-14 18:38:20','ATIVO');

--INSERT INTO public.tb_product_category(
--	id, name, create_by, created_date, last_modified_by, last_modified_date, status)
--	VALUES (1, 'Lanche', 'root@localhost.com','2023-05-14 18:38:20','root@localhost.com','2023-05-14 18:38:20','ATIVO');

--INSERT INTO public.tb_product_category(
--	id, name, create_by, created_date, last_modified_by, last_modified_date, status)
--	VALUES (2, 'Acopanhamento', 'root@localhost.com','2023-05-14 18:38:20','root@localhost.com','2023-05-14 18:38:20','ATIVO');

--INSERT INTO public.tb_product_category(
--	id, name, create_by, created_date, last_modified_by, last_modified_date, status)
--	VALUES (3, 'Bebida', 'root@localhost.com','2023-05-14 18:38:20','root@localhost.com','2023-05-14 18:38:20','ATIVO');

--INSERT INTO public.tb_product_category(
--    	id, name, create_by, created_date, last_modified_by, last_modified_date, status)
--    	VALUES (4, 'Sobremesa', 'root@localhost.com','2023-05-14 18:38:20','root@localhost.com','2023-05-14 18:38:20','ATIVO');

--INSERT INTO public.tb_product(
--	id, name, description, pic, price, product_category_id, restaurant_id, create_by, created_date, last_modified_by, last_modified_date, status)
--	VALUES (1, 'Frango', 'Xacon, salada, tomate', 'xxxx', 29.99, 1, 1, 'root@localhost.com','2023-05-14 18:38:20','root@localhost.com','2023-05-14 18:38:20','ATIVO');

--INSERT INTO public.tb_product(
--	id, name, description, pic, price, product_category_id, restaurant_id, create_by, created_date, last_modified_by, last_modified_date, status)
--	VALUES (2, 'Cebola empanada', 'Cebola empanada', 'xxxx', 1.99, 2, 1, 'root@localhost.com','2023-05-14 18:38:20','root@localhost.com','2023-05-14 18:38:20','ATIVO');

--INSERT INTO public.tb_product(
--	id, name, description, pic, price, product_category_id, restaurant_id, create_by, created_date, last_modified_by, last_modified_date, status)
--	VALUES (3, 'Coca-cola', 'Coca-cola 1L', 'xxxx', 9.99, 3, 1, 'root@localhost.com','2023-05-14 18:38:20','root@localhost.com','2023-05-14 18:38:20','ATIVO');

--INSERT INTO public.tb_product(
--	id, name, description, pic, price, product_category_id, restaurant_id, create_by, created_date, last_modified_by, last_modified_date, status)
--	VALUES (4, 'Tortinhas de chocolate', 'Tortinhas de chocolcate e caramelo', 'xxxx', 3.99, 4, 1, 'root@localhost.com','2023-05-14 18:38:20','root@localhost.com','2023-05-14 18:38:20','ATIVO');

--INSERT INTO public.tb_product(
--	id, name, description, pic, price, product_category_id, restaurant_id, create_by, created_date, last_modified_by, last_modified_date, status)
--	VALUES (5, 'X TUDO', '2 CARNES 180G, salada, tomate', 'xxxx', 45.99, 1, 1, 'root@localhost.com','2023-05-14 18:38:20','root@localhost.com','2023-05-14 18:38:20','ATIVO');

--SELECT setval('public.tb_product_category_id_seq', (SELECT MAX(id) FROM public.tb_product_category), true);
--SELECT setval('public.tb_product_id_seq', (SELECT MAX(id) FROM public.tb_product), true);
--SELECT setval('public.tb_restaurant_id_seq', (SELECT MAX(id) FROM public.tb_restaurant), true);
