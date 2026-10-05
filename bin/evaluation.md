# Évaluation — Environnement de travail, Git & Algorithmique Java
**Titre Professionnel CDA — Modules 1.1 et 1.2**

Ce test comporte **52 questions** réparties en 4 parties, dans l'ordre des supports fournis :
- **Partie A** — Environnement de travail (JDK/JRE/JVM, VS Code) — 12 questions
- **Partie B** — Git : notions et commandes essentielles — 12 questions
- **Partie C** — Git : commandes avancées (branches, stash, remote, tags, annulation) — 14 questions
- **Partie D** — Algorithmique & Java fondamental (Module 1.2) — 14 questions

Types de questions : QCM (une seule bonne réponse sauf mention contraire), vrai/faux, et questions ouvertes courtes.
Le corrigé se trouve à la fin de chaque partie.

---

## Partie A — Environnement de travail

**A1.** Que signifie le sigle JDK ?
a) Java Default Kit
b) Java Development Kit
c) Java Deployment Kit
d) Java Debug Kit

**A2.** Classez ces trois éléments du plus "englobant" au plus "restreint" : JRE, JDK, JVM.

**A3.** Quel élément permet à un programme Java de s'exécuter sur n'importe quel système d'exploitation ?
a) Le compilateur javac
b) La JVM
c) Maven
d) Git

**A4.** Vrai ou faux : le JRE seul suffit pour développer une application Java.

**A5.** Quelle commande affiche la version du JDK installé ?
a) `java --help`
b) `java -version`
c) `jdk --check`
d) `javac --run`

**A6.** Quelle distribution du JDK est installée dans le Module 1.1, et pour quelle version (numéro et type de support) ?

**A7.** À quoi sert la variable d'environnement `JAVA_HOME` ?

**A8.** Sous PowerShell, quelle commande permet de vérifier la valeur de `JAVA_HOME` ?

**A9.** Dans Visual Studio Code, quelle extension officielle (éditeur Microsoft) regroupe les outils nécessaires au développement Java ?
a) Java Booster
b) Extension Pack for Java
c) Code Runner Java
d) JDK Helper

**A10.** Citez deux des six extensions incluses automatiquement dans ce pack, et leur rôle respectif.

**A11.** Quel réglage de VS Code permet d'activer un thème à fort contraste pour l'accessibilité ?
a) `editor.fontSize`
b) `workbench.colorTheme`
c) `editor.accessibilitySupport`
d) `window.zoomLevel`

**A12.** Vrai ou faux : à l'installation, VS Code sait nativement compiler et exécuter du Java, sans aucune extension.

### Corrigé — Partie A
A1. b) Java Development Kit
A2. JDK (contient) → JRE (contient) → JVM
A3. b) La JVM
A4. Faux — le JRE seul suffit pour *exécuter* une application déjà compilée, mais pas pour la développer (il manque javac et le débogueur).
A5. b) `java -version`
A6. Eclipse Temurin, JDK 21 (LTS — Long Term Support).
A7. Elle indique aux autres logiciels (Maven, VS Code...) l'emplacement exact où le JDK est installé sur le disque.
A8. `echo $env:JAVA_HOME`
A9. b) Extension Pack for Java
A10. Par exemple : Language Support for Java (Red Hat) → coloration syntaxique, autocomplétion, détection d'erreurs ; Debugger for Java → déboguer (points d'arrêt, pas à pas) ; Maven for Java → intègre les commandes Maven ; Test Runner for Java → exécute les tests JUnit ; Project Manager for Java → gestion de plusieurs projets ; Visual Studio IntelliCode → suggestions contextuelles.
A11. b) `workbench.colorTheme`
A12. Faux — VS Code n'est à l'installation qu'un éditeur généraliste ; c'est l'ajout d'extensions qui en fait un environnement Java complet.

---

## Partie B — Git : notions et commandes essentielles

**B1.** Quelles sont les quatre zones successives du cycle de vie d'un fichier avec Git ?

**B2.** Quelle commande transforme un dossier ordinaire en un nouveau dépôt Git ?

**B3.** Quelle commande prépare un fichier pour le prochain commit ?
a) `git commit`
b) `git add`
c) `git push`
d) `git init`

**B4.** Quelle est la différence essentielle entre `git commit` et `git push` ?
a) Il n'y a aucune différence
b) commit valide localement, push envoie vers le dépôt distant
c) push valide localement, commit envoie vers le dépôt distant
d) Les deux ne concernent que GitHub

**B5.** Quelles sont les deux commandes de configuration initiale de l'identité Git (avant tout premier usage) ?

**B6.** À quoi sert l'option `--global` dans `git config --global user.name "..."` ?

**B7.** Que fait la commande `git status` ?

**B8.** Quelle est la différence entre `git diff` (sans option) et `git diff --staged` ?

**B9.** Que fait l'option `-am "message"` de `git commit` ? Que ne fait-elle *pas* ?

**B10.** À quoi sert `git commit --amend`, et quelle précaution majeure faut-il respecter avant de l'utiliser ?

**B11.** Quelle commande affiche l'historique des commits sous forme condensée, une ligne par commit, avec toutes les branches et un graphe visuel ?

**B12.** Vrai ou faux : `git add .` ajoute uniquement les fichiers déjà connus de Git (déjà suivis), pas les nouveaux fichiers.

### Corrigé — Partie B
B1. Répertoire de travail → Zone d'index (staging) → Dépôt local → Dépôt distant.
B2. `git init`
B3. b) `git add`
B4. b) commit valide localement, push envoie vers le dépôt distant
B5. `git config --global user.name "Prénom Nom"` et `git config --global user.email "adresse@exemple.fr"`
B6. Elle applique le réglage à tous les projets du poste (sinon le réglage ne s'applique qu'au dépôt courant, en configuration locale, prioritaire sur la globale).
B7. Elle affiche l'état actuel des fichiers : non suivis, modifiés, préparés (staging), ou sans changement.
B8. `git diff` compare le répertoire de travail à la zone de staging (modifications non encore ajoutées) ; `git diff --staged` compare la zone de staging au dernier commit (modifications déjà ajoutées, pas encore commit).
B9. `-a` ajoute automatiquement tous les fichiers déjà suivis et modifiés, combiné à `-m` pour le message ; elle n'ajoute PAS les nouveaux fichiers non suivis.
B10. Elle modifie le tout dernier commit (message et/ou fichiers) au lieu d'en créer un nouveau. Précaution : ne jamais l'utiliser sur un commit déjà envoyé (push) et récupéré par d'autres, car cela réécrit l'historique et provoque des conflits.
B11. `git log --oneline --graph --all`
B12. Faux — `git add .` ajoute absolument tout (fichiers modifiés ET nouveaux fichiers non suivis) dans le dossier courant et ses sous-dossiers.

---

## Partie C — Git : commandes avancées

**C1.** Quelle est la différence entre `git checkout nom-branche` et `git checkout -b nouvelle-branche` ?

**C2.** Quelle commande moderne remplace `git checkout` pour changer de branche, introduite pour séparer clairement cet usage de la restauration de fichiers ?

**C3.** Quelle est la différence entre une fusion *fast-forward* et une fusion *three-way* ?

**C4.** Dans un conflit de fusion, que représentent les marqueurs `<<<<<<<`, `=======` et `>>>>>>>` ?

**C5.** Après avoir résolu manuellement un conflit dans un fichier, quelles sont les deux étapes à réaliser pour terminer la fusion ?

**C6.** À quel problème répond la commande `git stash` ?

**C7.** Quelle est la différence entre `git stash pop` et `git stash apply` ?

**C8.** Vrai ou faux : un stash est envoyé automatiquement vers le dépôt distant lors du prochain `git push`.

**C9.** Quelle commande faut-il utiliser pour associer manuellement un dépôt distant à un dépôt créé avec `git init` (dépôt qui n'a donc pas été cloné) ?

**C10.** Quelle est la différence entre `git fetch` et `git pull` ?

**C11.** Pourquoi faut-il éviter `git push --force` sur une branche partagée, et quelle alternative plus sûre existe-t-il ?

**C12.** Quelle commande crée un tag *annoté* (avec message, auteur et date), par opposition à un tag simple (lightweight) ?

**C13.** Complétez le tableau suivant sur `git reset` :

| Option | Effet sur les commits | Effet sur le staging | Effet sur le répertoire de travail |
|---|---|---|---|
| `--soft` | ? | ? | ? |
| `--hard` | ? | ? | ? |

**C14.** Quelle est la différence fondamentale entre `git reset` et `git revert`, et laquelle des deux est adaptée à un commit déjà partagé avec l'équipe ?

### Corrigé — Partie C
C1. `git checkout nom-branche` bascule simplement sur une branche existante ; `git checkout -b nouvelle-branche` crée une nouvelle branche ET bascule dessus en une seule commande.
C2. `git switch` (avec `git switch -c` pour créer et basculer).
C3. Fast-forward : aucun nouveau commit n'a été ajouté sur la branche receveuse depuis la création de la branche fusionnée, donc la branche avance simplement, sans commit de fusion. Three-way : la branche receveuse a continué d'évoluer en parallèle, donc un commit de fusion supplémentaire (à deux parents) est créé.
C4. Ils délimitent les deux versions en désaccord : le contenu entre `<<<<<<<` et `=======` correspond à la version locale (HEAD), et le contenu entre `=======` et `>>>>>>>` correspond à la version entrante (branche fusionnée).
C5. Ajouter le(s) fichier(s) résolu(s) avec `git add`, puis terminer avec `git commit` (le message de fusion est pré-rempli automatiquement).
C6. Il permet de mettre de côté temporairement des modifications en cours non terminées et non commit, par exemple pour changer de branche en urgence sans les perdre ni les valider prématurément.
C7. `git stash pop` réapplique le stash le plus récent ET le retire de la liste ; `git stash apply` le réapplique mais le conserve dans la liste.
C8. Faux — un stash reste strictement local au poste, il n'est jamais partagé avec le dépôt distant.
C9. `git remote add origin URL`
C10. `git fetch` télécharge les nouveaux commits distants sans les fusionner (ils restent en attente pour inspection) ; `git pull` équivaut à un `fetch` immédiatement suivi d'un `merge` (ou `rebase`), donc fusionne automatiquement.
C11. Parce que cela écrase l'historique distant et peut faire disparaître le travail d'un collègue sans avertissement. Alternative plus sûre : `--force-with-lease`, qui refuse d'écraser si quelqu'un d'autre a poussé entre-temps.
C12. `git tag -a v1.0.0 -m "message"`
C13.

| Option | Effet sur les commits | Effet sur le staging | Effet sur le répertoire de travail |
|---|---|---|---|
| `--soft` | Annulés (redeviennent non commit) | Conservé tel quel | Inchangé |
| `--hard` | Annulés | Vidé | Réinitialisé (modifications perdues définitivement) |

C14. `git reset` réécrit l'historique (supprime/déplace des commits), à éviter sur du contenu déjà partagé ; `git revert` crée un nouveau commit qui annule l'effet d'un commit précédent, sans rien effacer de l'historique — c'est donc `git revert` qui est adapté à un commit déjà partagé.

---

## Partie D — Algorithmique & Java fondamental

**D1.** Quels sont les quatre types de variables à déclarer pour se présenter (Exercice 1.1) ? Citez un type Java pour chacun.

**D2.** Pourquoi déclare-t-on `PI` avec le mot-clé `final` dans l'exercice du cercle ?

**D3.** Sans utiliser de condition `if`, comment peut-on afficher directement si un nombre est pair, à l'aide de l'opérateur `%` ?

**D4.** Que se passe-t-il lorsqu'on convertit (cast) un `double` comme `19.99` en `int` ? Quel est le résultat ?

**D5.** Écrivez la condition (opérateur de comparaison) permettant d'afficher "Majeur" si `age` est supérieur ou égal à 18.

**D6.** Dans l'exercice "Note en lettre", pourquoi l'ordre des conditions (`>= 16`, puis `>= 12`, puis `>= 10`) est-il important ?

**D7.** Citez les deux formes de `switch` évoquées pour l'exercice "Jour de la semaine" (classique et moderne).

**D8.** Quelle boucle est la plus adaptée pour afficher une table de multiplication de 1 à 10, et pourquoi ?

**D9.** Quelle est la différence structurelle entre une boucle `for` classique et une boucle `for-each`, notamment pour parcourir un tableau ?

**D10.** Dans l'exercice du triangle d'étoiles (boucles imbriquées), quel est le rôle de la boucle extérieure et celui de la boucle intérieure ?

**D11.** Que renvoie la méthode `containsKey` d'une `Map<String, String>`, et à quoi sert-elle dans l'exercice du dictionnaire des capitales ?

**D12.** Pourquoi utilise-t-on un `StringBuilder` plutôt qu'une simple concaténation de `String` pour reconstituer une phrase mot par mot ?

**D13.** Dans l'exercice CompteBancaire, que doit faire la méthode `retirer(double montant)` si le solde est insuffisant ?

**D14.** Dans l'exercice sur le polymorphisme (Forme, Cercle, Carré), pourquoi peut-on parcourir un tableau `Forme[]` et appeler `calculerAire()` sur chaque élément "sans jamais tester leur type exact" ?

### Corrigé — Partie D
D1. Prénom (`String`), âge (`int`), taille en mètres (`double`), booléen indiquant la majorité (`boolean`).
D2. Parce que `PI` est une constante mathématique dont la valeur ne doit jamais changer pendant l'exécution du programme ; `final` empêche toute réaffectation.
D3. En affichant directement le résultat booléen de l'expression, par exemple `System.out.println(nombre % 2 == 0);` — l'opérateur `==` produit déjà `true` ou `false`, sans besoin de `if`.
D4. La partie décimale est tronquée (pas arrondie) : `19.99` devient `19`.
D5. `age >= 18`
D6. Parce que les conditions sont évaluées dans l'ordre avec des `else if` : si on testait `>= 10` en premier, une note de 18 serait classée "Passable" au lieu d'"Excellent" — il faut donc aller du seuil le plus élevé au plus faible.
D7. La forme classique (`switch` avec `case` et `break`) et la forme moderne (syntaxe fléchée `->` introduite dans les versions récentes de Java).
D8. La boucle `for`, car le nombre d'itérations (de 1 à 10) est connu à l'avance — c'est le cas d'usage typique du `for`.
D9. La boucle `for` classique utilise un compteur et un indice explicite (`for (int i = 0; i < tableau.length; i++)`), permettant d'accéder à la position ; la boucle `for-each` parcourt directement chaque élément du tableau sans indice explicite (`for (int valeur : tableau)`), plus simple mais sans accès direct à la position.
D10. La boucle extérieure contrôle le numéro de la ligne (combien de lignes au total) ; la boucle intérieure contrôle le nombre d'étoiles affichées sur cette ligne précise.
D11. Elle renvoie un booléen indiquant si une clé donnée existe dans la Map ; elle sert ici à vérifier si "Allemagne" fait partie des pays déjà présents comme clés, sans provoquer d'erreur si la clé est absente.
D12. Parce qu'une concaténation répétée de `String` (immuables) crée un nouvel objet à chaque opération, ce qui est coûteux en performance ; `StringBuilder` est mutable et conçu pour construire une chaîne progressivement de façon efficace.
D13. Elle doit afficher un message d'erreur indiquant que le solde est insuffisant, et NE PAS effectuer le retrait dans ce cas (le solde ne doit pas devenir négatif).
D14. Grâce au polymorphisme : chaque sous-classe (`Cercle`, `Carre`) redéfinit `calculerAire()` avec `@Override` selon sa propre formule, et Java appelle automatiquement, à l'exécution, la bonne version de la méthode correspondant au type réel de l'objet — c'est le principe même du polymorphisme, qui évite d'avoir à tester le type manuellement.

---

## Barème indicatif
- 45-52 bonnes réponses : maîtrise solide, prêt(e) pour les ateliers de synthèse.
- 35-44 : bonne base, revoir les points faibles avant de continuer.
- Moins de 35 : recommandé de relire les supports correspondants avant de poursuivre.
