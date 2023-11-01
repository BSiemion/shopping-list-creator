-- Change name of columns in 'user'
ALTER TABLE public.user
RENAME COLUMN activitylevel TO activity_level;

ALTER TABLE public.user
RENAME COLUMN lastname TO last_name;