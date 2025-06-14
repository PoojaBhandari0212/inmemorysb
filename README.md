# inmemorysb
Here’s a detailed project description for your `README.md`:
@author @Chetan
---

## Project Description

**inmemorysb** is a simple Spring Boot application that demonstrates basic CRUD (Create, Read, Update, Delete) operations for user management using an in-memory database. The project is designed to help developers understand how to build RESTful APIs with Spring Boot, interact with data repositories, and test endpoints using tools like Postman and JUnit.

### Features

- RESTful API endpoints for user management
- In-memory data storage (no external database required)
- Standard CRUD operations: create, retrieve, update, and delete users
- Simple data model with fields like `id`, `name`, and `email`
- Unit and integration tests using Spring Boot Test and JUnit
- Easy to run and test locally

### Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Maven
- H2 In-Memory Database
- JUnit & Mockito (for testing)

### How It Works

The application exposes the following endpoints under `/users`:

- `GET /users` — Retrieve all users
- `GET /users/{id}` — Retrieve a user by ID
- `POST /users` — Create a new user
- `PUT /users/{id}` — Update an existing user
- `DELETE /users/{id}` — Delete a user

All data is stored in-memory, so no setup for an external database is required. This makes it ideal for learning, prototyping, or testing.

### Getting Started

1. **Clone the repository:**
   ```
   git clone https://github.com/PoojaBhandari0212/inmemorysb.git
   ```
2. **Build the project:**
   ```
   mvn clean install
   ```
3. **Run the application:**
   ```
   mvn spring-boot:run
   ```
4. **Test the endpoints:**  
   Use Postman or any REST client to interact with the API.

### Testing

The project includes unit tests for the controller layer using Spring Boot Test and MockMvc. Run tests with:
```
mvn test
```

---

You can copy and paste this into your `README.md` and adjust as needed for your project specifics.

Here are the API endpoints and example request bodies for testing with Postman:

<hr></hr>
1. Get All Users
Method: GET
URL: http://localhost:8080/users
Request Body: None

<hr></hr>
2. Get User by ID
Method: GET
URL: http://localhost:8080/users/{id}
Replace {id} with the user ID (e.g., 1)
Request Body: None
{
  "name": "John Doe",
  "email": "john.doe@example.com"
}
4. Update User
Method: PUT
URL: http://localhost:8080/users/{id}
Replace {id} with the user ID (e.g., 1)
Request Body (raw, JSON):
<hr></hr>
3. Create User
Method: POST
URL: http://localhost:8080/users
Request Body (raw, JSON):

{
"name": "Jane Doe",
"email": "jane.doe@example.com"
}
<hr></hr>
5. Delete User
Method: DELETE
URL: http://localhost:8080/users/{id}
Replace {id} with the user ID (e.g., 1)
Request Body: None

<hr></hr> Set Content-Type to application/json for POST and PUT requests.
