# 🏏 CricBase — Cricket Management System

> A console-based Cricket Management System built with Java using Object-Oriented Programming principles.

![Java](https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/Paradigm-OOP-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Complete-brightgreen?style=for-the-badge)
![GitHub](https://img.shields.io/badge/Author-mahbub440-181717?style=for-the-badge&logo=github)

---

## 📌 About

**CricBase** is a Java console application that allows users to manage cricket teams, players, and matches. Built using core OOP concepts like inheritance, abstraction, and encapsulation.

---

## ✨ Features

- ➕ Add & manage cricket **teams**
- 👤 Add **players** with roles (Batsman/Bowler)
- 🔍 **Search** players by name
- 🏟️ Create **matches** between teams
- 📊 View **match results** with winner declaration
- ✅ Input validation & error handling

---

## 📁 Project Structure

```
CricBase/
├── App/
│   └── Main.java          # Entry point
├── Models/
│   ├── Person.java        # Abstract base class
│   ├── Player.java        # Player model
│   ├── Team.java          # Team model
│   └── Match.java         # Match model
└── Services/
    └── CricketSystem.java # Core business logic
```

---

## 🧠 OOP Concepts Used

| Concept | Where Used |
|---------|------------|
| **Abstraction** | `Person` abstract class |
| **Inheritance** | `Player` extends `Person` |
| **Encapsulation** | Private fields with getters |
| **Collections** | `ArrayList` for teams, players, matches |

---

## 🚀 How to Run

```bash
# Compile all files
javac App/Main.java Models/*.java Services/*.java

# Run
java App.Main
```

---

## 📋 Menu Options

```
===== CRICBASE MENU =====
1. Add Team
2. Add Player to Team
3. Show Teams
4. Search Player
5. Create Match
6. Show Matches
0. Exit
```

---

## 👨‍💻 Author

**Mahbubur Rahman Sayem**
- GitHub: [@mahbub440](https://github.com/mahbub440)
- Email: sayemmahbub7@gmail.com

---

> *"Cricket is not just a game, it's a passion." 🏏*
