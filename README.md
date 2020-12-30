# Projet application mobile : Jokapp

## Description du projet

L'objectif de l'application est de générer des blagues aléatoirement à partir d'une API.

## Détails de l'application

* Ecran 1 : Page de connexion
* Ecran 2 : Page de création de compte
* Ecran 2 : Page d'affichage d'une liste avec RecyclarView généré à partir d'une API
* Appel WebService à une API Rest : https://v2.jokeapi.dev
* Stockage de données sur une base de donnée en local (ROOM)
* Fonctions supplémentaires : 
  - Gitflow
  - Architecture MVVM
  - Clean Architecture
  - Design Patterns
  - Principe SOLID
  - Design (Harmonie des couleurs + logo application)
  - Bouton permettant le retour sur le MainActivity à partir de l'activité courrante
  - Message d'erreur si les identifiants ne sont pas bons à la connexion
  - Message d'erreur si les champs sont vides à l'inscription + si le mot de passe ne correspond pas à la confirmation du mot de passe
  - Message d'erreur si l'adresse mail n'est pas valide
  
## Fonctionnalités
  
  ### Ecran de login
  
  - Affichage d'un message d'erreur si les champs de login sont vides ou incorrects
  
  ![Ecran login](https://github.com/Pragma-dev/Projet_4A_ESIEA/blob/master/images_readme/1.png) ![Ecran login](https://github.com/Pragma-dev/Projet_4A_ESIEA/blob/master/images_readme/2.png)

  ### Fonction de recherche
  
  - Barre de recherche
  
  ![Barre de recherche](https://github.com/Pragma-dev/Projet_4A_ESIEA/blob/master/images_readme/2.png)
 
  - Recherche par pays
  
  ![Recherche pays](https://github.com/Pragma-dev/Projet_4A_ESIEA/blob/master/images_readme/3.png)
  
  - Recherche par pattern
  
  ![Recherche pattern](https://github.com/Pragma-dev/Projet_4A_ESIEA/blob/master/images_readme/4.png)
  
  ### Mise à jour des données en fonction de la connexion internet (Appel de l'API si le téléphone est connecté à internet, sinon on récupère le cache)
  
  ![Internet On](https://github.com/Pragma-dev/Projet_4A_ESIEA/blob/master/images_readme/5.png) ![Internet Off](https://github.com/Pragma-dev/Projet_4A_ESIEA/blob/master/images_readme/6.png)
  
  ### Affichage des statistiques d'un pays après avoir cliqué dessus + bouton retour sur l'activité principal

  ![Ecran1](https://github.com/Pragma-dev/Projet_4A_ESIEA/blob/master/images_readme/7.png) ![Ecran2](https://github.com/Pragma-dev/Projet_4A_ESIEA/blob/master/images_readme/8.png)
  
 
  ### Icone de l'application sur Samsung Galaxy S7 Edge
  
  ![Icone application](https://github.com/Pragma-dev/Project_ESIEA/blob/master/images_readme/IconeApplication.jpg)

