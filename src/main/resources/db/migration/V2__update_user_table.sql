-- add columns to 'user'
ALTER TABLE public.user
ADD COLUMN email VARCHAR(255) UNIQUE,
ADD COLUMN password VARCHAR(255),
ADD COLUMN creation_date TIMESTAMP;