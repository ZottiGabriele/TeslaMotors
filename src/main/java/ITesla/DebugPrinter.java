package ITesla;

import IShowRoom.IShowRoom;

public class DebugPrinter {

    public String prettyPrint(ITesla target) {
        StringBuilder sb = new StringBuilder();
        sb.append("----------------------------------------------------------\n");
        sb.append("Tesla ").append(target.getTeslaModel());
        sb.append("\n\tBatteryType: ").append(target.getBatteryType());
        sb.append("\n\tExteriorColor: ").append(target.getExteriorColor());
        sb.append("\n\tRoofType: ").append(target.getRoofType());
        sb.append("\n\tSeatsModel: ").append(target.getSeatsModel());
        sb.append("\n\tSeatsColor: ").append(target.getSeatsColor());
        sb.append("\n\tTOTAL PRICE: ").append(target.getPrice()).append(" €\n");
        sb.append("----------------------------------------------------------\n");
        return sb.toString();
    }

    public String prettyPrint(ITeslaUsed target) {
        StringBuilder sb = new StringBuilder();
        sb.append("----------------------------------------------------------\n");
        sb.append("Tesla ").append(target.getTeslaModel()).append(" used");
        sb.append("\n\tBatteryType: ").append(target.getBatteryType());
        sb.append("\n\tExteriorColor: ").append(target.getExteriorColor());
        sb.append("\n\tRoofType: ").append(target.getRoofType());
        sb.append("\n\tSeatsModel: ").append(target.getSeatsModel());
        sb.append("\n\tSeatsColor: ").append(target.getSeatsColor());
        sb.append("\n\tKilometersCount: ").append(target.getKilometersCount());
        sb.append("\n\tLicenceDate: ").append(target.getLicenceDate().getDate())
                .append("/" + target.getLicenceDate().getMonth())
                .append("/" + target.getLicenceDate().getYear());
        sb.append("\n\tTOTAL PRICE: ").append(target.getPrice()).append(" €\n");
        sb.append("----------------------------------------------------------\n");
        return sb.toString();
    }

    public String prettyPrint(IShowRoom target) {
        StringBuilder sb = new StringBuilder();
        sb.append("---------- " + target.getShowRoomName() + " ----------");
        sb.append("\nLocation: ").append(target.getShowRoomCity());
        sb.append("\nAvailable cars:\n");
        int i = 1;
        for(ITesla t : target.getAllCars()) {
            if(t instanceof ITeslaUsed) {
                sb.append(i + ")\t").append(prettyPrint((ITeslaUsed)t));
            } else {
                sb.append(i + ")\t").append(prettyPrint(t));
            }
            i++;
        }
        return sb.toString();
    }
}
