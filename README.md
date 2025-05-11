# 💬 Java TCP Chat Application

A lightweight, terminal-based multi-client chat app built using Java Sockets. Perfect for learning core networking, multithreading, and client-server architecture. 🚀

## 🧩 Features

- 🔁 Real-time message broadcasting
- 👥 Multi-client support
- 💻 Terminal-based user interface
- ⚙️ Built using standard Java (`Socket`, `ServerSocket`, `Thread`)

## 📦 Project Structure

```plaintext
📁 java-tcp-chat/
|
├── ChatServer.java # 💼 Server implementation
├── ChatClient.java # 🙋 Client implementation
├── LICENSE # 📜 MIT License
├── SECURITY.md # 🔒 Security policy
└── README.md # 🧾 You're reading this
```

## ⚙️ Getting Started

### 📌 Prerequisites

- ✅ Java JDK 8 or above
- ✅ Basic terminal knowledge
- ✅ Optional: IntelliJ / Eclipse for IDE support

### 🧪 How to Run

1️⃣ **Compile the code:**

```bash
javac ChatServer.java
javac ChatClient.java
```

2️⃣ Start the server:

```bash
java ChatServer
```

3️⃣ Start one or more clients in new terminals:

```bash
java ChatClient
```

**Start chatting! 💬 Messages typed in one client will appear in all others.**

## 🔐 Security Notes

- **🔓 Communication is not encrypted (no SSL/TLS)**

- **🙅 No user authentication**

- **🚫 No rate limiting or input validation**

**See `SECURITY.md` for more info.**

## 🚀 Future Enhancements

- **🔒 SSL/TLS encryption**

- **👤 Username login/auth**

- **💌 Private messaging (DMs)**

- **🖥️ GUI with JavaFX or Swing**

- **📦 Package into runnable `.jar`**

## 🪪 License

**This project is licensed under the MIT License.**
**Feel free to use, modify, and distribute responsibly. ✌️**

## 👤 Author

- **Arshanth Kumar**

- 🎓 AI & Data Science Engineering Student

- **📫 GitHub :** @4rshxnth

## 🙌 Contributing

Contributions, issues, and feature requests are welcome!

Feel free to fork the repo and submit a PR. 📬

## 🎯 Output

### 🖥️ Server Terminal Output

```bash
Server started. Waiting for clients...
Client connected: /127.0.0.1:52314
Client connected: /127.0.0.1:52315
Received: Hello from Client 1
Broadcasting message to all clients...
Received: Hi Client 1, this is Client 2
Broadcasting message to all clients...
```

**The server listens for incoming connections and relays every message it receives to all connected clients.**
-

- ### 💬 Client Terminal Output (Example: Client 1)

```bash
Connected to the chat server.
You: Hello from Client 1
Client2: Hi Client 1, this is Client 2
```

- ### 💬 Client Terminal Output (Example: Client 2)

```bash
Connected to the chat server.
Client1: Hello from Client 1
You: Hi Client 1, this is Client 2
```
