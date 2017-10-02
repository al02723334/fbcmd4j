package fbcmj4;

import java.io.IOException;
import java.util.Scanner;

import facebook4j.FacebookException;

public class Main {
	public static void main(String[] args) throws FacebookException, IOException, GenericError {
		FbAdapter fb = new FbAdapter();
		Scanner input = new Scanner(System.in);
		boolean next = true;

		while (next) {
			System.out.println("Cliente de FB v1.0");
			System.out.println("Menu:");
			System.out.println("\t1 - Configurar usuario");
			System.out.println("\t2 - Ver usuario");
			System.out.println("\t3 - Ver newsfeed");
			System.out.println("\t4 - Ver wall");
			System.out.println("\t5 - Publicar Estado");
			System.out.println("\t6 - Publicar link");
			System.out.println("\t7 - Salir");
			String op = input.nextLine();

			switch (op) {
			case "1":
				String newToken = SettingsManager.LoginProccess(input);
				fb.changeUser(newToken);
				break;
			case "3":
				fb.verNewsFeed();
				break;
			case "7":
				next = false;
				break;
			default:
				System.out.println("Opcion o valida");
				break;
			}
		}
	}
}
