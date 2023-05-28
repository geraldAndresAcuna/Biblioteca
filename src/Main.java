import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Miembro miembro = new Miembro("gerald","gacunal@ucenfotec.ac.cr","2022cenfotec",'e',LocalDate.parse("1980-03-14"),"San Francisco","Masculino","114260114" );
        Reserva reservaUno = new Reserva(1,miembro,'n',LocalDate.now());


    System.out.println(miembro.toString());
    System.out.println(reservaUno.toString());
    }
}