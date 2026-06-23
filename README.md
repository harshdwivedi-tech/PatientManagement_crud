# Patient Management System

A Spring Boot-based Patient Management System that provides CRUD (Create, Read, Update, Delete) operations for managing patient records in a hospital or clinic.

## Features

- Add new patient records
- View all patients
- View patient details by ID
- Update patient information
- Delete patient records
- Manage billing status (Paid/Pending)
- Store admission and discharge details
- Track diagnosis and doctor information

---

## Technologies Used

- Java 17+
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL Database
- Maven
- REST API

---

## Project Structure

```
src
 ├── controller
 ├── service
 ├── repository
 ├── model
```

---

## Patient Entity

| Field         | Data Type | Description       |
|---------------|-----------|-------------------|
| id            | Long      | Unique Patient ID |
| name          | String    | Patient Name      |
| dob           | LocalDate | Date of Birth     |
| diagnose      | String    | Patient Diagnosis |
| billAmount    | Double    | Total Bill Amount |
| doctorName    | String    | Assigned Doctor   |
| admitDate     | LocalDate | Admission Date    |
| dischargeDate | LocalDate | Discharge Date    |
| billStatus    | String    | Paid / Pending    |

---

## REST API Endpoints

### Create Patient

```http
POST :
http://localhost:8080/patient
```

### Get All Patients

```http
GET :
http://localhost:8080/patient
```

### Get Patient By ID

```http
GET :
http://localhost:8080/patient/1
```

### Update Patient

```http
PUT :
http://localhost:8080/patient/2
```

### Delete Patient

```http
DELETE :
http://localhost:8080/patient/2
```

---

## Sample JSON Request

```json

    {
        "id": 1,
        "name": "Harsh",
        "dob": "2008-05-21",
        "diagnose": "Fever",
        "billamount": 4000,
        "admitDate": "2026-10-12",
        "dischargeDate": "2026-10-21",
        "billstatus": "PAID"
    }
```

## Author

**Harsh Dwivedi**

Java Developer | Spring Boot Developer
