 

   ALTER TABLE APP.CarritoitemEntity ADD FOREIGN KEY (carritoId) REFERENCES  APP.CarritoEntity(id) ON DELETE CASCADE ON UPDATE RESTRICT;
   ALTER TABLE APP.CarritoitemEntity ADD FOREIGN KEY (itemId) REFERENCES  APP.ItemEntity(id) ON DELETE CASCADE ON UPDATE RESTRICT;
		