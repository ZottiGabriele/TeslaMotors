package ITesla;

public class DebugPrinter {

    public String prettyPrint(ITesla target) {
        StringBuilder sb = new StringBuilder();
        sb.append("Tesla ").append(target.getTeslaModel());
        sb.append("\n\tBatteryType: ").append(target.getBatteryType());
        sb.append("\n\tExteriorColor: ").append(target.getExteriorColor());
        sb.append("\n\tRoofType: ").append(target.getRoofType());
        sb.append("\n\tSeatsModel: ").append(target.getSeatsModel());
        sb.append("\n\tSeatsColor: ").append(target.getSeatsColor());
        sb.append("\n\tTOTAL PRICE: ").append(target.getPrice()).append(" €");
        return sb.toString();
    }
}
