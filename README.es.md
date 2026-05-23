<h1 align="center">IoT Car Wash API — API REST para Datos de Sensores de Autolavado</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Spring_Boot-3.1-6DB33F?logo=springboot&logoColor=white" alt="Spring Boot">
  <img src="https://img.shields.io/badge/Java-17-ED8B00?logo=openjdk&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/MongoDB-47A248?logo=mongodb&logoColor=white" alt="MongoDB">
  <img src="https://img.shields.io/badge/Licencia-GPL_v3-0298c3?logo=gnu&logoColor=white" alt="GPL v3">
  <img src="https://img.shields.io/badge/Estado-Active-2ea44f" alt="Active">
</p>

<p align="center">
  <em>Servicio backend para almacenar y servir datos de sensores ultrasónicos de un sistema de autolavado automático.</em>
</p>

<p align="center">
  <a href="README.md">🇬🇧 English</a> · <a href="README.es.md">🇪🇸 Español</a>
</p>

---

## Acerca de IoT Car Wash API

API REST que procesa datos de sensores en tiempo real desde un microcontrolador compatible con Arduino en un sistema de autolavado automático. Recibe mediciones de distancia de tres sensores ultrasónicos y almacena los estados de los componentes en MongoDB.

### Ecosistema

| Componente | Repositorio | Stack |
|-----------|-----------|-------|
| API Backend | [chrisssp/iot-carwash-api](https://github.com/chrisssp/iot-carwash-api) | Spring Boot 3, Java 17, MongoDB |
| Frontend | [chrisssp/iot-carwash](https://github.com/chrisssp/iot-carwash) | Angular 17, TypeScript |

## Funcionalidades

- Ingesta de datos de sensores ultrasónicos desde el microcontrolador
- Gestión y persistencia de estados de componentes
- Consulta de valores históricos con marcas de tiempo
- CORS habilitado para acceso desde el frontend
- Manejo global de excepciones con respuestas estructuradas

## Inicio rápido

### Requisitos previos

- Java 17+
- MongoDB corriendo en `localhost:27017`
- Maven (o usar el wrapper `mvnw`)

### Instalación

```bash
git clone https://github.com/chrisssp/iot-carwash-api.git
cd iot-carwash-api
./mvnw spring-boot:run
```

La API corre en `http://localhost:8080`.

## Endpoints de la API

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| GET | `/api/componentes` | Obtener todos los estados |
| GET | `/api/componentes/update-data/{data}` | Recibir datos de sensores |
| GET | `/api/componentes/{elemento}/{estado}` | Actualizar estado de un componente |
| GET | `/api/valores` | Obtener todas las lecturas |
| GET | `/api/valores/{elemento}` | Obtener lecturas por sensor |
| POST | `/api/valores` | Agregar una nueva lectura |

## Contribuciones

Lee [CONTRIBUTING.md](CONTRIBUTING.md) para conocer las convenciones de ramas, commits y PRs.

## Licencia

Este proyecto está bajo la licencia GPL v3 — ver [LICENSE](LICENSE) para más detalles.