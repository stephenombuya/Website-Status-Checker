# Website Status Checker 🌐✅

A simple Spring Boot microservice that allows you to check the online status of any website quickly and easily.

## 🚀 Features

- Check website availability with a single API endpoint
- Lightweight and fast response
- Provides detailed status information
- Easy to integrate into any project

## 📋 Prerequisites

- Java 17 or higher
- Maven 3.6+

## 🔧 Installation

### Cloning the Repository

```bash
git clone https://github.com/stephenombuya/Website-Status-Checker/tree/main
cd website-status-checker
```

### Building the Project

```bash
mvn clean package
```

### Running the Application

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## 🌍 API Endpoint

### Check Website Status

**Endpoint:** `/check-status`

**Method:** GET

**Query Parameter:**
- `websiteUrl` (required): The full URL of the website to check

#### Example Request
```
GET /check-status?websiteUrl=https://google.com
```

#### Successful Response
```json
{
  "url": "https://google.com",
  "online": true,
  "responseCode": 200
}
```

#### Offline/Unreachable Site Response
```json
{
  "url": "https://unexistingwebsite.com",
  "online": false,
  "responseCode": 0
}
```

## 🛠 Technologies Used

- Spring Boot 3.1.5
- Java 17
- Maven

## 📦 Dependencies

- Spring Boot Web Starter
- Java Standard Libraries

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

Distributed under the MIT License. See `LICENSE` for more information.

## 📞 Contact

Stephen - michiekaombuya@gmail.com

Project Link: [Project](https://github.com/stephenombuya/Website-Status-Checker/tree/main)
