-- Initialisation spécifiques pour un jeu de test
INSERT INTO Galerie(id, nom, adresse) VALUES 
(1, 'Saatchi', 'King s Road, Londres');


INSERT INTO Exposition(id, debut, intitule, duree) VALUES 
(1, TO_DATE('2021/01/11', 'YYYY/MM/DD'), 'ExpoCastres', 20),
(2, TO_DATE('2021/02/22', 'YYYY/MM/DD'), 'ExpoAlbi', 20),
(3, TO_DATE('2020/10/11', 'YYYY/MM/DD'), 'ExpoToulouse', 30);


INSERT INTO Personne(id, nom, adresse) VALUES 
(1, 'Bastide', 'Place Jean Jaures, Castres'),
(2, 'Rogers', '8 Rue Fuzies, Castres');

