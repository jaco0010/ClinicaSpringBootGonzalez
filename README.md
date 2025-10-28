# Clínica Spring Boot González

Sistema de gestión clínica desarrollado con Spring Boot para administrar médicos, pacientes e historias clínicas.

## 📋 Descripción

Aplicación backend que permite gestionar la información de una clínica médica, incluyendo datos de médicos con sus tarjetas profesionales, pacientes e historias clínicas.

## 🛠️ Tecnologías

- **Java** con Spring Boot
- **Spring Data JPA** para persistencia de datos
- **MySQL** como base de datos
- **Jakarta Persistence (JPA)** para mapeo objeto-relacional

## 📦 Estructura del Proyecto

### Modelos de Entidad

#### Médico
Entidad que representa a los profesionales médicos de la clínica.

**Atributos:**
- `nombreCompleto`: Nombre completo del médico
- `especialidad`: Especialidad médica
- `correo`: Correo electrónico
- `telefono`: Número de teléfono
- `antiguedad`: Años de experiencia
- `clinica`: Clínica donde labora
- `fechaNacimiento`: Fecha de nacimiento
- `direccion`: Dirección de residencia
- `idiomaPrincipal`: Idioma principal que habla

**Relaciones:**
- Relación uno a uno con `TarjetaProfesional`

#### Tarjeta Profesional
Entidad que almacena la información de la tarjeta profesional del médico.

**Atributos:**
- `numeroTarjeta`: Número de la tarjeta profesional
- `nombreTitular`: Nombre del titular
- `fechaExpedicion`: Fecha de expedición
- `fechaVencimiento`: Fecha de vencimiento
- `documentoIdentidad`: Documento de identidad
- `profesion`: Profesión registrada
- `especialidad`: Especialidad certificada
- `entidad`: Entidad emisora
- `estado`: Estado de vigencia (activa/inactiva)

**Relaciones:**
- Relación uno a uno con `Medico`

#### Historia Clínica
Entidad que contiene el historial médico de los pacientes.

**Atributos:**
- `grupoSanguineo`: Tipo de sangre del paciente
- `alergias`: Alergias conocidas
- `enfermedadesPrevias`: Historial de enfermedades
- `medicamentosActuales`: Medicamentos en uso
- `antecedentesFamiliares`: Antecedentes médicos familiares
- `fechaUltimaConsulta`: Fecha de la última consulta
- `estadoActual`: Estado de salud actual
- `motivoConsulta`: Motivo de la última consulta
- `recomendaciones`: Recomendaciones médicas

**Relaciones:**
- Relación uno a uno con `Paciente`

## ⚙️ Configuración

### Base de Datos

El proyecto utiliza MySQL con la siguiente configuración (definida en `application.properties`):

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/clinicagonzalez
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=create
```

### Requisitos Previos

- Java 17 o superior
- MySQL 8.0 o superior
- Maven

### Instalación

1. Clonar el repositorio
2. Crear la base de datos en MySQL:
   ```sql
   CREATE DATABASE clinicagonzalez;
   ```
3. Configurar las credenciales de la base de datos en `application.properties`
4. Ejecutar el proyecto:
   ```bash
   mvn spring-boot:run
   ```

## 🚀 Ejecución

La aplicación se ejecuta por defecto en el puerto 8080. Al iniciar, Hibernate creará automáticamente las tablas en la base de datos según la configuración `ddl-auto=create`.

## 📝 Notas

- El modo `ddl-auto=create` eliminará y recreará las tablas en cada ejecución. Para producción se recomienda cambiar a `update` o `validate`.
- Asegúrate de configurar una contraseña segura para la base de datos en entornos de producción.

## 👤 Autor

González

## 📄 Licencia

Este proyecto es de uso educativo.
