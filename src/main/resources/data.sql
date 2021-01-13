
INSERT INTO Galerie(id, nom, adresse) VALUES (1, 'Saatchi', 'King''s Road, Londres');
INSERT INTO Galerie(id, nom, adresse) VALUES (2, 'Galerie Castres', 'Place Soult');
INSERT INTO Galerie(id, nom, adresse) VALUES (3, 'Louvre', 'Paris');


INSERT INTO Exposition(id, debut, intitule, duree, galerie_id) VALUES (1, TO_DATE('2021/01/11', 'YYYY/MM/DD'), 'ExpoCastres', 20, 2);
INSERT INTO Exposition(id, debut, intitule, duree, galerie_id) VALUES (3, TO_DATE('2020/10/11', 'YYYY/MM/DD'), 'ExpoLondres', 30, 1);
INSERT INTO Exposition(id, debut, intitule, duree, galerie_id) VALUES (4, TO_DATE('2021/01/11', 'YYYY/MM/DD'), 'ExpoLouvre', 10, 3);


INSERT INTO Personne(id, nom, adresse) VALUES (1, 'Bastide', 'Place Jean Jaures, Castres');
INSERT INTO Personne(id, nom, adresse) VALUES (2, 'Rogers', '8 Rue Fuzies, Castres');
INSERT INTO Personne(id, nom, adresse) VALUES (3, 'DeVinci', 'Italie');


INSERT INTO Artiste(id, biographie) VALUES (3, 'Peint la Joconde');


INSERT INTO Tableau(id, titre, support, largeur, hauteur, artiste_id) VALUES (1, 'Joconde', 'toile', 1, 2, 3);
INSERT INTO Tableau(id, titre, support, largeur, hauteur, artiste_id) VALUES (2, 'Ciel Bleu', 'toile', 1, 2, 3);
INSERT INTO Exposition_Oeuvres(expositions_id, oeuvres_id) VALUES (4, 1);


INSERT INTO Transaction(id, vendu_le, prix_vente, acheteur_id, lieu_de_vente_id, tableau_id) VALUES (1, TO_DATE('2021/01/11', 'YYYY/MM/DD'), 2000000, 2, 4, 1);
INSERT INTO Transaction(id, vendu_le, prix_vente, acheteur_id, lieu_de_vente_id, tableau_id) VALUES (2, TO_DATE('2021/01/12', 'YYYY/MM/DD'), 1000, 1, 4, 2);


