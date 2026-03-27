# 📱 Projeto Cadastro de Usuários (Android)

Este projeto é uma aplicação Android desenvolvida em **Java**, que permite cadastrar e visualizar usuários em uma lista dinâmica utilizando o componente **RecyclerView**.

O objetivo principal é praticar conceitos fundamentais do desenvolvimento Android, como navegação entre telas (Activities), manipulação de listas e atualização de interface em tempo real.

---

## 🚀 Sobre o Projeto

A aplicação possui uma tela principal que exibe uma lista de nomes cadastrados e um botão para adicionar novos usuários. Ao clicar no botão, o usuário é direcionado para uma nova tela onde pode inserir um nome, que será adicionado à lista.

A lista é atualizada automaticamente ao retornar para a tela principal.

---

## 🧩 Funcionalidades

- 📋 Exibição de lista de usuários com **RecyclerView**
- ➕ Cadastro de novos usuários
- 🔄 Atualização automática da lista ao retornar para a tela principal
- 📱 Navegação entre telas utilizando **Intent**
- 💾 Armazenamento temporário em memória com lista estática

---

## 🛠 Tecnologias Utilizadas

- **Java** – Linguagem principal do projeto
- **Android Studio** – IDE de desenvolvimento
- **RecyclerView** – Exibição eficiente de listas
- **LinearLayoutManager** – Organização vertical dos itens
- **Intent** – Navegação entre Activities
- **XML** – Construção das interfaces

---

---

## 🧠 Lógica do Funcionamento

- A lista de usuários é armazenada em uma variável **estática (`static`)**, permitindo que os dados sejam compartilhados entre diferentes telas enquanto o app estiver aberto.
- O **RecyclerView** utiliza um adaptador (`UserAdapter`) para exibir os dados.
- Ao clicar no botão **"Cadastrar"**, o app abre a tela `CreateUser`.
- Quando o usuário retorna para a tela principal, o método `onResume()` é chamado, atualizando automaticamente a lista com `notifyDataSetChanged()`.

---

---

## 💡 Melhorias Futuras

- Persistência de dados com **SQLite** ou **Room Database**
- Validação de campos no cadastro
- Exclusão e edição de usuários
- Interface mais moderna com **Material Design**
- Armazenamento em nuvem (Firebase)

---

## 📜 Licença

Este projeto está sob a licença **MIT**.  
Sinta-se livre para usar e modificar.

---

## 👨‍💻 Desenvolvido por

Projeto desenvolvido para fins acadêmicos e de aprendizado em desenvolvimento Android.

---

> “Aprender na prática é o melhor caminho para evoluir como desenvolvedor.” 🚀