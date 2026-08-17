package primeiroprojeto.excecoes.hostel.application;

import primeiroprojeto.excecoes.hostel.entities.Reservation;
import primeiroprojeto.excecoes.hostel.exceptions.DomainException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Room number: ");
            int room = sc.nextInt();

            LocalDate checkIn = LocalDate.parse(sc.next(), dtf);
            LocalDate checkOut = LocalDate.parse(sc.next(), dtf);

            Reservation reservation = new Reservation(room, checkIn, checkOut);
            System.out.println(reservation);

            System.out.println("\nEnter data to update the reservation:");
            checkIn = LocalDate.parse(sc.next(), dtf);
            checkOut = LocalDate.parse(sc.next(), dtf);

            reservation.updateDates(checkIn, checkOut);
            System.out.println(reservation);
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input format. Room number must be an integer.");
        }
        catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use DD/MM/YYYY.");
        }
        catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error!");
        }
    }
}