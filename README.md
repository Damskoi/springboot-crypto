# Spring Boot Crypto - Mutual Authentication

Ce projet implémente *X.509 Authentication* de spring. Elle permet au serveur de vérifier l'identité d'un client lorsqu'il tente d'y accéder à travers un protocole HTTPS. Cette application possède son propre *self signed certificat autority* qu'elle utilise pour signer d'autres certificats. Le serveur n'autorise l'accès qu' clients avec un certificat .

Deux ont été et (réconnu par le CA):

- Bob
- Dupond

Le fichier __Procedure-teste-locale-x509-mutual-authentication-rootCA.docx__ décrit comment tester l'application en local sur sa machine.