# ProjectDespair

Bonjour mon nom est Bastien Deveault je suis un étudiant en informatique au Cégep.
Ce dépôt contient le prototype d'un jeu vidéo en cours de développement. Celui-ci comporte un moteur 2d codé entièrement en java sans l'aide de librairie extèrne. 

Le développement de ce projet est fait avec l'aide d'IA générative comme outil d'assistance (relecture du code, aide au déboggage et assistance à l'optimisation). Tout le code est relu, compris et intégré par moi-même avant d’être commité.

Projet en cours : Ce projet à été entamé en Aout 2025

# Objectifs du projet

-Appliquer une architecture MVC claire et testable.
-Créer le prototype d'un jeu vidéo 2d avec boucle de gameplay complète.

# Arcitecture MVC

Le but de ce projet est de mettre en pratique les principes de l'architecture logicielle MVC apprise dans le cadre de mes études. Voici les classes principales du projet :

MODÈLE 
    -ModeleMonde.java : 
    -ModeleEntite.java :
    -ModeleJoueur.java :
    -ModeleCarte.java :

VUE
    -VueJeu.java : 

CONTRÔLEUR
    -ControleurJeu : Orchestrateur de la boucle de jeu à 60 fps
    -ControleurInput :

# Fonctionnalités implémentés

-Boucle de jeu en temps réel cadencé à 60 fps
-Mouvement du joueur avec WASD (politique de dèrnière touche pressée prioritaire)
-Caméra centrée sur le joueur (calcul des bordures de l'écran pour afficher uniquement les tuiles visibles)
-Chargement d'une carte depuis res/cartes/ et affichage tuile par tuile dans la vue du jeu

# Prochaines étapes

-Système de collisions du joueur
-Génération procédurale des cartes avec un seed
-Ajout de sprites pour les tuiles et le joueur
-Système d'entités (monstres et PNJ) avec ia simple

# Prérequis pour pouvoir faire tourner le projet

-Java 17+ (le projet tourne actuellement sur JDK 17)
-Un IDE Java (IntelliJ / VS Code + Extension Java) ou la ligne de commande