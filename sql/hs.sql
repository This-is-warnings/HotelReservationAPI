PGDMP         !            
    y            HotelReservation    13.4    13.4 :    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16436    HotelReservation    DATABASE     s   CREATE DATABASE "HotelReservation" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Belarusian_Belarus.1251';
 "   DROP DATABASE "HotelReservation";
                postgres    false            �            1259    16523    cards    TABLE     �   CREATE TABLE public.cards (
    id integer NOT NULL,
    number character varying(20) NOT NULL,
    balance real DEFAULT 300,
    user_id integer NOT NULL
);
    DROP TABLE public.cards;
       public         heap    postgres    false            �            1259    16521    cards_id_seq    SEQUENCE     �   CREATE SEQUENCE public.cards_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.cards_id_seq;
       public          postgres    false    212            �           0    0    cards_id_seq    SEQUENCE OWNED BY     =   ALTER SEQUENCE public.cards_id_seq OWNED BY public.cards.id;
          public          postgres    false    211            �            1259    16486    requests    TABLE       CREATE TABLE public.requests (
    id integer NOT NULL,
    user_id integer NOT NULL,
    number_of_rooms smallint NOT NULL,
    class character varying(5) NOT NULL,
    start_date date NOT NULL,
    end_date date NOT NULL,
    status character varying(16)
);
    DROP TABLE public.requests;
       public         heap    postgres    false            �            1259    16484    requests_id_seq    SEQUENCE     �   CREATE SEQUENCE public.requests_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.requests_id_seq;
       public          postgres    false    206            �           0    0    requests_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.requests_id_seq OWNED BY public.requests.id;
          public          postgres    false    205            �            1259    16509    reserved_rooms    TABLE     �   CREATE TABLE public.reserved_rooms (
    id integer NOT NULL,
    user_id integer NOT NULL,
    room_id integer NOT NULL,
    price real NOT NULL,
    status character varying(16) NOT NULL,
    start_date date NOT NULL,
    end_date date NOT NULL
);
 "   DROP TABLE public.reserved_rooms;
       public         heap    postgres    false            �            1259    16507    reserved_rooms_id_seq    SEQUENCE     �   CREATE SEQUENCE public.reserved_rooms_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ,   DROP SEQUENCE public.reserved_rooms_id_seq;
       public          postgres    false    210            �           0    0    reserved_rooms_id_seq    SEQUENCE OWNED BY     O   ALTER SEQUENCE public.reserved_rooms_id_seq OWNED BY public.reserved_rooms.id;
          public          postgres    false    209            �            1259    16439    roles    TABLE     `   CREATE TABLE public.roles (
    id integer NOT NULL,
    name character varying(50) NOT NULL
);
    DROP TABLE public.roles;
       public         heap    postgres    false            �            1259    16437    roles_id_seq    SEQUENCE     �   CREATE SEQUENCE public.roles_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.roles_id_seq;
       public          postgres    false    201            �           0    0    roles_id_seq    SEQUENCE OWNED BY     =   ALTER SEQUENCE public.roles_id_seq OWNED BY public.roles.id;
          public          postgres    false    200            �            1259    16499    rooms    TABLE     �   CREATE TABLE public.rooms (
    id integer NOT NULL,
    number integer NOT NULL,
    number_of_rooms smallint NOT NULL,
    class character varying(5) NOT NULL,
    price_per_day real NOT NULL
);
    DROP TABLE public.rooms;
       public         heap    postgres    false            �            1259    16497    rooms_id_seq    SEQUENCE     �   CREATE SEQUENCE public.rooms_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.rooms_id_seq;
       public          postgres    false    208            �           0    0    rooms_id_seq    SEQUENCE OWNED BY     =   ALTER SEQUENCE public.rooms_id_seq OWNED BY public.rooms.id;
          public          postgres    false    207            �            1259    16448    users    TABLE     0  CREATE TABLE public.users (
    id integer NOT NULL,
    login character varying(50) NOT NULL,
    name character varying(50) NOT NULL,
    surname character varying(50) NOT NULL,
    middlename character varying(50),
    email character varying(255) NOT NULL,
    password character varying NOT NULL
);
    DROP TABLE public.users;
       public         heap    postgres    false            �            1259    16446    users_id_seq    SEQUENCE     �   CREATE SEQUENCE public.users_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.users_id_seq;
       public          postgres    false    203            �           0    0    users_id_seq    SEQUENCE OWNED BY     =   ALTER SEQUENCE public.users_id_seq OWNED BY public.users.id;
          public          postgres    false    202            �            1259    16456    users_roles    TABLE     `   CREATE TABLE public.users_roles (
    user_id integer NOT NULL,
    role_id integer NOT NULL
);
    DROP TABLE public.users_roles;
       public         heap    postgres    false            J           2604    16526    cards id    DEFAULT     d   ALTER TABLE ONLY public.cards ALTER COLUMN id SET DEFAULT nextval('public.cards_id_seq'::regclass);
 7   ALTER TABLE public.cards ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    211    212    212            G           2604    16489    requests id    DEFAULT     j   ALTER TABLE ONLY public.requests ALTER COLUMN id SET DEFAULT nextval('public.requests_id_seq'::regclass);
 :   ALTER TABLE public.requests ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    206    205    206            I           2604    16512    reserved_rooms id    DEFAULT     v   ALTER TABLE ONLY public.reserved_rooms ALTER COLUMN id SET DEFAULT nextval('public.reserved_rooms_id_seq'::regclass);
 @   ALTER TABLE public.reserved_rooms ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    209    210    210            E           2604    16442    roles id    DEFAULT     d   ALTER TABLE ONLY public.roles ALTER COLUMN id SET DEFAULT nextval('public.roles_id_seq'::regclass);
 7   ALTER TABLE public.roles ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    201    200    201            H           2604    16502    rooms id    DEFAULT     d   ALTER TABLE ONLY public.rooms ALTER COLUMN id SET DEFAULT nextval('public.rooms_id_seq'::regclass);
 7   ALTER TABLE public.rooms ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    207    208    208            F           2604    16451    users id    DEFAULT     d   ALTER TABLE ONLY public.users ALTER COLUMN id SET DEFAULT nextval('public.users_id_seq'::regclass);
 7   ALTER TABLE public.users ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    202    203    203            �          0    16523    cards 
   TABLE DATA           =   COPY public.cards (id, number, balance, user_id) FROM stdin;
    public          postgres    false    212   �?       �          0    16486    requests 
   TABLE DATA           e   COPY public.requests (id, user_id, number_of_rooms, class, start_date, end_date, status) FROM stdin;
    public          postgres    false    206   @       �          0    16509    reserved_rooms 
   TABLE DATA           c   COPY public.reserved_rooms (id, user_id, room_id, price, status, start_date, end_date) FROM stdin;
    public          postgres    false    210   t@       �          0    16439    roles 
   TABLE DATA           )   COPY public.roles (id, name) FROM stdin;
    public          postgres    false    201   �@       �          0    16499    rooms 
   TABLE DATA           R   COPY public.rooms (id, number, number_of_rooms, class, price_per_day) FROM stdin;
    public          postgres    false    208   A       �          0    16448    users 
   TABLE DATA           V   COPY public.users (id, login, name, surname, middlename, email, password) FROM stdin;
    public          postgres    false    203   TA       �          0    16456    users_roles 
   TABLE DATA           7   COPY public.users_roles (user_id, role_id) FROM stdin;
    public          postgres    false    204   =B       �           0    0    cards_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.cards_id_seq', 12, true);
          public          postgres    false    211            �           0    0    requests_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.requests_id_seq', 13, true);
          public          postgres    false    205                        0    0    reserved_rooms_id_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.reserved_rooms_id_seq', 6, true);
          public          postgres    false    209                       0    0    roles_id_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('public.roles_id_seq', 3, true);
          public          postgres    false    200                       0    0    rooms_id_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('public.rooms_id_seq', 7, true);
          public          postgres    false    207                       0    0    users_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.users_id_seq', 24, true);
          public          postgres    false    202            ^           2606    16529    cards cards_pk 
   CONSTRAINT     L   ALTER TABLE ONLY public.cards
    ADD CONSTRAINT cards_pk PRIMARY KEY (id);
 8   ALTER TABLE ONLY public.cards DROP CONSTRAINT cards_pk;
       public            postgres    false    212            V           2606    16491    requests requests_pk 
   CONSTRAINT     R   ALTER TABLE ONLY public.requests
    ADD CONSTRAINT requests_pk PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.requests DROP CONSTRAINT requests_pk;
       public            postgres    false    206            [           2606    16515     reserved_rooms reserved_rooms_pk 
   CONSTRAINT     ^   ALTER TABLE ONLY public.reserved_rooms
    ADD CONSTRAINT reserved_rooms_pk PRIMARY KEY (id);
 J   ALTER TABLE ONLY public.reserved_rooms DROP CONSTRAINT reserved_rooms_pk;
       public            postgres    false    210            N           2606    16444    roles roles_pk 
   CONSTRAINT     L   ALTER TABLE ONLY public.roles
    ADD CONSTRAINT roles_pk PRIMARY KEY (id);
 8   ALTER TABLE ONLY public.roles DROP CONSTRAINT roles_pk;
       public            postgres    false    201            Y           2606    16505    rooms rooms_pk 
   CONSTRAINT     L   ALTER TABLE ONLY public.rooms
    ADD CONSTRAINT rooms_pk PRIMARY KEY (id);
 8   ALTER TABLE ONLY public.rooms DROP CONSTRAINT rooms_pk;
       public            postgres    false    208            R           2606    16453    users users_pk 
   CONSTRAINT     L   ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pk PRIMARY KEY (id);
 8   ALTER TABLE ONLY public.users DROP CONSTRAINT users_pk;
       public            postgres    false    203            T           2606    16460    users_roles users_roles_pk 
   CONSTRAINT     f   ALTER TABLE ONLY public.users_roles
    ADD CONSTRAINT users_roles_pk PRIMARY KEY (user_id, role_id);
 D   ALTER TABLE ONLY public.users_roles DROP CONSTRAINT users_roles_pk;
       public            postgres    false    204    204            \           1259    16516 %   reserved_rooms_user_id_room_id_uindex    INDEX     s   CREATE UNIQUE INDEX reserved_rooms_user_id_room_id_uindex ON public.reserved_rooms USING btree (user_id, room_id);
 9   DROP INDEX public.reserved_rooms_user_id_room_id_uindex;
       public            postgres    false    210    210            L           1259    16445    roles_name_uindex    INDEX     J   CREATE UNIQUE INDEX roles_name_uindex ON public.roles USING btree (name);
 %   DROP INDEX public.roles_name_uindex;
       public            postgres    false    201            W           1259    16506    rooms_number_uindex    INDEX     N   CREATE UNIQUE INDEX rooms_number_uindex ON public.rooms USING btree (number);
 '   DROP INDEX public.rooms_number_uindex;
       public            postgres    false    208            O           1259    16454    users_email_uindex    INDEX     L   CREATE UNIQUE INDEX users_email_uindex ON public.users USING btree (email);
 &   DROP INDEX public.users_email_uindex;
       public            postgres    false    203            P           1259    16455    users_login_uindex    INDEX     L   CREATE UNIQUE INDEX users_login_uindex ON public.users USING btree (login);
 &   DROP INDEX public.users_login_uindex;
       public            postgres    false    203            b           2606    16530    cards cards_users_id_fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.cards
    ADD CONSTRAINT cards_users_id_fk FOREIGN KEY (user_id) REFERENCES public.users(id) ON DELETE CASCADE;
 A   ALTER TABLE ONLY public.cards DROP CONSTRAINT cards_users_id_fk;
       public          postgres    false    2898    203    212            a           2606    16492    requests requests_users_id_fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.requests
    ADD CONSTRAINT requests_users_id_fk FOREIGN KEY (user_id) REFERENCES public.users(id) ON DELETE CASCADE;
 G   ALTER TABLE ONLY public.requests DROP CONSTRAINT requests_users_id_fk;
       public          postgres    false    206    2898    203            `           2606    16466 #   users_roles users_roles_roles_id_fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.users_roles
    ADD CONSTRAINT users_roles_roles_id_fk FOREIGN KEY (role_id) REFERENCES public.roles(id) ON DELETE CASCADE;
 M   ALTER TABLE ONLY public.users_roles DROP CONSTRAINT users_roles_roles_id_fk;
       public          postgres    false    204    2894    201            _           2606    16461 #   users_roles users_roles_users_id_fk    FK CONSTRAINT     �   ALTER TABLE ONLY public.users_roles
    ADD CONSTRAINT users_roles_users_id_fk FOREIGN KEY (user_id) REFERENCES public.users(id) ON DELETE CASCADE;
 M   ALTER TABLE ONLY public.users_roles DROP CONSTRAINT users_roles_users_id_fk;
       public          postgres    false    203    2898    204            �   d   x�e��	�0D�u
'(95m���s�L)$��#�y*��&hM�!A�jd�)I�j�]��d�?w�E�O��y*�趱�q=��^����#H��|�_�s���&�      �   a   x�3�4�4�t�4202�54�52E0-8K�3R��SS��9��*a�u,�LCs��ļ�Ԝ�:3�:�ҊT��v���@�F��pY##���=... ��$k      �   C   x�3�4BC�Ҽ���N##C]C]#8�؀ː���P�"��2�4AEf�%W� K      �   .   x�3���q�wt����2�p�}<]�B��!<_G?Gw� �=... �N      �   ?   x����0�޾aP.�@��k���eY��#HVS�}R��P�n��EUuY�G7����S�!�\�	�      �   �   x����N�0������b[0��0B�F�@b�9�ut��vk���B��ڋs�/�9�G'��0�2m'?�4yJ7^�K��Aձu�U�$� Z����}v���BDh�n^����eC�T�&$!��lS�d�W����E�H�����\�kxS���V�t�8K�4��'��-��i>(�.��9	'�?bv?q����A�s&��U�a�4(�'A7��>�� ASwW      �      x�3�4�2�4�2�4�222b���� ��     