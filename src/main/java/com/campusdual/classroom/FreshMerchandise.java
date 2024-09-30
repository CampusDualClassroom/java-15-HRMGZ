package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    private final Date expirationDate;

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expiration) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expiration;
    }

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    public Object getSpecificData() {
        StringBuilder data = new StringBuilder();
        System.out.println("\n--- Información del Producto ---\n");
        data.append("Localizacion: ");
        data.append(getLocation());
        data.append("Fecha de caducidad: ");
        data.append(getFormattedDate(this.expirationDate));

        return data;
    }

    public void printSpecificData() {
        System.out.println(getSpecificData());
    }


    public String getLocation() {
        StringBuilder builder = new StringBuilder();
        builder.append("Zona - ");
        builder.append(getZone());
        builder.append(" Area - ");
        builder.append(getArea());
        builder.append(" Estantería - ");
        builder.append(getShelf());
        builder.append("\n");
        return builder.toString();
    }

    public Date getExpirationDate() {
        return this.expirationDate;
    }

    public String getFormattedDate(Date date) {
        return dateFormat.format(date);
    }

}
