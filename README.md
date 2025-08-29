# AMart E-Commerce Web Application

This is an eCommerce platform built with JSP, Servlets, MySQL, Hibernate (ORM), and Bootstrap for the frontend UI. It supports user registration/login, product listing, search with pagination, shopping cart (session-only), and order management. There are two roles: admin and regular users.

## Technologies Used
- Java EE (Servlets, JSP)
- Hibernate (ORM)
- MySQL (database)
- Bootstrap (frontend)
- Apache Tomcat (deployment)

## Main Features
- User Registration and Login (Authentication)
- Product Listing
- Advanced Search with Pagination
- Shopping Cart Management
- Checkout & Order Management
- Admin and Regular User Roles

## Project Structure
See project folders for details.

## Database Design
- User, Product, Order, OrderItem tables
- Cart is session-only

## Initial Steps
1. Set up Maven (pom.xml) or your preferred build system.
2. Configure `hibernate.cfg.xml` for your MySQL DB.
3. Create the necessary DB tables.
4. Implement User, Product, Order entities.
5. Set up servlets and JSPs for views.
6. Integrate Bootstrap for UI.

## Workflow
- Develop authentication & user management first.
- Implement product listing, search, and pagination.
- Add shopping cart logic (session-only).
- Implement checkout and order management.
- Add admin features for product/order management.
- Style with Bootstrap.
- Test, deploy on Tomcat.
