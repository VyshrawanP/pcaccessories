# 🖥️ PC Builder Recommender System

**PC Builder Recommender System** is a web app that helps users choose PC parts based on budget and requirements.  
Built with **Spring Boot, MySQL, Thymeleaf, and TailwindCSS**, it provides a parts catalog, compatibility checks, and smart recommendations using rule-based logic and machine learning.

---

## 🚀 Features
- Browse and search PC components with filters  
- Budget-based PC build recommendations  
- Compatibility checks (CPU ↔ Motherboard, GPU ↔ Case, PSU wattage, etc.)  
- User authentication (login/register)  
- Save and compare builds  
- (Optional) Cart and order management  

---

## 🛠️ Tech Stack
- **Frontend**: HTML, TailwindCSS, Thymeleaf  
- **Backend**: Spring Boot (Java)  
- **Database**: MySQL (via Spring Data JPA)  
- **Authentication**: Spring Security (JWT/session)  
- **Machine Learning**: Rule-based engine + Python microservice (FastAPI/Flask)  
- **Deployment**: Docker, GitHub Actions, Render/AWS/Heroku  

---

## ⚡ Getting Started

### 1️⃣ Clone the repository
```bash
git clone https://github.com/YOUR_USERNAME/pc-builder-recommender.git
cd pc-builder-recommender/backend
