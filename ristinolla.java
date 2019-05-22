

import java.util.Scanner;

public class ristinolla {

	public static void main(String[] args) {

		Scanner lukija = new Scanner(System.in);

		// luodaan muuttujat, joilla voidaan merkit‰ tietty‰ pelaajaa
		String pelaaja1, pelaaja2;

		// Upeaa java-arttia
		System.out.println(
				"***********                                          **              ***                       ***");

		System.out.println(
				"***********                                         ***              ***                       ***");

		System.out.println(
				"***********                                         ***              ***                       ***");

		System.out.println(
				"    ***       *****    *** ** ***   ***    *****   ****** ***   ***  ***    *****      *****   ***");

		System.out.println(
				"    ***      *******   ****** ***   ***   *******  ****** ***   ***  ***   *******    *******  ***");

		System.out.println(
				"    ***     ***   ***  ****   ***   ***  ***   ***  ***   ***   ***  ***  **** ****  **   ***  ***");

		System.out.println(
				"    ***     ***   ***  ***     *** ***   ***   ***  ***   ***   ***  ***  ***   ***      ****  ***");

		System.out.println(
				"    ***     *********  ***     *** ***   *********  ***   ***   ***  ***  ***   ***    ******   * ");

		System.out.println(
				"    ***     *********  ***      ** **    *********  ***   ***   ***  ***  ***   ***   *** ***   * ");

		System.out.println(
				"    ***     ***        ***      *****    ***        ***   ***   ***  ***  ***   ***  ***  ***     ");

		System.out.println(
				"    ***     ***   ***  ***      *****    ***   ***  ***   ***  ****  ***  **** ****  ***  ***  ***");

		System.out.println(
				"    ***      *******   ***       ***      *******   ***** *********  ***   *******   ********  ***");

		System.out.println(
				"    ***       *****    ***       ***       *****     ****  **** ***  ***    *****     **** *** *** ");

		System.out.println("                                     pelamaan ristinollaa!");

		System.out.println();

		// kysyt‰‰n pelaajien nimet
		System.out.print("Anna ensimm‰isen pelaajan nimi: ");

		pelaaja1 = lukija.nextLine();

		System.out.print("Anna toisen pelaajan nimi: ");

		pelaaja2 = lukija.nextLine();

		System.out.println();
		
		// Alustetaan muuttuja johon tulee arvo k‰ytt‰j‰n syˆtt‰m‰st‰ paikasta, mihin vuorolla oleva siirto sijoitetaan
		int k;

		
		// muuttuja uusi, jolla voidaan myˆhemmin aloittaa peli alusta, toimii ns. true muuttujana pelin toimimisen kannalta.
		// Jos pelaaja pelin p‰‰tytty‰ syˆtt‰‰ uusi muuttujalle toisen arvon kuin "kyll‰" peli keskeytyy.
		
		String uusi = "kyll‰";

		// aloitetaan peli, luodaan taulukko johon sijoitetaan myˆhemmin tietoa siit‰, mihin k‰ytt‰j‰ k‰ytt‰‰ vuronsa
		for (; uusi.equalsIgnoreCase("kyll‰");) {

			String Taulukko[] = new String[9];

			Taulukko[0] = "1";

			Taulukko[1] = "2";

			Taulukko[2] = "3";

			Taulukko[3] = "4";

			Taulukko[4] = "5";

			Taulukko[5] = "6";

			Taulukko[6] = "7";

			Taulukko[7] = "8";

			Taulukko[8] = "9";

			System.out.println("-------------------");

			System.out.println("|  1  |  2  |  3  |");

			System.out.println("-------------------");

			System.out.println("|  4  |  5  |  6  |");

			System.out.println("-------------------");

			System.out.println("|  7  |  8  |  9  |");

			System.out.println("-------------------");
			
			// aloitetaan loop, joka kiert‰‰ enent‰‰n 9 kierrosta, sill‰ ristinollassa 
			// on 9 eri paikkaa mihin voi sijoittaa tietoa

			for (int i = 1; i <= 9; i++) {

				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 9) {

					// loop jolla tarkastetaan, ett‰ pelaajan syˆtt‰m‰ arvo on validi
					for (;;) {

						System.out.println();

						System.out.println(pelaaja1 + " mihin ruutuun laitetaan X? Anna numero: ");

						k = lukija.nextInt();

						// varmisteaan ett‰ syˆtetty luku on taulukon arvojen sis‰puolella
						if (k < 10 && k > 0) {

							for (;;) {
									// varmistetaan sitke‰sti, ett‰ ruutu on "tyhj‰"
								if (Taulukko[k - 1] == "X" || Taulukko[k - 1] == "O") {

									System.out.println(
											"Et voi laittaa ruutuun, koska ruutu on varattu. Yrit‰ uudelleen: ");

									k = lukija.nextInt();

								}
									// jos ruutu on vapaa, sijoitetaan X pelaajan valitsemalle paikalle
								else {
									Taulukko[k - 1] = "X";

									break;
								}

							}

							break;

						}

						// jos annetaan jokin muu arvo kuin kokonaisluku 1-9 v‰lilt‰ tulostetaan taulukko uudelleen
						// ja pyydet‰‰n k‰ytt‰j‰‰ yritt‰m‰‰n uudelleen, toistetaan tarvittaessa.
						else {

							System.out.println("-------------------");

							System.out.println(
									"|  " + Taulukko[0] + "  |  " + Taulukko[1] + "  |  " + Taulukko[2] + "  |");

							System.out.println("-------------------");

							System.out.println(
									"|  " + Taulukko[3] + "  |  " + Taulukko[4] + "  |  " + Taulukko[5] + "  |");

							System.out.println("-------------------");

							System.out.println(
									"|  " + Taulukko[6] + "  |  " + Taulukko[7] + "  |  " + Taulukko[8] + "  |");

							System.out.println("-------------------");

							System.out.println("Yrit‰ uudelleen: ");

						}

					}

				}
				// tarkastetaan voittiko pelaaja1 pelin
				// verrataan eri kohtia taulukossa onko niiden arvo X 
				// jos kolmen per‰kk‰isen, pystyss‰ olevan tai  viistoittain olevan ruudun arvo on X
				// pelaaja julistetaan voittajaksi, muutoin peli jatkuu.
				if (Taulukko[0] == "X" && Taulukko[1] == "X" && Taulukko[2] == "X"

						|| Taulukko[3] == "X" && Taulukko[4] == "X" && Taulukko[5] == "X"

						|| Taulukko[6] == "X" && Taulukko[7] == "X" && Taulukko[8] == "X"

						|| Taulukko[0] == "X" && Taulukko[3] == "X" && Taulukko[6] == "X"

						|| Taulukko[1] == "X" && Taulukko[4] == "X" && Taulukko[7] == "X"

						|| Taulukko[2] == "X" && Taulukko[5] == "X" && Taulukko[8] == "X"

						|| Taulukko[0] == "X" && Taulukko[4] == "X" && Taulukko[8] == "X"

						|| Taulukko[2] == "X" && Taulukko[4] == "X" && Taulukko[6] == "X") {

					System.out.println(pelaaja1 + " VOITTAAA!");
					
					// tulostetaan ruudukko

					System.out.println("-------------------");

					System.out.println("|  " + Taulukko[0] + "  |  " + Taulukko[1] + "  |  " + Taulukko[2] + "  |");

					System.out.println("-------------------");

					System.out.println("|  " + Taulukko[3] + "  |  " + Taulukko[4] + "  |  " + Taulukko[5] + "  |");

					System.out.println("-------------------");

					System.out.println("|  " + Taulukko[6] + "  |  " + Taulukko[7] + "  |  " + Taulukko[8] + "  |");

					System.out.println("-------------------");

					break;

				}
				// tarkastetaan onko vuoro parillinen vuoro, jos on niin pelaajan2, eli O:n vuoro
				if (i == 2 || i == 4 || i == 6 || i == 8) {
					// k‰ytet‰‰n samaa toimintatapaa kuin X vuorollakin.
					for (;;) {

						System.out.println();

						System.out.println(pelaaja2 + " mihin ruutuun laitetaan O? Anna numero: ");

						k = lukija.nextInt();

						if (k < 10 && k > 0) {

							for (;;) {

								if (Taulukko[k - 1] == "X" || Taulukko[k - 1] == "O") {

									System.out.println(
											"Et voi laittaa ruutuun, koska ruutu on varattu. Yrit‰ uudelleen: ");

									k = lukija.nextInt();

								}

								else {
									Taulukko[k - 1] = "O";

									break;
								}

							}

							break;

						}

						else {

							System.out.println("-------------------");

							System.out.println(
									"|  " + Taulukko[0] + "  |  " + Taulukko[1] + "  |  " + Taulukko[2] + "  |");

							System.out.println("-------------------");

							System.out.println(
									"|  " + Taulukko[3] + "  |  " + Taulukko[4] + "  |  " + Taulukko[5] + "  |");

							System.out.println("-------------------");

							System.out.println(
									"|  " + Taulukko[6] + "  |  " + Taulukko[7] + "  |  " + Taulukko[8] + "  |");

							System.out.println("-------------------");

							System.out.println("Yrit‰ uudelleen: ");

						}

					}
					
					Taulukko[k - 1] = "O";
					// j‰lleen tarkastetaan voittiko pelaaj2, eli O.
					if (Taulukko[0] == "O" && Taulukko[1] == "O" && Taulukko[2] == "O"

							|| Taulukko[3] == "O" && Taulukko[4] == "O" && Taulukko[5] == "O"

							|| Taulukko[6] == "O" && Taulukko[7] == "O" && Taulukko[8] == "O"

							|| Taulukko[0] == "O" && Taulukko[3] == "O" && Taulukko[6] == "O"

							|| Taulukko[1] == "O" && Taulukko[4] == "O" && Taulukko[7] == "O"

							|| Taulukko[2] == "O" && Taulukko[5] == "O" && Taulukko[8] == "O"

							|| Taulukko[0] == "O" && Taulukko[4] == "O" && Taulukko[8] == "O"

							|| Taulukko[2] == "O" && Taulukko[4] == "O" && Taulukko[6] == "O") {

						System.out.println(pelaaja2 + " VOITTAAA!");

						System.out.println("-------------------");

						System.out.println("|  " + Taulukko[0] + "  |  " + Taulukko[1] + "  |  " + Taulukko[2] + "  |");

						System.out.println("-------------------");

						System.out.println("|  " + Taulukko[3] + "  |  " + Taulukko[4] + "  |  " + Taulukko[5] + "  |");

						System.out.println("-------------------");

						System.out.println("|  " + Taulukko[6] + "  |  " + Taulukko[7] + "  |  " + Taulukko[8] + "  |");

						System.out.println("-------------------");

						break;

					}

				}

					// jos kierroksia tulee t‰yteen 9 ja voittajaa ei ole lˆytynyt
					// p‰‰tet‰‰n peli tasapeliin
				else if (i == 9) {

					System.out.println("Tasapeli");

				}

				System.out.println("-------------------");

				System.out.println("|  " + Taulukko[0] + "  |  " + Taulukko[1] + "  |  " + Taulukko[2] + "  |");

				System.out.println("-------------------");

				System.out.println("|  " + Taulukko[3] + "  |  " + Taulukko[4] + "  |  " + Taulukko[5] + "  |");

				System.out.println("-------------------");

				System.out.println("|  " + Taulukko[6] + "  |  " + Taulukko[7] + "  |  " + Taulukko[8] + "  |");

				System.out.println("-------------------");

			}

			lukija.nextLine();
			// kysell‰‰n mahdollisesta uudesta pelikierroksesta.
			System.out.println("Jos haluat uuden pelin kirjoita \"kyll‰\"");

			uusi = lukija.nextLine();

		}
		// jos muuttuja "uusi" saa arvokseen muuta kuin "kyll‰" peli lopetetaan, ohjelma ei ole case sensitive asian suhteen.
		System.out.println("Lopetit pelaamisen.");

	}

}
