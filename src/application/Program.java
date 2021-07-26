package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.JuridicalPerson;
import entities.Person;
import entities.PrivatePerson;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> listPerson = new ArrayList<Person>();
		
		System.out.print("Enter the number of tax payers: ");
		int quant = sc.nextInt();
		
		int i = 1;
		while (i <= quant) {
			System.out.print("Tax payer #" + i + " data\n");
			System.out.print("Individual or company (i/c)");
			char person = sc.next().toUpperCase().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anuIncome = sc.nextDouble();
			
			if (person == 'I') {
				System.out.print("Health expenditures: ");
				double heaExpend = sc.nextDouble();
				
				listPerson.add(new PrivatePerson(name, anuIncome, heaExpend));
				
			} else if (person == 'C') {
				System.out.print("Number of employee: ");
				int numEmp = sc.nextInt();
				
				listPerson.add(new JuridicalPerson(name, anuIncome, numEmp));
			}
			
			i++;
		}
		
		for (Person p : listPerson) {
			System.out.println(p.getName() + " $ " + String.format("%.2f", p.impost()));
		}
		
	}
}
