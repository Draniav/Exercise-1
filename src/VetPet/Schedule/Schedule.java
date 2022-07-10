package VetPet.Schedule;

public class Schedule {

    private  int idAppointment;
    private String hour;
    private String day;
    private String month;
    private String year;
    private String typeOfAppintment; //medical or asthetic
    private String  activeDoctor;
    private String dniOwner;
    private  String patientName

    public Schedule(int idAppointment, String hour, String day, String month, String year, String typeOfAppintment, String activeDoctor, String dniOwner, String patientName) {
        this.idAppointment = idAppointment;
        this.hour = hour;
        this.day = day;
        this.month = month;
        this.year = year;
        this.typeOfAppintment = typeOfAppintment;
        this.activeDoctor = activeDoctor;
        this.dniOwner = dniOwner;
        this.patientName = patientName;
    }

    @Override
    public String toString() {

        return "Id of appintment  " + idAppointment + " |" + hour + " | " + day + " |  " + month + "    | " + year + " | " + typeOfAppintment + "  | " + " | " + idPatient +"  | " + activeDoctor +"  | " + idPatient +"  | " + patientName +"  | ";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return typeOfAppintment;
    }

    public void setTypeOfAppintment(String typeOfAppintment) {
        this.typeOfAppintment = typeOfAppintment;
    }

    public String getActiveDoctor() {
        return activeDoctor;
    }

    public void setActiveDoctor(String activeDoctor) {
        this.activeDoctor = activeDoctor;
    }

    public String getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(String idPatient) {
        this.idPatient = idPatient;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
