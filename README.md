# URL Shortener Lambda

## 📚 Sobre o Projeto

Este projeto é um sistema de encurtamento de URLs que resolve problemas como:

- 🔗 Limite de caracteres ao compartilhar URLs.
- ✨ Melhor estética ao apresentar links.

### 🛠️ O que a aplicação faz:
- Armazena a URL original, tempo de expiração e um identificador único (UUID) no banco de dados.
- Retorna ao usuário o UUID e o timestamp (tempo de expiração).
- Permite verificar a validade de URLs encurtadas.

---

## 🚀 Tecnologias Utilizadas

### **AWS Lambda (Serverless)**
- 🖥️ Modelo de computação em nuvem onde a infraestrutura é gerenciada automaticamente pela AWS.
- **Benefícios**:
  - 📈 Escalabilidade automática.
  - ⚙️ Configurações de hardware e rede feitas pelo provedor.
  - 💰 Custo baseado no uso, ideal para aplicações não contínuas.
  - 🕒 Pode ter aumento de latência inicial (cold start).

### **Amazon S3**
- ☁️ Serviço de armazenamento em nuvem escalável.
- **Utilizado no projeto para**:
  - 📝 Armazenar URLs originais e tempos de validade em arquivos JSON.
  - 🗂️ Nomear os arquivos JSON com os UUIDs designados.
- **Características**:
  - 📂 Armazena objetos (arquivos) e seus metadados (data de criação, última modificação, etc.).
  - 🪣 Utiliza buckets como contêineres para organizar os objetos.

---

## 🔧 Funcionalidades

### **1️⃣ Encurtamento de URLs**
- Recebe uma URL original e um tempo de expiração.
- Gera um UUID e retorna ao usuário:
  - 🔑 O UUID.
  - ⏱️ O timestamp do tempo de expiração.

### **2️⃣ Validação de URLs encurtadas**
- Permite ao usuário verificar a validade de uma URL encurtada.
- Verifica o status no banco de dados ou no S3.

---

## 📂 Estrutura do Projeto

- **🔄 Lambda Functions**: Gerenciam a lógica de encurtamento e validação de URLs.
- **☁️ Amazon S3**: Armazena os dados de URLs encurtadas em arquivos JSON organizados por buckets.

---
