

# ProjectDespair

Bonjour mon nom est Bastien Deveault je suis un étudiant en informatique au Cégep.
Ce dépôt contient le prototype d'un jeu vidéo en cours de développement. Celui-ci inclus moteur écrit entièrement en Java, sans bibliothèque externe.

Le développement de ce projet est fait avec l'aide d'IA générative comme outil d'assistance (relecture du code, aide au débogage et assistance à l'optimisation). Tout le code est relu, compris et intégré par moi-même avant d’être commité.

Projet en cours : Ce projet à été entamé en Aout 2025

# Objectifs du projet

- Appliquer une architecture MVC claire et testable.
- Créer le prototype d'un jeu vidéo 2d avec boucle de gameplay complète.

# Arcitecture MVC

Le but de ce projet est de mettre en pratique les principes de l'architecture logicielle MVC apprise dans le cadre de mes études. Voici les classes principales du projet :

MODÈLE 
- ModeleMonde.java : État global de la partie avec la carte et la position du joueur.
- ModeleEntite.java : Méthode abstaite. Base des entités.
- ModeleJoueur.java : État du joueur. Hérite de ModeleEntite
- ModeleCarte.java : Méthode abstraite. Base des cartes.

VUE
- VueJeu.java : Dessine le jeu (tuiles, joueur)

CONTRÔLEUR
- ControleurJeu : Orchestrateur de la boucle de jeu à 60 fps
- ControleurInput : Gestion des entrées clavier

# Fonctionnalités implémentés

- Boucle de jeu en temps réel cadencé à 60 fps
- Mouvement du joueur avec WASD (politique de dèrnière touche pressée prioritaire)
- Caméra centrée sur le joueur (calcul des bordures de l'écran pour afficher uniquement les tuiles visibles)
- Chargement d'une carte depuis res/cartes/ et affichage tuile par tuile dans la vue du jeu
- Système de collisions du joueur

# Prochaines étapes

- Système d'entités (monstres et PNJ) avec ia simple
- Génération procédurale des cartes avec un seed
- Ajout de sprites pour les tuiles et le joueur

# Prérequis pour pouvoir faire tourner le projet

- Java 17+ (le projet tourne actuellement sur JDK 17)
- Un IDE Java (IntelliJ / VS Code + Extension Java) ou la ligne de commande

# Comment installer le projet

1. Cloner le dépôt : git clone https://github.com/RTS_FleurDeLys/ProjectDespair.git
2. Ouvrir le dossier dans IntelliJ IDEA ou VS Code (avec l’extension Java).
3. Marquer src/main/resources (ou res/) comme dossier de ressources pour que cartes/carte.txt soit copié dans le classpath.
4. Lancer la classe Main
