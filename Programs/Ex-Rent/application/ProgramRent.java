package application;

import java.util.Scanner;

import entities.Rent;

//Programa realiza o cadastro de 10 quartos alugados

public class ProgramRent {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("How many rooms will be rented?");
		int n = input.nextInt();

		Rent[] room = new Rent[10];

		for (int i = 0; i < n; i++) {

			input.nextLine();

			System.out.print("Name: ");
			String name = input.nextLine();

			System.out.print("Email:");
			String email = input.nextLine();

			System.out.print("Number room: ");
			int number = input.nextInt();

			room[number] = new Rent(name, email);

		}

		System.out.print("\nBusy rooms:\n");

		for (int i = 0; i < 10; i++) {

			if (room[i] != null) {

				System.out.println(i + ": " + room[i]);

			}

		}

		input.close();
	}

}
