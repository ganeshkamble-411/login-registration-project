# 🔐 Login & Registration System (React + Spring Boot)

This project is a **Full Stack Login and Registration System** built using **React (Frontend)** and **Spring Boot (Backend)**.

Users can **register with an email and password** and later **login using the same credentials**.
Passwords are securely stored using **BCrypt hashing** in the backend.

---

# 🚀 Features

✅ User Registration
✅ User Login
✅ Password Encryption using BCrypt
✅ REST API using Spring Boot
✅ React Frontend with Axios API Calls
✅ CORS Configuration for Frontend-Backend Communication

---

# 🛠️ Technologies Used

## Frontend

* React
* Axios
* JavaScript
* HTML / CSS

## Backend

* Java
* Spring Boot
* Spring Security
* Spring Data JPA
* Hibernate
* MySQL (or any relational database)

---

# 📂 Project Structure

```
login-registration-project
│
├── backend
│   ├── src/main/java/com/login/demo
│   │
│   ├── config
│   │   └── SecurityConfig.java
│   │
│   ├── controller
│   │   └── AuthController.java
│   │
│   ├── DTO
│   │   ├── LoginRequest.java
│   │   └── RegisterRequest.java
│   │
│   ├── entity
│   │   └── User.java
│   │
│   ├── repository
│   │   └── UserRepository.java
│   │
│   ├── service
│   │   │── AuthService.java
│   │
│   └── LoginandRegistrationApplication.java
│
└── frontend
    ├── src
    │   ├── pages
    │   │   ├── Login.jsx
    │   │   └── Registration.jsx
    │   │
    │   ├── App.jsx
    │   └── main.jsx
    │
    ├── package.json
    └── vite.config.js
```

---

# ⚙️ API Endpoints

## 1️⃣ Register User

**POST**

```
/auth/register
```

### Request Body

```json
{
  "email": "user@example.com",
  "password": "123456"
}
```

### Response

```
User Registered Successfully!
```

---

## 2️⃣ Login User

**POST**

```
/auth/login
```

### Request Body

```json
{
  "email": "user@example.com",
  "password": "123456"
}
```

### Response

```
Login Successful!
```

If password is wrong:

```
Invalid Password!
```

---

# ▶️ How to Run the Project

## 1️⃣ Clone the Repository

```
git clone https://github.com/ganeshkamble-411/login-registration-project.git
```

---

## 2️⃣ Run Backend (Spring Boot)

Open backend folder in IDE (STS / IntelliJ / Eclipse)

Run:

```
LoginandRegistrationApplication.java
```

Server will start at:

```
http://localhost:8080
```

---

## 3️⃣ Run Frontend (React)

Go to frontend folder:

```
cd frontend
```

Install dependencies:

```
npm install
```

Run project:

```
npm run dev
```

Frontend will start at:

```
http://localhost:5173
```

---

# 🔐 Security

This project uses:

* **BCryptPasswordEncoder** for password hashing
* **Spring Security Filter Chain**
* **CORS Configuration** for React frontend connection

---

# 📌 Future Improvements

* JWT Authentication
* Role Based Authorization
* Email Verification
* Password Reset Feature
* UI Improvements
