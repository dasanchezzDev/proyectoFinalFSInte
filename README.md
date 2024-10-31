# ProyectoFinalFSInte

## Descripción General
Este proyecto es una aplicación web fullstack para la gestión de clientes, productos y ventas. Utiliza una base de datos relacional (MySQL) para almacenar información de ventas, clientes y productos, y una base de datos NoSQL (MongoDB) para gestionar comentarios de clientes y productos relacionados.

## Características Principales
- Mantenimiento de Clientes (CRUD)
- Mantenimiento de Productos (CRUD)
- Gestión de Ventas con actualización automática de inventario
- Sistema de Comentarios para productos
- Recomendación de Productos Relacionados
- Generación de Reportes de Ventas con filtros

## Tecnologías Utilizadas
- Frontend: React, Material-UI
- Backend: Spring Boot
- Bases de Datos: MySQL, MongoDB
- Otras herramientas: Maven, npm

## Requisitos Previos
- Java JDK 11 o superior
- Node.js y npm
- MySQL
- MongoDB
- Maven

## Instalación y Configuración

### Backend (Spring Boot)
1. Clona el repositorio: `git clone https://github.com/dasanchezzDev/proyectoFinalFSInte.git`
2. Navega al directorio del backend: `cd proyectoFinalFSInte/backend`
3. Configura la conexión a la base de datos en `src/main/resources/application.properties`
4. Ejecuta: `mvn spring-boot:run`

### Frontend (React)
1. Navega al directorio del frontend: `cd proyectoFinalFSInte/frontend`
2. Instala las dependencias: `npm install`
3. Inicia la aplicación: `npm start`

## Uso
Accede a la aplicación en tu navegador: `http://localhost:3000`

## Estructura del Proyecto
- `/backend`: Código fuente del backend (Spring Boot)
- `/frontend`: Código fuente del frontend (React)
- `/docs`: Documentación adicional, incluyendo el modelo entidad-relación y diagramas

## API Endpoints
- `/api/clientes`: CRUD de clientes
- `/api/productos`: CRUD de productos
- `/api/ventas`: Gestión de ventas
- `/api/comentarios`: Gestión de comentarios
- `/api/productos-relacionados`: Obtención de productos relacionados

## Pruebas
Se han implementado pruebas unitarias y de integración. Para ejecutar las pruebas:
- Backend: `mvn test`
- Frontend: `npm test`

## Contribución
Las contribuciones son bienvenidas. Por favor, abre un issue para discutir cambios mayores antes de crear un pull request.

## Licencia
[MIT](https://choosealicense.com/licenses/mit/)

## Contacto
David Sánchez - [dasanchezzdev@gmail.com](mailto:dasanchezzdev@gmail.com)

Enlace del Proyecto: [https://github.com/dasanchezzDev/proyectoFinalFSInte](https://github.com/dasanchezzDev/proyectoFinalFSInte)