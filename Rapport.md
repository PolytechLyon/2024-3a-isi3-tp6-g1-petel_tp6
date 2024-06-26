# Compte Rendu du TP 1 : Patrons de Conceptions

Noms des étudiants du binôme : PETEL Noa

## Exercices 1
Ce modèle reflète le design pattern *Composite*.
L'interface étant un **MobileObject** et le **Vehicle** étant un composite.

Il n'est pas nécessaire de réecrire les méthodes *getVelocity()* et *getMasse()* car la méthode dans **Vehicle** se charge
déjà de calculer la masse de l'ensemble des composants et des feuilles. Il est cependant nécessaire de définir la masse 
d'un **Bike**, celle de **Wheel** étant déjà défini.

## Exercices 2
La méthode *getVelocity()* utilise le patron de conception **Iterator**. Ce patron est utile pour parcourir des structures
de données sans se soucier des objets qui le constitue. On peut donc séparer le parcours de la structure de données du 
traitements de ces objets.

Il n'est pas nécessaire de modifier l'implémentation de la méthode *getVelocity()* étant donné que **Iterator** possède 
le même fonctionnement peu importe la structure de données parcourue.

## Exercices 3
Pour utiliser le patron de conception **Singleton**, on ajoute les éléments suivants dans la classe **Clock** :
- un champ *instance*, qui representera donc l'instance de **Clock**
- une méthode *getInstance* qui renvoie une nouvelle instance de **Clock** si elle n'existe pas déjà
- il n'est pas nécessaire d'ajouter un constructeur étant donné qu'il n'y a pas de traitements particuliers à effectuer 
à l'initialisation

## Exercices 4
Les classes **Bike** et **Wheel** ne sont pas dans le même package. Elles ont une relation d'inclusion l'une envers 
l'autre ce qui ne respecte pas le principe ADP (Acyclic Dependencies Principle).

La classe **Wheel** utilise la méthode *getPush()* de la classe **Bike**. Cependant, la classe mère **Vehicle** défini 
déjà cette fonctionnalité, et se situe dans le même package. Pour casser le cycle de dépendance, on va changer le champ 
*drive* pour qu'il soit du type **Vehicle**.

## Exercices 5
Voir le code 

On conserve les lignes communes de code dans la classe mère, et on implémente la méthode abstraite pour réaliser le 
traitement spécifique dans chacune des classes.

## Exercices 6
La différence entre le pattern **Singleton** et **Factory** réside dans le fait qu'on puisse instancier plusieurs objets 
avec **Factory** tandis que **Singleton** permet de créer une instance unique.

## Exercices 7
Voir le code 

On implémente simplement la nouvelle classe en la faisant hériter de **NamedLogger**. On fait attention de ne pas oublier 
la méthode qui permet de décorer notre objet concret.

## Exercices 8

La classe **Context** réalise le patron de conception **Façade**. En effet, la classe **Context** permet une utilisation
simplifié de la classe **ServiceLoader**, en ne réalisant que les methodes *inject()* et *injectAll()*.

Dans le fichier *fr.polytech.sim.cycling.Bike*, on peut ajouter la liste des objets que l'on peut injecter dans notre contexte.
Il est donc naturellement possible d'insérer plusieurs lignes si on souhaite ajouter plusieurs objets dans notre contexte.
C'est d'ailleurs ce que l'on fait dans l'exercice suivant. 

## Exercice 9 

La méthode *injectAll()* utilise le patron de conception **Iterator**.


