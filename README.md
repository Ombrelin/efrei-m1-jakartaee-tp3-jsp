# TD 1 Servlet, JSP, JSTL

## Exercice 1 : Servlet

On souhaite créer une application web permettant de charger un fichier (image, pdf ...) dans un dossier
de notre projet déployé dans un serveur web. Pour ce faire, on demande de créer la page web suivante :
Au clic sur le bouton Upload, le fichier sélectionné sera transféré vers le dossier "/WEB-INF/file/".
Ainsi, l'utilisateur sera rédigé vers une page "result.jsp" en affichant le message "File Uploaded
Successfully".

### La classe File

Une classe qui permet de manipuler des fichiers et des répertoires sans toutefois accéder aux données dans les fichiers.

```java
File myFile = new **File** ("file");
//Création de dossier
if(!myFile.exists())
myFile.mkdirs();
// Si on se trouve dans le répertoire courant
String relative = myFile.getPath(); // retourne "file.txt"
System .out.println(relative);
String absolute = myFile.getAbsolutePath();
System .out.println(absolute);
// C:\Users\leblond\Documents\NetBeansProjects\Examen\file
boolean there = myFile.exists(); // vrai ou faux si le fichier existe ou non
System.out.println(there);
boolean checkDir = myFile.isDirectory(); // si le fichier est un répertoire
System .out.println(checkDir);
long myLength = myFile.length(); // taille du fichier.
System.out.println(myLength);
// retourne les différents fichiers dans un répertoire
String [] allfiles = myFile.list();
for( String st : allfiles)
System .out.println(st);
```
## Exercice 2 : JSP, JSTL

- Ecrire une jsp en utilisant la JSTL, qui affiche la liste des nombres de 2 à 30 en indiquant pour
chaque nombre s’il est premier ou pas.
(Un nombre est premier s’il n’est divisible que par 1 et par lui-même)
- Ecrire une jsp qui prend en paramètre un nombre et calcule s’il est premier ou non
- Reprendre a. en remplaçant les valeurs écrites en dur dans le code (2 et 30) par des variables
entrées par l’utilisateur.

## Exercice 3 : JSP, JSTL

- Développer une page jsp en utilisant la JSTL, qui affiche la liste des nombres de 2 à 30 en ndiquant pour chaque nombre s’il est premier ou pas. NB : Un nombre est premier s’il n’est divisible que par 1 et par lui-même.
- Développer une page jsp qui prend en paramètre un nombre et calcule s’il est premier ou non
- Reprendre a. en remplaçant les valeurs écrites en dur dans le code (2 et 30) par des variables entrées par l’utilisateur.

## Exercice 4 : JavaBeans

Dans ce TP, nous allons faire une authentification avec un login et un mot de passe en utilisant un Java Bean représenté par la classe User. Cette authentification va être faite avec les actions JSP.

- Créer la classe User (login , password).
- Créer le formulaire d'authentification.
- Au clic sur le bouton "Envoyer" les données seront transmises vers la page "load.jsp", dans cette page créer un objet user et enregistrer le dans une session.
- Créer une page web "affiche" permettant d'afficher le login et le mot de passe que l'utilisateur a saisir.


