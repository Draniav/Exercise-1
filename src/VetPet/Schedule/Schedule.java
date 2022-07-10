package VetPet.Schedule;

public class Schedule {

    private int idAppointment;
    private String hour;
    private String day;
    private String month;
    private String year;
    private String typeOfAppointment; //medical or aesthetic
    private String activeDoctor;
    private String dniOwner;
    private String patientName;

    public Schedule(int idAppointment, String hour, String day, String month, String year, String typeOfAppointment, String activeDoctor, String dniOwner, String patientName) {
        this.idAppointment = idAppointment;
        this.hour = hour;
        this.day = day;
        this.month = month;
        this.year = year;
        this.typeOfAppointment = typeOfAppointment;
        this.activeDoctor = activeDoctor;
        this.dniOwner = dniOwner;
        this.patientName = patientName;
    }

    @Override
    public String toString() {

        return "Id of appintment  " + idAppointment + " |" + hour + " | " + day + " |  " + month + "    | " + year + " | " + typeOfAppointment + "  | " + activeDoctor + "  | " + dniOwner + "  | " + patientName + "  | ";
    }

    public int getIdAppointment() {
        return idAppointment;
    }

    public void setIdAppointment(int idAppointment) {
        this.idAppointment = idAppointment;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTypeOfAppintment() {
        return typeOfAppointment;
    }

    public void setTypeOfAppintment(String typeOfAppointment) {
        this.typeOfAppointment = typeOfAppointment;
    }

    public String getActiveDoctor() {
        return activeDoctor;
    }

    public void setActiveDoctor(String activeDoctor) {
        this.activeDoctor = activeDoctor;
    }

    public String getDniOwner() {
        return dniOwner;
    }

    public void setDniOwner(String dniOwner) {
        this.dniOwner = dniOwner;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
}