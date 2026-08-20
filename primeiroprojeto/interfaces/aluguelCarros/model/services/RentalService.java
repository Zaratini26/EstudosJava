package primeiroprojeto.interfaces.aluguelCarros.model.services;

import primeiroprojeto.interfaces.aluguelCarros.model.entities.CarRental;
import primeiroprojeto.interfaces.aluguelCarros.model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double pricePerHour;
    private Double PricePerDay;
    private TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
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

    public TaxService getTaxService() {
        return taxService;
    }

    public void setTaxService(TaxService taxService) {
        this.taxService = taxService;
    }

    // Methods
    public void processInvoice(CarRental carRental){

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;

        double basePayment;

        if (hours <= 12) {
            basePayment = getPricePerHour() * Math.ceil(hours);
        } else {
            basePayment = getPricePerDay() * Math.ceil(hours / 24.0);
        }

        double tax = taxService.tax(basePayment);
        carRental.setInvoice(new Invoice(basePayment, tax));
        }
    }