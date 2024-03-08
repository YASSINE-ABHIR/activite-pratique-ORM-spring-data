# Gestion des Patients avec Java Spring 🏥

## Definition

- **Spring Data**: Spring Data fait partie du framework Spring, qui est un ensemble complet d'outils pour le développement d'applications Java,Spring Data simplifie le développement des couches d'accès aux données en fournissant un modèle de programmation unifié et cohérent pour différents types de stockage de données, tels que les bases de données relationnelles, les bases de données NoSQL, etc.Il offre un support pour diverses technologies d'accès aux données, notamment JPA, JDBC MongoDB, Cassandra, et d'autres.

- **JPA (Java Persistence API)**: JPA est une spécification Java pour la gestion des données relationnelles dans les applications Java. Elle propose une méthode standardisée pour que les développeurs Java interagissent avec des bases de données relationnelles en utilisant des approches orientées objet. JPA définit un ensemble d'interfaces et d'annotations permettant aux développeurs de mapper des objets Java sur des tables de base de données, d'effectuer des opérations CRUD (Create, Read, Update, Delete) et de interroger les données à l'aide d'une API orientée objet.

- **Hibernate**: Hibernate est une implémentation populaire et open-source de la spécification JPA. Il s'agit d'un framework ORM qui simplifie l'interaction avec les bases de données dans les applications Java en fournissant un mappage puissant, haute performance et flexible entre les objets Java et les tables de base de données. Hibernate se charge de traduire les objets Java en requêtes SQL et vice versa, permettant aux développeurs de travailler avec des objets dans leur code tout en persistant et récupérant des données dans une base de données relationnelle.

- **ORM (Object-Relational Mapping)** : L'ORM est une technique de programmation qui permet la conversion de données entre des systèmes de types incompatibles, tels que entre une base de données relationnelle et un langage de programmation orienté objet. Dans le contexte de Java, les frameworks ORM comme Hibernate fournissent un moyen de mapper des objets Java sur des tables de base de données et vice versa, éliminant la nécessité pour les développeurs d'écrire des requêtes SQL de bas niveau. L'ORM simplifie les interactions avec la base de données, améliore la maintenabilité du code et augmente la productivité en permettant aux développeurs de travailler avec des objets dans leur langage de programmation plutôt que de traiter directement avec des détails spécifiques à la base de données.

**Spring Data est un framework d'accès aux données de haut niveau qui prend en charge plusieurs types de stockage de données, tandis que JPA est une norme permettant aux développeurs Java d'interagir avec des bases de données relationnelles. Hibernate est une implémentation spécifique de JPA et sert de framework ORM puissant pour les applications Java. Ensemble, ils fournissent une manière robuste et normalisée de gérer la persistance des données dans les applications d'entreprise basées sur Java.**

## presentations

Ce projet Java Spring est une application de gestion des patients, développée dans le cadre de `Activité Pratique N°2 - ORM, JPA Hibernate Spring Data`. Il utilise Spring Boot et JPA pour fournir un système permettant de gérer les informations des patients.

## Fonctionnalités

- **Ajout de patients** : Ajouter de nouveaux patients à la base de données.
- **Consultation de tous les patients** : Afficher tous les patients enregistrés.
- **Consultation d'un patient** : Afficher les détails d'un patient spécifique.
- **Recherche de patients par nom** : Rechercher les patients dont le nom contient une lettre spécifique.
- **Mise à jour des informations d'un patient** : Mettre à jour les informations d'un patient existant.
- **Suppression d'un patient** : Supprimer un patient de la base de données.

## Structure du Projet

- **Entities** : Contient la classe `Patient` qui définit l'entité JPA pour représenter les patients.
- **Repository** : Contient l'interface `PatientRepository` qui étend `JpaRepository` pour effectuer des opérations CRUD sur les patients.
- **Main Application** : Classe principale `ActivitePratiqueN2Application` qui lance l'application Spring Boot et implémente `CommandLineRunner` pour exécuter les opérations lors du démarrage.

## UML

![UML](./UML/UML.png)

## Technologies Utilisées

- **Java Spring Boot** : Framework Java pour le développement d'applications.
- **JPA (Java Persistence API)** : Interface de programmation Java permettant de gérer les données relationnelles.
- **Hibernate** : Framework de mapping objet-relationnel pour Java.
- **Lombok** : Bibliothèque Java qui automatise la génération de code répétitif, comme les accesseurs et les mutateurs.
- **MySQL** : Système de gestion de base de données relationnelle.
- **H2** : Base de données en mémoire, alternative à MySQL pour les tests et le développement.

## Configuration

Le fichier `application.properties` contient la configuration de l'application, y compris les détails de la base de données. Assurez-vous de configurer correctement les informations de votre base de données MySQL.

```properties
server.port=3309
spring.datasource.url=jdbc:mysql://localhost:3306/patientsdb?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
```

### Utilisation de H2

Décommentez les lignes suivantes pour utiliser H2 :

```properties
# Utilisation de H2 (base de données en mémoire)
#spring.datasource.url=jdbc:h2:mem:patientsdb
#spring.datasource.username=sa
#spring.datasource.password=
#spring.h2.console.enabled=true
```

## Exécution

Pour exécuter l'application, assurez-vous d'avoir configuré une base de données MySQL avec les informations spécifiées dans `application.properties`. Ensuite, exécutez la classe principale `ActivitePratiqueN2Application`.

## Auteur

Ce projet a été développé par **HAMZA DAMIRI (Dev7HD)** - [GitHub Profile](https://github.com/Dev7HD).

---

**Note :** Assurez-vous d'avoir les dépendances et l'environnement nécessaire configurés correctement avant d'exécuter l'application.
