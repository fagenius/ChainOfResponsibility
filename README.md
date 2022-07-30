# ChainOfResponsibility
Design pattern Chain Responsibility

Passer une requête à travers une chaîne d'objets candidats jusqu'à ce que l'un d'entre eux puisse traiter la requête.
Problème
 Plusieurs objets peuvent possiblement répondre à une requête
 Le client n'est pas en mesure de choisir un répondant 
 On veut permettre aux répondants candidats de répondant à la requête tout en conservant un couplage faible entre le client et les candidats
