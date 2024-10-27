# Projet bilingue
## 🇫🇷 Français

**Compte rendu**


***![](captures/Exercice1/Ex1-Ennoncé.png)***  
*Introduction :*  
Ce programme a pour objectif de permettre la gestion et l'affichage de notes d'étudiants. Il s'agit d'un ensemble de fonctions qui répond à plusieurs objectifs spécifiques :  
*Saisie des notes* : L'utilisateur peut entrer une série de notes qui seront stockées dans un tableau.  
*Tri des notes* :  Les notes saisies sont ensuite triées en ordre croissant afin de faciliter leur analyse.  
*Affichage des notes* : Une fois triées, les notes sont affichées à l'écran pour que l'utilisateur puisse les consulter.  
*Affichage de la note maximale et minimale* : Le programme calcule et affiche les valeurs extrêmes (la plus haute et la plus basse note).  
*Calcul de la moyenne* : Enfin, une fonction calcule et affiche la moyenne des notes saisies.  
Ces opérations sont réparties en différentes fonctions afin de rendre le code plus clair, modulaire et réutilisable. 

*Toutes ces fonctions sont ensuite réunies et appelées dans une fonction principale, qui orchestre l'exécution globale du programme. Cela permet de traiter chaque étape de manière distincte tout en les regroupant dans un processus cohérent.*

**Fonction : saisieNotes**

*Description :*  
Cette fonction permet de saisir les valeurs d'un tableau de nombres flottants (float\[\]) à partir de l'entrée utilisateur via la console.

![](captures/Exercice1/saisie_notes.png)

*Détails :*  
La fonction demande à l'utilisateur de saisir une série de valeurs pour remplir le tableau de notes. Elle utilise un objet Scanner pour lire les entrées de l'utilisateur. La boucle for parcourt chaque indice du tableau, affiche un message invitant l'utilisateur à entrer une valeur, puis lit et stocke la valeur saisie dans l'élément correspondant du tableau.

*Remarque :*  
La fonction modifie directement le tableau passé en paramètre, en remplissant ses éléments avec les valeurs saisies par l'utilisateur. Elle ne retourne aucune valeur.

**Fonction : afficherNotes**

*Description :*  
Cette fonction permet d'afficher les éléments d'un tableau de nombres à virgule flottante (type float\[\]) ligne par ligne dans la console.

![](captures/Exercice1/affiche_notes.png)

*Détails :*  
La fonction parcourt chaque élément du tableau tab en utilisant une boucle for-each et affiche chaque élément à l'aide de System.out.println(f), où f représente un élément du tableau.

*Remarque :*  
Cette fonction ne retourne rien. Elle se contente d'afficher les éléments du tableau dans la console.

**Fonction : trier**

*Description :*  
Cette fonction permet de trier un tableau de nombres à virgule flottante (type float\[\]) en ordre croissant.

![](captures/Exercice1/trie_notes.png)

*Détails :*  
La fonction utilise la méthode Arrays.sort(tab) de la classe Arrays pour trier les éléments du tableau en ordre croissant. Cette méthode applique un algorithme de tri optimisé.

**Fonction : noteMax**

Cette fonction permet de chercher dans un tableau de nombre à virgule flottante la valeur maximale(note maximale).

![](captures/Exercice1/note_max.png)

*Détails :*  
La fonction noteMax itère dans le tableau des notes pour trouver la valeur maximale qui retourne son indice.  
*Remarque :*  
On a choisi de retourner l'indice et non pas la valeur pour avoir plus de contrôle sur cette valeur.

**Fonction : noteMin**  
La fonction noteMin permet de chercher la valeur minimale (note minimale) dans un tableau de nombre à virgule flottante.

![](captures/Exercice1/note_min.png)

*Détails :*  
Cette fonction prend en paramètre un tableau dans lequel elle permet d’itéré pour trouver la valeur minimale et retourner son indice.  
*Remarque*:  
On a choisi de retourner l'indice et non pas la valeur pour avoir plus de contrôle sur cette valeur.

**Fonction : moyenne**  
La fonction moyenne permet de trouver une moyenne par rapport à l'ensemble des éléments qui se trouve dans le tableau de nombre à virgule flottante.

![](captures/Exercice1/moyenne_notes.png)

*Détails :*  
Cette fonction prend un tableau en paramètre qui  itère dessus pour appliquez la somme et retourner en dernier la moyenne.

*Remarque:*  
On a choisi de retourner la moyenne et non pas de l'afficher pour pouvoir l'utiliser ailleurs (dans la fonction principale).

**Fonction : nbElements**  
La fonction nbElements permet de calculer les répétitions d'une valeur, saisie (ou entrer) par l'utilisateur, dans un tableau de nombre à virgule flottante.

![](captures/Exercice1/nombre_element.png)

*Détails :*  
Cette fonction prend comme paramètres un tableau et une note qu'on va chercher en itérant dans le tableau entré en premier paramètre. La fonction retourne le nombre de répétitions de cette valeur dans le tableau.

**Fonction Principale : main**  
La fonction main permet l'exécution des fonctions citées ci-dessus et suivre l'enchaînement de ces derniers.

![](captures/Exercice1/main.png)

*Exécution* :  
![](captures/Exercice1/Ex1-exe1.png)
![](captures/Exercice1/Ex1-exe2.png)


***![](captures/Exercice2/Ex2-ennoncé.png)***  
*Introduction* :  
Ce programme a pour objectif de permettre la conjugaison automatique de verbes du premier groupe en français. Il est composé de plusieurs fonctions qui répondent à des objectifs spécifiques :  
Saisie d'un verbe : L'utilisateur est invité à entrer un verbe du premier groupe (un verbe se terminant par "er").  
Vérification du verbe : Le programme vérifie si le verbe saisi est bien un verbe du premier groupe en s'assurant qu'il se termine par "er".  
Conjugaison du verbe : Si le verbe est valide, il est conjugué au présent de l'indicatif pour les différents pronoms personnels (Je, Tu, Il/Elle/On, Nous, Vous, Ils/Elles).  
Ces opérations sont implémentées dans différentes fonctions, ce qui rend le code modulaire et facile à comprendre. La fonction principale main orchestre l'ensemble des étapes, assurant que le verbe est d'abord validé avant d'être conjugué et affiché. Ce découpage permet de traiter chaque partie du processus de manière distincte, tout en assurant une exécution cohérente et fluide du programme.

**Fonction : saisieVerbe()**

*Description* : Cette fonction permet de capturer la saisie d'un verbe par l'utilisateur.

![](captures/Exercice2/Ex2-saisie_verbe.png)

*Détails :*  
Elle utilise un Scanner pour lire l'entrée de l'utilisateur à partir de la console.  
Elle affiche un message à l'utilisateur pour lui demander de saisir un verbe du premier groupe.  
Elle retourne la chaîne de caractères saisie (le verbe).

**Fonction: verifierverbe(String verbe)**

*Description* : Cette fonction vérifie si le verbe saisi est bien un verbe du premier groupe, c'est-à-dire qu'il se termine par "er".

![](captures/Exercice2/Ex2-verifier_verbe.png)

*Détails* :   
Elle récupère la longueur du verbe avec verbe.length().  
Elle utilise substring() pour extraire les deux dernières lettres du verbe et vérifier si elles correspondent à "er".  
Si le verbe se termine par "er", elle retourne true, sinon elle retourne false.

**Fonction: conjuguer(String verbe)**

*Description* : Cette fonction conjugue le verbe donné au présent de l'indicatif pour les six pronoms personnels (Je, Tu, Il/Elle/On, Nous, Vous, Ils/Elles).

![](captures/Exercice2/Ex2-conjuguer_verbe.png)

*Détails* :  
Elle supprime les deux dernières lettres "er" du verbe pour récupérer le radical avec verbe.substring(0, verbe.length()-2).  
Elle concatène ce radical avec les terminaisons correctes pour chaque pronom personnel :  
"Je" : radical \+ "e"  
"Tu" : radical \+ "es"  
"Il/Elle/On" : radical \+ "e"  
"Nous" : radical \+ "ons"  
"Vous" : radical \+ "ez"  
"Ils/Elles" : radical \+ "ent"  
Elle affiche ensuite la conjugaison pour chaque pronom avec System.out.println().

**Fonction Principale: main(String\[\] args)**

*Description* : C'est la méthode principale qui exécute le programme. Elle demande à l'utilisateur de saisir un verbe du premier groupe (terminant par "er"), vérifie que c'est bien un verbe du premier groupe, et le conjugue si c'est le cas.

![](captures/Exercice2/Ex2-main.png)

*Détails* :   
Elle appelle la fonction saisieVerbe() pour capturer la saisie de l'utilisateur.  
Ensuite, elle utilise la méthode verifierverbe() pour vérifier que le verbe saisi est bien du premier groupe (se terminant par "er").  
Si la vérification est positive, elle appelle la méthode conjuguer() pour afficher la conjugaison du verbe saisi.

*Exécution* :

![](captures/Exercice2/Ex2-execution.png)

***![](captures/Exercice3/Ex3-ennoncé.png)***

***Introduction** :*

Ce programme a pour objectif de gérer des opérations diverses sur des chaînes de caractères saisies par l'utilisateur. Il permet d'interagir avec l'utilisateur via un menu et offre plusieurs fonctionnalités autour de la manipulation de chaînes, comme l'affichage, l'inversion, et le comptage des mots dans la chaîne. Il est conçu de manière modulaire, chaque fonctionnalité étant implémentée dans une fonction distincte, ce qui rend le code clair et maintenable. Les principales fonctionnalités sont :  
Saisie d'une chaîne de caractères : L'utilisateur peut saisir une chaîne qui sera ensuite utilisée pour d'autres opérations.  
Affichage de la chaîne : Une fois la chaîne saisie, elle peut être affichée en utilisant cette option.  
Inversion de la chaîne : Le programme permet d'inverser la chaîne et d'afficher le résultat.  
Comptage des mots : Le programme peut également compter et afficher le nombre de mots dans la chaîne saisie.  
Ces opérations sont organisées autour d'un menu qui permet à l'utilisateur de choisir l'opération qu'il souhaite exécuter. La gestion de l'interaction utilisateur est fluide, et le programme revient toujours au menu après chaque opération jusqu'à ce que l'utilisateur décide de quitter.

**Fonction: afficherMenu()**

*Description* : Cette fonction affiche le menu des options disponibles pour l'utilisateur.

![](captures/Exercice3/Ex3-afficher_menu.png)

*Détails :*  
Elle affiche un menu structuré, présentant les différentes opérations que l'utilisateur peut effectuer : saisir une chaîne, l'afficher, l'inverser, compter le nombre de mots, ou quitter le programme.

**Fonction : saisie()**

*Description* : Cette fonction permet à l'utilisateur de saisir une chaîne de caractères.

![](captures/Exercice3/Ex3-saisie.png)

*Détails* :  
Elle utilise un Scanner pour capturer la chaîne saisie par l'utilisateur.  
Elle retourne cette chaîne pour être utilisée dans d'autres parties du programme.

**Fonction: afficheChaine(String chaine)**

*Description* : Cette fonction affiche simplement la chaîne de caractères actuellement stockée.

![](captures/Exercice3/Ex3-afficher_chaine.png)

*Détails* :  
Elle prend la chaîne comme paramètre et l'affiche avec System.out.println().

**Fonction: inverserChaine(String chaine)**

*Description :* Cette fonction prend une chaîne en entrée et retourne sa version inversée.

![](captures/Exercice3/Ex3-inverser_chaine.png)

*Détails* :  
Elle utilise la classe StringBuilder pour inverser la chaîne, puis convertit le résultat en chaîne de caractères à l'aide de la méthode reverse().

**Fonction: nbMots(String chaine)**

*Description* : Cette fonction compte et retourne le nombre de mots dans la chaîne saisie.

![](captures/Exercice3/Ex3-nombre_mots.png)

*Détails* :  
Elle utilise la méthode split(" ") pour diviser la chaîne en fonction des espaces, puis retourne la longueur du tableau obtenu, qui correspond au nombre de mots dans la chaîne.  
Fonction: saisieCaractere()  
Description : Cette fonction attend que l'utilisateur appuie sur une touche avant de revenir au menu principal.  
   
*Détails* :  
Elle utilise un Scanner pour attendre une entrée de l'utilisateur, assurant une pause avant de retourner au menu après une opération.

**Fonction principale: main(String\[\] args)**

*Description* : C'est la méthode principale qui exécute le programme et gère l'interaction avec l'utilisateur à travers un menu. Elle permet de naviguer entre différentes options et d'appeler les fonctions appropriées en fonction du choix de l'utilisateur.

![](captures/Exercice3/Ex3-main.png)  
![](captures/Exercice3/Ex3-main_suite1.png)  
![](captures/Exercice3/Ex3-main_suite2.png)

*Détails* :  
Le programme utilise une boucle while qui reste active tant que l'utilisateur n'a pas choisi de quitter en saisissant "q".  
Pour chaque option, une méthode correspondante est appelée pour exécuter l'opération sélectionnée (saisie, affichage, inversion, ou comptage de mots).  
Il gère également des messages d'erreur si l'utilisateur essaie d'utiliser une option sans avoir d'abord saisi une chaîne.

*Exécution* :

![](captures/Exercice3/Ex3-exe1.png)  
![](captures/Exercice3/Ex3-exe2.png)
![](captures/Exercice3/Ex3-exe2.png)


![](captures/Exercice4/Ex4-ennoncé.png)  
*Introduction* :  
Ce programme a pour objectif de compter et d'afficher le nombre d'occurrences de chaque lettre de l'alphabet (minuscules) dans une chaîne de caractères saisie par l'utilisateur. Il est structuré de manière simple avec des fonctionnalités de saisie et de traitement de la chaîne, permettant à l'utilisateur de visualiser la fréquence des lettres dans le texte qu'il entre. Les principales étapes du programme sont :

*Saisie d'une chaîne de caractères* : L'utilisateur est invité à entrer une chaîne de texte.  
*Comptage des occurrences* : Le programme analyse la chaîne saisie et compte combien de fois chaque lettre de l'alphabet apparaît dans le texte.  
*Affichage des résultats* : Pour chaque lettre qui apparaît au moins une fois, le programme affiche le nombre d'occurrences.  
Ce programme est divisé en deux fonctions principales, qui sont orchestrées par la méthode main, garantissant un flux simple et compréhensible.

**Fonction: saisie()**

Description : Cette fonction permet de capturer la chaîne de caractères saisie par l'utilisateur.

![](captures/Exercice4/Ex4-saisie.png)

*Détails* :  
Elle affiche un message demandant à l'utilisateur de saisir une chaîne.  
Elle utilise un Scanner pour lire l'entrée de l'utilisateur depuis la console et retourne cette chaîne pour être traitée dans la suite du programme.

**Fonction nbOccurence(String chaine)**

*Description* : Cette fonction compte et affiche le nombre d'occurrences de chaque lettre de l'alphabet (minuscules) dans la chaîne saisie.

![](captures/Exercice4/Ex4-nbOccurence.png)

*Détails* :  
Un tableau nbOccurence de taille 26 (pour chaque lettre de l'alphabet) est utilisé pour stocker le nombre d'apparitions de chaque lettre.  
La chaîne est convertie en tableau de caractères (charArray) pour pouvoir être parcourue.  
Une double boucle est utilisée :  
La première boucle parcourt chaque lettre de l'alphabet (de 'a' à 'z').  
La deuxième boucle parcourt chaque caractère de la chaîne et compare si le caractère est égal à la lettre en cours dans la première boucle.  
Pour chaque lettre trouvée dans la chaîne, le programme incrémente le compteur correspondant dans le tableau nbOccurence.  
Si une lettre apparaît au moins une fois, le programme affiche le nombre d'occurrences de cette lettre.

**Fonction main(String\[\] args)**

Description : C'est la méthode principale du programme, qui orchestre l'exécution des différentes étapes.

![](captures/Exercice4/Ex4-main.png)

*Détails* :  
Elle appelle la fonction saisie() pour capturer la chaîne de caractères saisie par l'utilisateur.  
Elle passe cette chaîne à la fonction nbOccurence() pour compter et afficher le nombre d'occurrences de chaque lettre dans le texte.  
*Exécution* :  
![](captures/Exercice4/Ex4-exe.png)


🇬🇧 English
Report


Introduction:
This program aims to manage and display students' grades. It consists of a set of functions that meet several specific objectives:
Entering grades: The user can enter a series of grades that will be stored in an array.
Sorting grades: The entered grades are then sorted in ascending order to facilitate their analysis.
Displaying grades: Once sorted, the grades are displayed on the screen for the user to review.
Displaying maximum and minimum grades: The program calculates and displays the extreme values (the highest and lowest grades).
Calculating the average: Finally, a function calculates and displays the average of the entered grades.
These operations are distributed across different functions to make the code clearer, modular, and reusable.

All these functions are then gathered and called in a main function, which orchestrates the overall execution of the program. This allows each step to be handled separately while grouping them into a coherent process.

Function: saisieNotes

Description:
This function allows entering values for an array of floating-point numbers (float[]) from user input via the console.

![](captures/Exercice1/saisie_notes.png)

Details:
The function prompts the user to enter a series of values to fill the grades array. It uses a Scanner object to read user inputs. The for loop iterates through each index of the array, displays a message inviting the user to enter a value, and then reads and stores the entered value in the corresponding element of the array.

Note:
The function directly modifies the array passed as a parameter, filling its elements with the values entered by the user. It does not return any value.

Function: afficherNotes

Description:
This function displays the elements of an array of floating-point numbers (type float[]) line by line in the console.

![](captures/Exercice1/affiche_notes.png)

Details:
The function iterates through each element of the array tab using a for-each loop and displays each element using System.out.println(f), where f represents an element of the array.

Note:
This function does not return anything. It simply displays the elements of the array in the console.

Function: trier

Description:
This function sorts an array of floating-point numbers (type float[]) in ascending order.

![](captures/Exercice1/trie_notes.png)

Details:
The function uses the method Arrays.sort(tab) from the Arrays class to sort the elements of the array in ascending order. This method applies an optimized sorting algorithm.

Function: noteMax

This function searches for the maximum value (highest grade) in an array of floating-point numbers.

![](captures/Exercice1/note_max.png)

Details:
The function noteMax iterates through the grades array to find the maximum value and returns its index.
Note:
We chose to return the index rather than the value to have more control over this value.

Function: noteMin
The noteMin function searches for the minimum value (lowest grade) in an array of floating-point numbers.

![](captures/Exercice1/note_min.png)

Details:
This function takes an array as a parameter, allowing it to iterate to find the minimum value and return its index.
Note:
We chose to return the index rather than the value to have more control over this value.

Function: moyenne
The moyenne function calculates the average based on all elements in the array of floating-point numbers.

![](captures/Exercice1/moyenne_notes.png)

Details:
This function takes an array as a parameter, iterates over it to compute the sum, and finally returns the average.

Note:
We chose to return the average rather than display it, so it can be used elsewhere (in the main function).

Function: nbElements
The nbElements function calculates the occurrences of a value entered by the user in an array of floating-point numbers.

![](captures/Exercice1/nombre_element.png)

Details:
This function takes an array and a grade as parameters, which it searches for by iterating through the array passed as the first parameter. The function returns the number of occurrences of this value in the array.

Main Function: main
The main function executes the aforementioned functions and follows their sequence.

![](captures/Exercice1/main.png)

Execution:
![](captures/Exercice1/Ex1-exe1.png)
![](captures/Exercice1/Ex1-exe2.png)


Introduction:
This program aims to allow the automatic conjugation of first-group verbs in French. It consists of several functions that meet specific objectives:
Entering a verb: The user is prompted to enter a first-group verb (a verb ending in "er").
Verifying the verb: The program checks if the entered verb is indeed a first-group verb by ensuring it ends with "er".
Conjugating the verb: If the verb is valid, it is conjugated in the present indicative for the different personal pronouns (Je, Tu, Il/Elle/On, Nous, Vous, Ils/Elles).
These operations are implemented in various functions, making the code modular and easy to understand. The main function orchestrates all the steps, ensuring that the verb is first validated before being conjugated and displayed. This breakdown allows each part of the process to be handled distinctly while ensuring a coherent and smooth execution of the program.

Function: saisieVerbe()

Description: This function captures the input of a verb from the user.

![](captures/Exercice2/Ex2-saisie_verbe.png)

Details:
It uses a Scanner to read the user's input from the console.
It displays a message to the user asking them to enter a first-group verb.
It returns the entered string (the verb).

Function: verifierverbe(String verbe)

Description: This function checks if the entered verb is indeed a first-group verb, meaning it ends with "er".

![](captures/Exercice2/Ex2-verifier_verbe.png)

Details:
It retrieves the length of the verb with verbe.length().
It uses substring() to extract the last two letters of the verb and checks if they correspond to "er".
If the verb ends with "er", it returns true; otherwise, it returns false.

Function: conjuguer(String verbe)

Description: This function conjugates the given verb in the present indicative for the six personal pronouns (Je, Tu, Il/Elle/On, Nous, Vous, Ils/Elles).

![](captures/Exercice2/Ex2-conjuguer_verbe.png)

Details:
It removes the last two letters "er" from the verb to obtain the stem using verbe.substring(0, verbe.length()-2).
It concatenates this stem with the correct endings for each personal pronoun:
"Je": stem + "e"
"Tu": stem + "es"
"Il/Elle/On": stem + "e"
"Nous": stem + "ons"
"Vous": stem + "ez"
"Ils/Elles": stem + "ent"

It then displays the conjugation for each pronoun using System.out.println().

Main Function: main(String[] args)

Description: This is the main method that executes the program. It prompts the user to enter a first-group verb (ending in "er"), checks that it is indeed a first-group verb, and conjugates it if so.

![](captures/Exercice2/Ex2-main.png)

Details:
It calls the function saisieVerbe() to capture the user's input.
Then, it uses the method verifierverbe() to check that the entered verb is indeed a first-group verb (ending with "er").
If the verification is positive, it calls the method conjuguer() to display the conjugation of the entered verb.

Execution:

![](captures/Exercice2/Ex2-execution.png)

**Introduction:
This program aims to manage various operations on strings entered by the user. It allows interaction with the user through a menu and offers several functionalities around string manipulation, such as displaying, reversing, and counting the words in the string. It is designed modularly, with each functionality implemented in a distinct function, making the code clear and maintainable. The main functionalities are:
Entering a string: The user can enter a string that will then be used for other operations.
Displaying the string: Once the string is entered, it can be displayed using this option.
Reversing the string: The program allows reversing the string and displaying the result.
Counting words: The program can also count and display the number of words in the entered string.
These operations are organized around a menu that allows the user to choose the operation they wish to execute. User interaction management is smooth, and the program always returns to the menu after each operation until the user decides to exit.

Function: afficherMenu()

Description: This function displays the menu of available options for the user.

![](captures/Exercice3/Ex3-afficher_menu.png)

Details:
It displays a structured menu presenting the various operations that the user can perform: enter a string, display the string, reverse it, count words, or exit.

Function: saisieChaine()

Description: This function captures the input of a string from the user.

![](captures/Exercice3/Ex3-saisie.png)


Details:
It utilizes a Scanner to read the user's input from the console and returns the entered string.

Function: afficherChaine(String chaine)

Description: This function displays the entered string.

![](captures/Exercice3/Ex3-afficher_chaine.png)

Details:
It uses System.out.println(texte) to print the entered string in the console.

Function: inverserChaine(String chaine)

Description: This function reverses the entered string.

![](captures/Exercice3/Ex3-inverser_chaine.png)

Details:
It uses a StringBuilder to reverse the string and returns the reversed string using texte.reverse().toString().
Note:
StringBuilder is mutable, making it easy to reverse the string.

Function: compterMots(String chaine)

Description: This function counts the number of words in the entered string.

![](captures/Exercice3/Ex3-nombre_mots.png)
Details:
It splits the string into words using the split(" ") method.
It counts the number of resulting elements to return the number of words.

Main Function: main()

Description: This function manages the flow of the program, displaying the menu and handling user choices.

![](captures/Exercice3/Ex3-main.png)
![](captures/Exercice3/Ex3-main_suite1.png)
![](captures/Exercice3/Ex3-main_suite2.png)

Details:
It uses a loop to repeatedly display the menu until the user chooses to exit.
It captures user input and calls the corresponding function based on the chosen option.

Execution:
![](captures/Exercice3/Ex3-exe1.png)
![](captures/Exercice3/Ex3-exe2.png)
![](captures/Exercice3/Ex3-exe3.png)

Introduction:
This program aims to count and display the number of occurrences of each letter of the alphabet (lowercase) in a string entered by the user. It is structured simply with functionalities for input and processing the string, allowing the user to visualize the frequency of letters in the text they enter. The main steps of the program are:

Entering a string: The user is prompted to enter a text string.
Counting occurrences: The program analyzes the entered string and counts how many times each letter of the alphabet appears in the text.
Displaying results: For each letter that appears at least once, the program displays the number of occurrences.
This program is divided into two main functions, which are orchestrated by the main method, ensuring a straightforward and comprehensible flow.

Function: saisie()

Description: This function captures the string entered by the user.

![](captures/Exercice4/Ex4-saisie.png)

Details:
It displays a message asking the user to enter a string.
It uses a Scanner to read the user's input from the console and returns this string for further processing in the program.

Function: nbOccurence(String chaine)

Description: This function counts and displays the number of occurrences of each letter of the alphabet (lowercase) in the entered string.

![](captures/Exercice4/Ex4-nbOccurence.png)

Details:
An array nbOccurence of size 26 (for each letter of the alphabet) is used to store the number of appearances of each letter.
The string is converted to a character array (charArray) to allow traversal.
A double loop is used:
The first loop iterates through each letter of the alphabet (from 'a' to 'z').
The second loop iterates through each character of the string and compares whether the character is equal to the current letter in the first loop.
For each letter found in the string, the program increments the corresponding counter in the nbOccurence array.
If a letter appears at least once, the program displays the number of occurrences of that letter.

Function: main(String[] args)

Description: This is the main method of the program, orchestrating the execution of the different steps.

![](captures/Exercice4/Ex4-main.png)

Details:
It calls the saisie() function to capture the string entered by the user.
It passes this string to the nbOccurence() function to count and display the number of occurrences of each letter in the text.
Execution:

![](captures/Exercice4/Ex4-exe.png)