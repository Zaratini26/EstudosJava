package primeiroprojeto.interfaces.aluguelCarros.model.services;

import primeiroprojeto.interfaces.aluguelCarros.model.entities.CarRental;
import primeiroprojeto.interfaces.aluguelCarros.model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double pricePerHour;
    private Double PricePerDay;
    private BrazilTaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
        this.pricePerHour = pricePerHour;
        PricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Double getPricePerDay() {
        return PricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        PricePerDay = pricePerDay;
    }

    public BrazilTaxService getTaxService() {
        return taxService;
    }

    public void setTaxService(BrazilTaxService taxService) {
        this.taxService = taxService;
    }

    // Methods
    public void processInvoice(CarRental carRental){

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;

        double basePayment;

        if (hours < 12) {
            long hoursPrice = (long) Math.ceil(hours);
            basePayment = getPricePerHour() * hoursPrice;
        } else {
            long dias = (long) Math.ceil(hours / 24.0);
            basePayment = getPricePerDay() * dias;
        }

        carRental.setInvoice(new Invoice(basePayment, getTaxService().tax(basePayment)));

        }
    }