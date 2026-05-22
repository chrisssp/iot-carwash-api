<h1 align="center">IoT Car Wash API — REST API for Car Wash Sensor Data</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Spring_Boot-3.1-6DB33F?logo=springboot&logoColor=white" alt="Spring Boot">
  <img src="https://img.shields.io/badge/Java-17-ED8B00?logo=openjdk&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/MongoDB-47A248?logo=mongodb&logoColor=white" alt="MongoDB">
  <img src="https://img.shields.io/badge/License-GPL_v3-0298c3?logo=gnu&logoColor=white" alt="GPL v3">
  <img src="https://img.shields.io/badge/Status-Active-2ea44f" alt="Active">
</p>

<p align="center">
  <em>Backend service for storing and serving ultrasonic sensor data from an automatic car wash system.</em>
</p>

<p align="center">
  <a href="README.md">🇬🇧 English</a> · <a href="README.es.md">🇪🇸 Español</a>
</p>

---

## About IoT Car Wash API

REST API backend that processes real-time sensor data from an Arduino-compatible microcontroller in an automatic car wash system. It receives distance measurements from three ultrasonic sensors and stores component states in MongoDB.

### Ecosystem

| Component | Repository | Stack |
|-----------|-----------|-------|
| Backend API | [chrisssp/iot-carwash-api](https://github.com/chrisssp/iot-carwash-api) | Spring Boot 3, Java 17, MongoDB |
| Frontend | [chrisssp/iot-carwash](https://github.com/chrisssp/iot-carwash) | Angular 17, TypeScript |

## Features

- Ultrasonic sensor data ingestion from microcontroller
- Component state management and persistence
- Historical sensor value queries with timestamps
- CORS-enabled for cross-origin frontend access
- Global exception handling with structured error responses

## Quick Start

### Prerequisites

- Java 17+
- MongoDB running on `localhost:27017`
- Maven (or use the provided `mvnw` wrapper)

### Setup

```bash
git clone https://github.com/chrisssp/iot-carwash-api.git
cd iot-carwash-api
./mvnw spring-boot:run
```

The API runs on `http://localhost:8080`.

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/componentes` | Get all component states |
| GET | `/api/componentes/update-data/{data}` | Ingest ultrasonic sensor data |
| GET | `/api/componentes/{elemento}/{estado}` | Update a component state |
| GET | `/api/valores` | Get all sensor readings |
| GET | `/api/valores/{elemento}` | Get readings by sensor |
| POST | `/api/valores` | Add a new sensor reading |

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for branch naming, commit conventions, and PR workflow.

## License

This project is licensed under the GPL v3 — see the [LICENSE](LICENSE) file for details.

---

<p align="center">
  <sub>Built with ❤️ · 2026</sub>
</p>
