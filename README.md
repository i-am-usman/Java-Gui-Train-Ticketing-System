# 🚆 Train Ticket Booking System

A Java-based desktop application for booking train tickets, built using **Java Swing** for the GUI and **MySQL** for the backend database. This project is designed to allow users to sign up, log in, book tickets, review bookings, and view train details such as seat availability and timetables.

---

## 🛠️ Tech Stack

- **Programming Language**: Java  
- **GUI Framework**: Swing  
- **Database**: MySQL  
- **Database Tool**: MySQL Workbench  
- **IDE**: NetBeans  

---

## 📋 Features

- **User Authentication**  
  - Sign Up (New customers)
  - Login (Returning users)

- **Booking System**  
  - Book train tickets
  - View and review previous bookings
  - Check train timetable
  - View seat and berth availability

- **Check-in System**  
  - Mark customer check-in upon ticket verification

---

## 🗃️ Database Design

The project uses **two main tables** in the MySQL database:

### 1. `customer`
Stores user-related information.
- `id` – Unique Customer ID  
- `password` – Encrypted or plain text password  
- `booking_details` – Serialized or referenced booking info  
- `customer_idz` – Additional identifiers if applicable  

### 2. `traindetails`
Stores train-specific data.
- `train_id` – Unique Train ID (if used)  
- `available_seats` – Number of seats currently available  
- `berths` – Details about sleeper/berth arrangements  

---

## 🚀 Getting Started

### Prerequisites
- Java JDK (8 or above)
- MySQL Server and MySQL Workbench
- NetBeans IDE

### Installation Steps

1. **Clone the Repository**  
   ```bash
   git clone https://github.com/your-username/train-ticket-booking-system.git
