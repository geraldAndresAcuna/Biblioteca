import java.time.*;
public class Miembro {
    private String nombre;
    private String correoElectronico;
    private String contrasena;
    private char rol;
    private  LocalDate fechaNacimiento;
    private int edad;
    private String direccion;
    private String genero;
    private String identificacion;
    public Miembro(){
        this.nombre = "";
        this.correoElectronico = "";
        this.contrasena = "";
        this.rol = ' ';
        this.fechaNacimiento =null;
        this.edad=0;
        this.direccion = "";
        this.genero= "";
        this.identificacion="";
    }
    public Miembro(String nombre,String correoElectronico,String contrasena,char rol,LocalDate fechaNacimiento,String direccion,String genero,String identificacion){
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.rol = rol;
        this.fechaNacimiento = fechaNacimiento;
        this.edad=calcularEdad();
        this.direccion = direccion;
        this.genero= genero;
        this.identificacion=identificacion;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public char getRol() {
        return rol;
    }

    public void setRol(char rol) {
        this.rol = rol;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public int getEdad(){
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    // Método para calcular la edad
    public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        // Verificar si aún no se ha cumplido el día de nacimiento en el año actual
        if (fechaActual.getMonthValue() < fechaNacimiento.getMonthValue() ||
                (fechaActual.getMonthValue() == fechaNacimiento.getMonthValue() &&
                        fechaActual.getDayOfMonth() < fechaNacimiento.getDayOfMonth())) {
            edad--;
        }
        return edad;
    }

    @Override
    public String toString() {
        return "\nMiembro :" +'\n' +
                "nombre :" + getNombre() + '\n' +
                "correoElectronico :" + getCorreoElectronico() + '\n' +
                "contrasena :" + getContrasena() + '\n' +
                "rol :" + getRol() +'\n' +
                "fechaNacimiento :" + getFechaNacimiento() +'\n' +
                "Edad :" + getEdad() +'\n' +
                "direccion :" + getDireccion() + '\n' +
                "genero :" + getGenero() + '\n' +
                "identificacion :" + getIdentificacion();
    }
}
