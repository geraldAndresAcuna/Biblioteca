import java.time.LocalDate;

public class Reserva {
    int numeroReserva;
    Miembro miembro;
    char estado;
    LocalDate fechaRealizacion;
    public Reserva(){
        this.numeroReserva = 0;
        this.miembro=null;
        this.estado=' ';
        this.fechaRealizacion=null;
    }
    public Reserva(int numeroReserva,Miembro miembro,char estado,LocalDate fechaRealizacion){
        this.numeroReserva = numeroReserva;
        this.miembro=miembro;
        this.estado=estado;
        this.fechaRealizacion=fechaRealizacion;
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public Miembro getMiembro() {
        return miembro;
    }

    public void setMiembro(Miembro miembro) {
        this.miembro = miembro;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public LocalDate getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(LocalDate fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    @Override
    public String toString() {
        return "Reserva" +'\n' +
                "numero Reserva :" + getNumeroReserva() +'\n' +
                "miembro :" + getMiembro() +'\n' +
                "estado :" + getEstado()+'\n' +
                "fechaRealizacion :" + getFechaRealizacion() ;
    }
}
