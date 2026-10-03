# Spring Boot Product API

სასწავლო Spring Boot REST API პროექტი.

პროგრამა მუშაობს Product-ებთან და იყენებს:

* Controller
* Service
* Repository
* DTO
* Entity
* Constructor Injection
* REST API
* JSON

გამოვიყენე HTTP მეთოდები:

* GET
* POST
* PUT
* DELETE

DTO:

* ProductRequest — Client-ის მიერ გამოგზავნილი მონაცემები
* ProductResponse — Client-ისთვის დაბრუნებული მონაცემები
* RegisterRequest — Client-ის მიერ გამოგზავნილი მონაცემები
* UserResponse — Client-ისთვის დაბრუნებული მონაცემები

ძირითადი ჯაჭვი:

Client
↓
Controller
↓
Service
↓
Repository
↓
Entity

მთავარი Endpoints:

GET /products
GET /products/{id}
POST /products
PUT /products/{id}
DELETE /products/{id}

