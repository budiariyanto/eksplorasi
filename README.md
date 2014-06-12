eksplorasi
==========

Eksplorasi saya waktu ngoding, mostly pakai java, springframework. Yang mau pakai repo ini silahkan langsung fork aja. Saya menggunakan maven 3 untuk membuat project2 eksplorasi ini. Kalau ada yang belum tau maven, coba buka websitenya [maven](http://maven.apache.org)

## Project coba2 ini menggunakan:
* Jetty
* Spring Core (Dependency Injection)
* Spring MVC
* Spring AOP
* Hibernate
* Hikari CP (Connection Pooling)
* Maven
* Postgresql
* Angular JS
* Twitter Bootstrap
* JUnit
* Mockito
* Slf4J-logback

## Database
Database menggunakan **postgresql**. Datanya pakai database sample pagila versi 0.10.1. Filenya include di repo ini. Atau mau download dari sumbernya langsung di [sini](http://pgfoundry.org/frs/download.php/1719/pagila-0.10.1.zip) juga boleh. Siapa tau ada revisi database.

## Konfigurasi database di linux
1. Buka terminal
1. Masuk ke user postgres
1. Masuk ke postgresql client pakai perintah: psql
1. Buat database bernama pagila. Perintahnya: CREATE DATABASE pagila
1. Exit dari postgresql client pakai keyboard shortcut Ctrl-D
1. Masuk ke direktori di mana file database pagila berada, lalu ekstrak
1. Jalankan perintah: psql pagila < pagila-schema.sql
1. Jalankan perintah: psql pagila < pagila-insert.sql
1. Data sudah siap

Jangan lupa sesuaikan password databasenya di file konfigurasi springnya, yang terletak di eksplorasi-config/src/main/resources/org/eksplorasi/spring/config/applicationContext.xml, pada bagian datasource pada konfigurasi hikari CP.

## Cara compile
Jalankan perintah: mvn clean package

## Cara deploy
Sementara masih pakai cara manual. Tinggal jalankan script deploy.sh, tapi sebelum dijalankan, edit dulu isinya. Destinationnya disesuaikan dengan path webserver Anda.
