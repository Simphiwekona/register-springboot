# Login and Registration System

This project combines Spring Boot, React JS, and a PostgreSQL database to create a robust authentication system. It leverages Bootstrap for styling, ensuring a clean and responsive user interface.

## Description

This application provides user authentication functionalities through a Spring Boot-based REST API. The front-end is developed using React JS, allowing for a dynamic and interactive user experience. Bootstrap is used for styling, ensuring a polished and intuitive design.

## Technologies Used

- **Spring Boot:** Utilized for creating RESTful APIs and handling backend operations, including user authentication and CRUD functionality.
- **React JS:** Empowers the front-end, enabling a seamless user interface and dynamic user interactions.
- **PostgreSQL:** The chosen database for storing user information and credentials securely.
- **Bootstrap:** Enhances the visual appeal and responsiveness of the user interface.

## Key Concepts Implemented

- **useState:** Employed in React to manage state within functional components, enabling dynamic updates to the UI.
- **useEffect:** Used in React to manage side effects in functional components, such as data fetching and component updates.
- **Spring Boot REST APIs:** Implemented for handling user authentication, CRUD operations, and interactions with the PostgreSQL database.
- **CRUD Operations:** Create, Read, Update, and Delete functionalities enable managing user information securely and efficiently.

## User Registration and Login

### Registration

1. **Access Registration Page:** Users can navigate to the registration page from the main interface.
2. **Enter Details:** Users input required information, such as username, email, and password.
3. **Submit Form:** Once all necessary fields are filled, users submit the form.
4. **Backend Processing:** Spring Boot processes the form, securely storing user details in the PostgreSQL database.

### Login

1. **Access Login Page:** Users navigate to the login page.
2. **Enter Credentials:** Users input their registered username and password.
3. **Authentication:** The backend verifies the credentials against the database.
4. **Successful Login:** Upon successful authentication, users gain access to the system.

## Authentication

This system implements secure authentication measures, verifying user credentials against stored data. Passwords are encrypted and stored securely, ensuring confidentiality.
