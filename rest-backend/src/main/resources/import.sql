INSERT INTO public.autor (nombre, apellido, edad,nacionalidad)VALUES('Alejandro','Quea', 22, 'Boliviano');

INSERT INTO public.libro (descripcion, nro_paginas, titulo,autor_id)VALUES('Descripcion 1', 222, 'Libro 1',1);

--Hospitakl

INSERT INTO public.hospital (codigo, descripcion, direccion)VALUES('COSSMIL','Corporación del Seguro Social Militar (COSSMIL)','Av. Saavedra #1809');
INSERT INTO public.hospital (codigo, descripcion, direccion)VALUES('CLINICAS','Hospital de Clínicas','Av. Saavedra, Nº 2245, Zona Miraflores');
INSERT INTO public.hospital (codigo, descripcion, direccion)VALUES('ARCO-IRIS','Hospital Arco Iris','Calle General Monje, a dos cuadras de la Plaza Villarroel');

--servicios
INSERT INTO public.servicio (codigo, descripcion)VALUES('Emergencias','Emergencia 24 horas');
INSERT INTO public.servicio (codigo, descripcion)VALUES('Endoscopia','Endoscopia y Endoscopia pediátrica');
INSERT INTO public.servicio (codigo, descripcion)VALUES('Cuidados','Cuidados Intensivos Neonatales');


INSERT INTO public.hospital_servicio (servicio_id, hospital_id)VALUES(1,1);
INSERT INTO public.hospital_servicio (servicio_id, hospital_id)VALUES(1,1);
INSERT INTO public.hospital_servicio (servicio_id, hospital_id)VALUES(3,1);


INSERT INTO public.sala (codigo, descripcion, ubicacion,hospital_id,servicio_id)VALUES('SALA A','Sala A-1','Piso 1', 1, 1);
INSERT INTO public.sala (codigo, descripcion, ubicacion,hospital_id,servicio_id)VALUES('SALA B','Sala B-1','Piso 1', 1, 2);
INSERT INTO public.sala (codigo, descripcion, ubicacion,hospital_id,servicio_id)VALUES('SALA C','Sala C-1','Piso 1', 1, 3);
-- INSERT INTO public.sala (servicio_id, hospital_id)VALUES(2,1);